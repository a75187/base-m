package base;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.List;

/**
 * @desc: -.
 * @Author: lipei
 * @CreateDate: 2020/7/8 17:20
 * @Version: 1.0
 */

public class BaseMoneyTest {
    String data="{\n" +
            "    \"Data\": {\n" +
            "        \"Feature\": \"050,051,054,060,070\",\n" +
            "        \"FundType\": \"001\",\n" +
            "        \"LSJZList\": [\n" +
            "            {\n" +
            "                \"ACTUALSYI\": \"\",\n" +
            "                \"DWJZ\": \"0.9003\",\n" +
            "                \"FHFCBZ\": \"\",\n" +
            "                \"FHFCZ\": \"\",\n" +
            "                \"FHSP\": \"\",\n" +
            "                \"FSRQ\": \"2018-11-02\",\n" +
            "                \"JZZZL\": \"5.78\",\n" +
            "                \"LJJZ\": \"1.4366\",\n" +
            "                \"NAVTYPE\": \"1\",\n" +
            "                \"SGZT\": \"开放申购\",\n" +
            "                \"SHZT\": \"开放赎回\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"ACTUALSYI\": \"\",\n" +
            "                \"DWJZ\": \"0.8511\",\n" +
            "                \"FHFCBZ\": \"\",\n" +
            "                \"FHFCZ\": \"\",\n" +
            "                \"FHSP\": \"\",\n" +
            "                \"FSRQ\": \"2018-11-01\",\n" +
            "                \"JZZZL\": \"2.54\",\n" +
            "                \"LJJZ\": \"1.3874\",\n" +
            "                \"NAVTYPE\": \"1\",\n" +
            "                \"SGZT\": \"开放申购\",\n" +
            "                \"SHZT\": \"开放赎回\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"ACTUALSYI\": \"\",\n" +
            "                \"DWJZ\": \"0.8300\",\n" +
            "                \"FHFCBZ\": \"\",\n" +
            "                \"FHFCZ\": \"\",\n" +
            "                \"FHSP\": \"\",\n" +
            "                \"FSRQ\": \"2018-10-31\",\n" +
            "                \"JZZZL\": \"3.72\",\n" +
            "                \"LJJZ\": \"1.3663\",\n" +
            "                \"NAVTYPE\": \"1\",\n" +
            "                \"SGZT\": \"开放申购\",\n" +
            "                \"SHZT\": \"开放赎回\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"ACTUALSYI\": \"\",\n" +
            "                \"DWJZ\": \"0.8002\",\n" +
            "                \"FHFCBZ\": \"\",\n" +
            "                \"FHFCZ\": \"\",\n" +
            "                \"FHSP\": \"\",\n" +
            "                \"FSRQ\": \"2018-10-30\",\n" +
            "                \"JZZZL\": \"-1.74\",\n" +
            "                \"LJJZ\": \"1.3365\",\n" +
            "                \"NAVTYPE\": \"1\",\n" +
            "                \"SGZT\": \"开放申购\",\n" +
            "                \"SHZT\": \"开放赎回\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"ACTUALSYI\": \"\",\n" +
            "                \"DWJZ\": \"0.8144\",\n" +
            "                \"FHFCBZ\": \"\",\n" +
            "                \"FHFCZ\": \"\",\n" +
            "                \"FHSP\": \"\",\n" +
            "                \"FSRQ\": \"2018-10-29\",\n" +
            "                \"JZZZL\": \"-8.90\",\n" +
            "                \"LJJZ\": \"1.3507\",\n" +
            "                \"NAVTYPE\": \"1\",\n" +
            "                \"SGZT\": \"开放申购\",\n" +
            "                \"SHZT\": \"开放赎回\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"ACTUALSYI\": \"\",\n" +
            "                \"DWJZ\": \"0.8940\",\n" +
            "                \"FHFCBZ\": \"\",\n" +
            "                \"FHFCZ\": \"\",\n" +
            "                \"FHSP\": \"\",\n" +
            "                \"FSRQ\": \"2018-10-26\",\n" +
            "                \"JZZZL\": \"-2.60\",\n" +
            "                \"LJJZ\": \"1.4303\",\n" +
            "                \"NAVTYPE\": \"1\",\n" +
            "                \"SGZT\": \"开放申购\",\n" +
            "                \"SHZT\": \"开放赎回\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"ACTUALSYI\": \"\",\n" +
            "                \"DWJZ\": \"0.9179\",\n" +
            "                \"FHFCBZ\": \"\",\n" +
            "                \"FHFCZ\": \"\",\n" +
            "                \"FHSP\": \"\",\n" +
            "                \"FSRQ\": \"2018-10-25\",\n" +
            "                \"JZZZL\": \"-2.20\",\n" +
            "                \"LJJZ\": \"1.4542\",\n" +
            "                \"NAVTYPE\": \"1\",\n" +
            "                \"SGZT\": \"开放申购\",\n" +
            "                \"SHZT\": \"开放赎回\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"ACTUALSYI\": \"\",\n" +
            "                \"DWJZ\": \"0.9385\",\n" +
            "                \"FHFCBZ\": \"\",\n" +
            "                \"FHFCZ\": \"\",\n" +
            "                \"FHSP\": \"\",\n" +
            "                \"FSRQ\": \"2018-10-24\",\n" +
            "                \"JZZZL\": \"-2.77\",\n" +
            "                \"LJJZ\": \"1.4748\",\n" +
            "                \"NAVTYPE\": \"1\",\n" +
            "                \"SGZT\": \"开放申购\",\n" +
            "                \"SHZT\": \"开放赎回\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"ACTUALSYI\": \"\",\n" +
            "                \"DWJZ\": \"0.9652\",\n" +
            "                \"FHFCBZ\": \"\",\n" +
            "                \"FHFCZ\": \"\",\n" +
            "                \"FHSP\": \"\",\n" +
            "                \"FSRQ\": \"2018-10-23\",\n" +
            "                \"JZZZL\": \"-7.37\",\n" +
            "                \"LJJZ\": \"1.5015\",\n" +
            "                \"NAVTYPE\": \"1\",\n" +
            "                \"SGZT\": \"开放申购\",\n" +
            "                \"SHZT\": \"开放赎回\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"ACTUALSYI\": \"\",\n" +
            "                \"DWJZ\": \"1.0420\",\n" +
            "                \"FHFCBZ\": \"\",\n" +
            "                \"FHFCZ\": \"\",\n" +
            "                \"FHSP\": \"\",\n" +
            "                \"FSRQ\": \"2018-10-22\",\n" +
            "                \"JZZZL\": \"4.95\",\n" +
            "                \"LJJZ\": \"1.5783\",\n" +
            "                \"NAVTYPE\": \"1\",\n" +
            "                \"SGZT\": \"开放申购\",\n" +
            "                \"SHZT\": \"开放赎回\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"ACTUALSYI\": \"\",\n" +
            "                \"DWJZ\": \"0.9929\",\n" +
            "                \"FHFCBZ\": \"\",\n" +
            "                \"FHFCZ\": \"\",\n" +
            "                \"FHSP\": \"\",\n" +
            "                \"FSRQ\": \"2018-10-19\",\n" +
            "                \"JZZZL\": \"3.91\",\n" +
            "                \"LJJZ\": \"1.5292\",\n" +
            "                \"NAVTYPE\": \"1\",\n" +
            "                \"SGZT\": \"开放申购\",\n" +
            "                \"SHZT\": \"开放赎回\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"ACTUALSYI\": \"\",\n" +
            "                \"DWJZ\": \"0.9555\",\n" +
            "                \"FHFCBZ\": \"\",\n" +
            "                \"FHFCZ\": \"\",\n" +
            "                \"FHSP\": \"\",\n" +
            "                \"FSRQ\": \"2018-10-18\",\n" +
            "                \"JZZZL\": \"-2.40\",\n" +
            "                \"LJJZ\": \"1.4918\",\n" +
            "                \"NAVTYPE\": \"1\",\n" +
            "                \"SGZT\": \"开放申购\",\n" +
            "                \"SHZT\": \"开放赎回\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"ACTUALSYI\": \"\",\n" +
            "                \"DWJZ\": \"0.9790\",\n" +
            "                \"FHFCBZ\": \"\",\n" +
            "                \"FHFCZ\": \"\",\n" +
            "                \"FHSP\": \"\",\n" +
            "                \"FSRQ\": \"2018-10-17\",\n" +
            "                \"JZZZL\": \"-0.51\",\n" +
            "                \"LJJZ\": \"1.5153\",\n" +
            "                \"NAVTYPE\": \"1\",\n" +
            "                \"SGZT\": \"开放申购\",\n" +
            "                \"SHZT\": \"开放赎回\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"ACTUALSYI\": \"\",\n" +
            "                \"DWJZ\": \"0.9840\",\n" +
            "                \"FHFCBZ\": \"\",\n" +
            "                \"FHFCZ\": \"\",\n" +
            "                \"FHSP\": \"\",\n" +
            "                \"FSRQ\": \"2018-10-16\",\n" +
            "                \"JZZZL\": \"-0.30\",\n" +
            "                \"LJJZ\": \"1.5203\",\n" +
            "                \"NAVTYPE\": \"1\",\n" +
            "                \"SGZT\": \"开放申购\",\n" +
            "                \"SHZT\": \"开放赎回\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"ACTUALSYI\": \"\",\n" +
            "                \"DWJZ\": \"0.9870\",\n" +
            "                \"FHFCBZ\": \"\",\n" +
            "                \"FHFCZ\": \"\",\n" +
            "                \"FHSP\": \"\",\n" +
            "                \"FSRQ\": \"2018-10-15\",\n" +
            "                \"JZZZL\": \"-2.03\",\n" +
            "                \"LJJZ\": \"1.5233\",\n" +
            "                \"NAVTYPE\": \"1\",\n" +
            "                \"SGZT\": \"开放申购\",\n" +
            "                \"SHZT\": \"开放赎回\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"ACTUALSYI\": \"\",\n" +
            "                \"DWJZ\": \"1.0075\",\n" +
            "                \"FHFCBZ\": \"\",\n" +
            "                \"FHFCZ\": \"\",\n" +
            "                \"FHSP\": \"\",\n" +
            "                \"FSRQ\": \"2018-10-12\",\n" +
            "                \"JZZZL\": \"3.00\",\n" +
            "                \"LJJZ\": \"1.5438\",\n" +
            "                \"NAVTYPE\": \"1\",\n" +
            "                \"SGZT\": \"开放申购\",\n" +
            "                \"SHZT\": \"开放赎回\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"ACTUALSYI\": \"\",\n" +
            "                \"DWJZ\": \"0.9782\",\n" +
            "                \"FHFCBZ\": \"\",\n" +
            "                \"FHFCZ\": \"\",\n" +
            "                \"FHSP\": \"\",\n" +
            "                \"FSRQ\": \"2018-10-11\",\n" +
            "                \"JZZZL\": \"-3.38\",\n" +
            "                \"LJJZ\": \"1.5145\",\n" +
            "                \"NAVTYPE\": \"1\",\n" +
            "                \"SGZT\": \"开放申购\",\n" +
            "                \"SHZT\": \"开放赎回\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"ACTUALSYI\": \"\",\n" +
            "                \"DWJZ\": \"1.0124\",\n" +
            "                \"FHFCBZ\": \"\",\n" +
            "                \"FHFCZ\": \"\",\n" +
            "                \"FHSP\": \"\",\n" +
            "                \"FSRQ\": \"2018-10-10\",\n" +
            "                \"JZZZL\": \"-4.38\",\n" +
            "                \"LJJZ\": \"1.5487\",\n" +
            "                \"NAVTYPE\": \"1\",\n" +
            "                \"SGZT\": \"开放申购\",\n" +
            "                \"SHZT\": \"开放赎回\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"ACTUALSYI\": \"\",\n" +
            "                \"DWJZ\": \"1.0588\",\n" +
            "                \"FHFCBZ\": \"\",\n" +
            "                \"FHFCZ\": \"\",\n" +
            "                \"FHSP\": \"\",\n" +
            "                \"FSRQ\": \"2018-10-09\",\n" +
            "                \"JZZZL\": \"0.07\",\n" +
            "                \"LJJZ\": \"1.5951\",\n" +
            "                \"NAVTYPE\": \"1\",\n" +
            "                \"SGZT\": \"开放申购\",\n" +
            "                \"SHZT\": \"开放赎回\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"ACTUALSYI\": \"\",\n" +
            "                \"DWJZ\": \"1.0581\",\n" +
            "                \"FHFCBZ\": \"\",\n" +
            "                \"FHFCZ\": \"\",\n" +
            "                \"FHSP\": \"\",\n" +
            "                \"FSRQ\": \"2018-10-08\",\n" +
            "                \"JZZZL\": \"0.86\",\n" +
            "                \"LJJZ\": \"1.5944\",\n" +
            "                \"NAVTYPE\": \"1\",\n" +
            "                \"SGZT\": \"开放申购\",\n" +
            "                \"SHZT\": \"开放赎回\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"isNewType\": false\n" +
            "    },\n" +
            "    \"ErrCode\": 0,\n" +
            "    \"PageIndex\": 2,\n" +
            "    \"PageSize\": 20,\n" +
            "    \"TotalCount\": 81\n" +
            "}";

