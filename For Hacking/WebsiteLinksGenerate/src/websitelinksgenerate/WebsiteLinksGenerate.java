/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package websitelinksgenerate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Enumeration;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.html.HTML;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.BrowserType;

/**
 *
 * @author adittachakraborty
 */
public class WebsiteLinksGenerate {

    public WebsiteLinksGenerate() {
        super();
    }

    public static void generator(String url) {
        final String name = url;
        Reader r = null;

        try {
            URL u = new URL(name);
            System.setProperty("http.agent", "Chrome");
            InputStream in = u.openStream();
            r = new InputStreamReader(in);

            ParserDelegator hp = new ParserDelegator();
            hp.parse(r, new HTMLEditorKit.ParserCallback() {

                @Override
                public void handleStartTag(HTML.Tag t, MutableAttributeSet a, int pos) {

                    if (t == HTML.Tag.A) {
                        Enumeration attrNames = a.getAttributeNames();

                        while (attrNames.hasMoreElements()) {
                            String exactUrl = "";
                            Object key = attrNames.nextElement();
                            if ("href".equals(key.toString())) {
                                exactUrl = a.getAttribute(key).toString();
                                if (!a.getAttribute(key).toString().startsWith("http://") && !a.getAttribute(key).toString().startsWith("https://")) {
                                    if (a.getAttribute(key).toString().startsWith("/")) {
                                        exactUrl = name + a.getAttribute(key);
                                    } else {
                                        exactUrl = name.concat("/").concat(a.getAttribute(key).toString());
                                    }
                                    URI uri;
                                    try {
                                        uri = new java.net.URI(exactUrl);
                                        //System.out.println(uri);
                                        String url = uri.toString();
                                        new Dashboard().dataOutput(url);
                                    } catch (URISyntaxException e) {
                                        //e.printStackTrace();
                                    }
                                } else {
                                    URI uri;
                                    try {
                                        uri = new java.net.URI(exactUrl);
                                        //System.out.println(uri);
                                        String url = uri.toString();
                                        new Dashboard().dataOutput(url);
                                    } catch (URISyntaxException e) {
                                        //e.printStackTrace();
                                    }
                                }
                            }
                        }
                    }
                }
            }, true);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Returned HTTP response code: 503", "Not Possible", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (r != null) {
                try {
                    r.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Reader Not Closed", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("");
        generator(name);
    }

}
