/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package websitelinksgenerate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.nodes.Element;

/**
 *
 * @author adittachakraborty
 */
public class LinksWithTitle {
    
    public static void generator(){
        try {
            String url = "";
            HashMap<String, String> h = new HashMap<>();
            url = "https://www.reshmait.com";
            Document doc = Jsoup.connect(url).get();
            String title = doc.title();
            
            Elements links = doc.select("a[href]");
            List url_array = new ArrayList();
            int i = 0;
            url_array.add(url);
            String root = url;
            h.put(url, title);
            Iterator<String> keySetIterator = h.keySet().iterator();
            while ((i <= h.size())) {
                try {
                    url = url_array.get(i).toString();
                    doc = Jsoup.connect(url).get();
                    title = doc.title();
                    links = doc.select("a[href]");

                    for (Element link : links) {

                        String res = h.putIfAbsent(link.attr("href"), link.text());
                        if (res == null) {
                            url_array.add(link.attr("href"));
                            System.out.println("\nURL: " + link.attr("href"));
                            System.out.println("CONTENT: " + link.text());
                        }
                    }
                } catch (IOException e) {
                    System.out.println("\n" + e);
                }

                i++;

            }
        } catch (IOException ex) {
            Logger.getLogger(LinksWithTitle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //try {
            //        WebDriver driver = new FirefoxDriver();
//        driver.get("www.aditta.org");
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        for(WebElement ele:links){
//            System.out.println(ele.getAttribute("href"));
//        }

//            Document doc = Jsoup.connect("https://www.google.com/").userAgent("chrome/75.0.3770.142").get();
//            Elements temp = doc.select("div.info");
//            int i = 0;
//            for(Element siteLinks:temp){
//                i++;
//                System.out.println(i+ " "+ siteLinks.getElementsByTag("a").text());
//                
//            }
//        } catch (IOException ex) {
//            Logger.getLogger(WebsiteLinksGenerate.class.getName()).log(Level.SEVERE, null, ex);
//        }
            String url = "";
            HashMap<String, String> h = new HashMap<>();
            url = "https://www.lplt20.co.uk";
            Document doc = Jsoup.connect(url).get();

//  Page Title
            String title = doc.title();
//System.out.println("title: " + title);

//  Links in page
            Elements links = doc.select("a[href]");
            List url_array = new ArrayList();
            int i = 0;
            url_array.add(url);
            String root = url;
            h.put(url, title);
            Iterator<String> keySetIterator = h.keySet().iterator();
            while ((i <= h.size())) {
                try {
                    url = url_array.get(i).toString();
                    doc = Jsoup.connect(url).get();
                    title = doc.title();
                    links = doc.select("a[href]");

                    for (Element link : links) {

                        String res = h.putIfAbsent(link.attr("href"), link.text());
                        if (res == null) {
                            url_array.add(link.attr("href"));
                            System.out.println("\nURL: " + link.attr("href"));
                            System.out.println("CONTENT: " + link.text());
                        }
                    }
                } catch (Exception e) {
                    System.out.println("\n" + e);
                }

                i++;

            }
        } catch (IOException ex) {
            Logger.getLogger(LinksWithTitle.class.getName()).log(Level.SEVERE, null, ex);
        }

}

}