    int multiple=5;
    @Test
    public void a() {

        //   double[] lv={-0.0035,-0.0159,-0.0576,-0.0347,-0.0098,0.0244,0.0502};
        double[] lv = ParsingData(data);
        double t = 10000;
        boolean flag = false;
        double price=t;
        double serviceFee=0.001;
        for (double v : lv) {
            System.out.print("["+v+"]");
        }
        System.out.println();
        feeComp(t, serviceFee, price,true,lv);

    }

    private double[] ParsingData(String data) {
        JSONObject jsonObject = JSON.parseObject(data);
        JSONObject p1 = (JSONObject) jsonObject.get("Data");
        List<JSONObject> lsjzList = (List<JSONObject>) p1.get("LSJZList");
        double[] lv = new double[lsjzList.size()];
        int i=0;
        for (JSONObject object : lsjzList) {
            double jzzzl = MathUtil.doubleDiv(object.getDouble("JZZZL"), 100,4);
            lv[i]=jzzzl;
            i++;
        }
        return lv;
    }

    private void feeComp(double t, double serviceFee, double price,boolean boll,double[] lv) {
        price = MathUtil.doubleMul(t, MathUtil.doubleSubtract(1,serviceFee));
        double allAdd=0;
        double allSub=0;
        if(!boll){
            multiple=0;
        }
        for (int i=0;i<lv.length;i++){
            price=formatNumber(MathUtil.doubleMul(price,1+lv[i]),3);
            if(lv[i]<0&&(i+1)%2==0){
                double write =formatNumber( MathUtil.doubleMul(MathUtil.doubleMul(Math.abs(lv[i]), t),multiple),3);
                System.out.println("第:"+(i+1)+"天,补仓为"+write);
                price=MathUtil.doubleAdd(price,write);
                t=MathUtil.doubleAdd(t,write);
                allSub = MathUtil.doubleAdd(allSub, lv[i]);
            }else if (lv[i]>0){
                allAdd = MathUtil.doubleAdd(allAdd, lv[i]);
            }

            System.out.println("第:"+(i+1)+"天,总金额为"+price+",本金为"+t);
        }
        double x = MathUtil.doubleDiv(MathUtil.doubleSubtract(price, t), t, 5);
        System.out.println("本金:"+t+",总额:"+price+",收益率:"+MathUtil.doubleMul(x,100)+"%"+",收益:"+MathUtil.doubleSubtract(price,t));
        System.out.println("sub: "+allSub+",add "+allAdd);
    }

    public Double formatNumber(Double money, int scale) {
        return MathUtil.doubleDiv(money, 1.0, scale);
    }
}
