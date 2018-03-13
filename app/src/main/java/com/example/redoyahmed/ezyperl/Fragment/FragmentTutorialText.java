package com.example.redoyahmed.ezyperl.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.redoyahmed.ezyperl.Database.DbHelper;
import com.example.redoyahmed.ezyperl.Model.TutorialItems;
import com.example.redoyahmed.ezyperl.R;
import com.example.redoyahmed.ezyperl.Utils.Code;
import com.example.redoyahmed.ezyperl.Utils.Codeview;
import com.example.redoyahmed.ezyperl.Utils.Settings;
import com.example.redoyahmed.ezyperl.Utils.TouchMyWebView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


@SuppressLint("ValidFragment")
public class FragmentTutorialText extends Fragment {

    private View rootView;
    private int category_id;
    private List<TutorialItems> tutorialItems;

    @BindView(R.id.summarytext)
    public TouchMyWebView textView;

    public FragmentTutorialText(int category_id) {
        this.category_id = category_id;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_tutorial_text, container, false);
        ButterKnife.bind(this, rootView);

        loadData(category_id);
        loadDataIntoWidgets();

        return rootView;
    }

    private void loadData(int category_id) {
        DbHelper db = new DbHelper(rootView.getContext());
        tutorialItems = db.getTutorialDetailsByCategory(category_id);
    }

    private void loadDataIntoWidgets() {
        textView.getSettings().setBuiltInZoomControls(true);
        textView.getSettings().setDisplayZoomControls(false);
        textView.getSettings().setJavaScriptEnabled(true);
        Codeview.with(getContext())
                .setStyle(Code.DEFAULT_STYLE)
                .setAutoWrap(Code.autoWrap)
                .setLang(Settings.Lang.PYTHON)
                .withHtml("<h1>Perl - Introduction</h1>")
                .withHtml("<p>Perl is a general-purpose programming language originally developed for text manipulation and now used for a wide range of tasks including system administration, web development, network programming, GUI development, and more.</p>\n" + "<h2>What is Perl?</h2>\n")
                .withHtml("<li><p>Perl is a stable, cross platform programming language.</p></li>\n" + "<li><p>Though Perl is not officially an acronym but few people used it as <b>Practical Extraction and Report Language</b>.</p></li>\n" + "<li><p>It is used for mission critical projects in the public and private sectors.</p></li>\n" + "<li><p>Perl is an <i>Open Source</i> software, licensed under its <i>Artistic License</i>, or the <i>GNU General Public License (GPL)</i>.</p></li>\n" + "<li><p>Perl was created by Larry Wall.</p></li>\n" + "<li><p>Perl 1.0 was released to usenet's alt.comp.sources in 1987.</p></li>\n" + "<li><p>At the time of writing this tutorial, the latest version of perl was 5.16.2.</p></li>\n" + "<li><p>Perl is listed in the <i>Oxford English Dictionary</i>.</p></li>\n" + "</ul>\n" + "<p>PC Magazine announced Perl as the finalist for its 1998 Technical Excellence Award in the Development Tool category.</p>\n")
                .withHtml("<h2>Perl Features</h2>\n" + "<ul class=\"list\">\n" + "<li><p>Perl takes the best features from other languages, such as C, awk, sed, sh, and BASIC, among others.</p></li>\n" + "<li><p>Perls database integration interface DBI supports third-party databases including Oracle, Sybase, Postgres, MySQL and others.</p></li>\n" + "<li><p>Perl works with HTML, XML, and other mark-up languages.</p></li>\n" + "<li><p>Perl supports Unicode.</p></li>\n" + "<li><p>Perl is Y2K compliant.</p></li>\n" + "<li><p>Perl supports both procedural and object-oriented programming.</p></li>\n" + "<li><p>Perl interfaces with external C/C++ libraries through XS or SWIG.</p></li>\n" + "<li><p>Perl is extensible. There are over 20,000 third party modules available from the Comprehensive Perl Archive Network.</p></li>\n" + "<li><p>The Perl interpreter can be embedded into other systems.</p></li>\n" + "</ul>\n")
                .withHtml("<h2>Perl and the Web</h2>\n" + "<ul class=\"list\">\n" + "<li><p>Perl used to be the most popular web programming language due to its text manipulation capabilities and rapid development cycle.</p></li>\n" + "<li><p>Perl is widely known as the duct-tape of the Internet.</p></li>\n" + "<li><p>Perl can handle encrypted Web data, including e-commerce transactions.</p></li>\n" + "<li><p>Perl can be embedded into web servers to speed up processing by as much as 2000%.</p></li>\n" + "<li><p>Perl's mod_perl allows the Apache web server to embed a Perl interpreter.</p></li>\n" + "<li><p>Perl's DBI package makes web-database integration easy.</p></li>\n" + "</ul>\n" + "<h2>Perl is Interpreted</h2>\n" + "<p>Perl is an interpreted language, which means that your code can be run as is, without a compilation stage that creates a non portable executable program.</p>\n" + "<p>Traditional compilers convert programs into machine language. When you run a Perl program, it's first compiled into a byte code, which is then converted ( as the program runs) into machine instructions. So it is not quite the same as shells, or Tcl, which are <b>strictly</b> interpreted without an intermediate representation.</p>\n" + "<p>It is also not like most versions of C or C++, which are compiled directly into a machine dependent format. It is somewhere in between, along with Python and awk and Emacs .elc files.</p>\n")
                .withHtml("</br>")
                .into(textView);

        /*.withHtml("First Python Program<br><b>Interactive Mode Programming</b><br>Invoking the interpreter without passing a script file as a parameter brings up the following prompt −")
                .withCode("$ python\nPython 2.4.3 (#1, Nov 11 2010, 13:34:43)\n[GCC 4.1.2 20080704 (Red Hat 4.1.2-48)] on linux2\nType \"help\", \"copyright\", \"credits\" or \"license\" for more information.\n>>>")
                .withHtml("Type the following text at the Python prompt and press the Enter:")
                .withCode(">>> print \"Hello, Python!\"")
                .withHtml("If you are running new version of Python, then you would need to use print statement with parenthesis as in print (\"Hello, Python!\");. However in Python version 2.4.3, this produces the following result:")
                .withCode("Hello, Python!")
                .withHtml("<h3>Script Mode Programming</h3>")
                .withHtml("Invoking the interpreter with a script parameter begins execution of the script and continues until the script is finished. When the script is finished, the interpreter is no longer active.\n\nLet us write a simple Python program in a script. Python files have extension .py. Type the following source code in a test.py file:")
                .withCode("print \"Hello, Python!\"")
                .withHtml("We assume that you have Python interpreter set in PATH variable. Now, try to run this program as follows −")
                .withCode("$ python test.py")
                .withHtml("This produces the following result:")
                .withCode("Hello, Python!")
                .withHtml("Let us try another way to execute a Python script. Here is the modified test.py file −")
                .withCode("#!/usr/bin/python\n\nprint \"Hello, Python!\"")
                .withHtml("We assume that you have Python interpreter available in /usr/bin directory. Now, try to run this program as follows −")
                .withCode("$ chmod +x test.py     # This is to make file executable\n$./test.py")
                .withHtml("This produces the following result −")
                .withCode("Hello, Python!")
                .withHtml("<h2>Python Identifiers</h2>")
                .withHtml("A Python identifier is a name used to identify a variable, function, class, module or other object. An identifier starts with a letter A to Z or a to z or an underscore (_) followed by zero or more letters, underscores and digits (0 to 9).\n\nPython does not allow punctuation characters such as @, $, and % within identifiers. Python is a case sensitive programming language. Thus, Manpower and manpower are two different identifiers in Python.\n\nHere are naming conventions for Python identifiers −")
                .withHtml("<ul class=\"list\">\n<li><p>Class names start with an uppercase letter. All other identifiers start with a lowercase letter.</p></li>\n<li><p>Starting an identifier with a single leading underscore indicates that the identifier is private.</p></li>\n<li><p>Starting an identifier with two leading underscores indicates a strongly private identifier.</p></li>\n<li><p>If the identifier also ends with two trailing underscores, the identifier is a language-defined special name.</p></li>\n</ul>")
                .withHtml("<h2>Reserved Words</h2>")
                .withHtml("<table class=\"table table-bordered\">\n<tbody><tr><td>And</td><td>exec</td><td>Not</td></tr>\n<tr><td>Assert</td><td>finally</td><td>or</td></tr>\n<tr><td>Break</td><td>for</td><td>pass</td></tr>\n<tr><td>Class</td><td>from</td><td>print</td></tr>\n<tr><td>Continue</td><td>global</td><td>raise</td></tr>\n<tr><td>def</td><td>if</td><td>return</td></tr>\n<tr><td>del</td><td>import</td><td>try</td></tr>\n<tr><td>elif</td><td>in</td><td>while</td></tr>\n<tr><td>else</td><td>is</td><td>with </td></tr>\n<tr><td>except</td><td>lambda</td><td>yield</td></tr>\n</tbody></table>")
                .withHtml("<h2>Lines and Indentation</h2>")
                .withHtml("Python provides no braces to indicate blocks of code for class and function definitions or flow control. Blocks of code are denoted by line indentation, which is rigidly enforced.\n\nThe number of spaces in the indentation is variable, but all statements within the block must be indented the same amount. For example −")
                .withCode("if True:\n    print \"True\"\nelse:\n  print \"False\"")
                .withHtml("<b>However, the following block generates an error − </b>")
                .withCode("if True:\n    print \"Answer\"\n    print \"True\"\nelse:\n    print \"Answer\"\n  print \"False\"")
                .withHtml("Thus, in Python all the continuous lines indented with same number of spaces would form a block. The following example has various statement blocks −")
                .withHtml("Note: Do not try to understand the logic at this point of time. Just make sure you understood various blocks even if they are without braces.")
                .withHtml("<h2>Multi-Line Statements</h2>")
                .withHtml("Statements in Python typically end with a new line. Python does, however, allow the use of the line continuation character (\\) to denote that the line should continue. For example −")
                .withCode("total = item_one + \\\n        item_two + \\\n        item_three")
                .withHtml("Statements contained within the [], {}, or () brackets do not need to use the line continuation character. For example −")
                .withCode("days = ['Monday', 'Tuesday', 'Wednesday',\n        'Thursday', 'Friday']")
                .withHtml("<h2>Quotation in Python</h2>")
                .withHtml("Python accepts single ('), double (\") and triple (''' or \"\"\") quotes to denote string literals, as long as the same type of quote starts and ends the string.\n\nThe triple quotes are used to span the string across multiple lines. For example, all the following are legal −")
                .withCode("word = 'word'\nsentence = \"This is a sentence.\"\nparagraph = \"\"\"This is a paragraph. It is\nmade up of multiple lines and sentences.\"\"\"")
                .withHtml("<h2>Comments in Python</h2>")
                .withHtml("A hash sign (#) that is not inside a string literal begins a comment. All characters after the # and up to the end of the physical line are part of the comment and the Python interpreter ignores them.")
                .withCode("#!/usr/bin/python\n\n# First comment\nprint \"Hello, Python!\" # second comment")
                .withHtml("You can type a comment on the same line after a statement or expression −")
                .withCode("name = \"Madisetti\" # This is again comment")
                .withHtml("You can comment multiple lines as follows −")
                .withCode("# This is a comment.\n# This is a comment, too.\n# This is a comment, too.\n# I said that already.")
                .withHtml("<h2>Multiple Statements on a Single Line</h2>")
                .withHtml("The semicolon ( ; ) allows multiple statements on the single line given that neither statement starts a new code block. Here is a sample snip using the semicolon −")
                .withCode("import sys; x = 'foo'; sys.stdout.write(x + '\\n')")
                .withHtml("<h2>Multiple Statement Groups as Suites</h2>")
                .withHtml("A group of individual statements, which make a single code block are called suites in Python. Compound or complex statements, such as if, while, def, and class require a header line and a suite.\n\nHeader lines begin the statement (with the keyword) and terminate with a colon ( : ) and are followed by one or more lines which make up the suite. For example −")
                .withCode("if expression : \n   suite\nelif expression : \n   suite \nelse : \n   suite")
                .withHtml("<h2>Waiting for the User</h2>")
                .withHtml("The following line of the program displays the prompt, the statement saying “Press the enter key to exit”, and waits for the user to take action −")
                .withCode("#!/usr/bin/python\n\ninput = raw_input(\"\\n\\nPress the enter key to exit.\")print(input)")*/
    }
}
