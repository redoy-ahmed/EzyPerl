package com.example.redoyahmed.ezyperl.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.redoyahmed.ezyperl.Model.QuestionItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by redoy.ahmed on 04-Mar-2018.
 */

public class DbHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "ezyPerl";
    private static final String QUESTION_ANSWER = "QuestionAnswer";

    private static final String KEY_ID = "id";
    private static final String KEY_CATEGORY = "category";
    private static final String KEY_QUES = "question";
    private static final String KEY_ANSWER = "answer";
    private static final String KEY_OPTONE = "option_one";
    private static final String KEY_OPTTWO = "option_two";
    private static final String KEY_OPTTHREE = "option_three";
    private static final String KEY_OPTFOUR = "option_four";
    private SQLiteDatabase database;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        database = db;
        String sql = "CREATE TABLE IF NOT EXISTS "
                + QUESTION_ANSWER + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + KEY_CATEGORY + " TEXT, "
                + KEY_QUES + " TEXT, "
                + KEY_OPTONE + " TEXT, "
                + KEY_OPTTWO + " TEXT, "
                + KEY_OPTTHREE + " TEXT, "
                + KEY_OPTFOUR + " TEXT, "
                + KEY_ANSWER + " INTEGER);";
        db.execSQL(sql);
        addQuestions();
        //db.close();
    }

    private void addQuestions() {
        QuestionItem q1 = new QuestionItem("Math", "Sum of 1+1 is", "1", "2", "3", "4", 2);
        addQuestion(q1);
        QuestionItem q2 = new QuestionItem("Math", "Sum of 10+10 is", "10", "20", "30", "40", 2);
        addQuestion(q2);
        QuestionItem q3 = new QuestionItem("Math", "Result of 10*10 is", "100", "200", "300", "400", 1);
        addQuestion(q3);
        QuestionItem q4 = new QuestionItem("Perl", "what will be the output of the following program? \nprint \"Hello, world!\";", "Hello", "Hello, world", "Hello, world!", "Error", 3);
        addQuestion(q4);
        QuestionItem q5 = new QuestionItem("Perl", "what will be the output of the following program? \nprint 'Greetings, small planet!';", "Greetings, small planet", "Greetings, small", "Greetings", "Greetings, small planet!", 4);
        addQuestion(q5);
        QuestionItem q6 = new QuestionItem("Perl", "what will be the output of the following program? \nprint What's cooking?;", "Error!", "What's?", "'What's cooking?'", "What's cooking?", 4);
        addQuestion(q6);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        db.execSQL("DROP TABLE IF EXISTS " + QUESTION_ANSWER);
        onCreate(db);
    }

    public void addQuestion(QuestionItem questionItem) {
        ContentValues values = new ContentValues();
        values.put(KEY_CATEGORY, questionItem.getCategory());
        values.put(KEY_QUES, questionItem.getQuestion());
        values.put(KEY_OPTONE, questionItem.getOption_one());
        values.put(KEY_OPTTWO, questionItem.getOption_two());
        values.put(KEY_OPTTHREE, questionItem.getOption_three());
        values.put(KEY_OPTFOUR, questionItem.getOption_four());
        values.put(KEY_ANSWER, questionItem.getAnswer());

        database.insert(QUESTION_ANSWER, null, values);
    }

    public List<QuestionItem> getAllQuestions() {

        List<QuestionItem> quesList = new ArrayList<>();

        String selectQuery = "SELECT  * FROM " + QUESTION_ANSWER + ";";

        database = this.getReadableDatabase();

        Cursor cursor = database.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                QuestionItem questionItem = new QuestionItem();
                questionItem.setId(cursor.getInt(0));
                questionItem.setCategory(cursor.getString(1));
                questionItem.setQuestion(cursor.getString(2));
                questionItem.setOption_one(cursor.getString(3));
                questionItem.setOption_two(cursor.getString(4));
                questionItem.setOption_three(cursor.getString(5));
                questionItem.setOption_four(cursor.getString(6));
                questionItem.setAnswer(cursor.getInt(7));
                quesList.add(questionItem);
            } while (cursor.moveToNext());
        }

        return quesList;
    }

    public List<QuestionItem> getQuestionsByCategory(String category) {

        List<QuestionItem> quesList = new ArrayList<>();

        String selectQuery = "SELECT  * FROM " + QUESTION_ANSWER + "WHERE " + KEY_CATEGORY + " = " + category + ";";

        database = this.getReadableDatabase();

        Cursor cursor = database.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                QuestionItem questionItem = new QuestionItem();
                questionItem.setId(cursor.getInt(0));
                questionItem.setCategory(cursor.getString(1));
                questionItem.setQuestion(cursor.getString(2));
                questionItem.setOption_one(cursor.getString(3));
                questionItem.setOption_two(cursor.getString(4));
                questionItem.setOption_three(cursor.getString(5));
                questionItem.setOption_four(cursor.getString(6));
                quesList.add(questionItem);
            } while (cursor.moveToNext());
        }

        return quesList;
    }

    public int rowcount() {
        int row;
        String selectQuery = "SELECT  * FROM " + QUESTION_ANSWER;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        row = cursor.getCount();
        return row;
    }
}
