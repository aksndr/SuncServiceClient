package ru.terralink.ws.common;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Aksndr on 09.02.2016.
 */
public class Utils {

    public static XMLGregorianCalendar stringToXMLGregorianCalendar(String s)
            throws ParseException, DatatypeConfigurationException {

        XMLGregorianCalendar result = null;
        Date date;
        SimpleDateFormat simpleDateFormat;
        GregorianCalendar gregorianCalendar;

        simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        date = simpleDateFormat.parse(s);
        gregorianCalendar = (GregorianCalendar) GregorianCalendar.getInstance();
        gregorianCalendar.setTime(date);
        result = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
        result.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
        result.setMillisecond(DatatypeConstants.FIELD_UNDEFINED);

        return result;
    }
}
