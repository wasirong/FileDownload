package com.dhl.Util;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class ReadFromWeb {
    public String SendRequest() {
        Properties prop = new Properties();

        String result = "nothing";
        Logger logger = Logger.getLogger("TestLogger");

        logger.log(Level.INFO, LogPrint.WriteInfoLog("*****************START********************"));

        try {
            IgnoreVerifySSL.createIgnoreVerifySSL();

            String username = "bo.wang@dhl.com";
            String password = "Woaidalian=2022";

            String url = "https://opms.dhl.com/opms/report/coabos/index.jsp?guiStatusGZ=3ac-7UI8000000000elnXS_qe1z-lONbJ_JOd2jgnsuqjHi56PES4b2rZyAOykeJs-b8tAHVX-ZR4B9M8aRKCzhFi8xwYLPMYXVV4WU_f2ksflaFC4xZX5VQcq9Fa2amrDPYpjnKn66Ad4AzMAlavpMa_e7CuGC9Pxk2raFY_a1RdD2sXnpXIsUliWBiM40L8KGEY84CN5C7ksWsjsVao0tQz1aY2EF1_7GiC75dVpWxx4v9W_4hiN9aR351Ca_FWODcShSLMdZsNUdNUswszpUO2i284GQn53olsAEAikcqW5R6chapzTSc7wDfgmZOyNQ3CQA4NfsIEmBpxHIZr2F2EC6FQ1CCQgIyEpq1soNhi39tkDSsv1X-wuqzSnMW-DS95GfVBZLFVcXSsLuVZdb23CRwe6S5-uxLCYMILsgmAV1NFDsSTl-HHPqtmg8WFUXw9QR24S6jHoqPnP69-SC3P2PZK2gssNllwi0m-jyzAEA8EUxEeFo21EjnZrOeS-SU_n9R9gXmbz5yWx_23ljb7cjxyFMbFmfSV6cU7ympTK6j_GdtquXdhHZ_dDwwtTHrdoOvx5Qu5XEN8-WFQz0uNzDDxtA5zpzaedDVKdtHDhsh8b-_bhH9dNPe9dKssuxtBG7kRi9iIXahO0oYBtlrMsPQIhTWCqyXXPFt5Zvp1Fb6zu3fNuRSuJQCZ627-N5vXWXhKDM_Gp_P75vtreuTXTaz0urwTLEFVVHJXWqUi8h5gh85F_wHBG9bDqqBEHHXIUeU2f-VN29fJmMU2GJBOR1bMZlrUuGA2M6RJRQsqXqb7vmebnouRHNNSD6pu_twiDoyRRpfgwuo7OsgLLC48k5la5ClT89KU9dMt3sreHuPplABJ-_Rfe_fnHvLLvcMiAB2jVNqGto-lrmM45IUz9b1B3Vi3HCZtHPmSQhbnmQjuHoZ1TykOoFiAXlg66Cx2juN4ez5t6eyqhExsh1K0TxyeJ0uiIAwk_hdEzsAOtWzH__qWyiulZfTvUH2dnxqZ1XCZLuEeguVeWubYwAu3Dco6dnn8utMiBCCWytzZrAkpoThOEypFyzS0fdlAc2UscUy3mGihLiFhI7V0iJmPGd03OQvm0qKJqGhHd3rMFLAmHM0_-Qcb82F6XpwnvhhVd82qYxL3ltzU3X8JJRW1txSnaeZtDiL7tRHh_vrQvRSZdJSZdJSZ5kX-GEtXrUgCXLfPjBKlItGputwXc6TYB_oPn-L2_6u_gQ00000";

            //map装载表单数据
            Map<String, String> map = new HashMap<String, String>();
            map.put("_login", username);
            map.put("_password", password);
            map.put("acclog", "false");
            map.put("originalURL", url);

            //模拟浏览器创建连接，发起请求
            Connection conn = Jsoup.connect(url);

            conn.header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
            conn.header("Accept-Encoding", "gzip, deflate, br");
            conn.header("Accept-Language", "en-US,en;q=0.9");
            conn.header("Cache-Control", "max-age=0");
            conn.header("Connection", "keep-alive");
            conn.header("Content-Length", "2002");
            conn.header("Content-Type", "application/x-www-form-urlencoded");
            conn.header("Host", "opms.dhl.com");
            conn.header("Origin", "https://opms.dhl.com");
            conn.header("Referer", url);
            conn.header("Upgrade-Insecure-Requests", "1");
            conn.header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36");

            Connection.Response login = Jsoup.connect(url)
                    .ignoreContentType(true) // 忽略类型验证
                    .followRedirects(false) // 禁止重定向
                    .postDataCharset("utf-8")
                    .header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
                    .header("Accept-Encoding", "gzip, deflate, br")
                    .header("Accept-Language", "en-US,en;q=0.9")
                    .header("Cache-Control", "max-age=0")
                    .header("Connection", "keep-alive")
                    .header("Content-Length", "2002")
                    .header("Content-Type", "application/x-www-form-urlencoded")
                    .header("Host", "opms.dhl.com")
                    .header("Origin", "https://opms.dhl.com")
                    .header("Referer", url)
                    .data(map)
                    .method(Connection.Method.POST)
                    .execute();

            login.charset("UTF-8");

            //获取cookies
            Map<String, String> cookies = login.cookies();
            logger.log(Level.INFO, LogPrint.WriteInfoLog("Cookies 获取成功"));

            Set<String> keys = cookies.keySet();

            for (String key : keys) {
                logger.log(Level.INFO, LogPrint.WriteInfoLog("key:[" + key + "] / keyValue:[" + cookies.get(key) + "]"));
            }

            //利用cookies保存的登录信息进行登录
            Document document = Jsoup.connect(url).cookies(cookies).post();
            document.charset(StandardCharsets.UTF_8);

            //分析页面，得到成绩的标签
//            Elements trs = document.getElementsByTag("tr");

            //获取迭代器
//            Iterator it = trs.iterator();
//            while (it.hasNext()) {
//                Element element = (Element) it.next();
//                Node titleNode = element.child(0).childNode(0);
//
//                logger.log(Level.INFO, LogPrint.WriteInfoLog("nodeName :" + titleNode.nodeName()));
//                logger.log(Level.INFO, LogPrint.WriteInfoLog("titleNode.toString :" + titleNode.toString()));
//                //遍历中。。。。。。
//            }

            logger.log(Level.INFO, LogPrint.WriteInfoLog("Login Success!"));
            logger.log(Level.INFO, LogPrint.WriteInfoLog("DownLoadStart!"));




            result = "Connect Success!";

        } catch (Exception e) {
            e.printStackTrace();

            result = e.toString();
        }

        return result;
    }
}
