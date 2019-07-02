package com.sm.mongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.Cursor;

public class JavaMongoConnection {


	public static void main( String args[] ) {

		
			//Connecting With Server Please add the external jar file first
			MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
			System.out.println("server connection successfully done");

			//Connecting with database
			DB dbs =mongoClient.getDB("mongo-crud-java-example");
			System.out.println("Connection Done");
			System.out.println("Database Name "+dbs.getName());
			//boolean auth = db.authenticate(myUserName, myPassword);
			//System.out.println("Authentication: "+auth);
			

			//Create Collection
			DBCollection coll = dbs.getCollection("OV_Chipkaart");
			System.out.println("Collection created successfully");
			
			
			System.out.println("Alle reizigers");
			//Read or Find Document From Database
			Cursor cursor=coll.find();
			//BasicDBObject doc = new BasicDBObject("voorletter", "H");
			//Cursor cursor=coll.find(doc);
			while (cursor.hasNext()) {
				System.out.println(cursor.next());
				//System.out.println(cursor.next().get("name"));
			}

			
//			//Insert Document in Collection
//			BasicDBObject doc1 = new BasicDBObject("kaartnummer", 13666).
//					append("geldigTot", "20-06-2025").
//					append("klasse", 3).
//					append("saldo", 25).
//					append("ReizigerID", 3);
//			coll.insert(doc1);
//			
//			//Insert Document in Collection
//			BasicDBObject doc1 = new BasicDBObject("ovproductID", 1).
//					append("kaartnummer", 35283).
//					append("productnummer", 3).
//					append("reisproductStatus", "actief").
//					append("lastUpdate", "31-05-2017");
//			coll.insert(doc1);
//			BasicDBObject doc2 = new BasicDBObject("ovproductID", 2).
//					append("kaartnummer", 35283).
//					append("productnummer", 1).
//					append("reisproductStatus", "gekocht").
//					append("lastUpdate", "05-04-2018");
//			coll.insert(doc2);
//			BasicDBObject doc3 = new BasicDBObject("ovproductID", 3).
//					append("kaartnummer", 35283).
//					append("productnummer", 2).
//					append("reisproductStatus", "gekocht").
//					append("lastUpdate", "05-04-2018");
//			coll.insert(doc3);
//			BasicDBObject doc4 = new BasicDBObject("ovproductID", 4).
//					append("kaartnummer", 46392).
//					append("productnummer", 3).
//					append("reisproductStatus", "verlopen").
//					append("lastUpdate", "31-05-2017");
//			coll.insert(doc4);
//			BasicDBObject doc5 = new BasicDBObject("ovproductID", 5).
//					append("kaartnummer", 68514).
//					append("productnummer", 6).
//					append("reisproductStatus", "actief").
//					append("lastUpdate", "01-04-2018");
//			coll.insert(doc5);
//			BasicDBObject doc6 = new BasicDBObject("ovproductID", 6).
//					append("kaartnummer", 79625).
//					append("productnummer", 6).
//					append("reisproductStatus", "actief").
//					append("lastUpdate", "01-02-2018");
//			coll.insert(doc6);
//			BasicDBObject doc7 = new BasicDBObject("ovproductID", 7).
//					append("kaartnummer", 90537).
//					append("productnummer", 3).
//					append("reisproductStatus", "actief").
//					append("lastUpdate", "01-02-2018");
//			coll.insert(doc7);
//			BasicDBObject doc8 = new BasicDBObject("ovproductID", 8).
//					append("kaartnummer", 90537).
//					append("productnummer", 2).
//					append("reisproductStatus", "gekocht").
//					append("lastUpdate", "14-04-2018");
//			coll.insert(doc8);
//			System.out.println("Document Insereted..");
//			
//			//Insert Document in Collection
//			BasicDBObject doc1 = new BasicDBObject("productNummer", 1).
//					append("productNaam", "Dagkaart 2e klas").
//					append("Beschrijving", "Een hele dag onbeperkt reizen met de trein").
//					append("prijs", 50.60);
//			coll.insert(doc1);
//			System.out.println("Document Insereted..");
//			BasicDBObject doc2 = new BasicDBObject("productNummer", 2).
//					append("productNaam", "Dagkaart fiets").
//					append("Beschrijving", "Uw fiets mee in de trein, 1 dag geldig in Nederland. ").
//					append("prijs", 6.20);
//			coll.insert(doc2);
//			BasicDBObject doc3 = new BasicDBObject("productNummer", 3).
//					append("productNaam", "Dal Voordeel 40%").
//					append("Beschrijving", "40% korting buiten de spits en in het weekend").
//					append("prijs", 50.0);
//			coll.insert(doc3);
//			BasicDBObject doc4 = new BasicDBObject("productNummer", 4).
//					append("productNaam", "Amsterdam Travel Ticket").
//					append("Beschrijving", "Onbeperkt reizen door Amsterdam").
//					append("prijs", 26.0);
//			coll.insert(doc4);
//			BasicDBObject doc5 = new BasicDBObject("productNummer", 5).
//					append("productNaam", "Railrunner").
//					append("Beschrijving", "Voordelig reizen voor kinderen").
//					append("prijs", 2.50);
//			coll.insert(doc5);
//			BasicDBObject doc6 = new BasicDBObject("productNummer", 6).
//					append("productNaam", "Studenrenreisproduct").
//					append("Beschrijving", "Gratis of met korting reizen als je studeert").
//					append("prijs", 0.0);
//			coll.insert(doc6);
//			
//			
//			
//			
//			//Insert Document in Collection
//			BasicDBObject doc1 = new BasicDBObject("adresID", 1).
//					append("postcode", "3511 LX").
//					append("straat", "Visschersplein").
//					append("huisnummer", "37").
//					append("woonplaats", "Utrecht").
//					append("reizigerID", 1);
//			coll.insert(doc1);
//			System.out.println("Document Insereted..");
//			BasicDBObject doc2 = new BasicDBObject("adresID", 2).
//					append("postcode", "3521 AL").
//					append("straat", "Jaarsbeursplein").
//					append("huisnummer", "6A").
//					append("woonplaats", "Utrecht").
//					append("reizigerID", 2);
//			coll.insert(doc2);
//			BasicDBObject doc3 = new BasicDBObject("adresID", 3).
//					append("postcode", "1791 AV").
//					append("straat", "Emmalaan").
//					append("huisnummer", "66D").
//					append("woonplaats", "Den Burg").
//					append("reizigerID", 2);
//			coll.insert(doc3);
//			BasicDBObject doc4 = new BasicDBObject("adresID", 4).
//					append("postcode", "6707 AA").
//					append("straat", "Stadsbrik").
//					append("huisnummer", "375").
//					append("woonplaats", "Wageningen").
//					append("reizigerID", 3);
//			coll.insert(doc4);
//			BasicDBObject doc5 = new BasicDBObject("adresID", 5).
//					append("postcode", "3817 CH").
//					append("straat", "Arnhemseweg").
//					append("huisnummer", "4").
//					append("woonplaats", "Amersfoort").
//					append("reizigerID", 4);
//			coll.insert(doc5);
//			BasicDBObject doc6 = new BasicDBObject("adresID", 6).
//					append("postcode", "3572 WP").
//					append("straat", "Vermeulenstraat").
//					append("huisnummer", "22").
//					append("woonplaats", "Utrecht").
//					append("reizigerID", 5);
//			coll.insert(doc6);
//			System.out.println("Document Insereted..");

//			//Insert Document in Collection
//			BasicDBObject doc1 = new BasicDBObject("reizigerID", "1").
//					append("voorletter", "G").
//					append("tussenvoegel", "van").
//					append("achternaam", "Rijn").
//					append("geboortedatum", "17-09-2002");
//			coll.insert(doc1);
//			System.out.println("Document Insereted..");
//
//			BasicDBObject doc2 = new BasicDBObject("reizigerID", "2").
//					append("voorletter", "B").
//					append("tussenvoegel", "van").
//					append("achternaam", "Rijn").
//					append("geboortedatum", "20-10-2002");
//			coll.insert(doc2);
//
//			BasicDBObject doc3 = new BasicDBObject("reizigerID", "3").
//					append("voorletter", "H").
//					append("tussenvoegel", "").
//					append("achternaam", "Lubben").
//					append("geboortedatum", "11-08-1998");
//			coll.insert(doc3);
//			BasicDBObject doc4 = new BasicDBObject("reizigerID", "4").
//					append("voorletter", "F").
//					append("tussenvoegel", "").
//					append("achternaam", "Memari").
//					append("geboortedatum", "03-12-2002");
//			coll.insert(doc4);
//			BasicDBObject doc5 = new BasicDBObject("reizigerID", "5").
//					append("voorletter", "G").
//					append("tussenvoegel", "").
//					append("achternaam", "Piccardo").
//					append("geboortedatum", "03-12-2002");
//			coll.insert(doc5);
			
//			System.out.println("Reizigers updaten.");
//			BasicDBObject doc6 = new BasicDBObject("reizigerID", "6").
//			append("voorletter", "D").
//			append("tussenvoegel", "").
//			append("achternaam", "Rickard").
//			append("geboortedatum", "03-12-1992");
//			coll.insert(doc6);
//
//			System.out.println("Document Insereted..");

			
//			
//			coll.drop();
//			System.out.println("Collection Dropped");

//			//Update Document in Collection
//			BasicDBObject updatedDocument = new BasicDBObject();
//			//New Value
//			updatedDocument.append("$set", new BasicDBObject().append("kaartnummer",33333 ));
//			//Old Document
//			BasicDBObject oldDocument = new BasicDBObject().append("geldigTot", "20-06-2025");
//			coll.update(oldDocument, updatedDocument,false,false);
//			System.out.println("Document Updated..");
////			
//			Cursor cursor=coll.find();
//			//BasicDBObject doc = new BasicDBObject("voorletter", "H");
//			//Cursor cursor=coll.find(doc);
//			while (cursor.hasNext()) {
//			System.out.println(cursor.next());
//			//System.out.println(cursor.next().get("name"));
//			}
			
//			cursor=coll.find();
//			while (cursor.hasNext()) {
//				System.out.println(cursor.next());
//				//System.out.println(cursor.next().get("name"));
//			}
//
//
			//Delete Document

			//coll.remove(); //For All Documents

			BasicDBObject del = new BasicDBObject("kaartnummer", 33333);
			coll.remove(del);
			cursor=coll.find();
			System.out.println("After Deletion");
			while (cursor.hasNext()) {
				System.out.println(cursor.next());
				//System.out.println(cursor.next().get("name"));
			}
//			
			
			
			cursor=coll.find();
			System.out.println("After Deletion");
			//while (cursor.hasNext()) {
			//	System.out.println(cursor.next());
				//System.out.println(cursor.next().get("name"));
			}
////
//			//Drop Collection
//			coll.drop();
//			System.out.println("Collection Dropped");
//
//		}catch(Exception e){
//			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
//		}
	}





	

