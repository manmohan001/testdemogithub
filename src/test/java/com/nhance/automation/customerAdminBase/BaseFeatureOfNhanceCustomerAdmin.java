package com.nhance.automation.customerAdminBase;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import javax.mail.MessagingException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public interface BaseFeatureOfNhanceCustomerAdmin {

	public void moduleSpecificSetUp(Map<String, String> map)
			throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException;

	public void addTest(Map<String, String> map) throws InterruptedException, IOException, MessagingException,
			EncryptedDocumentException, InvalidFormatException, Exception;

	public void checkDuplicateTest(Map<String, String> map) throws InterruptedException, EncryptedDocumentException,
			InvalidFormatException, IOException, MessagingException;

	public void inLineSearchTest(Map<String, String> map) throws InterruptedException, ClassNotFoundException,
	InstantiationException, IllegalAccessException, SQLException, EncryptedDocumentException, InvalidFormatException, IOException;

	public void validate_All_Field_For_Added_Item(Map<String, String> map)
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, ClassNotFoundException,
			InstantiationException, IllegalAccessException, IOException, SQLException;

	public void editTest(Map<String, String> map)
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException,
			ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException;

	public void deleteTest(Map<String, String> map)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, InterruptedException,
			SQLException, EncryptedDocumentException, InvalidFormatException, IOException;

}
