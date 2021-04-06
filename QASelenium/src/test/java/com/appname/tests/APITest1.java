package com.appname.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.appname.base.AppnameBaseTestCase;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class APITest1 extends AppnameBaseTestCase{
	
  @Test
  public void f() throws IOException {
	  
	  Response resp = RestAssured.get(url);
	  if(resp!=null) {
		  System.out.println(resp.statusCode());
		  System.out.println(resp.contentType());
		  System.out.println(resp.timeIn(TimeUnit.SECONDS));
		  JsonPath respbody = JsonPath.from(resp.getBody().asInputStream());
		  System.out.println(respbody);
		  System.out.println(respbody.get("data.email"));
		  System.out.println("Enter id:");
		  int id = System.in.read();
		  System.out.println("Details requested are below:");
		  System.out.println(respbody.getMap("data.id["+id+"]"));
		  
//		  //Json object
//		  JSONObject jo = new JSONObject();
//		  jo.get(key)
//		  
		  JSONObject name = new JSONObject();
		  
	  }
	  
  
  }
  
  
  @Test
  public void headersend() {
	  
	  
	  
	  
  }
  
}
