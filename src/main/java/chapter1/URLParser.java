package chapter1;


import java.net.URL;

import java.util.HashMap;
import java.util.Map;

public class URLParser  {


    public static  void main(String [] args){
        Map<String , String > map = new HashMap<>();

        URLParser urlParser = new URLParser();

        String  myR = "http://google.com/this/is/the/path?a=1&b=2";

        urlParser.parseUrl(myR);

        try{
            UrL  myUrl =  urlParser.buildUrl(myR);

            String q = myUrl.queryParam;

            if(q != null) {
               String [] arr1 = q.split("\\&") ;

            }

            System.out.println(myUrl);
        }catch (Exception e){
            e.printStackTrace();
        }

    }


    public UrL buildUrl(String url ) throws Exception{
        URL url1 = new URL(url);
        return new UrL(url1.getProtocol(), url1.getHost(), url1.getPath(), url1.getQuery());
    }


    private  void parseUrl(String url){
        int idex1 = url.indexOf(':');

        String protocol = url.substring(0, idex1);

        System.out.println( "Protocol "+ protocol);

        String part2 = url.substring(idex1+2);

        String domainName =  part2.substring(0, part2.indexOf('/'));


        System.out.println( "DomainName "+ domainName);

    }

    private static class UrL {

        String protocol;
        String domainName;
        String path;
        String queryParam;

        public UrL( String protocol , String domainName, String path,String queryParam){

            this.protocol = protocol;
            this.domainName = domainName;
            this.path = path;
            this.queryParam = queryParam;
        }

        @Override
        public  String toString(){
            return "protocol "+ protocol + " \n" +"domainName " + domainName+ "\n" + "path " + path+ "\n" + "queryParam "+queryParam;
        }

    }




}




