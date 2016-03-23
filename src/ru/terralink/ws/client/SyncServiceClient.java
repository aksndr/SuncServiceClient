package ru.terralink.ws.client;

import com.sun.xml.internal.ws.client.BindingProviderProperties;
import ru.terralink.ws.common.Utils;
import ru.terralink.ws.model.ContractOut;
import ru.terralink.ws.model.ISyncService;
import ru.terralink.ws.model.SyncOutRequest;
import ru.terralink.ws.model.SyncService;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.soap.SOAPBinding;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Aksndr on 09.02.2016.
 */
public class SyncServiceClient {

    private static final String NAME_SPACE_URL = "http://tempuri.org/";
    private static final String WS_NAME = "SyncService";

    private ISyncService syncService;

    public SyncServiceClient() {
    }

    public Map<String, Object> init(String url) {
        URL wsdlUrl = null;
        try {
            wsdlUrl = new URL(url);
            QName qName = new QName(NAME_SPACE_URL, WS_NAME);
            Service service = Service.create(wsdlUrl, qName);
            ISyncService syncService = service.getPort(ISyncService.class);

            BindingProvider bp = (BindingProvider) syncService;

            Map<String, Object> requestContext = bp.getRequestContext();

            requestContext.put(BindingProviderProperties.CONNECT_TIMEOUT, 5000);
            requestContext.put(BindingProviderProperties.REQUEST_TIMEOUT, 25000);

//            requestContext.put(BindingProvider.USERNAME_PROPERTY, login);
//            requestContext.put(BindingProvider.PASSWORD_PROPERTY, pass);

            this.syncService = syncService;
        } catch (Exception e) {
            return failed(e.toString());
        }
        return succeed();
    }


    public Map<String, Object> syncOutContractData(String guid, String gid, String state,
                                                   String startDateStr, String endDateStr, String regDateStr,
                                                   String regNum, String outerNum, String generalNum) {
        XMLGregorianCalendar startDate = null;
        XMLGregorianCalendar endDate = null;
        XMLGregorianCalendar regDate = null;

        try {
            if (regDateStr != null && !"".equals(regDateStr))
                startDate = Utils.stringToXMLGregorianCalendar(startDateStr);

            if (regDateStr != null && !"".equals(regDateStr))
                endDate = Utils.stringToXMLGregorianCalendar(endDateStr);

            if (regDateStr != null && !"".equals(regDateStr))
                regDate = Utils.stringToXMLGregorianCalendar(regDateStr);

            ContractOut co = new ContractOut(gid, state, startDate, endDate, regDate, regNum, outerNum, generalNum);
            SyncOutRequest r = new SyncOutRequest(guid, co);
            syncService.syncOutContractData(r);

        } catch (Exception e) {
            return failed(e.toString());
        }

        return succeed();
    }

    public Map<String, Object> syncOutContractURL(String guid, String url, String gid) {
        try {
            ContractOut co = new ContractOut(url, gid);
            SyncOutRequest r = new SyncOutRequest(guid, co);
            syncService.syncOutContractURL(r);

        } catch (Exception e) {
            return failed(e.toString());
        }

        return succeed();
    }


    public Map<String, Object> succeed() {
        Map<String, Object> result = new HashMap<>();
        result.put("ok", true);
        return result;
    }

    public Map<String, Object> succeed(Object value) {
        Map<String, Object> result = new HashMap<>();
        result.put("ok", true);
        result.put("value", value);
        return result;
    }

    public Map<String, Object> failed(String errMsg) {
        Map<String, Object> result = new HashMap<>();
        result.put("ok", false);
        result.put("errMsg", errMsg);
        return result;
    }

}
