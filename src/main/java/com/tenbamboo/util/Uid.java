package com.tenbamboo.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Uid {
        public static String getOrderIdByUUId() {
        	long nowLong = Long.parseLong(new SimpleDateFormat("yyyyMMdd").format(new Date()));
            int machineId = 1;//最大支持1-9个集群机器部署
            int hashCodeV = UUID.randomUUID().toString().hashCode();
            if(hashCodeV < 0) {//有可能是负数
                hashCodeV = - hashCodeV;
            }
            // 0 代表前面补充0     
            // 4 代表长度为4     
            // d 代表参数为正数型
            return "M"+ nowLong + String.format("%010d", hashCodeV);
        }
        public static void main(String[] args) {
            System.out.println(getOrderIdByUUId());
        }
}