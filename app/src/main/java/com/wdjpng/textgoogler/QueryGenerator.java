package com.wdjpng.textgoogler;

import com.google.firebase.ml.vision.text.FirebaseVisionText;


public class QueryGenerator {

    public String generateQuery(FirebaseVisionText firebaseVisionText) throws IncorrectTextException {
        String query = firebaseVisionText.getText();
        return query;
    }


}
