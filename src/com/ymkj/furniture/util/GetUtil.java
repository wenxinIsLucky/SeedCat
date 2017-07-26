package com.ymkj.furniture.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.ymkj.furniture.util.VARIABLE;

/**
 * Note:各种工具方法
 * 
 * @author Pen Data:2016-5-19
 */
public class GetUtil {

	static Logger log = Logger.getLogger(GetUtil.class);

	
	
	
	// 去除char�?的字�?
	public static String formatString(String ins) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < ins.length(); i++) {
			int s = ins.charAt(i);
			if (s != 0) {
				sb.append((char) s);
			}
		}
		return sb.toString();
	}
		
		
		
		
	/**
	 * Note:获取JSON中的字段
	 * 
	 * @author Pen(彭万�? Data:2016-5-27
	 * @param json
	 * @param field
	 * @return
	 */
	public static String getField(String json, String field) {
		try {
			JSONObject jo = new JSONObject(json);
			return jo.get(field).toString();
		} catch (Exception e) {
			System.out.println("getUtil - getField:" + e.getMessage());
			return null;
		}
	}

	/**
	 * Note:去除空格
	 * 
	 * @author Pen(彭万�? Data:2016-5-25
	 * @param str
	 * @return
	 */
	public static String replaceBlank(String str) {
		String dest = "";
		if (str != null) {
			Pattern p = Pattern.compile("\\s*|\t|\r|\n");
			Matcher m = p.matcher(str);
			dest = m.replaceAll("");
		}
		return dest;
	}

	/**
	 * Note:根据code获取用户的openid和accessToken
	 * 
	 * @author Pen(彭万�? Data:2016-5-27
	 * @param code
	 * @return
	 */
	public static String[] getOpenIdAndAccessToken(String code) {
		String uri = "https://api.weixin.qq.com/sns/oauth2/access_token?appid="
				+ VARIABLE.APPID + "&secret=" + VARIABLE.SECRET + "&code="
				+ code + "&grant_type=authorization_code";
		String result = URLRequest.requestURL(uri, null);
		String errcode = null;
		try {
			try {
				errcode = GetUtil.getField(result, "errcode");
			} catch (Exception e) {
				errcode = null;
			}

			if (errcode == null) {
				String openId = getField(result, "openid");
				String access_token = getField(result, "access_token");
				String[] sz = new String[2];
				sz[0] = openId;
				sz[1] = access_token;
				return sz;
			} else {
				System.out.println("getOpenIdAndAccessToken :" + errcode);
				return null;
			}
		} catch (Exception e) {
			System.out.println("getOpenIdAndAccessToken :" + e.getMessage());
			return null;
		}
	}
	

	/**
	 * Note:获取二维�?
	 * 
	 * @author Pen(彭万�? Data:2016-5-27
	 * @param uid
	 * @return
	 */
	public static String getPicUrl(Integer uid) {
		String url = "https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token="
				+ VARIABLE.ACCESS_TOKEN;
		String par = "{\"expire_seconds\": 2592000, \"action_name\": \"QR_SCENE\", \"action_info\": {\"scene\": {\"scene_id\": "
				+ uid + "}}}";
		// 请求获得ticket
		String result = URLRequest.requestURL(url, par);

		String ticket = GetUtil.getField(result, "ticket");
		String pic_url = "https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket="
				+ URLEncoder.encode(ticket);
		
		return pic_url;
	}

	/**
	 * Note:根据用户OpenId获取用户信息
	 * 
	 * @author Pen(彭万�? Data:2016-5-27
	 * @param openId
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public static String getUserMessageByOpenId(String openId) throws UnsupportedEncodingException {
		String url = "https://api.weixin.qq.com/cgi-bin/user/info?access_token="
				+ VARIABLE.ACCESS_TOKEN + "&openid=" + openId + "&lang=zh_CN";
		String result = URLRequest.requestURL2(url, null);
		return result;
	}

	/**
	 * Note:刷新微信Token
	 * 
	 * @author Pen(彭万�? Data:2016-5-27
	 * @return
	 */
	public static String getMyToken() {
		String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="
				+ VARIABLE.APPID + "&secret=" + VARIABLE.SECRET;
		String result = URLRequest.requestURL(url, null);
		String access_token = GetUtil.getField(result, "access_token");
		return access_token;
	}
	
	
	/**
	 * Note:MD5加密
	 * 
	 * @author Pen(彭万�? Data:2016-5-27
	 * @param s
	 * @return
	 */
	public final static String MD5(String s) {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'A', 'B', 'C', 'D', 'E', 'F' };
		try {
			byte[] btInput = s.getBytes();
			MessageDigest mdInst = MessageDigest.getInstance("MD5");
			mdInst.update(btInput);
			byte[] md = mdInst.digest();
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
	/**
	 * Note:拼接登录URL
	 * @author Pen(彭万�?
	 * Data:2016-5-31
	 * @param uri
	 * @return
	 */
	public static String getLoginUrl(String uri){
		String url = "redirect:https://open.weixin.qq.com/connect/oauth2/authorize?appid="+VARIABLE.APPID+"&redirect_uri=http%3A%2F%2Fm.yywluo.cn%2FuserLogin&response_type=code&scope=snsapi_base&state="+uri+"#wechat_redirect";
		return url;
	}

}
