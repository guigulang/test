package test;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.json.JSONObject;



public class MyTest {

	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub1eeeeeeeeee
		MyTest mt=new MyTest();
		
		String resStr="";
		String pStr1="4.36";
		Integer pInt=2;
		resStr=(Float.parseFloat(pStr1)*pInt)+"";
		System.out.println("--------resStr="+resStr);
		
//		 byte[] b={
//		0x68
//		,0x07,0x05,0x07,0x05,0x18,0x20
//		,0x68
//		,(byte) 0x91
//		,0x08
//		,0x33,0x33,0x33,0x33
//		,(byte) 0x9A
//		,0x56
//		,0x35
//		,0x33
//		,(byte) 0xDD
//		,0x16};
//		
//		String str=mt.getCheckEmNum(mt.getDealByte(mt.subBytes(b, 14, 4))).toString();
//		System.out.println("str=="+str);
		
		

//		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmssSSS");
//		Long dateMark=Long.parseLong(format.format(new Date()));
//		System.out.println("--------------dateMark="+dateMark);
		

		
		
		
		
		
//		Float res=0f;
//		res=(float) (0*100+0*10+0+25*0.01);
//		System.out.println("res="+res);
		
//		int[] ecNum= {0,0,0,25};
//		Float res=0f;
//		res=(float) (ecNum[0]*100+ecNum[1]*10+ecNum[2]+ecNum[3]*0.01);
//		System.out.println("--getCheckEmNum---res="+res);
//		
//		Integer var=25;
//		
//		System.out.println("--22---res="+Integer.toHexString(var));
		
		
		
		
		
//		 byte[] test={(byte)0xfe,(byte)0xfe,(byte)0xfe,(byte)0xfe
//				,0x68
//				,0x35,0x10,0x10,0x17,0x00,0x00
//				,0x68
//				,0x11
//				,0x04
//				,0x34,0x37,0x33,0x37
//				,0x26
//				,0x16};
//		
//		int res=0;
//		for(int i=4;i<test.length-2;i++) {
//			System.out.println("---test["+i+"]="+mt.toHexString1(test[i]));
////			res+=test[i]%256;
////			byte[] x_b= {test[i]};
////			int x=byteArrayToInt(x_b);
//			int x=Integer.valueOf(mt.toHexString1(test[i]), 16);
//			System.out.println("---test["+i+"]="+mt.toHexString1(test[i])+"-------------x="+x);
//			res+=x;
//		}
//		System.out.println("--------------------res="+res);
//		int y=res%256;
//		System.out.println("--------------------y="+y);
//		String z=Integer.toHexString(y);
//		System.out.println("--------------------z="+z);
		
		
		
		
//		byte b5=(byte) 0xfe;
//		byte b6=0x1c;
//
//		System.out.println("---------b5="+mt.toHexString1(b5));
//		System.out.println("---------b6="+mt.toHexString1(b6));
//		
//		
//		String code="000017101035";
//		
//		System.out.println("------1---code="+code.substring(10, 12));
//		System.out.println("-----2----code="+code.substring(8, 10));
//		
//		
//		byte b =0x69;
//		
//		String  s1="68";
//		
//		Integer x=Integer.valueOf(s1, 16);
//		System.out.println("---------x="+x);
//		byte b4 =x.byteValue();
//		System.out.println("---------b4="+mt.toHexString1(b4));
//		
//		
//		
//		String s2=Integer.toHexString(Integer.parseInt(s1));
//
//		System.out.println("---------s2="+s2);
//		
//		byte[] b2=Integer.toHexString(104).getBytes();
//		for(byte bb:b2) {
//			System.out.println("---------b2="+mt.toHexString1(bb));
//		}
//		
//		
//		
//		System.out.println("---------b="+b);
//		System.out.println("---------new String(b)="+mt.toHexString1(b));
//		
//		
//		byte[] b3= {b};
//		
//		System.out.println("------------b3="+mt.byteArrayToInt(b3));
		
		
//		String xx=null;
//		System.out.println("sss"+xx);
//		
//		float x=0f;
//		x=(float) (16*0.01+1+2*10+3*100);
//
//		System.out.println("x="+x);
//		
//		
//		String str="69 30 30 30 30 31 37 31 30 31 30 33 35 32 17";
//		
//		byte[] b= {(byte)0x32};
//		Integer res_int=mt.byteArrayToInt(b);
//		System.out.println("-----------res_int="+res_int);
//		
//		String res_s=new String(b);
//		System.out.println("-----------res_s="+res_s);
//
//		byte[] b2= {(byte)0x30,(byte)0x30,(byte)0x30,(byte)0x30,(byte)0x31,(byte)0x37
//				,(byte)0x31,(byte)0x30,(byte)0x31,(byte)0x30,(byte)0x33,(byte)0x35};
//
//		String res_s2=new String(b2);
//		System.out.println("-----------res_s2="+res_s2);
		
		
		
		
//		String msg="<div class=\"cl\"><table class=\"dt pg\" summary=\"全站禁止非法采集，如需数据请购买接口\"><tr><th>期号</th><th>1位</th><th>2位</th><th>3位</th><th>4位</th><th>时间</th></tr><tr><td><span id='qs_1' class='xs0'>第18121308期</span></td><td class='bm'><strong class='brs' style='color:#FFF;background-color:#a87ff6;'>4</strong></td><td class='bm'><strong class='brs' style='color:#FFF;background-color:#c4ca42;'>1</strong></td><td class='bm'><strong class='brs' style='color:#FFF;background-color:#8f14e4;'>7</strong></td><td class='bm'><strong class='brs' style='color:#FFF;background-color:#e4da3b;'>5</strong></td><td><span class='xs0' title='2018-12-13 09:41:45'>09:41</span></td></tr><tr class='alt'><td><span id='qs_2' class='xs0'>第18121307期</span></td><td class='bm'><strong class='brs' style='color:#FFF;background-color:#eccbc8;'>3</strong></td><td class='bm'><strong class='brs' style='color:#FFF;background-color:#c4ca42;'>1</strong></td><td class='bm'><strong class='brs' style='color:#FFF;background-color:#e4da3b;'>5</strong></td><td class='bm'><strong class='brs' style='color:#FFF;background-color:#eccbc8;'>3</strong></td><td><span class='xs0' title='2018-12-13 09:31:43'>09:31</span></td></tr><tr><td><span id='qs_3' class='xs0'>第18121306期</span></td><td class='bm'><strong class='brs' style='color:#FFF;background-color:#a87ff6;'>4</strong></td><td class='bm'><strong class='brs' style='color:#FFF;background-color:#e4da3b;'>5</strong></td><td class='bm'><strong class='brs' style='color:#FFF;background-color:#8f14e4;'>7</strong></td><td class='bm'><strong class='brs' style='color:#FFF;background-color:#c4ca42;'>1</strong></td><td><span class='xs0' title='2018-12-13 09:22:05'>09:22</span></td></tr><tr class='alt'><td><span id='qs_4' class='xs0'>第18121305期</span></td><td class='bm'><strong class='brs' style='color:#FFF;background-color:#eccbc8;'>3</strong></td><td class='bm'><strong class='brs' style='color:#FFF;background-color:#8f14e4;'>7</strong></td><td class='bm'><strong class='brs' style='color:#FFF;background-color:#a87ff6;'>4</strong></td><td class='bm'><strong class='brs' style='color:#FFF;background-color:#167909;'>6</strong></td><td><span class='xs0' title='2018-12-13 09:11:49'>09:11</span></td></tr><tr><td><span id='qs_5' class='xs0'>第18121304期</span></td><td class='bm'><strong class='brs' style='color:#FFF;background-color:#167909;'>6</strong></td><td class='bm'><strong class='brs' style='color:#FFF;background-color:#167909;'>6</strong></td><td class='bm'><strong class='brs' style='color:#FFF;background-color:#a87ff6;'>4</strong></td><td class='bm'><strong class='brs' ";
//		System.out.println(msg.length());
//		String str2="买接口\\\"><tr><th>期号</th><th>1位</th><th>2位</th><th>3位</th><th>4位</th><th>时间</th></tr><tr><td><span id='qs_1' class='xs0'>第18121308期</span></td><td class='bm'><strong class='brs' style='color:#FFF;background-color:#a87ff6;'>4</strong></td><td class='bm'><strong class='brs' style='color:#FFF;background-color:#c4ca42;'>1</strong></td><td class='bm'><strong class='brs' style='color:#FFF;background-color:#8f14e4;'>7</strong></td><td class='bm'><strong class='brs' style='color:#FFF;background-color:#e4da3b;'>5</strong></td><td><span class='xs0' title='2018-12-13 09:41:45'>09:41</span></td>";
//		System.out.println(str2.length());
//		String str3="全站禁止非法采集，如需数据请购买接口\"><tr><th>期号</th><th>1位</th><th>2位</th><th>3位</th><th>4位</th><th>时间</th></tr><tr>";
//		System.out.println(str3.length());
//		msg=msg.substring(msg.indexOf("全站禁止非法采集，如需数据请购买接口")+99,579 );
//		System.out.println(msg);
//		
//		System.out.println("------------msg="+msg);
//		String regEx_span = "<span[^>]*?>";
//		String regEx_strong = "<strong[^>]*?>";
//		Pattern p_span = Pattern.compile(regEx_span, Pattern.CASE_INSENSITIVE);
//        Matcher m_span = p_span.matcher(msg);
//        msg=m_span.replaceAll("");
//        Pattern p_strong = Pattern.compile(regEx_strong, Pattern.CASE_INSENSITIVE);
//        Matcher m_strong = p_strong.matcher(msg);
//        msg=m_strong.replaceAll("");
//        msg=msg.replaceAll("</span>", "");
//        msg=msg.replaceAll("</strong>", "");
//        msg=msg.replaceAll("期", "");
//        msg=msg.replaceAll("第", "");
//		System.out.println("-----1-------msg="+msg);
//        
//		msg="<tr>"+msg+"</tr>";
//		SAXReader reader = new SAXReader();
//		Document doc = reader.read(new ByteArrayInputStream(msg.getBytes("UTF-8")));
//		Element root=doc.getRootElement();
//		List trs = root.selectNodes("//tr");
//		List tds = root.selectNodes(".//td");
//		System.out.println("((Element) tds.get(0)).getText()="+((Element) tds.get(0)).getText());
//		//49 4F 54 2D 42 6F 61 72 64 2D 56 32 2E 32 00 00 08 20 02 08
//		String download="49 4F 54 2D 42 6F 61 72 64 2D 56 32 2E 32 00 00 08 20 02 08";
//		String[] dl=download.split(" ");
//		byte[] bb=new byte[20];
//		bb[0]=(byte)0x49;
//		bb[1]=(byte)0x4F;
//		bb[2]=(byte)0x54;
//		bb[3]=(byte)0x2d;
//		bb[4]=(byte)0x42;
//		bb[5]=(byte)0x6f;
//		bb[6]=(byte)0x61;
//		bb[7]=(byte)0x72;
//		bb[8]=(byte)0x64;
//		bb[9]=(byte)0x2d;
//		bb[10]=(byte)0x56;
//		bb[11]=(byte)0x32;
//		bb[12]=(byte)0x2e;
//		bb[13]=(byte)0x32;
//		bb[14]=(byte)0x00;
//		bb[15]=(byte)0x00;
//		bb[16]=(byte)0x08;
//		bb[17]=(byte)0x20;
//		bb[18]=(byte)0x02;
//		bb[19]=(byte)0x08;
//		
//		String str=new String(bb);
//		System.out.println("str="+str);
		
//		TcpLogOta re_tlo=new TcpLogOta();
//		re_tlo=null;
//		re_tlo.setDevId(1l);
		
		
//		//30 00 00 00 00 00 00 00
//		byte[] bb=new byte[8];
//		bb[0]=0x30;
//		
//		Long x=mt.bytesToLong(bb);
//		System.out.println("x="+x);
		
		
//		String download="aa bb 14 64 63 3a 34 66 3a 32 32 3a 35 32 3a 33 39 3a 36 06 30 00 00 00 00 00 00 00 09 00 00 00 00 00 00 00 66 66 a6 3f e8 25 01 00 00 00 00 00 93 00 00 00 00 01 00 00 00 00 02 00 00 fc 4d a8 b1 fc a0 0f f0 e5 fa 02 20 68 70 00 24 03 f0 10 fd 64 1c e4 b2 02 2c f9 d3 68 78 01 28 13 d0 02 28 19 d1 bd e8 70 40 f8 a0 0f f0 d2 ba fd a0 0f f0 cf fa 01 20 68 70 00 24 03 f0 fa fc 64 1c 14 f0 ff 04 f9 d0 e8 e7 4f f4 fa 60 07 f0 93 fc bd e8 70 40 05 f0 d2 bc 70 bd 00 24 25 46 f7 a0 0f f0 b7 fa e3 4e 32 20 0a f0 d5 fb 01 20 07 f0 30 fb 01 28 0a d1 f7 a0 0f f0 ab fa 64 1c e4 b2 14 2c 03 d9 70 78 00 24 01 28 03 d0 30 79 01 28 26 d0 27 e0 f3 48 0f f0 9c fa f2 48 f3 a1 f9 4f 0a 68 40 f8 46 2f 89 88 81 80 30 21 81 71 f0 a1 38 46 04 f0 46 fa 64 20 0a f0 ad fb f3 a1 38 46 04 f0 3f fa 64 20 0a f0 a6 fb f2 a1 38 46 04 f0 38 fa 64 20 0a f0 9f fb 00 20 f0 70 01 20 30 71 03 f0 96 fc 6d 1c ed b2 50 2d bc d9 00 25 2c 46 b9 e7 ed a0 0f f0 6d fa 00 23 bd 4c 5f 1e 3a 46 19 46 60 6c 09 f0 22 fe f4 a0 0f f0 62 fa dd 4d f6 a1 28 46 04 f0 15 fa 00 23 1a 46 19 46 60 6c 09 f0 13 fd 41 f2 88 38 40 46 0a f0 74 fb f1 a0 0f f0 4f fa 40 f6 b8 39 00 26 48 46 0a f0 6b fb 60 78 01 28 05 d0 02 28 f7 d1 64 20 0a f0 63 fb f3 e7 42 f2 28 30 0a f0 5e fb 20 89 05 28 0a d9 f2 a1 28 46 04 f0 ed f9 40 46 0a f0 54 fb 26 81 60 89 40 1c 60 81 ef a0 0f f0 2b fa 00 23 3a 46 19 46 60 6c 09 f0 e2 fd d4 a0 0f f0 22 fa d2 a1 28 46 04 f0 d6 f9 00 23 1a 46 19 46 60 6c 09 f0 d4 fc 4f f4 fa 60 0a f0 36 fb e0 78 70 b1 05 28 0c d0 01 28 35 d0 04 28 33 d0 03 28 31 d0 02 28 c3 d1 5f f0 64 00 0a f0 26 fb be e7 00 23 3a 46 19 46 60 6c 09 f0 ba fd e2 a0 0f f0 fa f9 e0 a1 28 46 04 f0 ae f9 00 23 1a 46 19 46 60 6c 09 f0 ac fc 41 f2 94 10 0a f0 0e fb 9a 4b 40 f2 00 00 bb aa";
//		String[] dl=download.split(" ");
//		System.out.println("dl.length="+dl.length);
		
//		Long fw_len=75240l;
//		byte[] b_len=mt.long2Bytes(fw_len);
//	      System.out.print("sv:");
//			for(byte b:b_len) {
//		  		System.out.print(" "+mt.byteToHex(b));
//		  	}
//			System.out.println();
//			
//			Long fw_len2=mt.bytesToLong(b_len);
//			System.out.println("fw_len2="+fw_len2);
//
//			Integer fw_p=147;
//			byte[] b_p=mt.intToButeArray2(fw_p);
//		      System.out.print("sv:");
//				for(byte b:b_p) {
//			  		System.out.print(" "+mt.byteToHex(b));
//			  	}
//				System.out.println();
		
			
			
			
//		Float sv=1.3f;
//		byte[] b_sv=mt.float2ByteArray(sv);
//	      System.out.print("sv:");
//			for(byte b:b_sv) {
//		  		System.out.print(" "+mt.byteToHex(b));
//		  	}
//			System.out.println();
//			
//			
//			Float sv2=mt.byteToFloat(b_sv);
//			System.out.println("sv2="+sv2);
		
		
//		String path="localhost:8080/Neldiot/uploadFile/1542356978281.bin";
//		//获取文件名
//		int fn_index=path.lastIndexOf('/')+1;
//		String fileName=path.substring(fn_index);
//		System.out.println("fileName="+fileName);
//		String r_path="F:\\Program Files\\Apache Software Foundation\\Tomcat 7.0\\webapps\\Neldiot\\uploadFile\\"+fileName;
//		System.out.println("r_path="+r_path);
//		
//		
//		
//		
////		String file_path="F:\\国立光电\\机器车\\USART.bin";
//		String file_path=r_path;
//		byte[]	file_b=mt.getBytes(file_path);
//		System.out.println("-------文件数据----start----"+file_b.length);
////		System.out.println();
////		for(byte b_t:file_b) {
////			System.out.print(mt.toHexString1(b_t)+" ");
////		}
////		System.out.println();
//		System.out.println("-------文件数据---end-----");
//		List<byte[]> b_li=mt.getBytes_li(file_b,512);
//		System.out.println("--------b_li.size()="+b_li.size());
//		for(byte[] b_temp:b_li) {
//			System.out.println("b_temp.length="+b_temp.length);
//		}
		
		
//		List<String> test_li=new ArrayList<String>();
//		test_li.add("aaa");
//		test_li.add("bbb");
//		test_li.add("ccc");
//		
//		String  test_s="aaa";
//		String  test_s2="eee";
//		
//		System.out.println("------------test_s---="+test_li.contains(test_s));
//		System.out.println("------------test_s2---="+test_li.contains(test_s2));
		
		
//		System.out.println("--------------"+mt.getStringRandom(5)+"--------------");
//		mt.forTest(2);
//		mt.testAylJson();
		
//		byte[] b=new byte[4];
//		b[0]=0;
//		b[1]=0;
//		b[2]=-69;
//		b[3]=-86;
//		Integer test=mt.byteArrayToInt(b);
//		System.out.println("--------------test="+test+"--------------");
//		
//		byte[] b2=new byte[2];
//		b2[0]=-69;
//		b2[1]=-86;
//		Integer test2=mt.byteArrayToInt(b2);
//		System.out.println("--------------test2="+test2+"--------------");
//		
//
//		byte[] b3=new byte[2];
//		System.arraycopy(b, 2, b3, 0, 2);
//		Integer test3=mt.byteArrayToInt(b3);
//		System.out.println("--------------test3="+test3+"--------------");
//		
//		
//		
//		Long x=1l;
//		byte[] b_l=new byte[8];
//		b_l[0]=0;
//		b_l[1]=0;
//		b_l[2]=0;
//		b_l[3]=0;
//		b_l[4]=0;
//		b_l[5]=0;
//		b_l[6]=0;
//		b_l[7]=1;
//		Long res=mt.bytesToLong(b_l);
//		System.out.println("--------------res="+res+"--------------");

//		byte[] b_l2=new byte[1];
//		b_l2[0]=1;
//		Long res2=mt.bytesToLong(b_l2);
//		System.out.println("--------------res2="+res2+"--------------");
		
		
		
//		TcpModel mod=new TcpModel();
//		mod.setFrameType(1);
//		mod.setDevSN("dc:4f:22:52:2c:4");
//		mod.setDevType(6);
//		
//		byte[] bb=mt.responseHead(mod);
//		for(byte b:bb) {
//			System.out.println(b);
//		}
		

//		mod.setDevId(32l);
//		byte b_devId =mod.getDevId().byteValue();
//		System.out.println(b_devId);
		
		
//		byte[] b_int=mt.intToButeArray(18);
//		System.out.println("--------------b_int.length="+b_int.length);
		
//		Long at=System.currentTimeMillis();
//		System.out.println("--------------at="+at);
//		
//		byte[] b_long=mt.longToBytes(at);
//		System.out.println("--------------b_long.length="+b_long.length);

//		System.out.println(ByteOrder.nativeOrder());
//		
//		
//		byte[] b_int=mt.intToButeArray(-1929379840);
//		
//		for(byte b:b_int) {
//			System.out.println("b="+mt.byteToHex(b));
//		}
//		System.out.println("=================11==================");
//
//		byte[] l_byte=mt.toLH(1224736768);
//		for(byte b:l_byte) {
//			System.out.println("b="+mt.byteToHex(b));
//		}
//		System.out.println("=================22==================");
//		byte[] h_bye= {(byte)0x0,(byte)0x0,(byte)0x0,(byte)0x8d};
//		for(byte b:h_bye) {
//			System.out.println("b="+mt.byteToHex(b));
//		}
//		int h_byte=mt.byteArrayToInt(h_bye);
//		System.out.println("int h_byte="+h_byte);
//		
//		int i = ByteBuffer.wrap(l_byte).order(ByteOrder.BIG_ENDIAN).getInt();
//		System.out.println("int i="+i);
		
//		byte[] b_devId = mt.long2Bytes(32l);
//		for(byte b:b_devId) {
//			System.out.println("b="+mt.byteToHex(b));
//		}
//		
//		b_devId=ByteBuffer.wrap(b_devId).order(ByteOrder.LITTLE_ENDIAN).array();
//		for(byte b:b_devId) {
//			System.out.println("l---b="+mt.byteToHex(b));
//		}
//		
//		b_devId=ByteBuffer.wrap(b_devId).order(ByteOrder.BIG_ENDIAN).array();
//		for(byte b:b_devId) {
//			System.out.println("b---b="+mt.byteToHex(b));
//		}
//		
//
//		ByteBuffer buffer=ByteBuffer.allocate(8);
//		buffer.put(b_devId);
//		buffer.rewind();
//		buffer.order(ByteOrder.BIG_ENDIAN);
//		byte[]	devId2=buffer.array();
//		for(byte b:devId2) {
//			System.out.println("zzz---b="+mt.byteToHex(b));
//		}
		
		
//		byte[] b_devId = mt.long2Bytes(32l);
//		
//		byte[] b_devId2=ByteBuffer.wrap(b_devId).order(ByteOrder.BIG_ENDIAN).array();
//		for(byte b:b_devId2) {
//		System.out.println("zzz---b="+mt.byteToHex(b));
//	}
//        byte[] b_devId3=ByteBuffer.wrap(b_devId).order(ByteOrder.LITTLE_ENDIAN).array();
//        for(byte b:b_devId3) {
//    		System.out.println("zzz---b="+mt.byteToHex(b));
//    	}
//		
//        ByteBuffer bb = ByteBuffer.wrap(new byte[8]);
//        // 存入字符串
//        bb.asCharBuffer().put("abcd");
//        bb.put(b_devId);
//        System.out.println(Arrays.toString(bb.array()));
//
//        // 反转缓冲区
//        bb.rewind();
//        // 设置字节存储次序
//        bb.order(ByteOrder.BIG_ENDIAN);
//        bb.asCharBuffer().put("abcd");
//        System.out.println(Arrays.toString(bb.array()));
//
//        // 反转缓冲区
//        bb.rewind();
//        // 设置字节存储次序
//        bb.order(ByteOrder.LITTLE_ENDIAN);
//        bb.asCharBuffer().put("abcd");
//        System.out.println(Arrays.toString(bb.array()));
        
        

//        ByteBuffer bb2 = ByteBuffer.wrap(new byte[8]);
//        bb2.order(ByteOrder.BIG_ENDIAN);
//        bb2.putLong(32l);
//        System.out.print("bb2:");
//		for(byte b:bb2.array()) {
//	  		System.out.print(" "+mt.byteToHex(b));
//	  	}
//		System.out.println();
//		
//		
//        ByteBuffer bb3 = ByteBuffer.wrap(new byte[8]);
//        bb3.order(ByteOrder.LITTLE_ENDIAN);
//        bb3.putLong(32l);
//        System.out.print("bb3:");
//		for(byte b:bb3.array()) {
//	  		System.out.print(" "+mt.byteToHex(b));
//	  	}
//		System.out.println();
//        
//
//		Long devId=mt.bytesToLong(bb3.array());
//		System.out.println("devId="+devId);
//
//		byte[] bb=ByteBuffer.wrap(bb3.array()).order(ByteOrder.BIG_ENDIAN).array();
//        
//      for(byte b:bb) {
//  		System.out.println("zzz---b="+mt.byteToHex(b));
//  	}
        
		
//		long at=System.currentTimeMillis()/1000;
//      	System.out.println("at:"+at);
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//    	GregorianCalendar gc = new GregorianCalendar(); 
//    	gc.setTimeInMillis(at);
//      	String ss=format.format(gc.getTime());
//      	System.out.println("ss:"+ss);
      	
		
		
		
		
