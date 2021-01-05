import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = new PrintStream("./config.xml");
        System.setOut(out);

        System.out.print(getDefaultConfig());
    }
    private static String getDefaultConfig(){
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        sb.append("<PROPSTABLE DESC=\"TABLENAME\">\n");
        sb.append("\t<PROPSROW DESC=\"PARK\">\n");
        sb.append("\t\t<SERVICE>ParkService</SERVICE>\n");
        sb.append("\t\t<SERVERS>localhost:1888,localhost:1889</SERVERS>\n");
        sb.append("\t\t<SAFEMEMORYPER>0.95</SAFEMEMORYPER>\n");
        sb.append("\t\t<HEARTBEAT>3000</HEARTBEAT>\n");
        sb.append("\t\t<MAXDELAY>30000</MAXDELAY>\n");
        sb.append("\t\t<EXPIRATION>24</EXPIRATION>\n");
        sb.append("\t\t<CLEARPERIOD>0</CLEARPERIOD>\n");
        sb.append("\t\t<ALWAYSTRYLEADER>false</ALWAYSTRYLEADER>\n");
        sb.append("\t\t<STARTWEBAPP>true</STARTWEBAPP>\n");
        sb.append("\t</PROPSROW>\n");
        sb.append("\t<PROPSROW DESC=\"COOLHASH\">\n");
        sb.append("\t\t<DATAROOT>data</DATAROOT>\n");
        sb.append("\t\t<KEYLENTH DESC=\"B\">256</KEYLENTH>\n");
        sb.append("\t\t<VALUELENGTH DESC=\"M\">2</VALUELENGTH>\n");
        sb.append("\t\t<REGIONLENGTH DESC=\"M\">2</REGIONLENGTH>\n");
        sb.append("\t\t<LOADLENGTH DESC=\"M\">64</LOADLENGTH>\n");
        sb.append("\t\t<HASHCAPACITY>1000000</HASHCAPACITY>\n");
        sb.append("\t</PROPSROW>\n");
        sb.append("\t<PROPSROW DESC=\"CACHE\">\n");
        sb.append("\t\t<SERVICE>CacheService</SERVICE>\n");
        sb.append("\t\t<SERVERS>localhost:2000,localhost:2001</SERVERS>\n");
        sb.append("\t</PROPSROW>\n");
        sb.append("\t<PROPSROW DESC=\"CACHEGROUP\">\n");
        sb.append("\t\t<STARTTIME>2010-01-01</STARTTIME>\n");
        sb.append("\t\t<GROUP>localhost:2000,localhost:2001@2010-01-01;localhost:2002,localhost:2003@2010-05-01;localhost:2004,localhost:2005@2010-05-01</GROUP>\n");
        sb.append("\t</PROPSROW>\n");
        sb.append("\t<PROPSROW DESC=\"CACHEGROUP\">\n");
        sb.append("\t\t<STARTTIME>2018-05-01</STARTTIME>\n");
        sb.append("\t\t<GROUP>localhost:2008,localhost:2009@2018-05-01;localhost:2010,localhost:2011@2018-05-01</GROUP>\n");
        sb.append("\t</PROPSROW>\n");
        sb.append("\t<PROPSROW DESC=\"CACHEFACADE\">\n");
        sb.append("\t\t<SERVICE>CacheFacadeService</SERVICE>\n");
        sb.append("\t\t<SERVERS>localhost:1998</SERVERS>\n");
        sb.append("\t\t<TRYKEYSNUM>100</TRYKEYSNUM>\n");
        sb.append("\t</PROPSROW>\n");
        sb.append("\t<PROPSROW DESC=\"WORKER\">\n");
        sb.append("\t\t<TIMEOUT DESC=\"FALSE\">2</TIMEOUT>\n");
        sb.append("\t\t<SERVERS>localhost:2088</SERVERS>\n");
        sb.append("\t\t<SERVICE>false</SERVICE>\n");
        sb.append("\t</PROPSROW>\n");
        sb.append("\t<PROPSROW DESC=\"CTOR\">\n");
        sb.append("\t\t<!-- <CTORSERVERS>localhost:1988</CTORSERVERS> -->\n");
        sb.append("\t\t<INITSERVICES>100</INITSERVICES>\n");
        sb.append("\t\t<MAXSERVICES>500</MAXSERVICES>\n");
        sb.append("\t</PROPSROW>\n");
        sb.append("\t<PROPSROW DESC=\"COMPUTEMODE\">\n");
        sb.append("\t\t<MODE DESC=\"DEFAULT\">0</MODE>\n");
        sb.append("\t\t<MODE>1</MODE>\n");
        sb.append("\t</PROPSROW>\n");
        sb.append("\t<PROPSROW DESC=\"FTTP\">\n");
        sb.append("\t\t<SERVERS>localhost:2121</SERVERS>\n");
        sb.append("\t</PROPSROW>\n");
        sb.append("\t<PROPSROW DESC=\"WEBAPP\">\n");
        sb.append("\t\t<SERVERS>localhost:9080</SERVERS>\n");
        sb.append("\t\t<USERS>admin:admin,guest:123456,test:test</USERS>\n");
        sb.append("\t</PROPSROW>\n");
        sb.append("\t<PROPSROW DESC=\"LOG\">\n");
        sb.append("\t\t<LEVELNAME>ALL</LEVELNAME>\n");
        sb.append("\t\t<LEVELNAME>SEVERE</LEVELNAME>\n");
        sb.append("\t\t<LEVELNAME>WARNING</LEVELNAME>\n");
        sb.append("\t\t<LEVELNAME>INFO</LEVELNAME>\n");
        sb.append("\t\t<LEVELNAME>CONFIG</LEVELNAME>\n");
        sb.append("\t\t<LEVELNAME DESC=\"LOGLEVEL\">FINE</LEVELNAME>\n");
        sb.append("\t\t<LEVELNAME>FINER</LEVELNAME>\n");
        sb.append("\t\t<LEVELNAME>FINEST</LEVELNAME>\n");
        sb.append("\t\t<LEVELNAME>OFF</LEVELNAME>\n");
        sb.append("\t\t<INFO>true</INFO>\n");
        sb.append("\t\t<FINE>false</FINE>\n");
        sb.append("\t</PROPSROW>\n");
        sb.append("</PROPSTABLE>");
        return sb.toString();
    }
}
