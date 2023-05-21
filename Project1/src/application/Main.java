package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;


public class Main extends Application {

	LinkedList<Flights> flightsList = new LinkedList<Flights>(); 
	//LinkedList<Passengers> passengersList = new LinkedList<Passengers>();

	//	VBox side = new VBox(10);
	//	boolean visible = false;
	public void start(Stage primaryStage) {

		try {
			
			primaryStage.setResizable(false);
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,1370,710);
			Image back = new Image ("Bangers.png");
			BackgroundImage bImg  = new BackgroundImage(back,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
			Background bground = new Background (bImg);
			root.setBackground(bground);
			Button main = new Button ("Go To Main Page");
			main.setPrefHeight(60);
			main.setPrefWidth(250);
			main.setFont(Font.font(24));
			HBox h = new HBox();
			h.setPadding(new Insets (100,400,50,160));
			h.getChildren().add(main);
			root.setBottom(h);


			Image back0 = new Image ("backk.jpg");
			BackgroundImage bImg0  = new BackgroundImage(back0,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
			Background bground0 = new Background (bImg0);
			BorderPane root0 = new BorderPane ();
			Scene scene0 = new Scene (root0,1370,710);
			root0.setBackground(bground0);

			main.setOnAction(e -> {
				primaryStage.setScene(scene0);
			});
			/*Rectangle rc = new Rectangle ();
				rc.setX(20);
				rc.setY(20);
				rc.setWidth(1370);
				rc.setHeight(60);*/



			VBox v0 = new VBox();
			Label l00 = new Label ("Main Page");
			l00.setPadding(new Insets (5,100,5,600));
			l00.setFont(Font.font(40));
			root0.setTop(l00);
			Button b01 = new Button ("Read Data");
			b01.setFont(Font.font(24));
			b01.setPrefHeight(55);
			b01.setPrefWidth(600);
			Button b02 = new Button ("Display Flights Information");
			b02.setFont(Font.font(24));
			b02.setPrefHeight(55);
			b02.setPrefWidth(600);
			Button b03 = new Button ("Display Passengers Information For A Specific Flight");
			b03.setFont(Font.font(24));
			b03.setPrefHeight(55);
			b03.setPrefWidth(600);
			Button b04 = new Button ("Add Flight");
			b04.setFont(Font.font(24));
			b04.setPrefHeight(55);
			b04.setPrefWidth(298);
			Button b040 = new Button ("Edit Flight");
			b040.setFont(Font.font(24));
			b040.setPrefHeight(55);
			b040.setPrefWidth(297);
			HBox hae = new HBox ();
			hae.getChildren().addAll(b04,b040);
			hae.setSpacing(5);
			Button b05 = new Button ("Reserve A Ticket For A Specific Flight");
			b05.setFont(Font.font(24));
			b05.setPrefHeight(55);
			b05.setPrefWidth(600);
			Button b06 = new Button ("Cancel A Reservation");
			b06.setFont(Font.font(24));
			b06.setPrefHeight(55);
			b06.setPrefWidth(600);
			Button b07 = new Button ("Check Whether A Ticket Is Reserved For A Perosn");
			b07.setFont(Font.font(24));
			b07.setPrefHeight(55);
			b07.setPrefWidth(600);
			Button b08 = new Button ("Search For A Specific Passenger");
			b08.setFont(Font.font(24));
			b08.setPrefHeight(55);
			b08.setPrefWidth(600);
			Button b09 = new Button ("Exit");
			b09.setFont(Font.font(24));
			b09.setPrefHeight(55);
			b09.setPrefWidth(600);
			v0.getChildren().addAll(b01,b02,b03,hae,b05,b06,b07,b08,b09);
			v0.setPadding(new Insets (25,100,20,400));
			v0.setSpacing(10);

			root0.setCenter(v0);


			Image back1 = new Image ("tt.png");
			BackgroundImage bImg1  = new BackgroundImage(back1,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
			Background bground1 = new Background (bImg1);
			BorderPane root1 = new BorderPane ();
			Scene scene1 = new Scene (root1,1370,710);
			root1.setBackground(bground1);

			b01.setOnAction(e ->{
				Image bf = new Image ("bf.png");
				BackgroundImage bf0  = new BackgroundImage(bf,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
				Background bgf = new Background (bf0);
				root1.setBackground(bgf);
				primaryStage.setScene(scene1);	
				Label top = new Label ("Read Data");
				top.setPadding(new Insets (15,100,0,550));
				top.setFont(Font.font(50));
				root1.setTop(top);
				HBox hb = new HBox ();
				Button r1 = new Button ("Read Flights\n       File");
				r1.setFont(Font.font(34));
				r1.setPrefHeight(200);
				r1.setPrefWidth(350);
				Button r2 = new Button ("Read Passengers\n          File");
				r2.setFont(Font.font(34));
				r2.setPrefHeight(200);
				r2.setPrefWidth(350);
				hb.getChildren().addAll(r1,r2);
				hb.setPadding(new Insets (200,50,50,250));
				hb.setSpacing(200);
				root1.setCenter(hb);
				root1.setLeft(null);

				r1.setOnAction(r ->{
					FileChooser fc = new FileChooser ();
					fc.getExtensionFilters().addAll(new ExtensionFilter("Text Files", "*.txt"));
					File file = fc.showOpenDialog(primaryStage);
					try {
						Scanner sc = new Scanner(file);
						while (sc.hasNextLine()){
							String line = sc.nextLine();
							String [] tok =line.split(",");
							Flights flight = new Flights(Integer.parseInt(tok[0].trim()), tok[1], tok[2], tok[3], Integer.parseInt(tok[4].trim()));
							flightsList.insert(flight);
						}
						//	flightsList.traverse();
						sc.close();
					}
					catch (Exception ex) {
						ex.printStackTrace();
						System.out.println("\nProgram terminated Safely...");
					}


				});
				r2.setOnAction(r ->{
					try {
						FileChooser fc = new FileChooser ();
						fc.getExtensionFilters().addAll(new ExtensionFilter("Text Files", "*.txt"));
						File file2 = fc.showOpenDialog(primaryStage);
						Scanner sc;
						sc = new Scanner(file2);
						if(file2.exists()) {
							while(sc.hasNext()) {
								String tok = sc.nextLine();
								String [] line = tok.split(",");
								String [] tok1 =  line[5].split("/");
								Date date = new Date(Integer.parseInt(tok1[2])-1900, Integer.parseInt(tok1[1])-1, Integer.parseInt(tok1[0]));
								Passengers pas = new Passengers(Integer.parseInt(line[0]), Integer.parseInt(line[1]), line[2], line[3], line[4], date);
								Node<Flights> curr = flightsList.getHead();
								for (  ; curr != null ; curr = curr.getNext()) {
									if (curr.getData().getFlightnum() == Integer.parseInt(line[0])) {
										curr.getData().getPassengerList().insert(pas);
									}
								}
							}

						}
						sc.close();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				});

				Button backto = new Button ("Back To Main Page");
				backto.setPrefHeight(60);
				backto.setPrefWidth(300);
				backto.setFont(Font.font(24));
				HBox btns = new HBox ();
				btns.getChildren().addAll(backto);
				btns.setSpacing(20);
				btns.setPadding(new Insets (0,60,40,500));
				root1.setBottom(btns);
				backto.setOnAction(q ->{
					primaryStage.setScene(scene0);						

				});

			});

			b02.setOnAction(e ->{
				primaryStage.setScene(scene1);	
				root1.setBackground(bground1);
				Label top = new Label ("Flights Information");
				top.setPadding(new Insets (15,100,5,450));
				top.setFont(Font.font(50));
				root1.setTop(top);
				Label l7 = new Label ("Flights Info:");
				l7.setFont(Font.font(26));	
				VBox v2 = new VBox ();
				v2.getChildren().addAll(l7);
				v2.setPadding(new Insets (175,50,0,90));
				root1.setLeft(v2);

				TextArea a = new TextArea ();
				a.setPrefHeight(300);
				a.setPrefWidth(300);
				VBox v3 = new VBox ();
				v3.getChildren().addAll(a);
				a.setFont(Font.font(18));
				v3.setPadding(new Insets (177,120,0,12));
				root1.setCenter(v3);
				Button backto = new Button ("Back To Main Page");
				backto.setPrefHeight(60);
				backto.setPrefWidth(300);
				backto.setFont(Font.font(24));
				Button addto = new Button ("Display Information");
				addto.setPrefHeight(60);
				addto.setPrefWidth(300);
				addto.setFont(Font.font(24));
				HBox btns = new HBox ();
				btns.getChildren().addAll(backto,addto);
				btns.setSpacing(20);
				btns.setPadding(new Insets (0,60,40,400));
				root1.setBottom(btns);

				addto.setOnAction(o ->{
					a.setText(flightsList.toStr());

				});
				backto.setOnAction(q ->{
					primaryStage.setScene(scene0);						

				});
			});

			b03.setOnAction(e ->{
				primaryStage.setScene(scene1);
				root1.setBackground(bground1);
				Label top = new Label ("Passenger Information");
				top.setPadding(new Insets (15,100,5,450));
				top.setFont(Font.font(50));
				root1.setTop(top);
				Label l6 = new Label ("Flight Number:");
				l6.setFont(Font.font(24));	
				Label l7 = new Label ("Passenger Info:");
				l7.setFont(Font.font(24));	
				VBox v2 = new VBox ();
				v2.getChildren().addAll(l6,l7);
				v2.setSpacing(20);
				v2.setPadding(new Insets (200,50,0,70));
				root1.setLeft(v2);

				TextField t5 = new TextField ();
				t5.setFont(Font.font(18));
				TextArea a = new TextArea ();
				a.setPrefHeight(200);
				a.setFont(Font.font(18));
				VBox v3 = new VBox ();
				v3.getChildren().addAll(t5,a);
				v3.setSpacing(18);
				v3.setPadding(new Insets (200,100,0,0));
				root1.setCenter(v3);
				Button backto = new Button ("Back To Main Page");
				backto.setPrefHeight(60);
				backto.setPrefWidth(300);
				backto.setFont(Font.font(24));
				Button addto = new Button ("Display Information");
				addto.setPrefHeight(60);
				addto.setPrefWidth(300);
				addto.setFont(Font.font(24));
				HBox btns = new HBox ();
				btns.getChildren().addAll(backto,addto);
				btns.setSpacing(20);
				btns.setPadding(new Insets (0,60,40,400));
				root1.setBottom(btns);

				addto.setOnAction(o -> {
					Node<Flights> curr = flightsList.getHead();
					for (  ; curr != null ; curr = curr.getNext()) {
						if (curr.getData().getFlightnum() == Integer.parseInt(t5.getText())){
							a.setText(curr.getData().getPassengerList().toStr());
						}
					}
				});

				backto.setOnAction(q ->{
					primaryStage.setScene(scene0);						

				});
			});

			b04.setOnAction(e ->{
				primaryStage.setScene(scene1);
				root1.setBackground(bground1);
				Label top = new Label ("Add or edit a flight");
				top.setPadding(new Insets (15,100,5,450));
				top.setFont(Font.font(50));
				root1.setTop(top);
				Label l11 = new Label ("Flight Number:");
				l11.setFont(Font.font(24));
				Label l22 = new Label ("Airline Name:");
				l22.setFont(Font.font(24));	
				Label l33 = new Label ("Source:");
				l33.setFont(Font.font(24));	
				Label l44 = new Label ("Destination:");
				l44.setFont(Font.font(24));
				Label l55 = new Label ("Capacity:");
				l55.setFont(Font.font(24));
				VBox vn = new VBox ();
				vn.getChildren().addAll(l11,l22,l33,l44,l55);
				vn.setSpacing(20);
				vn.setPadding(new Insets (175,50,0,90));
				root1.setLeft(vn);

				TextField t11 = new TextField ();
				t11.setFont(Font.font(18));
				TextField t22 = new TextField ();
				t22.setFont(Font.font(18));
				TextField t33 = new TextField ();
				t33.setFont(Font.font(18));
				TextField t44 = new TextField ();
				t44.setFont(Font.font(18));
				TextField t55 = new TextField ();
				t55.setFont(Font.font(18));
				VBox v1n = new VBox ();
				v1n.getChildren().addAll(t11,t22,t33,t44,t55);
				v1n.setSpacing(18);
				v1n.setPadding(new Insets (177,120,0,12));
				root1.setCenter(v1n);

				Button backto = new Button ("Back To Main page");
				backto.setPrefHeight(60);
				backto.setPrefWidth(300);
				backto.setFont(Font.font(24));
				Button addto = new Button ("Add Flight");
				addto.setPrefHeight(60);
				addto.setPrefWidth(300);
				addto.setFont(Font.font(24));

				addto.setOnAction(c ->{
					Flights flight = new Flights(Integer.parseInt(t11.getText()),t22.getText(),t33.getText(),t44.getText(),Integer.parseInt(t55.getText()));
					flightsList.insert(flight);
				});

				HBox btns = new HBox ();
				btns.getChildren().addAll(backto,addto);
				btns.setSpacing(20);
				btns.setPadding(new Insets (0,50,40,380));
				root1.setBottom(btns);

				backto.setOnAction(d -> {

					primaryStage.setScene(scene0);						
				});

			});

			b040.setOnAction(e ->{
				primaryStage.setScene(scene1);
				root1.setBackground(bground1);
				Label top = new Label ("Add or edit a flight");
				top.setPadding(new Insets (15,100,5,450));
				top.setFont(Font.font(50));
				root1.setTop(top);
				Label l11 = new Label ("Flight Number:");
				l11.setFont(Font.font(16));
				Label l11n = new Label ("*New Flight Number:");
				l11n.setFont(Font.font(15));
				Label l22 = new Label ("Airline Name:");
				l22.setFont(Font.font(16));	
				Label l22n = new Label ("*New Airline Name:");
				l22n.setFont(Font.font(15));
				Label l33 = new Label ("Source:");
				l33.setFont(Font.font(16));	
				Label l33n = new Label ("*New Source:");
				l33n.setFont(Font.font(15));
				Label l44 = new Label ("Destination:");
				l44.setFont(Font.font(16));
				Label l44n = new Label ("*New Destination:");
				l44n.setFont(Font.font(15));
				Label l55 = new Label ("Capacity:");
				l55.setFont(Font.font(16));
				Label l55n = new Label ("*New Capacity:");
				l55n.setFont(Font.font(15));
				VBox vn = new VBox ();
				vn.getChildren().addAll(l11,l11n,l22,l22n,l33,l33n,l44,l44n,l55,l55n);
				vn.setSpacing(8);
				vn.setPadding(new Insets (165,50,0,90));
				root1.setLeft(vn);

				TextField t11 = new TextField ();
				t11.setFont(Font.font(14));
				TextField t11n = new TextField ();
				t11n.setFont(Font.font(13));
				TextField t22 = new TextField ();
				t22.setFont(Font.font(14));
				t22.setDisable(true);
				TextField t22n = new TextField ();
				t22n.setFont(Font.font(13));
				TextField t33 = new TextField ();
				t33.setFont(Font.font(14));
				t33.setDisable(true);
				TextField t33n = new TextField ();
				t33n.setFont(Font.font(13));
				TextField t44 = new TextField ();
				t44.setFont(Font.font(14));
				t44.setDisable(true);
				TextField t44n = new TextField ();
				t44n.setFont(Font.font(13));
				TextField t55 = new TextField ();
				t55.setFont(Font.font(14));
				t55.setDisable(true);
				TextField t55n = new TextField ();
				t55n.setFont(Font.font(13));
				VBox v1n = new VBox ();
				v1n.getChildren().addAll(t11,t11n,t22,t22n,t33,t33n,t44,t44n,t55,t55n);
				v1n.setSpacing(5);
				v1n.setPadding(new Insets (155,120,0,12));
				root1.setCenter(v1n);

				Button backto = new Button ("Back To Main page");
				backto.setPrefHeight(60);
				backto.setPrefWidth(300);
				backto.setFont(Font.font(24));
				Button search = new Button ("Search");
				search.setPrefHeight(60);
				search.setPrefWidth(300);
				search.setFont(Font.font(24));
				Button addto = new Button ("Edit Flight");
				addto.setPrefHeight(60);
				addto.setPrefWidth(300);
				addto.setFont(Font.font(24));

				search.setOnAction(c ->{
					Node<Flights> curr = flightsList.getHead();
					for (  ; curr != null ; curr = curr.getNext()) {
						if (curr.getData().getFlightnum() == Integer.parseInt(t11.getText())){
							t22.setText(curr.getData().getAirlineName());
							t33.setText(curr.getData().getSource());
							t44.setText(curr.getData().getDestination());
							String s = Integer.toString(curr.getData().getCapacity());
							t55.setText(s);
						}

					}
				});
				addto.setOnAction(p ->{
					Node<Flights> curr1 = flightsList.getHead();
					for (  ; curr1 != null ; curr1 = curr1.getNext()) {
						if (curr1.getData().getFlightnum() == Integer.parseInt(t11.getText())){
							if (t11n == null)
								curr1.getData().setFlightnum(curr1.getData().getFlightnum());
							else
								curr1.getData().setFlightnum(Integer.parseInt(t11n.getText()));
							if (t22n == null)
								curr1.getData().setAirlineName(curr1.getData().getAirlineName());
							else
								curr1.getData().setAirlineName(t22n.getText());
							if (t33n == null)
								curr1.getData().setSource(curr1.getData().getSource());
							else
								curr1.getData().setSource(t33n.getText());
							if (t44n == null)
								curr1.getData().setDestination(curr1.getData().getDestination());
							else
								curr1.getData().setDestination(t44n.getText());
							if (t55n == null)
								curr1.getData().setCapacity(curr1.getData().getCapacity());
							else
								curr1.getData().setCapacity(Integer.parseInt(t55n.getText()));

						}
					}




				});

				HBox btns = new HBox ();
				btns.getChildren().addAll(backto,search,addto);
				btns.setSpacing(20);
				btns.setPadding(new Insets (0,50,40,220));
				root1.setBottom(btns);

				backto.setOnAction(d -> {

					primaryStage.setScene(scene0);						
				});
			});

			b05.setOnAction(e -> {
				primaryStage.setScene(scene1);
				root1.setBackground(bground1);
				Label top = new Label ("Reserve a ticket");
				top.setPadding(new Insets (15,100,5,520));
				top.setFont(Font.font(50));
				root1.setTop(top);
				Label l8 = new Label ("Flight Number:");
				l8.setFont(Font.font(22));
				Label l9 = new Label ("Ticket Number:");
				l9.setFont(Font.font(22));	
				Label l10 = new Label ("Full Name:");
				l10.setFont(Font.font(22));	
				Label l11 = new Label ("Passport Number:");
				l11.setFont(Font.font(22));	
				Label l12 = new Label ("Nationality:");
				l12.setFont(Font.font(22));	
				Label l13 = new Label ("Birthdate:");
				l13.setFont(Font.font(24));	
				VBox v5 = new VBox ();
				v5.getChildren().addAll(l8,l9,l10,l11,l12,l13);
				v5.setSpacing(20);
				v5.setPadding(new Insets (158,50,0,72));
				root1.setLeft(v5);


				TextField t8 = new TextField ();
				t8.setFont(Font.font(17));
				TextField t9 = new TextField ();
				t9.setFont(Font.font(17));
				TextField t10 = new TextField ();
				t10.setFont(Font.font(17));
				TextField t11 = new TextField ();
				t11.setFont(Font.font(17));
				TextField t12 = new TextField ();
				t12.setFont(Font.font(17));
				TextField t13 = new TextField ();
				t13.setFont(Font.font(17));
				VBox v4 = new VBox ();
				v4.getChildren().addAll(t8,t9,t10,t11,t12,t13);
				v4.setSpacing(15);
				v4.setPadding(new Insets (155,100,0,0));
				root1.setCenter(v4);
				Button backto = new Button ("Back To Main Page");
				backto.setPrefHeight(60);
				backto.setPrefWidth(300);
				backto.setFont(Font.font(24));
				Button addto = new Button ("Reserve The Seat");
				addto.setPrefHeight(60);
				addto.setPrefWidth(300);
				addto.setFont(Font.font(24));
				HBox btns = new HBox ();
				btns.getChildren().addAll(backto,addto);
				btns.setSpacing(20);
				btns.setPadding(new Insets (0,60,40,400));
				root1.setBottom(btns);
				Alert alert = new Alert(AlertType.ERROR);
				addto.setOnAction(n ->{

					Node <Flights> curr = flightsList.getHead();
					for (  ; curr != null ; curr = curr.getNext()) {
						if (curr.getData().getFlightnum() == Integer.parseInt(t8.getText())) {
							if (flightsList.capcity(curr)) {
								String [] tokens = t13.getText().split("/");
								Date date = new Date (Integer.parseInt(tokens[2])-1900,Integer.parseInt(tokens[1])-1,Integer.parseInt(tokens[0]));
								Passengers ps = new Passengers (Integer.parseInt(t8.getText()),Integer.parseInt(t9.getText()),t10.getText(),t11.getText(),t12.getText(),date);
								curr.getData().getPassengerList().insert(ps);
							}
							else { 
								alert.showAndWait();
								alert.setHeaderText("Sorry, there is no capacity is this flight.");
								Optional <ButtonType> result = alert.showAndWait();
								if (result.isPresent() && result.get()== ButtonType.OK) {
									alert.close();
								}
							}
						}
					}



				});

				backto.setOnAction(w ->{
					primaryStage.setScene(scene0);						
				});
			});

			b06.setOnAction(e ->{
				primaryStage.setScene(scene1);	
				root1.setBackground(bground1);
				Label top = new Label ("Cancel Reservation");
				top.setPadding(new Insets (15,100,5,520));
				top.setFont(Font.font(50));
				root1.setTop(top);
				Label l7 = new Label ("Passenger Name:");
				l7.setFont(Font.font(24));	
				Label l8 = new Label ("Flight Number:");
				l8.setFont(Font.font(24));	
				VBox v2 = new VBox ();
				v2.getChildren().addAll(l7,l8);
				v2.setSpacing(20);
				v2.setPadding(new Insets (250,50,0,65));
				root1.setLeft(v2);


				TextField t8 = new TextField ();
				t8.setFont(Font.font(18));
				TextField t9 = new TextField ();
				t9.setFont(Font.font(18));
				VBox v3 = new VBox ();
				v3.getChildren().addAll(t8,t9);
				v3.setSpacing(18);
				v3.setPadding(new Insets (250,100,0,0));
				root1.setCenter(v3);
				Button backto = new Button ("Back To Main Page");
				backto.setPrefHeight(60);
				backto.setPrefWidth(300);
				backto.setFont(Font.font(24));
				Button addto = new Button ("Cancel Reservation");
				addto.setPrefHeight(60);
				addto.setPrefWidth(300);
				addto.setFont(Font.font(24));
				HBox btns = new HBox ();
				btns.getChildren().addAll(backto,addto);
				btns.setSpacing(20);
				btns.setPadding(new Insets (0,60,40,400));
				root1.setBottom(btns);
				Alert alert = new Alert(AlertType.ERROR);

				addto.setOnAction(n ->{


					Node<Flights> curr = flightsList.getHead();
					for (  ; curr != null; curr = curr.getNext()) {
						if (curr.getData().getFlightnum() ==  Integer.parseInt(t9.getText())){
							Node<Passengers> curr2 = curr.getData().getPassengerList().getHead();
							for (  ; curr2 != null; curr2 = curr2.getNext()) {
								if(curr2.getData().getFullName().equals(t8.getText())) {
									curr.getData().getPassengerList().delete(curr2.getData());
								}
								else {
									alert.showAndWait();
									alert.setHeaderText("Sorry, NO reservation to cancel.");
									Optional <ButtonType> result = alert.showAndWait();
									if (result.isPresent() && result.get()== ButtonType.OK) {
										alert.close();
									}
								}
							}
						}
					}
				});


				backto.setOnAction(q ->{
					primaryStage.setScene(scene0);						

				});
			});
			b07.setOnAction(e ->{
				primaryStage.setScene(scene1);	
				root1.setBackground(bground1);
				Label top = new Label ("Check Reservation");
				top.setPadding(new Insets (15,100,5,520));
				top.setFont(Font.font(50));
				root1.setTop(top);
				Label l7 = new Label ("Passenger Name:");
				l7.setFont(Font.font(24));	
				Label l8 = new Label ("Flight Number:");
				l8.setFont(Font.font(24));	
				VBox v2 = new VBox ();
				v2.getChildren().addAll(l7,l8);
				v2.setSpacing(20);
				v2.setPadding(new Insets (250,50,0,65));
				root1.setLeft(v2);


				TextField t8 = new TextField ();
				t8.setFont(Font.font(18));
				TextField t9 = new TextField ();
				t9.setFont(Font.font(18));
				VBox v3 = new VBox ();
				v3.getChildren().addAll(t8,t9);
				v3.setSpacing(18);
				v3.setPadding(new Insets (250,80,0,0));
				root1.setCenter(v3);
				Button backto = new Button ("Back To Main Page");
				backto.setPrefHeight(60);
				backto.setPrefWidth(300);
				backto.setFont(Font.font(24));
				Button addto = new Button ("Check Reservation");
				addto.setPrefHeight(60);
				addto.setPrefWidth(300);
				addto.setFont(Font.font(24));
				HBox btns = new HBox ();
				btns.getChildren().addAll(backto,addto);
				btns.setSpacing(20);
				btns.setPadding(new Insets (0,60,40,400));
				root1.setBottom(btns);
				Alert alert = new Alert (AlertType.INFORMATION);
				addto.setOnAction(n ->{
					Node<Flights> curr = flightsList.getHead();
					for (  ; curr != null ; curr = curr.getNext()) {
						if (flightsList.getHead() != null) {
							if (curr.getData().getPassengerList().getHead() != null) {
								if (curr.getData().getPassengerList().head.getData().getFullName().equalsIgnoreCase(t8.getText()) && curr.getData().getFlightnum() == Integer.parseInt(t9.getText())){
									alert.showAndWait();
									alert.setHeaderText("Yes; this Passenger is reserved for this flight");
									Optional <ButtonType> result = alert.showAndWait();
									if (result.isPresent() && result.get()== ButtonType.OK) {
										alert.close();
									}

								}
								else {
									alert.showAndWait();
									alert.setHeaderText("NO reservation.");
									Optional <ButtonType> result = alert.showAndWait();
									if (result.isPresent() && result.get()== ButtonType.OK) {
										alert.close();
									}
								}
							}

						}
					}
				});

				backto.setOnAction(q ->{
					primaryStage.setScene(scene0);						

				});
			});
			b08.setOnAction(e ->{
				primaryStage.setScene(scene1);	
				root1.setBackground(bground1);
				Label top = new Label ("Search For a Passenger");
				top.setPadding(new Insets (15,100,5,450));
				top.setFont(Font.font(50));
				root1.setTop(top);
				Label l6 = new Label ("Passenger Name:");
				l6.setFont(Font.font(24));
				Label l7 = new Label ("Passenger Info:");
				l7.setFont(Font.font(24));	
				VBox v2 = new VBox ();
				v2.getChildren().addAll(l6,l7);
				v2.setSpacing(20);
				v2.setPadding(new Insets (200,50,0,67));
				root1.setLeft(v2);

				TextField t1 = new TextField();
				t1.setFont(Font.font(18));
				TextArea a = new TextArea ();
				a.setPrefHeight(200);
				a.setFont(Font.font(18));
				VBox v3 = new VBox ();
				v3.getChildren().addAll(t1,a);
				v3.setSpacing(18);
				v3.setPadding(new Insets (200,100,0,0));
				root1.setCenter(v3);
				Button backto = new Button ("Back To Main Page");
				backto.setPrefHeight(60);
				backto.setPrefWidth(300);
				backto.setFont(Font.font(24));
				Button addto = new Button ("Display Information");
				addto.setPrefHeight(60);
				addto.setPrefWidth(300);
				addto.setFont(Font.font(24));
				HBox btns = new HBox ();
				btns.getChildren().addAll(backto,addto);
				btns.setSpacing(20);
				btns.setPadding(new Insets (0,60,40,400));
				root1.setBottom(btns);

				addto.setOnAction(r ->{
					Node<Flights> curr = flightsList.getHead();
					for (  ; curr != null ; curr = curr.getNext()) {
						if (curr.getData().getPassengerList().getHead() != null) {
							if (curr.getData().getPassengerList().head.getData().getFullName().equalsIgnoreCase(t1.getText())){
								a.setText(curr.getData().getPassengerList().getHead().toString());
							}
						}
					}
				});

				backto.setOnAction(q ->{
					primaryStage.setScene(scene0);						

				});
			});

			b09.setOnAction(e_-> {
				primaryStage.setScene(scene);
			});

			primaryStage.setScene(scene);
			primaryStage.show();
		} 


		catch(Exception e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		launch(args);
	}


	public void read ()  {

	}
}


