package com.mementoguy.feature_expense.data

import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.tasks.await
import java.lang.Exception


object FirebaseService {
    val firestoreDB: FirebaseFirestore
        get() {
            return Firebase.firestore
        }

    suspend fun saveDocumentWithKnownId(
        documentId: String,
        document: Any,
        collectionName: String
    ): Void? {
        return firestoreDB
            .collection(collectionName)
            .document(documentId)
            .set(document, SetOptions.merge())
            .await()
    }

    suspend fun saveDocument(document: Any, collectionName: String): DocumentReference? {
        return firestoreDB
            .collection(collectionName)
            .add(document)
            .await()
    }
}