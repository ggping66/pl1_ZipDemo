package logic;

import java.io.File;

import org.apache.tools.ant.*;
import org.apache.tools.ant.taskdefs.Zip;
import org.apache.tools.ant.types.FileSet;
public class ZipDemo {
	//鎵撳寘鍩烘湰鏂囦欢锛屾病鏈夊叾浠栬姹�
	public void compressFile1(String name,String filePath){
		File zipFile = new File(name);
		File srcdir = new File(filePath);
		Project prj = new Project();
		Zip zip = new Zip();
		zip.setEncoding("gbk");
		zip.setProject(prj);
		zip.setDestFile(zipFile);
		FileSet fileSet = new FileSet();
		fileSet.setProject(prj);
		fileSet.setDir(srcdir);
		zip.addFileset(fileSet);
		zip.execute();
	}
	//鎼滅储鏂囦欢骞舵樉绀�
	public static void showDirectiory(File file){
		File[] files  = file.listFiles();
		for(File a:files){
			//System.out.println(a.getAbsolutePath());
			System.out.println(a.getName());
			/*
			if(a.isDirectory()){
				showDirectiory(a);
			}
			*/
		}
	}
	public void compressFile2(String name,String filePath){
		File zipFile = new File(name);
		File srcdir = new File(filePath);
		Project prj = new Project();
		Zip zip = new Zip();
		zip.setEncoding("gbk");
		zip.setProject(prj);
		zip.setDestFile(zipFile);
		FileSet fileSet = new FileSet();
		fileSet.setProject(prj);
		fileSet.setDir(srcdir);
		//排除文件
		fileSet.setExcludes("backup");
		fileSet.setExcludes("read.properties");
		zip.addFileset(fileSet);
		zip.execute();
		
	}
	
	
}
