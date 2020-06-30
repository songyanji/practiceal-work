package com.icss.mvc.controller;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.icss.mvc.dao.MybatisUtil;
import com.icss.mvc.dao.StudentDao;
import com.icss.mvc.entity.Client;
import com.icss.mvc.entity.Student;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import com.sun.prism.Graphics;
import com.sun.prism.paint.Color;

import javafx.scene.text.Font;

@Controller
public class photocontroller {
	@RequestMapping("uploadTest")
	  @ResponseBody
	  public String fun(@RequestParam("photo") MultipartFile upfile,
	      Client client,HttpServletRequest request) throws Exception {
	    System.out.println("upload---------------------"+upfile.getOriginalFilename());
	    System.out.println("upload---------------------"+upfile.getName());
	    System.out.println("upload---------------------"+client.getClientName());
	    String path=request.getServletContext().getRealPath("/");
	    String savename=client.getClientName()+System.currentTimeMillis()+".jpg";

	    File file=new File(path+"upload/"+savename);
	    upfile.transferTo(file);
	    return "success";
	  }
	  @RequestMapping("addStuPhoto")
	  @ResponseBody
	  public String fun1(@RequestParam("upphoto") MultipartFile upfile,
	      Student stu,HttpServletRequest request) throws Exception {
	    
	    System.out.println("upload---------------------"+upfile.getOriginalFilename());
	    String path=request.getServletContext().getRealPath("/");
	    stu.setPhoto(upfile.getBytes());
	    SqlSession session = MybatisUtil.getSqlSession();
	    StudentDao dao=session.getMapper(StudentDao.class);
	    dao.insertStu(stu);
	    session.commit();
	    return "success";
	  }
	  @RequestMapping("showPic")
	  public void fun2(HttpServletResponse response) throws Exception {    
	    System.out.println("showpic---------------------");
	    response.setContentType("image/jpeg");
	    ServletOutputStream out = response.getOutputStream(); 
	    BufferedImage bimg=new BufferedImage(150, 30, BufferedImage.TYPE_INT_RGB);
	    Graphics gp=bimg.getGraphics();
	    gp.setColor(Color.RED);
	    gp.fillRect(0, 0, 150, 30);
	    gp.setColor(Color.BLUE);
	    gp.setFont(new Font("Arial", Font.ITALIC, 24));
	    gp.drawString("hello", 19, 19);
	    JPEGImageEncoder enc=JPEGCodec.createJPEGEncoder(out);
	    enc.encode(bimg);
	    out.close();
	  }
}
