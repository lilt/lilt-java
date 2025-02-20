package com.lilt;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import com.lilt.testCreateContent.TestSign;
import com.lilt.testCreateContent.TestCreateChars;
import com.lilt.testCreateContent.TestCreateSections;
import com.lilt.testDataSource.TestCreateDataSource;
import com.lilt.testDataSource.TestUploadTMX;
import com.lilt.testInstantTranslate.TestInstantTranslate;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   TestSign.class,
   TestCreateChars.class,
   TestCreateSections.class,
   //TestCreateDataSource.class,
   TestUploadTMX.class,
   TestInstantTranslate.class
})

public class testRunner {
} 
