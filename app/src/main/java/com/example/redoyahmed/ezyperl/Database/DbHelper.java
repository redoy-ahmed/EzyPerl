package com.example.redoyahmed.ezyperl.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.redoyahmed.ezyperl.Model.Category;
import com.example.redoyahmed.ezyperl.Model.Language;
import com.example.redoyahmed.ezyperl.Model.PerformanceItem;
import com.example.redoyahmed.ezyperl.Model.QuestionItem;
import com.example.redoyahmed.ezyperl.Model.Result;
import com.example.redoyahmed.ezyperl.Model.TutorialItems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by redoy.ahmed on 04-Mar-2018.
 */

public class DbHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "ezyPerl";

    private static final String TUTORIAL_LANGUAGE = "TutorialLanguage";
    private static final String TUTORIAL_CATEGORY = "TutorialCategory";
    private static final String TUTORIAL_DETAILS = "TutorialDetails";
    private static final String QUESTION_ANSWER = "QuestionAnswer";
    private static final String TUTORIAL_RESULT = "TutorialResult";

    private static final String KEY_NAME = "name";
    private static final String KEY_LANGUAGE_ID = "language_id";
    private static final String KEY_CATEGORY_ID = "category_id";
    private static final String KEY_TUTORIAL_NAME = "tutorial_name";
    private static final String KEY_TUTORIAL_DETAILS = "tutorial_details";
    private static final String KEY_TUTORIAL_CODE = "tutorial_code";
    private static final String KEY_TOTAL_QUESTION = "total_question";
    private static final String KEY_CORRECT_ANSWER = "correct_answer";

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
        String sql;

        sql = "CREATE TABLE IF NOT EXISTS "
                + TUTORIAL_LANGUAGE + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + KEY_NAME + " TEXT);";
        db.execSQL(sql);

        sql = "CREATE TABLE IF NOT EXISTS "
                + TUTORIAL_CATEGORY + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + KEY_LANGUAGE_ID + " INTEGER, "
                + KEY_CATEGORY + " TEXT);";
        db.execSQL(sql);

        sql = "CREATE TABLE IF NOT EXISTS "
                + TUTORIAL_DETAILS + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + KEY_LANGUAGE_ID + " INTEGER, "
                + KEY_CATEGORY_ID + " INTEGER, "
                + KEY_TUTORIAL_NAME + " TEXT, "
                + KEY_TUTORIAL_DETAILS + " TEXT, "
                + KEY_TUTORIAL_CODE + " TEXT);";
        db.execSQL(sql);

        sql = "CREATE TABLE IF NOT EXISTS "
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

        sql = "CREATE TABLE IF NOT EXISTS "
                + TUTORIAL_RESULT + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + KEY_LANGUAGE_ID + " INTEGER, "
                + KEY_CATEGORY_ID + " INTEGER, "
                + KEY_TOTAL_QUESTION + " INTEGER, "
                + KEY_CORRECT_ANSWER + " INTEGER);";
        db.execSQL(sql);

        addLanguages();
        addCategories();
        addDetails();
        addQuestions();
        addResult();
    }

    private void addLanguages() {
        Language l1 = new Language("Perl");
        addLanguage(l1);
    }

    private void addLanguage(Language l) {
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, l.getName());
        database.insert(TUTORIAL_LANGUAGE, null, values);
    }

    private void addCategories() {
        Category c1 = new Category(1, "Array");
        addCategory(c1);
        Category c2 = new Category(1, "String");
        addCategory(c2);
        Category c3 = new Category(1, "List");
        addCategory(c3);
    }

    private void addCategory(Category c) {
        ContentValues values = new ContentValues();
        values.put(KEY_LANGUAGE_ID, c.getLanguage_id());
        values.put(KEY_CATEGORY, c.getCategory());
        database.insert(TUTORIAL_CATEGORY, null, values);
    }

    private void addDetails() {
        TutorialItems details1 = new TutorialItems(1, 1, "Array Declaration", "BLA11 BLA1 BLA1", "Code1 code1 code1");
        addDetail(details1);

        TutorialItems details2 = new TutorialItems(1, 1, "Array Initialization", "BLA2 BLA2 BLA2", "Code2 code2 code2");
        addDetail(details2);

        TutorialItems details3 = new TutorialItems(1, 2, "String Usage", "BLA3 BLA3 BLA3", "Code3 code3 code3");
        addDetail(details3);

        TutorialItems details4 = new TutorialItems(1, 2, "String functions", "BLA4 BLA4 BLA4", "Code4 code4 code4");
        addDetail(details4);
    }

    private void addDetail(TutorialItems details) {
        ContentValues values = new ContentValues();
        values.put(KEY_LANGUAGE_ID, details.getLanguage_id());
        values.put(KEY_CATEGORY_ID, details.getCategory_id());
        values.put(KEY_TUTORIAL_NAME, details.getTutorial_name());
        values.put(KEY_TUTORIAL_DETAILS, details.getTutorial_details());
        values.put(KEY_TUTORIAL_CODE, details.getTutorial_code());
        database.insert(TUTORIAL_DETAILS, null, values);
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

    private void addQuestion(QuestionItem questionItem) {
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

    private void addResult() {
        Result r1 = new Result(1, 1, 5, 4);

        ContentValues values = new ContentValues();
        values.put(KEY_LANGUAGE_ID, r1.getLanguage_id());
        values.put(KEY_CATEGORY_ID, r1.getCategory_id());
        values.put(KEY_TOTAL_QUESTION, r1.getTotal_question());
        values.put(KEY_CORRECT_ANSWER, r1.getCorrect_answer());
        database.insert(TUTORIAL_RESULT, null, values);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        db.execSQL("DROP TABLE IF EXISTS " + QUESTION_ANSWER);
        onCreate(db);
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

    public List<TutorialItems> getAllTutorials() {

        List<TutorialItems> tutorialList = new ArrayList<>();

        String selectQuery = "SELECT  * FROM " + TUTORIAL_DETAILS + ";";

        database = this.getReadableDatabase();

        Cursor cursor = database.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                TutorialItems tutorialItems = new TutorialItems();
                tutorialItems.setId(cursor.getInt(0));
                tutorialItems.setLanguage_id(cursor.getInt(1));
                tutorialItems.setCategory_id(cursor.getInt(2));
                tutorialItems.setTutorial_name(cursor.getString(3));
                tutorialItems.setTutorial_details(cursor.getString(4));
                tutorialItems.setTutorial_code(cursor.getString(5));
                tutorialList.add(tutorialItems);
            } while (cursor.moveToNext());
        }

        return tutorialList;
    }

    public List<PerformanceItem> getAllCategories() {

        List<PerformanceItem> categoryList = new ArrayList<>();

        String selectQuery = "" +
                "SELECT TC.category as category,\n" +
                "COALESCE(TR.total_question, 0) AS totalQuestion, \n" +
                "COALESCE(TR.correct_answer, 0) AS correctAnswer \n" +
                "FROM \n" +
                "TutorialCategory TC \n" +
                "LEFT JOIN \n" +
                "TutorialResult TR \n" +
                "ON TC.id=TR.category_id;";

        database = this.getReadableDatabase();

        Cursor cursor = database.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                PerformanceItem performanceItem = new PerformanceItem();
                performanceItem.setCategory(cursor.getString(0));
                performanceItem.setTotalQuestion(cursor.getInt(1));
                performanceItem.setCorrectAnswer(cursor.getInt(2));
                categoryList.add(performanceItem);
            } while (cursor.moveToNext());
        }
        return categoryList;
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