		//-1146486784，-1430585344
//      	byte[] b_i1=mt.intToButeArray(-1430585344);
//      System.out.print("b_i1:");
//		for(byte b:b_i1) {
//	  		System.out.print(" "+mt.byteToHex(b));
//	  	}
//		System.out.println();
//      	
//		byte[] b_i3= {b_i1[2],b_i1[3]};
//		Integer res_int=mt.byteArrayToInt(b_i1);
//		System.out.println("res_int="+res_int);
//      	
//		byte[] b_i2=mt.intToButeArray2(-1430585344);
//	      System.out.print("b_i2:");
//			for(byte b:b_i2) {
//		  		System.out.print(" "+mt.byteToHex(b));
//		  	}
//			System.out.println();
			
//			
//		Integer parseInt = Integer.parseInt("0a", 16);
//			System.out.println(parseInt);
//			
//			byte b_t=parseInt.byteValue();
//			
//
//			System.out.println(mt.byteToHex(b_t));
//			
//			
//			String hexString = Integer.toHexString(parseInt);
//			System.out.println(hexString);
		
		
//		float a=36f;
//		float b=12f;
//		float c=6.5f;
//		float C=0.11f;
//		double X=2f/3f;
//		System.out.println("------------------X="+X);
//		
//		float cjb=(2*a*(b+c))/(4*b*c);
//		
//		System.out.println("cjb="+cjb);
//		
//
//		
//		double V=a*b*c;
//		System.out.println("V="+V);
//		
//		
//		double A=10*C*Math.pow(V, X);
//		System.out.println("A="+A);
//		
//		
//		float a2=18f;
//
//		float cjb2=(2*a2*(b+c))/(4*b*c);
//		
//		System.out.println("cjb2="+cjb2);
//
//		
//		double V2=a2*b*c;
//		System.out.println("V2="+V2);
//		
//		
//		double A2=10*C*Math.pow(V2, X);
//	
//		System.out.println("A2="+A2);
//		
//		
//		System.out.println("------------------Math.pow(V, X)="+Math.pow(V, X));
//		System.out.println("------------------Math.pow(V2, X)="+Math.pow(V2, X));
		
		
		
		
		
	}

	private byte[] subBytes(byte[] src, int begin, int count) {
        byte[] bs = new byte[count];
        System.arraycopy(src, begin, bs, 0, count);
        return bs;
    }
	
	//协议数据处理 减33并反序
	private int[] getDealByte(byte[] b) {
		
		if(b.length<=0)return null;
		int[] res=new int[b.length];
		for(int i=0;i<b.length;i++) {
			res[b.length-1-i]=Integer.parseInt(Integer.toHexString(Integer.valueOf(this.toHexString1(b[i]), 16)-Integer.valueOf("33", 16)));
		}
		return res;
	}

	//电量值返回
	private Float getCheckEmNum(int[] ecNum) {
		
		if(ecNum.length!=4)return null;
		Float res=0f;
		res=(float) (ecNum[0]*10000+ecNum[1]*100+ecNum[2]+ecNum[3]*0.01);
		return res;
	}
	
	 public static String makeChecksum(String data) {
		  if (data == null || data.equals("")) {
		   return "";
		  }
		  int total = 0;
		  int len = data.length();
		  int num = 0;
		  while (num < len) {
		   String s = data.substring(num, num + 2);
		   System.out.println(s);
		   total += Integer.parseInt(s, 16);
		   num = num + 2;
		  }
		  /**
		   * 用256求余最大是255，即16进制的FF
		   */
		  int mod = total % 256;
		  String hex = Integer.toHexString(mod);
		  len = hex.length();
		  // 如果不够校验位的长度，补0,这里用的是两位校验
		  if (len < 2) {
		   hex = "0" + hex;
		  }
		  return hex;
		 }
	
	
	
	
    /**
     * 字符串转化成为16进制字符串
     * @param s
     * @return
     */
    private String strTo16(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            int ch = (int) s.charAt(i);
            String s4 = Integer.toHexString(ch);
            str = str + s4;
        }
        return str;
    }
	
	
    private byte[] intToButeArray2(int n) {
    	
    	//改字节序
   	 ByteBuffer bb = ByteBuffer.wrap(new byte[4]);
        bb.order(ByteOrder.LITTLE_ENDIAN);
        bb.putInt(n);
   	return bb.array();
    	
    	}
	
	 /**
     * 将int转为低字节在前，高字节在后的byte数组
     * @param n int
     * @return byte[]
     */ 
   public static byte[] toLH(int n) { 
     byte[] b = new byte[4]; 
     b[0] = (byte) (n & 0xff); 
     b[1] = (byte) (n >> 8 & 0xff); 
     b[2] = (byte) (n >> 16 & 0xff); 
     b[3] = (byte) (n >> 24 & 0xff); 
     return b; 
   }  
    
   /**
     * 将int转为高字节在前，低字节在后的byte数组
     * @param n int
     * @return byte[]
     */ 
   public static byte[] toHH(int n) { 
     byte[] b = new byte[4]; 
     b[3] = (byte) (n & 0xff); 
     b[2] = (byte) (n >> 8 & 0xff); 
     b[1] = (byte) (n >> 16 & 0xff); 
     b[0] = (byte) (n >> 24 & 0xff); 
     return b; 
   }  

    //响应头
    private byte[] responseHead(TcpModel mod) {
    	byte[] r_b=new byte[20];
    	
    	byte[] f_head=this.intToButeArray(43707);
    	System.out.println("f_head.length="+f_head.length);
    	byte[] f_type=this.intToButeArray(mod.getFrameType()+1);
    	System.out.println("f_type.length="+f_type.length);
    	byte[] f_sn=mod.getDevSN().getBytes();
    	System.out.println("f_sn.length="+f_sn.length);
    	byte[] dev_type=this.intToButeArray(mod.getDevType());
    	System.out.println("dev_type.length="+dev_type.length);
    	
    	System.arraycopy(f_head, 2, r_b, 0, 2);
    	System.arraycopy(f_type, 3, r_b, 2, 1);
    	System.arraycopy(f_sn, 0, r_b, 3, f_sn.length);
    	System.arraycopy(dev_type, 3, r_b, 19, 1);
    	
    	return r_b;
    }
	//43707,48042
    private byte[] intToButeArray(int n) {
    	byte[] byteArray = null;
    	try {
    	ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
    	DataOutputStream dataOut = new DataOutputStream(byteOut);
    	dataOut.writeInt(n);
    	byteArray = byteOut.toByteArray();
    	for (byte b : byteArray) {
//    	System.out.println(" " + b);
    	}
    	} catch (IOException e) {
    	e.printStackTrace();
    	}
    	return byteArray;
    	}
    
    private byte[] long2Bytes(long num) {
//        byte[] byteNum = new byte[8];
//        for (int ix = 0; ix < 8; ++ix) {
//            int offset = 64 - (ix + 1) * 8;
//            byteNum[ix] = (byte) ((num >> offset) & 0xff);
//        }
//        return byteNum;
    	//改字节序
   	 ByteBuffer bb = ByteBuffer.wrap(new byte[8]);
        bb.order(ByteOrder.LITTLE_ENDIAN);
        bb.putLong(num);
   	return bb.array();
    }
    
    public static long bytesToLong(byte[] bytes) {

    	ByteBuffer buffer = ByteBuffer.allocate(8);
        buffer.order(ByteOrder.LITTLE_ENDIAN);
    	byte[] b= {0,0,0,0,0,0,0,0};
    	int n=7;
		for(int i=bytes.length-1;i>=0;i--) {
			b[n--]=bytes[i];
		}
        buffer.put(b, 0, b.length);

        buffer.flip();//need flip 
        return buffer.getLong();
        
        
        
    }
	
    public static int byteArrayToInt(byte[] bb) {   

    	ByteBuffer buffer = ByteBuffer.allocate(4);
        buffer.order(ByteOrder.LITTLE_ENDIAN);
    	
    	byte[] b= {0,0,0,0};
    	if(bb.length>4) {
    		System.out.println("int转换异常，字节过长！");
    		return -1;
    	}
    	
    		int n=3;
    		for(int i=bb.length-1;i>=0;i--) {
    			b[n--]=bb[i];
    		}
//    		return   b[3] & 0xFF |   
//    	            (b[2] & 0xFF) << 8 |   
//    	            (b[1] & 0xFF) << 16 |   
//    	            (b[0] & 0xFF) << 24;   
    		buffer.put(b, 0, b.length);

            buffer.flip();//need flip 
            return buffer.getInt();
    		
    	}
    
    private byte[] float2ByteArray (float value)
    {  
    	ByteBuffer buffer = ByteBuffer.allocate(4);
    	buffer.order(ByteOrder.LITTLE_ENDIAN);
         return buffer.putFloat(value).array();
    }

    private Float byteToFloat(byte[] bytes) {
    	

    	ByteBuffer buffer = ByteBuffer.allocate(4);
        buffer.order(ByteOrder.LITTLE_ENDIAN);
    	byte[] b= {0,0,0,0};
    	int n=3;
		for(int i=bytes.length-1;i>=0;i--) {
			b[n--]=bytes[i];
		}
        buffer.put(b, 0, b.length);
        buffer.flip();//need flip 
        return buffer.getFloat();
    	
//    	
//    	DataInputStream dis=new DataInputStream(new ByteArrayInputStream(bytes));
//    	Float f=null;
//		try {
//			f = dis.readFloat();
//	        dis.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        return f;
    }
    
    
    
	private void testAylJson() {
		String result="{\"private\":true,\"create_time\":\"2018-10-08 16:28:30\",\"obsv\":true,\"ack\":true,\"auth_info\":{\"865820031989333\":\"460043985601549\"},\"imsi\":\"460043985601549\",\"title\":\"NLED-V01-00059\",\"tags\":[],\"protocol\":\"LWM2M\",\"rg_id\":\"865820031989333\",\"imsi_old\":[\"460043985601549\"],\"imsi_mt\":\"Mon Oct 08 16:29:56 CST 2018\",\"online\":false,\"location\":{\"lon\":0,\"lat\":0},\"id\":\"45961174\"}";
		System.out.println("result:"+result);
		JSONObject jsonObject = new JSONObject(result);
		String test=jsonObject.getString("imsi_mt");
		System.out.println("test:"+test);
	
	
	
	}
	
	
	
	
	private void forTest(int x) {
		for(int i=0;i<x;i++) {
			System.out.println("--i="+i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("-------xxx-------i=");
	}
	
	//生成随机数字和字母,  
    private String getStringRandom(int length) {  
          
        String val = "";  
        Random random = new Random();  
          
        //参数length，表示生成几位随机数  
        for(int i = 0; i < length; i++) {  
              
            String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";  
            //输出字母还是数字  
            if( "char".equalsIgnoreCase(charOrNum) ) {  
                //输出是大写字母还是小写字母  
                int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;  
                val += (char)(random.nextInt(26) + temp);  
            } else if( "num".equalsIgnoreCase(charOrNum) ) {  
                val += String.valueOf(random.nextInt(10));  
            }  
        }  
        return val;  
    }  
    
    /** 
     * 字节转十六进制 
     * @param b 需要进行转换的byte字节 
     * @return  转换后的Hex字符串 
     */  
    public static String byteToHex(byte b){  
        String hex = Integer.toHexString(b & 0xFF);  
        if(hex.length() < 2){  
            hex = "0" + hex;  
        }  
        return hex;  
    }  

    private String toHexString1(byte b){
        String s = Integer.toHexString(b & 0xFF);
        if (s.length() == 1){
            return "0" + s;
        }else{
            return s;
        }
    }
    
    
    /** 
     * byte数组分拆数据包
     */  
    private List<byte[]> getBytes_li(byte[] b_all,int sp_len){  
    	
    	List<byte[]> b_li=new ArrayList<byte[]>();
    	
    	if(b_all.length<=sp_len) {
    		b_li.add(b_all);
    		return b_li;
    	}
    	
    	//计算拆包数
    	int count=b_all.length%sp_len==0?b_all.length/sp_len:b_all.length/sp_len+1;
//    	System.out.println("---------count="+count);
    	
    	for(int i=0;i<count;i++) {
    		int b_len=i==count-1?b_all.length%sp_len:sp_len;
//    		System.out.println("b_len="+b_len);
    		byte[] b_temp=new byte[b_len];
//    		System.out.println("start="+(i==0?0:i*sp_len+1));
    		System.arraycopy(b_all, i*sp_len, b_temp, 0, b_len);
    		b_li.add(b_temp);
//    		System.out.println("["+i+"]b_temp.length="+b_temp.length);
    	}
        return b_li;  
    }
    
    /** 
     * 获得指定文件的byte数组 
     */  
    private byte[] getBytes(String filePath){  
        byte[] buffer = null;  
        try {  
            File file = new File(filePath);  
            FileInputStream fis = new FileInputStream(file);  
            ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);  
            byte[] b = new byte[1024];  
            int n;  
            while ((n = fis.read(b)) != -1) {  
                bos.write(b, 0, n);  
            }  
            fis.close();  
            bos.close();  
            buffer = bos.toByteArray();  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        return buffer;  
    }
    
    /** 
     * 根据byte数组，生成文件 
     */  
    public static void getFile(byte[] bfile, String filePath,String fileName) {  
        BufferedOutputStream bos = null;  
        FileOutputStream fos = null;  
        File file = null;  
        try {  
            File dir = new File(filePath);  
            if(!dir.exists()&&dir.isDirectory()){//判断文件目录是否存在  
                dir.mkdirs();  
            }  
            file = new File(filePath+"\\"+fileName);  
            fos = new FileOutputStream(file);  
            bos = new BufferedOutputStream(fos);  
            bos.write(bfile);  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            if (bos != null) {  
                try {  
                    bos.close();  
                } catch (IOException e1) {  
                    e1.printStackTrace();  
                }  
            }  
            if (fos != null) {  
                try {  
                    fos.close();  
                } catch (IOException e1) {  
                    e1.printStackTrace();  
                }  
            }  
        }  
    }  
}
