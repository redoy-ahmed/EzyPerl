package com.example.redoyahmed.ezyperl.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.redoyahmed.ezyperl.Model.Category;
import com.example.redoyahmed.ezyperl.Model.Language;
import com.example.redoyahmed.ezyperl.Model.PerformanceItem;
import com.example.redoyahmed.ezyperl.Model.QuestionItem;
import com.example.redoyahmed.ezyperl.Model.Result;
import com.example.redoyahmed.ezyperl.Model.TutorialItems;
import com.example.redoyahmed.ezyperl.R;

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
    private static final String KEY_TIMES_PLAYED = "times_played";

    private static final String KEY_ID = "id";
    private static final String KEY_CATEGORY = "category";
    private static final String KEY_QUES = "question";
    private static final String KEY_ANSWER = "answer";
    private static final String KEY_OPTONE = "option_one";
    private static final String KEY_OPTTWO = "option_two";
    private static final String KEY_OPTTHREE = "option_three";
    private static final String KEY_OPTFOUR = "option_four";
    private static final String KEY_LEVEL = "level";
    private SQLiteDatabase database;
    private Context context;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
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
                + KEY_CATEGORY + " TEXT, "
                + KEY_LEVEL + " INTEGER);";
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
                + KEY_CATEGORY_ID + " INTEGER, "
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
                + KEY_TIMES_PLAYED + " INTEGER, "
                + KEY_TOTAL_QUESTION + " INTEGER, "
                + KEY_CORRECT_ANSWER + " INTEGER);";
        db.execSQL(sql);

        addLanguages();
        addCategories();
        addDetails();
        addQuestions();
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
        String[] category = context.getResources().getStringArray(R.array.category);
        Category c;
        int changeLevel = 0;
        int level = 1;
        for (int i = 0; i < category.length; i++) {
            changeLevel++;
            if (changeLevel % 5 == 0) {
                c = new Category(1, category[i], level++);
            } else {
                c = new Category(1, category[i], level);
            }
            addCategory(c);
        }
    }

    private void addCategory(Category c) {
        ContentValues values = new ContentValues();
        values.put(KEY_LANGUAGE_ID, c.getLanguage_id());
        values.put(KEY_CATEGORY, c.getCategory());
        values.put(KEY_LEVEL, c.getLevel());
        database.insert(TUTORIAL_CATEGORY, null, values);
    }

    private void addDetails() {
        String[] tutorials = context.getResources().getStringArray(R.array.tutorialDetails);
        String[] category = context.getResources().getStringArray(R.array.category);

        for (int i = 0; i < tutorials.length; i++) {
            TutorialItems details = new TutorialItems(1, i + 1, category[i], tutorials[i], "Code1 code1 code1");
            addDetail(details);
        }
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

        String[] category_id = context.getResources().getStringArray(R.array.tutorialDetails);
        String[] category = context.getResources().getStringArray(R.array.category);

        String[] introduction_questions = context.getResources().getStringArray(R.array.introduction_questions);
        String[] introduction_answers = context.getResources().getStringArray(R.array.introduction_answers);

        String[] environment_questions = context.getResources().getStringArray(R.array.environment_questions);
        String[] environment_answers = context.getResources().getStringArray(R.array.environment_answers);

        String[] syntax_overview_questions = context.getResources().getStringArray(R.array.syntax_overview_questions);
        String[] syntax_overview_answers = context.getResources().getStringArray(R.array.syntax_overview_answers);

        String[] data_types_questions = context.getResources().getStringArray(R.array.data_types_questions);
        String[] data_types_answers = context.getResources().getStringArray(R.array.data_types_answers);

        String[] variables_questions = context.getResources().getStringArray(R.array.variables_questions);
        String[] variables_answers = context.getResources().getStringArray(R.array.variables_answers);


        /*String[] scalars_questions = context.getResources().getStringArray(R.array.scalars_questions);
        String[] arrays_questions = context.getResources().getStringArray(R.array.arrays_questions);
        String[] hashes_questions = context.getResources().getStringArray(R.array.hashes_questions);
        String[] if_else_questions = context.getResources().getStringArray(R.array.if_else_questions);
        String[] loops_questions = context.getResources().getStringArray(R.array.loops_questions);
        String[] operators_questions = context.getResources().getStringArray(R.array.operators_questions);
        String[] date_and_time_questions = context.getResources().getStringArray(R.array.date_and_time_questions);
        String[] subroutines_questions = context.getResources().getStringArray(R.array.subroutines_questions);
        String[] references_questions = context.getResources().getStringArray(R.array.references_questions);
        String[] files_questions = context.getResources().getStringArray(R.array.files_questions);
        String[] directories_questions = context.getResources().getStringArray(R.array.directories_questions);
        String[] error_handling_questions = context.getResources().getStringArray(R.array.error_handling_questions);
        String[] regular_expression_questions = context.getResources().getStringArray(R.array.regular_expression_questions);
        String[] socket_programming_questions = context.getResources().getStringArray(R.array.socket_programming_questions);
        String[] oop_questions = context.getResources().getStringArray(R.array.oop_questions);
        String[] database_questions = context.getResources().getStringArray(R.array.database_questions);
        String[] package_and_modules_questions = context.getResources().getStringArray(R.array.package_and_modules_questions);*/

        for (int i = 0; i < introduction_questions.length; i++) {
            String[] parts = introduction_answers[i].split(",");
            QuestionItem introductionQuestions = new QuestionItem(Integer.valueOf(category_id[0]), category[0], introduction_questions[i], parts[0], parts[1], parts[2], parts[3], Integer.valueOf(parts[4]));
            addQuestion(introductionQuestions);
        }

        for (int i = 0; i < environment_questions.length; i++) {
            String[] parts = environment_answers[i].split(",");
            QuestionItem environmentQuestions = new QuestionItem(Integer.valueOf(category_id[1]), category[1], environment_questions[i], parts[0], parts[1], parts[2], parts[3], Integer.valueOf(parts[4]));
            addQuestion(environmentQuestions);
        }

        for (int i = 0; i < syntax_overview_questions.length; i++) {
            String[] parts = syntax_overview_answers[i].split(",");
            QuestionItem syntaxOverviewQuestions = new QuestionItem(Integer.valueOf(category_id[2]), category[2], syntax_overview_questions[i], parts[0], parts[1], parts[2], parts[3], Integer.valueOf(parts[4]));
            addQuestion(syntaxOverviewQuestions);
        }

        for (int i = 0; i < data_types_questions.length; i++) {
            String[] parts = data_types_answers[i].split(",");
            QuestionItem dataTypesQuestions = new QuestionItem(Integer.valueOf(category_id[3]), category[3], data_types_questions[i], parts[0], parts[1], parts[2], parts[3], Integer.valueOf(parts[4]));
            addQuestion(dataTypesQuestions);
        }

        for (int i = 0; i < variables_questions.length; i++) {
            String[] parts = variables_answers[i].split(",");

            Log.e("category_id",category_id[4]);
            Log.e("category",category[4]);
            Log.e("variables_questions",variables_questions[i]);
            Log.e("1",parts[0]);
            Log.e("2",parts[1]);
            Log.e("3",parts[2]);
            Log.e("4",parts[3]);
            Log.e("answer",parts[4]);

            QuestionItem variablesQuestions = new QuestionItem(Integer.valueOf(category_id[4]), category[4], variables_questions[i], parts[0], parts[1], parts[2], parts[3], Integer.valueOf(parts[4]));
            addQuestion(variablesQuestions);
        }
    }

    private void addQuestion(QuestionItem questionItem) {
        ContentValues values = new ContentValues();
        values.put(KEY_CATEGORY_ID, questionItem.getCategoryID());
        values.put(KEY_CATEGORY, questionItem.getCategory());
        values.put(KEY_QUES, questionItem.getQuestion());
        values.put(KEY_OPTONE, questionItem.getOption_one());
        values.put(KEY_OPTTWO, questionItem.getOption_two());
        values.put(KEY_OPTTHREE, questionItem.getOption_three());
        values.put(KEY_OPTFOUR, questionItem.getOption_four());
        values.put(KEY_ANSWER, questionItem.getAnswer());

        database.insert(QUESTION_ANSWER, null, values);
    }

    public void addResult(Result result) {
        database.delete(TUTORIAL_RESULT, KEY_CATEGORY_ID + "=?", new String[]{String.valueOf(result.getCategory_id())});

        ContentValues values = new ContentValues();
        values.put(KEY_LANGUAGE_ID, result.getLanguage_id());
        values.put(KEY_CATEGORY_ID, result.getCategory_id());
        values.put(KEY_TIMES_PLAYED, result.getTimes_played());
        values.put(KEY_TOTAL_QUESTION, result.getTotal_question());
        values.put(KEY_CORRECT_ANSWER, result.getCorrect_answer());
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
                questionItem.setCategoryID(cursor.getInt(1));
                questionItem.setCategory(cursor.getString(2));
                questionItem.setQuestion(cursor.getString(3));
                questionItem.setOption_one(cursor.getString(4));
                questionItem.setOption_two(cursor.getString(5));
                questionItem.setOption_three(cursor.getString(6));
                questionItem.setOption_four(cursor.getString(7));
                questionItem.setAnswer(cursor.getInt(8));
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
                "SELECT TC.language_id as languageID,\n" +
                "TC.id as categoryID,\n" +
                "TC.category as category,\n" +
                "COALESCE(TR.total_question, 0) AS totalQuestion,\n" +
                "COALESCE(TR.correct_answer, 0) AS correctAnswer \n" +
                "FROM\n" +
                "TutorialCategory TC\n" +
                "LEFT JOIN\n" +
                "TutorialResult TR\n" +
                "ON TC.id=TR.category_id;";

        database = this.getReadableDatabase();

        Cursor cursor = database.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                PerformanceItem performanceItem = new PerformanceItem();
                performanceItem.setLanguageID(cursor.getInt(0));
                performanceItem.setCategoryID(cursor.getInt(1));
                performanceItem.setCategory(cursor.getString(2));
                performanceItem.setTotalQuestion(cursor.getInt(3));
                performanceItem.setCorrectAnswer(cursor.getInt(4));
                categoryList.add(performanceItem);
            } while (cursor.moveToNext());
        }
        return categoryList;
    }

    public List<QuestionItem> getQuestionsByCategory(int category) {

        List<QuestionItem> quesList = new ArrayList<>();

        String selectQuery = "" +
                "select\n" +
                "*\n" +
                "from \n" +
                "QuestionAnswer \n" +
                "where category_id=" + category + ";";

        database = this.getReadableDatabase();

        Cursor cursor = database.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                QuestionItem questionItem = new QuestionItem();
                questionItem.setId(cursor.getInt(0));
                questionItem.setCategoryID(cursor.getInt(1));
                questionItem.setCategory(cursor.getString(2));
                questionItem.setQuestion(cursor.getString(3));
                questionItem.setOption_one(cursor.getString(4));
                questionItem.setOption_two(cursor.getString(5));
                questionItem.setOption_three(cursor.getString(6));
                questionItem.setOption_four(cursor.getString(7));
                questionItem.setAnswer(cursor.getInt(8));
                quesList.add(questionItem);
            } while (cursor.moveToNext());
        }

        return quesList;
    }

    public List<Result> getResultsByCategory(int category_id) {

        List<Result> resultList = new ArrayList<>();

        String selectQuery = "" +
                "SELECT TR.id as id,\n" +
                "TR.language_id as language_id,\n" +
                "TC.id as categoryID,\n" +
                "TR.times_played as times_played,\n" +
                "COALESCE(TR.total_question, 0) AS totalQuestion,\n" +
                "COALESCE(TR.correct_answer, 0) AS correctAnswer,\n" +
                "TC.level as level\n" +
                "FROM\n" +
                "TutorialCategory TC\n" +
                "LEFT JOIN\n" +
                "TutorialResult TR\n" +
                "ON TC.id=TR.category_id where TR.category_id=" + category_id + ";";

        database = this.getReadableDatabase();

        Cursor cursor = database.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                Result result = new Result();
                result.setId(cursor.getInt(0));
                result.setLanguage_id(cursor.getInt(1));
                result.setCategory_id(cursor.getInt(2));
                result.setTimes_played(cursor.getInt(3));
                result.setTotal_question(cursor.getInt(4));
                result.setCorrect_answer(cursor.getInt(5));
                result.setLevel(cursor.getInt(6));
                resultList.add(result);
            } while (cursor.moveToNext());
        }

        return resultList;
    }

    public int questionCount(int category_id) {
        int row;
        String selectQuery = "select * from QuestionAnswer where category_id=" + category_id + ";";
        SQLiteDatabase db = getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        row = cursor.getCount();

        return row;
    }

    public int getQuizLevelByCategory(String category) {
        int level = 0;
        String selectQuery = "select level from TutorialCategory where category='" + category + "';";
        SQLiteDatabase db = getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                level = cursor.getInt(0);
            } while (cursor.moveToNext());
        }
        return level;
    }
}