package com.example.demo.services;

import com.example.demo.model.Game;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firestore.v1.Document;

public class GameService {



	public static String create(Game gid) {
		Firestore db = FirestoreClient.getFirestore();
		ApiFuture<WriteResult> collectionApiFuture = db.collection(s:"crud_user").document(gid.getTitle()).set(gid);
		return collectionApiFuture.get().getUpdateTime().toString();
	}
	public static Game get(String gid) {
		Firestore db = FirestoreClient.getFirestore(); 	
		DocumentReference dr = db.collection(s:"crud_user").document(gid);
		ApiFuture<DocumentSnapshot> future = dr.get();
		DocumentSnapshot doc = future.get();
		Game game;
		if(doc.exists()) {
			game = doc.toObject(Game.class);
			return game;
		}
		return null;
	}

	public static String update(Game gid) {
		Firestore db = FirestoreClient.getFirestore();
		ApiFuture<WriteResult> collectionApiFuture = db.collection(s:"crud_user").document(gid.getTitle()).set(gid);
		return collectionApiFuture.get().getUpdateTime().toString();
	}

	public static String delete(String id) {
		Firestore db = FirestoreClient.getFirestore(); 
		ApiFuture<WriteResult> wr = db.collection(s:"crud_user").document(id).delete();
		return "Sucessfully Deleted" + id ;
	}

}
