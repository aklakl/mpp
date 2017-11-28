package com.mpp.lab10.prob2;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * This class scans the package lesson10.labs.prob2.javapackage for classes with
 * annotation @BugReport. It then generates a bug report bugreport.txt,
 * formatted like this:
 *
 * Joe Smith 
 * 	reportedBy:
 *  classname: 
 *  description: 
 *  severity:
 *
 *  reportedBy:
 *  classname:
 *  description:
 *  severity:
 *
 * Tom Jones
 *  reportedBy:
 *  classname: 
 *  description:
 *  severity:
 *
 * reportedBy:
 * classname: 
 * description: 
 * severity:
 *
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
	private static final String PACKAGE_TO_SCAN = "com.mpp.lab10.prob2.javapackage";
	private static final String REPORT_NAME = "bug_report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";

	public void reportGenerator() {
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);
		List<String> names = new ArrayList<>();

		try (Writer writer = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("/home/suresh/filename.txt"), "utf-8"))) {

			for (Class<?> class1 : classes) {
				for (Annotation annotation : class1.getAnnotations()) {
					Class<? extends Annotation> type = annotation.annotationType();
					for (Method method : type.getDeclaredMethods()) {
						Object value = null;
						try {
							value = method.invoke(annotation, null);
						} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
							e.printStackTrace();
						}
						if (method.getName().equals("assignedTo")) {
							if (!names.contains(value)) {
								System.out.println(value);
								writer.write(""+value+"\n");
							}

							names.add(value.toString());
						} else {
							System.out.println("     " + method.getName() + ": " + value);
							writer.write("     " + method.getName() + ": " + value+"\n");
						}

					}
				}
				System.out.println("     class name: " + class1.getName() + "\n");
				writer.write("     class name: " + class1.getName() + "\n\n");

			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
