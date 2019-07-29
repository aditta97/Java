
import java.net.*;
import java.io.*;
import javax.xml.parsers.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.jsoup.select.Selector;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.w3c.tidy.Tidy;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import java.util.Scanner;
import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import redstone.xmlrpc.XmlRpcFault;
import redstone.xmlrpc.XmlRpcArray;
import net.bican.wordpress.Page;
import net.bican.wordpress.PageDefinition;
import net.bican.wordpress.Wordpress;
import java.net.MalformedURLException;
import java.util.List;
import java.util.*;
import java.util.LinkedList;

public class getallurl {

    public static class GenQueue {

        private LinkedList list = new LinkedList();

        public void enqueue(String item) {
            list.addLast(item);
        }

        public String dequeue() {
            return list.poll().toString();
        }

        public boolean hasItems() {
            return !list.isEmpty();
        }

        public int size() {
            return list.size();
        }

        public int indexOf(String item) {
            return list.indexOf(item);
        }

    }

    public static void main(String args[]) throws Exception {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setValidating(false);
        dbf.setNamespaceAware(true);
        dbf.setIgnoringComments(false);
        dbf.setIgnoringElementContentWhitespace(false);
        dbf.setExpandEntityReferences(false);
        DocumentBuilder db = dbf.newDocumentBuilder();
        String oracle = args[0];
        String phrase = args[1];

        Document doc = Jsoup.connect(args[0]).get();
        List linksvisited = new ArrayList();
        GenQueue linkstobevisted = new GenQueue();
        getURLlist(oracle, linksvisited, linkstobevisted, phrase);
        while (linkstobevisted.hasItems()) {
            String newlink = linkstobevisted.dequeue();
            getURLlist(newlink, linksvisited, linkstobevisted, phrase);
        }

    }

    public static int getURLlist(String ul, List linksvisited, GenQueue linkstobevisted, String phrase) throws Exception {
        int i = 0;
        try {
            Document doc = Jsoup.connect(ul).get();
            System.out.println(ul);
            linksvisited.add(ul);

            Elements links = doc.select("a[href]");
            Iterator itr = links.iterator();
            while (itr.hasNext()) {
                Element el = (Element) itr.next();
                i++;
                String st = el.attr("abs:href");

                if (st.contains("http://") && st.contains(phrase) && !(st.equals(ul)) && !(linksvisited.contains(st)) && (linkstobevisted.indexOf(st) == -1)) {
                    linkstobevisted.enqueue(st);
                    int s = 0;
//                    if (s != -1) {
//                        System.out.println("Copying ………… " + st);
//                        copywebsitemt cp = new copywebsitemt();
//                        cp.copyw(st);
//                        Elements linksimages = doc.select("img[src$ =.jpg]");
//                        Iterator itrimages = linksimages.iterator();
//                        while (itrimages.hasNext()) {
//                            Element elimages = (Element) itrimages.next();
//                            String myURL = "http://";
//                            String stimages = elimages.attr("src");
//                            stimages = stimages.replace("../", "");
//                            stimages = stimages.replace("http://", "");
//                            stimages = myURL + stimages;
//                            System.out.println("Copying ………… " + stimages);
//                            copywebsiteimages cpimages = new copywebsiteimages();
//                            cpimages.copyw(stimages);
//                        }
//                    }

                }
            }
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
            return -1;
        }
        return i;
    }

    /**
     *
     * @param ul
     * @param linksvisited
     * @return
     * @throws Exception
     */
    public static int getURLlistimages(String ul, List linksvisited) throws Exception {
        int i = 0;
        try {
            Document doc = Jsoup.connect(ul).get();

            System.out.println(ul);
            String myURL = "http://mercurytrip.com/";

            linksvisited.add(ul);
            Elements links = doc.select("img[src$ =.jpg]");
            System.out.println(links);
            Iterator itr = links.iterator();

            while (itr.hasNext()) {
                Element el = (Element) itr.next();
                i++;
                String st = el.attr("src");
                st = st.replace("../", "");
                st = myURL + st;
                if (!(st.equals(ul)) && !(linksvisited.contains(st))) {

                    System.out.println("Copying ………… " + st);
                    //copywebsiteimages cp = new copywebsiteimages();
                    //cp.copyw(st);
                }
            }

        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
            return -1;
        }
        return i;
    }
}
