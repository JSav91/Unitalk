package com.unitalk.server;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

public class ServerController {

	@FXML
	private BorderPane serverMain;
	@FXML
	private TextField xmlPathText;
	@FXML
	private Button browseButton;
	@FXML
	private Button loadXml;
	@FXML
	private TextArea serverLogs;
	@FXML
	private Button startServer;
	@FXML
	private Button stopServer;
	@FXML
	private Text serverIp;
	
	private volatile Thread serverThread;

	@FXML
	public void initialize() {	
		this.startServer.setVisible(true);	
	}

	@FXML
	void buttonStartServerAction(ActionEvent event) {
		System.out.println("Starting Server");
		RunnableServer server= new RunnableServer(this); 
		this.serverThread = new Thread(server);
		serverThread.start();
	}

	@FXML
	void buttonStopServerAction(ActionEvent event) {

		this.serverThread=null;
	}

	@FXML
	void buttonBrowseAction(ActionEvent event) {

	}

	@FXML
	void buttonLoadAction(ActionEvent event) {

	}

	public BorderPane getServerMain() {
		return serverMain;
	}

	public void setServerMain(BorderPane serverMain) {
		this.serverMain = serverMain;
	}

	public TextField getXmlPathText() {
		return xmlPathText;
	}

	public void setXmlPathText(TextField xmlPathText) {
		this.xmlPathText = xmlPathText;
	}

	public Button getBrowseButton() {
		return browseButton;
	}

	public void setBrowseButton(Button browseButton) {
		this.browseButton = browseButton;
	}

	public Button getLoadXml() {
		return loadXml;
	}

	public void setLoadXml(Button loadXml) {
		this.loadXml = loadXml;
	}

	public TextArea getServerLogs() {
		return serverLogs;
	}

	public void setServerLogs(TextArea serverLogs) {
		this.serverLogs = serverLogs;
	}

	public Button getStartServer() {
		return startServer;
	}

	public void setStartServer(Button startServer) {
		this.startServer = startServer;
	}

	public Button getStopServer() {
		return stopServer;
	}

	public void setStopServer(Button stopServer) {
		this.stopServer = stopServer;
	}

	public Text getServerIp() {
		return serverIp;
	}

	public void setServerIp(Text serverIp) {
		this.serverIp = serverIp;
	}

	public Thread getServerThread() {
		return serverThread;
	}

	public void setServerThread(Thread serverThread) {
		this.serverThread = serverThread;
	}


}
