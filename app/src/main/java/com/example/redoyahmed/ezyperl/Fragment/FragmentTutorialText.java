package com.example.redoyahmed.ezyperl.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.redoyahmed.ezyperl.R;
import com.example.redoyahmed.ezyperl.Utils.Code;
import com.example.redoyahmed.ezyperl.Utils.Codeview;
import com.example.redoyahmed.ezyperl.Utils.Settings;
import com.example.redoyahmed.ezyperl.Utils.TouchMyWebView;

import butterknife.BindView;
import butterknife.ButterKnife;


@SuppressLint("ValidFragment")
public class FragmentTutorialText extends Fragment {

    private View rootView;
    private String category;

    @BindView(R.id.summarytext)
    public TouchMyWebView textView;

    public FragmentTutorialText(String category) {
        this.category = category;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_tutorial_text, container, false);
        ButterKnife.bind(this, rootView);
        loadDataIntoWidgets();
        return rootView;
    }

    private void loadDataIntoWidgets() {
        textView.getSettings().setBuiltInZoomControls(true);
        textView.getSettings().setDisplayZoomControls(false);
        textView.getSettings().setJavaScriptEnabled(true);
        loadDataByCategory(category);
    }

    private void loadDataByCategory(String category) {
        String[] categories = rootView.getContext().getResources().getStringArray(R.array.category);

        if (category.equals(categories[0])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h1>Perl - Introduction</h1>")
                    .withHtml("<p>Perl is a general-purpose programming language originally developed for text manipulation and now used for a wide range of tasks including system administration, web development, network programming, GUI development, and more.</p>\n" + "<h2>What is Perl?</h2>\n")
                    .withHtml("<li><p>Perl is a stable, cross platform programming language.</p></li>\n" + "<li><p>Though Perl is not officially an acronym but few people used it as <b>Practical Extraction and Report Language</b>.</p></li>\n" + "<li><p>It is used for mission critical projects in the public and private sectors.</p></li>\n" + "<li><p>Perl is an <i>Open Source</i> software, licensed under its <i>Artistic License</i>, or the <i>GNU General Public License (GPL)</i>.</p></li>\n" + "<li><p>Perl was created by Larry Wall.</p></li>\n" + "<li><p>Perl 1.0 was released to usenet's alt.comp.sources in 1987.</p></li>\n" + "<li><p>At the time of writing this tutorial, the latest version of perl was 5.16.2.</p></li>\n" + "<li><p>Perl is listed in the <i>Oxford English Dictionary</i>.</p></li>\n" + "</ul>\n" + "<p>PC Magazine announced Perl as the finalist for its 1998 Technical Excellence Award in the Development Tool category.</p>\n")
                    .withHtml("<h2>Perl Features</h2>\n" + "<ul class=\"list\">\n" + "<li><p>Perl takes the best features from other languages, such as C, awk, sed, sh, and BASIC, among others.</p></li>\n" + "<li><p>Perls database integration interface DBI supports third-party databases including Oracle, Sybase, Postgres, MySQL and others.</p></li>\n" + "<li><p>Perl works with HTML, XML, and other mark-up languages.</p></li>\n" + "<li><p>Perl supports Unicode.</p></li>\n" + "<li><p>Perl is Y2K compliant.</p></li>\n" + "<li><p>Perl supports both procedural and object-oriented programming.</p></li>\n" + "<li><p>Perl interfaces with external C/C++ libraries through XS or SWIG.</p></li>\n" + "<li><p>Perl is extensible. There are over 20,000 third party modules available from the Comprehensive Perl Archive Network.</p></li>\n" + "<li><p>The Perl interpreter can be embedded into other systems.</p></li>\n" + "</ul>\n")
                    .withHtml("<h2>Perl and the Web</h2>\n" + "<ul class=\"list\">\n" + "<li><p>Perl used to be the most popular web programming language due to its text manipulation capabilities and rapid development cycle.</p></li>\n" + "<li><p>Perl is widely known as the duct-tape of the Internet.</p></li>\n" + "<li><p>Perl can handle encrypted Web data, including e-commerce transactions.</p></li>\n" + "<li><p>Perl can be embedded into web servers to speed up processing by as much as 2000%.</p></li>\n" + "<li><p>Perl's mod_perl allows the Apache web server to embed a Perl interpreter.</p></li>\n" + "<li><p>Perl's DBI package makes web-database integration easy.</p></li>\n" + "</ul>\n" + "<h2>Perl is Interpreted</h2>\n" + "<p>Perl is an interpreted language, which means that your code can be run as is, without a compilation stage that creates a non portable executable program.</p>\n" + "<p>Traditional compilers convert programs into machine language. When you run a Perl program, it's first compiled into a byte code, which is then converted ( as the program runs) into machine instructions. So it is not quite the same as shells, or Tcl, which are <b>strictly</b> interpreted without an intermediate representation.</p>\n" + "<p>It is also not like most versions of C or C++, which are compiled directly into a machine dependent format. It is somewhere in between, along with Python and awk and Emacs .elc files.</p>")
                    .withCode("<hr />\n")
                    .into(textView);
        } else if (category.equals(categories[1])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h1>Perl - Environment</h1>\n")
                    .withHtml("<hr />\n" +
                            "<p>Before we start writing our Perl programs, let's understand how to setup our Perl environment. Perl is available on a wide variety of platforms &minus;</p>\n" +
                            "<ul>\n" +
                            "<li>Unix (Solaris, Linux, FreeBSD, AIX, HP/UX, SunOS, IRIX etc.)</li>\n" +
                            "<li>Win 9x/NT/2000/</li>\n" +
                            "<li>WinCE</li>\n" +
                            "<li>Macintosh (PPC, 68K)</li>\n" +
                            "<li>Solaris (x86, SPARC)</li>\n" +
                            "<li>OpenVMS</li>\n" +
                            "<li>Alpha (7.2 and later)</li>\n" +
                            "<li>Symbian</li>\n" +
                            "<li>Debian GNU/kFreeBSD</li>\n" +
                            "<li>MirOS BSD</li>\n" +
                            "<li>And many more...</li>\n" +
                            "</ul>\n" +
                            "<p>This is more likely that your system will have perl installed on it. Just try giving the following command at the $ prompt &minus;</p>\n")
                    .withCode("$perl -v\n")
                    .withHtml("<p>If you have perl installed on your machine, then you will get a message something as follows &minus;</p>\n")
                    .withCode("This is perl 5, version 16, subversion 2 (v5.16.2) built for i686-linux\n" +
                            "\n" +
                            "Copyright 1987-2012, Larry Wall\n" +
                            "\n" +
                            "Perl may be copied only under the terms of either the Artistic License or the\n" +
                            "GNU General Public License, which may be found in the Perl 5 source kit.\n" +
                            "\n" +
                            "Complete documentation for Perl, including FAQ lists, should be found on\n" +
                            "this system using \"man perl\" or \"perldoc perl\".  If you have access to the\n" +
                            "Internet, point your browser at http://www.perl.org/, the Perl Home Page.\n")
                    .withHtml("<p>If you do not have perl already installed, then proceed to the next section.</p>\n" +
                            "<h2>Getting Perl Installation</h2>\n" +
                            "<p>The most up-to-date and current source code, binaries, documentation, news, etc. are available at the official website of Perl.</p>\n" +
                            "<p><b>Perl Official Website</b> &minus; <a rel=\"nofollow\" href=\"https://www.perl.org/\" target=\"_blank\">https://www.perl.org/</a></p>\n" +
                            "<p>You can download Perl documentation from the following site.</p>\n" +
                            "<p><b>Perl Documentation Website</b> &minus; <a rel=\"nofollow\" href=\"https://perldoc.perl.org\" target=\"_blank\">https://perldoc.perl.org</a></p>\n" +
                            "<h2>Install Perl</h2>\n" +
                            "<p>Perl distribution is available for a wide variety of platforms. You need to download only the binary code applicable for your platform and install Perl.</p>\n" +
                            "<p>If the binary code for your platform is not available, you need a C compiler to compile the source code manually. Compiling the source code offers more flexibility in terms of choice of features that you require in your installation.</p>\n" +
                            "<p>Here is a quick overview of installing Perl on various platforms.</p>\n" +
                            "<h2>Unix and Linux Installation</h2>\n" +
                            "<p>Here are the simple steps to install Perl on Unix/Linux machine.</p>\n" +
                            "<ul>\n" +
                            "<li><p>Open a Web browser and go to <a rel=\"nofollow\" href=\"https://www.perl.org/get.html\" target=\"_blank\">https://www.perl.org/get.html.</a></p></li>\n" +
                            "<li><p>Follow the link to download zipped source code available for Unix/Linux.</p></li>\n" +
                            "<li><p>Download <b>perl-5.x.y.tar.gz</b> file and issue the following commands at $ prompt.</p></li>\n" +
                            "</ul>\n")
                    .withCode("$tar -xzf perl-5.x.y.tar.gz\n" +
                            "$cd perl-5.x.y\n" +
                            "$./Configure -de\n" +
                            "$make\n" +
                            "$make test\n" +
                            "$make install")
                    .withHtml("<p><b>NOTE</b> &minus; Here $ is a Unix prompt where you type your command, so make sure you are not typing $ while typing the above mentioned commands.</p>\n" +
                            "<p>This will install Perl in a standard location <i>/usr/local/bin</i> and its libraries are installed in <i>/usr/local/lib/perlXX</i>, where XX is the version of Perl that you are using.</p>\n" +
                            "<p>It will take a while to compile the source code after issuing the <b>make</b> command. Once installation is done, you can issue <b>perl -v</b> command at $ prompt to check perl installation. If everything is fine, then it will display message like we have shown above.</p>\n" +
                            "<h2>Windows Installation</h2>\n" +
                            "<p>Here are the steps to install Perl on Windows machine.</p>\n" +
                            "<ul>\n" +
                            "<li><p>Follow the link for the Strawberry Perl installation on Windows <a rel=\"nofollow\" href=\"http://strawberryperl.com\" target=\"_blank\">http://strawberryperl.com</a></p></li>\n" +
                            "<li><p>Download either 32bit or 64bit version of installation.</p></li>\n" +
                            "<li><p>Run the downloaded file by double-clicking it in Windows Explorer. This brings up the Perl install wizard, which is really easy to use. Just accept the default settings, wait until the installation is finished, and you're ready to roll!</p></li>\n" +
                            "</ul>\n" +
                            "<h2>Macintosh Installation</h2>\n" +
                            "<p>In order to build your own version of Perl, you will need 'make', which is part of the Apples developer tools usually supplied with Mac OS install DVDs. You do not need the latest version of Xcode (which is now charged for) in order to install make.</p>\n" +
                            "<p>Here are the simple steps to install Perl on Mac OS X machine.</p>\n" +
                            "<ul>\n" +
                            "<li><p>Open a Web browser and go to <a rel=\"nofollow\"  target=\"_blank\" href=\"https://www.perl.org/get.html\">https://www.perl.org/get.html</a>.</p></li>\n" +
                            "<li><p>Follow the link to download zipped source code available for Mac OS X.</p></li>\n" +
                            "<li><p>Download <b>perl-5.x.y.tar.gz</b> file and issue the following commands at $ prompt.</p></li>\n" +
                            "</ul>\n")
                    .withCode("$tar -xzf perl-5.x.y.tar.gz\n" +
                            "$cd perl-5.x.y\n" +
                            "$./Configure -de\n" +
                            "$make\n" +
                            "$make test\n" +
                            "$make install\n")
                    .withHtml("<p>This will install Perl in a standard location <i>/usr/local/bin</i> and its libraries are installed in <i>/usr/local/lib/perlXX</i>, where XX is the version of Perl that you are using.</p>\n" +
                            "<h2>Running Perl</h2>\n" +
                            "<p>The following are the different ways to start Perl.</p>\n" +
                            "<h3>Interactive Interpreter</h3>\n" +
                            "<p>You can enter <b>perl</b> and start coding right away in the interactive interpreter by starting it from the command line. You can do this from Unix, DOS, or any other system, which provides you a command-line interpreter or shell window.</p>\n")
                    .withCode("$perl  -e &lt;perl code&gt;           # Unix/Linux\n" +
                            "\n" +
                            "or \n" +
                            "\n" +
                            "C:&gt;perl -e &lt;perl code&gt;          # Windows/DOS")
                    .withHtml("<p>Here is the list of all the available command line options &minus;</p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;width:10%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Option &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>-d[:debugger]</b></p>\n" +
                            "<p>Runs program under debugger</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>-Idirectory</b></p>\n" +
                            "<p>Specifies &commat;INC/#include directory</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>-T</b></p>\n" +
                            "<p>Enables tainting checks</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">4</td>\n" +
                            "<td><p><b>-t</b></p>\n" +
                            "<p>Enables tainting warnings</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">5</td>\n" +
                            "<td><p><b>-U</b></p>\n" +
                            "<p>Allows unsafe operations</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">6</td>\n" +
                            "<td><p><b>-w</b></p>\n" +
                            "<p>Enables many useful warnings</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">7</td>\n" +
                            "<td><p><b>-W</b></p>\n" +
                            "<p>Enables all warnings</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">8</td>\n" +
                            "<td><p><b>-X</b></p>\n" +
                            "<p>Disables all warnings</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">9</td>\n" +
                            "<td><p><b>-e program</b></p>\n" +
                            "<p>Runs Perl script sent in as program</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">10</td>\n" +
                            "<td><p><b>file</b></p>\n" +
                            "<p>Runs Perl script from a given file</p></td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h3>Script from the Command-line</h3>\n" +
                            "<p>A Perl script is a text file, which keeps perl code in it and it can be executed at the command line by invoking the interpreter on your application, as in the following &minus;</p>\n")
                    .withCode("$perl  script.pl          # Unix/Linux\n" +
                            "\n" +
                            "or \n" +
                            "\n" +
                            "C:&gt;perl script.pl         # Windows/DOS\n")
                    .withHtml("<h3>Integrated Development Environment</h3>\n" +
                            "<p>You can run Perl from a graphical user interface (GUI) environment as well. All you need is a GUI application on your system that supports Perl. You can download <a rel=\"nofollow\"  target=\"_blank\" href=\"http://padre.perlide.org/\">Padre, the Perl IDE</a>. You can also use Eclipse Plugin <a rel=\"nofollow\"  target=\"_blank\" href=\"https://www.epic-ide.org/\">EPIC - Perl Editor and IDE for Eclipse</a> if you are familiar with Eclipse.</p>\n" +
                            "<p>Before proceeding to the next chapter, make sure your environment is properly setup and working perfectly fine. If you are not able to setup the environment properly then you can take help from your system admininstrator.</p>\n" +
                            "<p>All the examples given in subsequent chapters have been executed with v5.16.2 version available on the CentOS flavor of Linux.</p>\n" +
                            "<hr />\n")
                    .withCode("<hr />\n")
                    .into(textView);
        } else if (category.equals(categories[2])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h1>Perl - Syntax Overview</h1>\n")
                    .withHtml("<p>Perl borrows syntax and concepts from many languages: awk, sed, C, Bourne Shell, Smalltalk, Lisp and even English. However, there are some definite differences between the languages. This chapter is designd to quickly get you up to speed on the syntax that is expected in Perl.</p>\n" +
                            "<p>A Perl program consists of a sequence of declarations and statements, which run from the top to the bottom. Loops, subroutines, and other control structures allow you to jump around within the code. Every simple statement must end with a semicolon (;).</p>\n" +
                            "<p>Perl is a free-form language: you can format and indent it however you like. Whitespace serves mostly to separate tokens, unlike languages like Python where it is an important part of the syntax, or Fortran where it is immaterial.</p>\n" +
                            "<h2>First Perl Program</h2>\n" +
                            "<h3>Interactive Mode Programming</h3>\n" +
                            "<p>You can use Perl interpreter with <b>-e</b> option at command line, which lets you execute Perl statements from the command line. Let's try something at $ prompt as follows &minus;</p>\n")
                    .withCode("$perl -e 'print \"Hello World\\n\"'\n")
                    .withHtml("<p>This execution will produce the following result &minus;</p>\n")
                    .withCode("Hello, world\n")
                    .withHtml("<h3>Script Mode Programming</h3>\n" +
                            "<p>Assuming you are already on $ prompt, let's open a text file hello.pl using vi or vim editor and put the following lines inside your file.</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "# This will print \"Hello, World\"\n" +
                            "print \"Hello, world\\n\";\n")
                    .withHtml("<p>Here <b>/usr/bin/perl</b> is actual the perl interpreter binary. Before you execute your script, be sure to change the mode of the script file and give execution priviledge, generally a setting of 0755 works perfectly and finally you execute the above script as follows &minus;</p>\n")
                    .withCode("$chmod 0755 hello.pl\n" +
                            "$./hello.pl\n")
                    .withHtml("<p>This execution will produce the following result &minus;</p>\n")
                    .withCode("Hello, world\n")
                    .withHtml("<p>You can use parentheses for functions arguments or omit them according to your personal taste. They are only required occasionally to clarify the issues of precedence. Following two statements produce the same result.</p>")
                    .withCode("print(\"Hello, world\\n\");\n" +
                            "print \"Hello, world\\n\";\n")
                    .withHtml("<h2>Perl File Extension</h2>\n" +
                            "<p>A Perl script can be created inside of any normal simple-text editor program. There are several programs available for every type of platform. There are many programs designd for programmers available for download on the web.</p>\n" +
                            "<p>As a Perl convention, a Perl file must be saved with a .pl or .PL file extension in order to be recognized as a functioning Perl script. File names can contain numbers, symbols, and letters but must not contain a space. Use an underscore (_) in places of spaces.</p>\n" +
                            "<h2>Comments in Perl</h2>\n" +
                            "<p>Comments in any programming language are friends of developers. Comments can be used to make program user friendly and they are simply skipped by the interpreter without impacting the code functionality. For example, in the above program, a line starting with hash <b>#</b> is a comment.</p>\n" +
                            "<p>Simply saying comments in Perl start with a hash symbol and run to the end of the line &minus;</p>")
                    .withCode("# This is a comment in perl\n")
                    .withHtml("<p>Lines starting with = are interpreted as the start of a section of embedded documentation (pod), and all subsequent lines until the next =cut are ignored by the compiler. Following is the example &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "# This is a single line comment\n" +
                            "print \"Hello, world\\n\";\n" +
                            "\n" +
                            "=begin comment\n" +
                            "This is all part of multiline comment.\n" +
                            "You can use as many lines as you like\n" +
                            "These comments will be ignored by the \n" +
                            "compiler until the next =cut is encountered.\n" +
                            "=cut\n")
                    .withHtml("<p>This will produce the following result &minus;</p>")
                    .withCode("Hello, world\n")
                    .withHtml("<h2>Whitespaces in Perl</h2>\n" +
                            "<p>A Perl program does not care about whitespaces. Following program works perfectly fine &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "print       \"Hello, world\\n\";\n")
                    .withHtml("<p>But if spaces are inside the quoted strings, then they would be printed as is. For example &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "# This would print with a line break in the middle\n" +
                            "print \"Hello\n" +
                            "          world\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("Hello\n" +
                            "          world")
                    .withHtml("<p>All types of whitespace like spaces, tabs, newlines, etc. are equivalent for the interpreter when they are used outside of the quotes. A line containing only whitespace, possibly with a comment, is known as a blank line, and Perl totally ignores it.</p>\n" +
                            "<h2>Single and Double Quotes in Perl</h2>\n" +
                            "<p>You can use double quotes or single quotes around literal strings as follows &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "print \"Hello, world\\n\";\n" +
                            "print 'Hello, world\\n';\n")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("Hello, world\n" +
                            "Hello, world\\n$\n")
                    .withHtml("<p>There is an important difference in single and double quotes. Only double quotes <b>interpolate</b> variables and special characters such as newlines \\n, whereas single quote does not interpolate any variable or special character. Check below example where we are using $a as a variable to store a value and later printing that value &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "$a = 10;\n" +
                            "print \"Value of a = $a\\n\";\n" +
                            "print 'Value of a = $a\\n';")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("Value of a = 10\n" +
                            "Value of a = $a\\n$\n")
                    .withHtml("<h2>\"Here\" Documents</h2>\n" +
                            "<p>You can store or print multiline text with a great comfort. Even you can make use of variables inside the \"here\" document. Below is a simple syntax, check carefully there must be no space between the &lt;&lt; and the identifier.</p>\n" +
                            "<p>An identifier may be either a bare word or some quoted text like we used EOF below. If identifier is quoted, the type of quote you use determines the treatment of the text inside the here docoment, just as in regular quoting. An unquoted identifier works like double quotes.</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "$a = 10;\n" +
                            "$var = &lt;&lt;\"EOF\";\n" +
                            "This is the syntax for here document and it will continue\n" +
                            "until it encounters a EOF in the first line.\n" +
                            "This is case of double quote so variable value will be \n" +
                            "interpolated. For example value of a = $a\n" +
                            "EOF\n" +
                            "print \"$var\\n\";\n" +
                            "\n" +
                            "$var = &lt;&lt;'EOF';\n" +
                            "This is case of single quote so variable value will not be \n" +
                            "interpolated. For example value of a = $a\n" +
                            "EOF\n" +
                            "print \"$var\\n\";")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("This is the syntax for here document and it will continue\n" +
                            "until it encounters a EOF in the first line.\n" +
                            "This is case of double quote so variable value will be\n" +
                            "interpolated. For example value of a = 10\n" +
                            "\n" +
                            "This is case of single quote so variable value will be\n" +
                            "interpolated. For example value of a = $a\n")
                    .withHtml("<h2>Escaping Characters</h2>\n" +
                            "<p>Perl uses the backslash (\\) character to escape any type of character that might interfere with our code. Let's take one example where we want to print double quote and $ sign &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "$result = \"This is \\\"number\\\"\";\n" +
                            "print \"$result\\n\";\n" +
                            "print \"\\$result\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("This is \"number\"\n" +
                            "$result\n")
                    .withHtml("<h2>Perl Identifiers</h2>\n" +
                            "<p>A Perl identifier is a name used to identify a variable, function, class, module, or other object. A Perl variable name starts with either $, &commat; or % followed by zero or more letters, underscores, and digits (0 to 9).</p>\n" +
                            "<p>Perl does not allow punctuation characters such as &commat;, $, and % within identifiers. Perl is a <b>case sensitive</b> programming language.  Thus <b>$Manpower</b> and <b>$manpower</b> are two different identifiers in Perl.</p>\n" +
                            "<hr />\n")
                    .withCode("<hr />\n")
                    .into(textView);

        } else if (category.equals(categories[3])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h1>Perl - Data Types</h1>")
                    .withHtml("<hr />\n" +
                            "<p>Perl is a loosely typed language and there is no need to specify a type for your data while using in your program. The Perl interpreter will choose the type based on the context of the data itself.</p>\n" +
                            "<p>Perl has three basic data types: scalars, arrays of scalars, and hashes of scalars, also known as associative arrays. Here is a little detail about these data types.</p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Types &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>Scalar</b></p>\n" +
                            "<p>Scalars are simple variables. They are preceded by a dollar sign ($). A scalar is either a number, a string, or a reference. A reference is actually an address of a variable, which we will see in the upcoming chapters.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>Arrays</b></p>\n" +
                            "<p>Arrays are ordered lists of scalars that you access with a numeric index, which starts with 0. They are preceded by an \"at\" sign (&commat;).</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>Hashes</b></p>\n" +
                            "<p>Hashes are unordered sets of key/value pairs that you access using the keys as subscripts. They are preceded by a percent sign (%).</p></td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h2>Numeric Literals</h2>\n" +
                            "<p>Perl stores all the numbers internally as either signed integers or double-precision floating-point values. Numeric literals are specified in any of the following floating-point or integer formats &minus;</p>\n" +
                            "<table class=\"table table-bordered\" style=\"text-align:center;\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;width:50%\">Type</th>\n" +
                            "<th style=\"text-align:center;\">Value</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td>Integer</td>\n" +
                            "<td>1234</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td>Negative integer</td>\n" +
                            "<td>-100</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td>Floating point</td>\n" +
                            "<td>2000</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td>Scientific notation</td>\n" +
                            "<td>16.12E14</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td>Hexadecimal</td>\n" +
                            "<td>0xffff</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td>Octal</td>\n" +
                            "<td>0577</td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h2>String Literals</h2>\n" +
                            "<p>Strings are sequences of characters. They are usually alphanumeric values delimited by either single (') or double (\") quotes. They work much like UNIX shell quotes where you can use single quoted strings and double quoted strings.</p>\n" +
                            "<p>Double-quoted string literals allow variable interpolation, and single-quoted strings are not. There are certain characters when they are proceeded by a back slash, have special meaning and they are used to represent like newline (\\n) or tab (\\t).</p>\n" +
                            "<p>You can embed newlines or any of the following Escape sequences directly in your double quoted strings &minus;</p>\n" +
                            "<table class=\"table table-bordered\" style=\"text-align:center;\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;\">Escape sequence</th>\n" +
                            "<th style=\"text-align:center;\">Meaning</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td>\\\\</td>\n" +
                            "<td>Backslash</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td>\\'</td>\n" +
                            "<td>Single quote</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "\n" +
                            "<td>\\\"</td>\n" +
                            "<td>Double quote</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td>\\a</td>\n" +
                            "<td>Alert or bell</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td>\\b</td>\n" +
                            "<td>Backspace</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td>\\f</td>\n" +
                            "<td>Form feed</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td>\\n</td>\n" +
                            "<td>Newline</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td>\\r</td>\n" +
                            "<td>Carriage return</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td>\\t</td>\n" +
                            "<td>Horizontal tab</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td>\\v</td>\n" +
                            "<td>Vertical tab</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td>\\0nn</td>\n" +
                            "<td>Creates Octal formatted numbers</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td>\\xnn</td>\n" +
                            "<td>Creates Hexideciamal formatted numbers</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td>\\cX</td>\n" +
                            "<td>Controls characters, x may be any character</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td>\\u</td>\n" +
                            "<td>Forces next character to uppercase</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td>\\l</td>\n" +
                            "<td>Forces next character to lowercase</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td>\\U</td>\n" +
                            "<td>Forces all following characters to uppercase</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td>\\L</td>\n" +
                            "<td>Forces all following characters to lowercase</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td>\\Q</td>\n" +
                            "<td>Backslash all following non-alphanumeric characters</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td>\\E</td>\n" +
                            "<td>End \\U, \\L, or \\Q</td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h3>Example</h3>\n" +
                            "<p>Let's see again how strings behave with single quotation and double quotation. Here we will use string escapes mentioned in the above table and will make use of the scalar variable to assign string values.</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "# This is case of interpolation.\n" +
                            "$str = \"Welcome to \\ntutorialspoint.com!\";\n" +
                            "print \"$str\\n\";\n" +
                            "\n" +
                            "# This is case of non-interpolation.\n" +
                            "$str = 'Welcome to \\ntutorialspoint.com!';\n" +
                            "print \"$str\\n\";\n" +
                            "\n" +
                            "# Only W will become upper case.\n" +
                            "$str = \"\\uwelcome to tutorialspoint.com!\";\n" +
                            "print \"$str\\n\";\n" +
                            "\n" +
                            "# Whole line will become capital.\n" +
                            "$str = \"\\UWelcome to tutorialspoint.com!\";\n" +
                            "print \"$str\\n\";\n" +
                            "\n" +
                            "# A portion of line will become capital.\n" +
                            "$str = \"Welcome to \\Ututorialspoint\\E.com!\"; \n" +
                            "print \"$str\\n\";\n" +
                            "\n" +
                            "# Backsalash non alpha-numeric including spaces.\n" +
                            "$str = \"\\QWelcome to tutorialspoint's family\";\n" +
                            "print \"$str\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>")
                    .withCode("Welcome to\n" +
                            "tutorialspoint.com!\n" +
                            "Welcome to \\ntutorialspoint.com!\n" +
                            "Welcome to tutorialspoint.com!\n" +
                            "WELCOME TO TUTORIALSPOINT.COM!\n" +
                            "Welcome to TUTORIALSPOINT.com!\n" +
                            "Welcome\\ to\\ tutorialspoint\\'s\\ family\n")
                    .withCode("<hr />\n")
                    .into(textView);
        } else if (category.equals(categories[4])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h1>Perl - Variables</h1>")
                    .withHtml("<p>Variables are the reserved memory locations to store values. This means that when you create a variable you reserve some space in memory.</p>\n" +
                            "<p>Based on the data type of a variable, the interpreter allocates memory and decides what can be stored in the reserved memory. Therefore, by assigning different data types to variables, you can store integers, decimals, or strings in these variables.</p>\n" +
                            "<p>We have learnt that Perl has the following three basic data types &minus;</p>\n" +
                            "<ul class=\"list\">\n" +
                            "<li>Scalars</li>\n" +
                            "<li>Arrays</li>\n" +
                            "<li>Hashes</li>\n" +
                            "</ul>\n" +
                            "<p>Accordingly, we are going to use three types of variables in Perl. A <b>scalar</b> variable will precede by a dollar sign ($) and it can store either a number, a string, or a reference. An <b>array</b> variable will precede by sign &commat; and it will store ordered lists of scalars. Finaly, the <b>Hash</b> variable will precede by sign % and will be used to store sets of key/value pairs.</p>\n" +
                            "<p>Perl maintains every variable type in a separate namespace. So you can, without fear of conflict, use the same name for a scalar variable, an array, or a hash. This means that $foo and &commat;foo are two different variables.</p>\n" +
                            "<h2>Creating Variables</h2>\n" +
                            "<p>Perl variables do not have to be explicitly declared to reserve memory space. The declaration happens automatically when you assign a value to a variable. The equal sign (=) is used to assign values to variables.</p>\n" +
                            "<p>Keep a note that this is mandatory to declare a variable before we use it if we use <b>use strict</b> statement in our program.</p>\n" +
                            "<p>The operand to the left of the = operator is the name of the variable, and the operand to the right of the = operator is the value stored in the variable. For example &minus;</p>\n")
                    .withCode("$age = 25;             # An integer assignment\n" +
                            "$name = \"John Paul\";   # A string \n" +
                            "$salary = 1445.50;     # A floating point\n")
                    .withHtml("<p>Here 25, \"John Paul\" and 1445.50 are the values assigned to <i>$age</i>, <i>$name</i> and <i>$salary</i> variables, respectively. Shortly we will see how we can assign values to arrays and hashes.</p>\n" +
                            "<h2>Scalar Variables</h2>\n" +
                            "<p>A scalar is a single unit of data. That data might be an integer number, floating point, a character, a string, a paragraph, or an entire web page. Simply saying it could be anything, but only a single thing.</p>\n" +
                            "<p>Here is a simple example of using scalar variables &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "$age = 25;             # An integer assignment\n" +
                            "$name = \"John Paul\";   # A string \n" +
                            "$salary = 1445.50;     # A floating point\n" +
                            "\n" +
                            "print \"Age = $age\\n\";\n" +
                            "print \"Name = $name\\n\";\n" +
                            "print \"Salary = $salary\\n\";\n" +
                            "</pre>\n" +
                            "<p>This will produce the following result &minus;</p>\n" +
                            "<pre class=\"result notranslate\">\n" +
                            "Age = 25\n" +
                            "Name = John Paul\n" +
                            "Salary = 1445.5\n")
                    .withHtml("<h2>Array Variables</h2>\n" +
                            "<p>An array is a variable that stores an ordered list of scalar values. Array variables are preceded by an \"at\" (&commat;) sign. To refer to a single element of an array, you will use the dollar sign ($) with the variable name followed by the index of the element in square brackets.</p>\n" +
                            "<p>Here is a simple example of using array variables &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "&commat;ages = (25, 30, 40);             \n" +
                            "&commat;names = (\"John Paul\", \"Lisa\", \"Kumar\");\n" +
                            "\n" +
                            "print \"\\$ages[0] = $ages[0]\\n\";\n" +
                            "print \"\\$ages[1] = $ages[1]\\n\";\n" +
                            "print \"\\$ages[2] = $ages[2]\\n\";\n" +
                            "print \"\\$names[0] = $names[0]\\n\";\n" +
                            "print \"\\$names[1] = $names[1]\\n\";\n" +
                            "print \"\\$names[2] = $names[2]\\n\";\n")
                    .withHtml("<p>Here we used escape sign (\\) before the $ sign just to print it. Other Perl will understand it as a variable and will print its value. When executed, this will produce the following result &minus;</p>\n")
                    .withCode("$ages[0] = 25\n" +
                            "$ages[1] = 30\n" +
                            "$ages[2] = 40\n" +
                            "$names[0] = John Paul\n" +
                            "$names[1] = Lisa\n" +
                            "$names[2] = Kumar\n")
                    .withHtml("<h2>Hash Variables</h2>\n" +
                            "<p>A hash is a set of <b>key/value</b> pairs. Hash variables are preceded by a percent (%) sign. To refer to a single element of a hash, you will use the hash variable name followed by the \"key\" associated with the value in curly brackets.</p>\n" +
                            "<p>Here is a simple example of using hash variables &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "%data = ('John Paul', 45, 'Lisa', 30, 'Kumar', 40);\n" +
                            "\n" +
                            "print \"\\$data{'John Paul'} = $data{'John Paul'}\\n\";\n" +
                            "print \"\\$data{'Lisa'} = $data{'Lisa'}\\n\";\n" +
                            "print \"\\$data{'Kumar'} = $data{'Kumar'}\\n\";\n" +
                            "</pre>\n" +
                            "<p>This will produce the following result &minus;</p>\n" +
                            "<pre class=\"result notranslate\">\n" +
                            "$data{'John Paul'} = 45\n" +
                            "$data{'Lisa'} = 30\n" +
                            "$data{'Kumar'} = 40\n")
                    .withHtml("<h2>Variable Context</h2>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "&commat;names = ('John Paul', 'Lisa', 'Kumar');\n" +
                            "\n" +
                            "&commat;copy = &commat;names;\n" +
                            "$size = &commat;names;\n" +
                            "\n" +
                            "print \"Given names are : &commat;copy\\n\";\n" +
                            "print \"Number of names are : $size\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("Given names are : John Paul Lisa Kumar\n" +
                            "Number of names are : 3\n")
                    .withHtml("<p>Here &commat;names is an array, which has been used in two different contexts. First we copied it into anyother array, i.e., list, so it returned all the elements assuming that context is list context. Next we used the same array and tried to store this array in a scalar, so in this case it returned just the number of elements in this array assuming that context is scalar context. Following table lists down the various contexts &minus;</p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Context &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>Scalar</b></p>\n" +
                            "<p>Assignment to a scalar variable evaluates the right-hand side in a scalar context.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>List</b></p>\n" +
                            "<p>Assignment to an array or a hash evaluates the right-hand side in a list context.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>Boolean</b></p>\n" +
                            "<p>Boolean context is simply any place where an expression is being evaluated to see whether it's true or false.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">4</td>\n" +
                            "<td><p><b>Void</b></p>\n" +
                            "<p>This context not only doesn't care what the return value is, it doesn't even want a return value.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">5</td>\n" +
                            "<td><p><b>Interpolative</b></p>\n" +
                            "<p>This context only happens inside quotes, or things that work like quotes.</p></td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<hr />\n")
                    .withHtml("<hr />\n<hr />\n<hr />\n<hr />\n<hr />\n")
                    .into(textView);
        } else if (category.equals(categories[5])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h1>Perl - Scalars</h1>\n")
                    .withHtml("<p>A scalar is a single unit of data. That data might be an integer number, floating point, a character, a string, a paragraph, or an entire web page.</p>\n" +
                            "<p>Here is a simple example of using scalar variables &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "$age = 25;             # An integer assignment\n" +
                            "$name = \"John Paul\";   # A string \n" +
                            "$salary = 1445.50;     # A floating point\n" +
                            "\n" +
                            "print \"Age = $age\\n\";\n" +
                            "print \"Name = $name\\n\";\n" +
                            "print \"Salary = $salary\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("Age = 25\n" +
                            "Name = John Paul\n" +
                            "Salary = 1445.5\n")
                    .withHtml("<h2>Numeric Scalars</h2>\n" +
                            "<p>A scalar is most often either a number or a string. Following example demonstrates the usage of various types of numeric scalars &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "$integer = 200;\n" +
                            "$negative = -300;\n" +
                            "$floating = 200.340;\n" +
                            "$bigfloat = -1.2E-23;\n" +
                            "\n" +
                            "# 377 octal, same as 255 decimal\n" +
                            "$octal = 0377;\n" +
                            "\n" +
                            "# FF hex, also 255 decimal\n" +
                            "$hexa = 0xff;\n" +
                            "\n" +
                            "print \"integer = $integer\\n\";\n" +
                            "print \"negative = $negative\\n\";\n" +
                            "print \"floating = $floating\\n\";\n" +
                            "print \"bigfloat = $bigfloat\\n\";\n" +
                            "print \"octal = $octal\\n\";\n" +
                            "print \"hexa = $hexa\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("integer = 200\n" +
                            "negative = -300\n" +
                            "floating = 200.34\n" +
                            "bigfloat = -1.2e-23\n" +
                            "octal = 255\n" +
                            "hexa = 255\n")
                    .withHtml("<h2>String Scalars</h2>\n" +
                            "<p>Following example demonstrates the usage of various types of string scalars. Notice the difference between single quoted strings and double quoted strings &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "$var = \"This is string scalar!\";\n" +
                            "$quote = 'I m inside single quote - $var';\n" +
                            "$double = \"This is inside single quote - $var\";\n" +
                            "\n" +
                            "$escape = \"This example of escape -\\tHello, World!\";\n" +
                            "\n" +
                            "print \"var = $var\\n\";\n" +
                            "print \"quote = $quote\\n\";\n" +
                            "print \"double = $double\\n\";\n" +
                            "print \"escape = $escape\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("var = This is string scalar!\n" +
                            "quote = I m inside single quote - $var\n" +
                            "double = This is inside single quote - This is string scalar!\n" +
                            "escape = This example of escape -       Hello, World\n")
                    .withHtml("<h2>Scalar Operations</h2>\n" +
                            "<p>You will see a detail of various operators available in Perl in a separate chapter, but here we are going to list down few numeric and string operations.</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "$str = \"hello\" . \"world\";       # Concatenates strings.\n" +
                            "$num = 5 + 10;                  # adds two numbers.\n" +
                            "$mul = 4 * 5;                   # multiplies two numbers.\n" +
                            "$mix = $str . $num;             # concatenates string and number.\n" +
                            "\n" +
                            "print \"str = $str\\n\";\n" +
                            "print \"num = $num\\n\";\n" +
                            "print \"mul = $mul\\n\";\n" +
                            "print \"mix = $mix\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("str = helloworld\n" +
                            "num = 15\n" +
                            "mul = 20\n" +
                            "mix = helloworld15\n")
                    .withHtml("<h2>Multiline Strings</h2>\n" +
                            "<p>If you want to introduce multiline strings into your programs, you can use the standard single quotes as below &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "$string = 'This is\n" +
                            "a multiline\n" +
                            "string';\n" +
                            "\n" +
                            "print \"$string\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("This is\n" +
                            "a multiline\n" +
                            "string\n")
                    .withHtml("<p>You can use \"here\" document syntax as well to store or print multilines as below &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "print &lt;&lt;EOF;\n" +
                            "This is\n" +
                            "a multiline\n" +
                            "string\n" +
                            "EOF\n")
                    .withHtml("<p>This will also produce the same result &minus;</p>\n")
                    .withCode("This is\n" +
                            "a multiline\n" +
                            "string\n")
                    .withHtml("<h2>V-Strings</h2>\n" +
                            "<p>A literal of the form v1.20.300.4000 is parsed as a string composed of characters with the specified ordinals. This form is known as v-strings.</p>\n" +
                            "<p>A v-string provides an alternative and more readable way to construct strings, rather than use the somewhat less readable interpolation form \"\\x{1}\\x{14}\\x{12c}\\x{fa0}\".</p>\n" +
                            "<p>They are any literal that begins with a v and is followed by one or more dot-separated elements. For example &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "$smile  = v9786;\n" +
                            "$foo    = v102.111.111;\n" +
                            "$martin = v77.97.114.116.105.110; \n" +
                            "\n" +
                            "print \"smile = $smile\\n\";\n" +
                            "print \"foo = $foo\\n\";\n" +
                            "print \"martin = $martin\\n\";\n")
                    .withHtml("<p>This will also produce the same result &minus;</p>\n")
                    .withCode("smile = ☺\n" +
                            "foo = foo\n" +
                            "martin = Martin\n" +
                            "Wide character in print at main.pl line 7.\n")
                    .withHtml("<h2>Special Literals</h2>\n" +
                            "<p>So far you must have a feeling about string scalars and its concatenation and interpolation opration. So let me tell you about three special literals __FILE__, __LINE__, and __PACKAGE__ represent the current filename, line number, and package name at that point in your program.</p>\n" +
                            "<p>They may be used only as separate tokens and will not be interpolated into strings. Check the below example &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "print \"File name \". __FILE__ . \"\\n\";\n" +
                            "print \"Line Number \" . __LINE__ .\"\\n\";\n" +
                            "print \"Package \" . __PACKAGE__ .\"\\n\";\n" +
                            "\n" +
                            "# they can not be interpolated\n" +
                            "print \"__FILE__ __LINE__ __PACKAGE__\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("File name hello.pl\n" +
                            "Line Number 4\n" +
                            "Package main\n" +
                            "__FILE__ __LINE__ __PACKAGE__")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .into(textView);
        } else if (category.equals(categories[6])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h1>Perl - Arrays</h1>")
                    .withHtml("<p>An array is a variable that stores an ordered list of scalar values. Array variables are preceded by an \"at\" (&commat;) sign. To refer to a single element of an array, you will use the dollar sign ($) with the variable name followed by the index of the element in square brackets.</p>\n" +
                            "<p>Here is a simple example of using the array variables &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "&commat;ages = (25, 30, 40);             \n" +
                            "&commat;names = (\"John Paul\", \"Lisa\", \"Kumar\");\n" +
                            "\n" +
                            "print \"\\$ages[0] = $ages[0]\\n\";\n" +
                            "print \"\\$ages[1] = $ages[1]\\n\";\n" +
                            "print \"\\$ages[2] = $ages[2]\\n\";\n" +
                            "print \"\\$names[0] = $names[0]\\n\";\n" +
                            "print \"\\$names[1] = $names[1]\\n\";\n" +
                            "print \"\\$names[2] = $names[2]\\n\";")
                    .withHtml("<p>Here we have used the escape sign (\\) before the $ sign just to print it. Other Perl will understand it as a variable and will print its value. When executed, this will produce the following result &minus;</p>\n")
                    .withCode("$ages[0] = 25\n" +
                            "$ages[1] = 30\n" +
                            "$ages[2] = 40\n" +
                            "$names[0] = John Paul\n" +
                            "$names[1] = Lisa\n" +
                            "$names[2] = Kumar\n")
                    .withHtml("<p>In Perl, List and Array terms are often used as if they're interchangeable. But the list is the data, and the array is the variable.</p>\n" +
                            "<h2>Array Creation</h2>\n" +
                            "<p>Array variables are prefixed with the &commat; sign and are populated using either parentheses or the qw operator. For example &minus;</p>\n")
                    .withCode("&commat;array = (1, 2, 'Hello');\n" +
                            "&commat;array = qw/This is an array/;\n")
                    .withHtml("<p>The second line uses the qw// operator, which returns a list of strings, separating the delimited string by white space. In this example, this leads to a four-element array; the first element is 'this' and last (fourth) is 'array'. This means that you can use different lines as follows &minus;</p>\n")
                    .withCode("&commat;days = qw/Monday\n" +
                            "Tuesday\n" +
                            "...\n" +
                            "Sunday/;\n")
                    .withHtml("<p>You can also populate an array by assigning each value individually as follows &minus;</p>\n")
                    .withCode("$array[0] = 'Monday';\n" +
                            "...\n" +
                            "$array[6] = 'Sunday';\n")
                    .withHtml("h2>Accessing Array Elements</h2>\n" +
                            "<p>When accessing individual elements from an array, you must prefix the variable with a dollar sign ($) and then append the element index within the square brackets after the name of the variable. For example &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "@days = qw/Mon Tue Wed Thu Fri Sat Sun/;\n" +
                            "\n" +
                            "print \"$days[0]\\n\";\n" +
                            "print \"$days[1]\\n\";\n" +
                            "print \"$days[2]\\n\";\n" +
                            "print \"$days[6]\\n\";\n" +
                            "print \"$days[-1]\\n\";\n" +
                            "print \"$days[-7]\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("Mon\n" +
                            "Tue\n" +
                            "Wed\n" +
                            "Sun\n" +
                            "Sun\n" +
                            "Mon\n")
                    .withHtml("<p>Array indices start from zero, so to access the first element you need to give 0 as indices. You can also give a negative index, in which case you select the element from the end, rather than the beginning, of the array. This means the following &minus;</p>\n")
                    .withCode("print $days[-1]; # outputs Sun\n" +
                            "print $days[-7]; # outputs Mon\n")
                    .withHtml("<h2>Sequential Number Arrays</h2>\n" +
                            "<p>Perl offers a shortcut for sequential numbers and letters. Rather than typing out each element when counting to 100 for example, we can do something like as follows &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "@var_10 = (1..10);\n" +
                            "@var_20 = (10..20);\n" +
                            "@var_abc = (a..z);\n" +
                            "\n" +
                            "print \"@var_10\\n\";   # Prints number from 1 to 10\n" +
                            "print \"@var_20\\n\";   # Prints number from 10 to 20\n" +
                            "print \"@var_abc\\n\";  # Prints number from a to z\n")
                    .withHtml("<p>Here double dot (..) is called <b>range operator</b>. This will produce the following result &minus;</p>\n")
                    .withCode("1 2 3 4 5 6 7 8 9 10\n" +
                            "10 11 12 13 14 15 16 17 18 19 20\n" +
                            "a b c d e f g h i j k l m n o p q r s t u v w x y z\n")
                    .withHtml("<h2>Array Size</h2>\n" +
                            "<p>The size of an array can be determined using the scalar context on the array - the returned value will be the number of elements in the array &minus;</p>\n")
                    .withCode("&commat;array = (1,2,3);\n" +
                            "print \"Size: \",scalar &commat;array,\"\\n\";\n")
                    .withHtml("<p>The value returned will always be the physical size of the array, not the number of valid elements. You can demonstrate this, and the difference between scalar &commat;array and $#array, using this fragment is as follows &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "@array = (1,2,3);\n" +
                            "$array[50] = 4;\n" +
                            "\n" +
                            "$size = @array;\n" +
                            "$max_index = $#array;\n" +
                            "\n" +
                            "print \"Size:  $size\\n\";\n" +
                            "print \"Max Index: $max_index\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("Size: 51\n" +
                            "Max Index: 50\n")
                    .withHtml("<p>There are only four elements in the array that contains information, but the array is 51 elements long, with a highest index of 50.</p>\n" +
                            "<h2>Adding and Removing Elements in Array</h2>\n" +
                            "<p>Perl provides a number of useful functions to add and remove elements in an array. You may have a question what is a function? So far you have used <b>print</b> function to print various values. Similarly there are various other functions or sometime called sub-routines, which can be used for various other functionalities.</p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Types &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>push &commat;ARRAY, LIST</b></p>\n" +
                            "<p>Pushes the values of the list onto the end of the array.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>pop &commat;ARRAY</b></p>\n" +
                            "<p>Pops off and returns the last value of the array.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>shift &commat;ARRAY</b></p>\n" +
                            "<p>Shifts the first value of the array off and returns it, shortening the array by 1 and moving everything down.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">4</td>\n" +
                            "<td><p><b>unshift &commat;ARRAY, LIST</b></p>\n" +
                            "<p>Prepends list to the front of the array, and returns the number of elements in the new array.</p></td>\n" +
                            "</tr>\n" +
                            "</table>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "# create a simple array\n" +
                            "@coins = (\"Quarter\",\"Dime\",\"Nickel\");\n" +
                            "print \"1. \\&commat;coins  = &commat;coins\\n\";\n" +
                            "\n" +
                            "# add one element at the end of the array\n" +
                            "push(&commat;coins, \"Penny\");\n" +
                            "print \"2. \\&commat;coins  = &commat;coins\\n\";\n" +
                            "\n" +
                            "# add one element at the beginning of the array\n" +
                            "unshift(&commat;coins, \"Dollar\");\n" +
                            "print \"3. \\&commat;coins  = &commat;coins\\n\";\n" +
                            "\n" +
                            "# remove one element from the last of the array.\n" +
                            "pop(&commat;coins);\n" +
                            "print \"4. \\&commat;coins  = &commat;coins\\n\";\n" +
                            "\n" +
                            "# remove one element from the beginning of the array.\n" +
                            "shift(&commat;coins);\n" +
                            "print \"5. \\&commat;coins  = &commat;coins\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("1. &commat;coins = Quarter Dime Nickel\n" +
                            "2. &commat;coins = Quarter Dime Nickel Penny\n" +
                            "3. &commat;coins = Dollar Quarter Dime Nickel Penny\n" +
                            "4. &commat;coins = Dollar Quarter Dime Nickel\n" +
                            "5. &commat;coins = Quarter Dime Nickel")
                    .withHtml("<h2>Slicing Array Elements</h2>\n" +
                            "<p>You can also extract a \"slice\" from an array - that is, you can select more than one item from an array in order to produce another array.</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "&commat;days = qw/Mon Tue Wed Thu Fri Sat Sun/;\n" +
                            "\n" +
                            "&commat;weekdays = &commat;days[3,4,5];\n" +
                            "\n" +
                            "print \"&commat;weekdays\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("Thu Fri Sat\n")
                    .withHtml("<p>The specification for a slice must have a list of valid indices, either positive or negative, each separated by a comma. For speed, you can also use the <b>..</b> range operator &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "&commat;days = qw/Mon Tue Wed Thu Fri Sat Sun/;\n" +
                            "\n" +
                            "&commat;weekdays = &commat;days[3..5];\n" +
                            "\n" +
                            "print \"&commat;weekdays\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("Thu Fri Sat\n")
                    .withHtml("<h2>Replacing Array Elements</h2>\n" +
                            "<p>Now we are going to introduce one more function called <b>splice()</b>, which has the following syntax &minus;</p>\n")
                    .withCode("splice &commat;ARRAY, OFFSET [ , LENGTH [ , LIST ] ]\n")
                    .withHtml("<p>This function will remove the elements of @ARRAY designated by OFFSET and LENGTH, and replaces them with LIST, if specified. Finally, it returns the elements removed from the array. Following is the example &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "&commat;nums = (1..20);\n" +
                            "print \"Before - &commat;nums\\n\";\n" +
                            "\n" +
                            "splice(&commat;nums, 5, 5, 21..25); \n" +
                            "print \"After - &commat;nums\\n\";\n" +
                            "</pre>\n" +
                            "<p>This will produce the following result &minus;</p>\n" +
                            "<pre class=\"result notranslate\">\n" +
                            "Before - 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20\n" +
                            "After - 1 2 3 4 5 21 22 23 24 25 11 12 13 14 15 16 17 18 19 20\n")
                    .withHtml("<p>Here, the actual replacement begins with the 6th number after that five elements are then replaced from 6 to 10 with the numbers 21, 22, 23, 24 and 25.</p>\n" +
                            "<h2>Transform Strings to Arrays</h2>\n" +
                            "<p>Let's look into one more function called <b>split()</b>, which has the following syntax &minus;</p>\n")
                    .withCode("split [ PATTERN [ , EXPR [ , LIMIT ] ] ]\n")
                    .withHtml("<p>This function splits a string into an array of strings, and returns it. If LIMIT is specified, splits into at most that number of fields. If PATTERN is omitted, splits on whitespace. Following is the example &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "# define Strings\n" +
                            "$var_string = \"Rain-Drops-On-Roses-And-Whiskers-On-Kittens\";\n" +
                            "$var_names = \"Larry,David,Roger,Ken,Michael,Tom\";\n" +
                            "\n" +
                            "# transform above strings into arrays.\n" +
                            "@string = split('-', $var_string);\n" +
                            "@names  = split(',', $var_names);\n" +
                            "\n" +
                            "print \"$string[3]\\n\";  # This will print Roses\n" +
                            "print \"$names[4]\\n\";   # This will print Michael\n")
                    .withHtml("<p>This will produce the following result &minus;</p>")
                    .withCode("Roses\n" +
                            "Michael\n")
                    .withHtml("<h2>Transform Arrays to Strings</h2>\n" +
                            "<p>We can use the <b>join()</b> function to rejoin the array elements and form one long scalar string. This function has the following syntax &minus;</p>\n")
                    .withCode("join EXPR, LIST\n")
                    .withHtml("<p>This function joins the separate strings of LIST into a single string with fields separated by the value of EXPR, and returns the string. Following is the example &minus;</p>")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "# define Strings\n" +
                            "$var_string = \"Rain-Drops-On-Roses-And-Whiskers-On-Kittens\";\n" +
                            "$var_names = \"Larry,David,Roger,Ken,Michael,Tom\";\n" +
                            "\n" +
                            "# transform above strings into arrays.\n" +
                            "&commat;string = split('-', $var_string);\n" +
                            "&commat;names  = split(',', $var_names);\n" +
                            "\n" +
                            "$string1 = join( '-', &commat;string );\n" +
                            "$string2 = join( ',', &commat;names );\n" +
                            "\n" +
                            "print \"$string1\\n\";\n" +
                            "print \"$string2\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("Rain-Drops-On-Roses-And-Whiskers-On-Kittens\n" +
                            "Larry,David,Roger,Ken,Michael,Tom\n")
                    .withHtml("<h2>Sorting Arrays</h2>\n" +
                            "<p>The <b>sort()</b> function sorts each element of an array according to the ASCII Numeric standards. This function has the following syntax &minus;</p>\n")
                    .withCode("sort [ SUBROUTINE ] LIST\n")
                    .withHtml("<p>This function sorts the LIST and returns the sorted array value. If SUBROUTINE is specified then specified logic inside the SUBTROUTINE is applied while sorting the elements.</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "# define an array\n" +
                            "&commat;foods = qw(pizza steak chicken burgers);\n" +
                            "print \"Before: &commat;foods\\n\";\n" +
                            "\n" +
                            "# sort this array\n" +
                            "@foods = sort(&commat;foods);\n" +
                            "print \"After: &commat;foods\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("Before: pizza steak chicken burgers\n" +
                            "After: burgers chicken pizza steak\n")
                    .withHtml("<p>Please note that sorting is performed based on ASCII Numeric value of the words. So the best option is to first transform every element of the array into lowercase letters and then perform the sort function.</p>\n" +
                            "<h2>The $[ Special Variable</h2>\n" +
                            "<p>So far you have seen simple variable we defined in our programs and used them to store and print scalar and array values. Perl provides numerous special variables, which have their predefined meaning.</p>\n" +
                            "<p>We have a special variable, which is written as <b>$[</b>. This special variable is a scalar containing the first index of all arrays. Because Perl arrays have zero-based indexing, $[ will almost always be 0. But if you set $[ to 1 then all your arrays will use on-based indexing. It is recommended not to use any other indexing other than zero. However, let's take one example to show the usage of $[ variable &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "# define an array\n" +
                            "&commat;foods = qw(pizza steak chicken burgers);\n" +
                            "print \"Foods: &commat;foods\\n\";\n" +
                            "\n" +
                            "# Let's reset first index of all the arrays.\n" +
                            "$[ = 1;\n" +
                            "\n" +
                            "print \"Food at \\&commat;foods[1]: $foods[1]\\n\";\n" +
                            "print \"Food at \\&commat;foods[2]: $foods[2]\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("Foods: pizza steak chicken burgers\n" +
                            "Food at &commat;foods[1]: pizza\n" +
                            "Food at &commat;foods[2]: steak\n")
                    .withHtml("<h2>Merging Arrays</h2>\n")
                    .withHtml("<p>Because an array is just a comma-separated sequence of values, you can combine them together as shown below &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "&commat;numbers = (1,3,(4,5,6));\n" +
                            "\n" +
                            "print \"numbers = &commat;numbers\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("numbers = 1 3 4 5 6\n")
                    .withHtml("<p>The embedded arrays just become a part of the main array as shown below &minus;</p>")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "&commat;odd = (1,3,5);\n" +
                            "&commat;even = (2, 4, 6);\n" +
                            "\n" +
                            "&commat;numbers = (&commat;odd, &commat;even);\n" +
                            "\n" +
                            "print \"numbers = &commat;numbers\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("numbers = 1 3 5 2 4 6\n")
                    .withHtml("<h2>Selecting Elements from Lists</h2>\n" +
                            "<p>The list notation is identical to that for arrays. You can extract an element from an array by appending square brackets to the list and giving one or more indices &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "$var = (5,4,3,2,1)[4];\n" +
                            "\n" +
                            "print \"value of var = $var\\n\"\n")
                    .withHtml("<p>This will produce the following result &minus;</p>")
                    .withCode("value of var = 1\n")
                    .withHtml("<p>Similarly, we can extract slices, although without the requirement for a leading &commat; character &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "&commat;list = (5,4,3,2,1)[1..3];\n" +
                            "\n" +
                            "print \"Value of list = &commat;list\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>")
                    .withCode("Value of list = 4 3 2\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />")
                    .into(textView);
        } else if (category.equals(categories[7])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h1>Perl - Hashes</h1>\n")
                    .withHtml("<hr />\n")
                    .withHtml("<p>A hash is a set of <b>key/value</b> pairs. Hash variables are preceded by a percent (%) sign. To refer to a single element of a hash, you will use the hash variable name preceded by a \"$\" sign and followed by the \"key\" associated with the value in curly brackets..</p>\n" +
                            "<p>Here is a simple example of using the hash variables &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "%data = ('John Paul', 45, 'Lisa', 30, 'Kumar', 40);\n" +
                            "\n" +
                            "print \"\\$data{'John Paul'} = $data{'John Paul'}\\n\";\n" +
                            "print \"\\$data{'Lisa'} = $data{'Lisa'}\\n\";\n" +
                            "print \"\\$data{'Kumar'} = $data{'Kumar'}\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("$data{'John Paul'} = 45\n" +
                            "$data{'Lisa'} = 30\n" +
                            "$data{'Kumar'} = 40\n")
                    .withHtml("<h2>Creating Hashes</h2>\n" +
                            "<p>Hashes are created in one of the two following ways. In the first method, you assign a value to a named key on a one-by-one basis &minus;</p>\n")
                    .withCode("$data{'John Paul'} = 45;\n" +
                            "$data{'Lisa'} = 30;\n" +
                            "$data{'Kumar'} = 40;\n")
                    .withHtml("<p>In the second case, you use a list, which is converted by taking individual pairs from the list: the first element of the pair is used as the key, and the second, as the value. For example &minus;</p>\n")
                    .withCode("%data = ('John Paul', 45, 'Lisa', 30, 'Kumar', 40);\n")
                    .withHtml("<p>For clarity, you can use =&gt; as an alias for , to indicate the key/value pairs as follows &minus;</p>\n")
                    .withCode("%data = ('John Paul' =&gt; 45, 'Lisa' =&gt; 30, 'Kumar' =&gt; 40);\n")
                    .withHtml("<p>Here is one more variant of the above form, have a look at it, here all the keys have been preceded by hyphen (-) and no quotation is required around them &minus;</p>\n")
                    .withCode("%data = (-JohnPaul =&gt; 45, -Lisa =&gt; 30, -Kumar =&gt; 40);\n")
                    .withHtml("<p>But it is important to note that there is a single word, i.e., without spaces keys have been used in this form of hash formation and if you build-up your hash this way then keys will be accessed using hyphen only as shown below.</p>\n")
                    .withCode("$val = %data{-JohnPaul}\n" +
                            "$val = %data{-Lisa}\n")
                    .withHtml("<h2>Accessing Hash Elements</h2>\n" +
                            "<p>When accessing individual elements from a hash, you must prefix the variable with a dollar sign ($) and then append the element key within curly brackets after the name of the variable. For example &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "%data = ('John Paul' =&gt; 45, 'Lisa' =&gt; 30, 'Kumar' =&gt; 40);\n" +
                            "\n" +
                            "print \"$data{'John Paul'}\\n\";\n" +
                            "print \"$data{'Lisa'}\\n\";\n" +
                            "print \"$data{'Kumar'}\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("45\n" +
                            "30\n" +
                            "40\n")
                    .withHtml("<h2>Extracting Slices</h2>\n" +
                            "<p>You can extract slices of a hash just as you can extract slices from an array. You will need to use &commat; prefix for the variable to store the returned value because they will be a list of values &minus;</p>\n")
                    .withCode("#!/uer/bin/perl\n" +
                            "\n" +
                            "\n" +
                            "%data = (-JohnPaul =&gt; 45, -Lisa =&gt; 30, -Kumar =&gt; 40);\n" +
                            "\n" +
                            "&commat;array = &commat;data{-JohnPaul, -Lisa};\n" +
                            "\n" +
                            "print \"Array : &commat;array\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("Array : 45 30\n")
                    .withHtml("<h2>Extracting Keys and Values</h2>\n" +
                            "<p>You can get a list of all of the keys from a hash by using <b>keys</b> function, which has the following syntax &minus;</p>\n")
                    .withCode("keys %HASH\n")
                    .withHtml("<p>This function returns an array of all the keys of the named hash. Following is the example &minus;</p>")
                    .withCode("#!/usr/bin/perl \n" +
                            "\n" +
                            "%data = ('John Paul' =&gt; 45, 'Lisa' =&gt; 30, 'Kumar' =&gt; 40);\n" +
                            "\n" +
                            "&commat;names = keys %data;\n" +
                            "\n" +
                            "print \"$names[0]\\n\";\n" +
                            "print \"$names[1]\\n\";\n" +
                            "print \"$names[2]\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("Lisa\n" +
                            "John Paul\n" +
                            "Kumar\n")
                    .withHtml("<p>Similarly, you can use <b>values</b> function to get a list of all the values. This function has the following syntax &minus;</p>\n")
                    .withCode("values %HASH\n")
                    .withHtml("<p>This function returns a normal array consisting of all the values of the named hash. Following is the example &minus;</p>\n")
                    .withCode("#!/usr/bin/perl \n" +
                            "\n" +
                            "%data = ('John Paul' =&gt; 45, 'Lisa' =&gt; 30, 'Kumar' =&gt; 40);\n" +
                            "\n" +
                            "&commat;ages = values %data;\n" +
                            "\n" +
                            "print \"$ages[0]\\n\";\n" +
                            "print \"$ages[1]\\n\";\n" +
                            "print \"$ages[2]\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("30\n" +
                            "45\n" +
                            "40\n")
                    .withHtml("<h2>Checking for Existence</h2>\n" +
                            "<p>If you try to access a key/value pair from a hash that doesn't exist, you'll normally get the <b>undefined</b> value, and if you have warnings switched on, then you'll get a warning generated at run time. You can get around this by using the <b>exists</b> function, which returns true if the named key exists, irrespective of what its value might be &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "%data = ('John Paul' =&gt; 45, 'Lisa' =&gt; 30, 'Kumar' =&gt; 40);\n" +
                            "\n" +
                            "if( exists($data{'Lisa'} ) ) {\n" +
                            "   print \"Lisa is $data{'Lisa'} years old\\n\";\n" +
                            "} else {\n" +
                            "   print \"I don't know age of Lisa\\n\";\n" +
                            "}\n")
                    .withHtml("<p>Here we have introduced the IF...ELSE statement, which we will study in a separate chapter. For now you just assume that <b>if( condition )</b> part will be executed only when the given condition is true otherwise <b>else</b> part will be executed. So when we execute the above program, it produces the following result because here the given condition <i>exists($data{'Lisa'}</i> returns true &minus;</p>\n")
                    .withCode("Lisa is 30 years old\n")
                    .withHtml("<h2>Getting Hash Size</h2>\n" +
                            "<p>You can get the size - that is, the number of elements from a hash by using the scalar context on either keys or values. Simply saying first you have to get an array of either the keys or values and then you can get the size of array as follows &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "%data = ('John Paul' =&gt; 45, 'Lisa' =&gt; 30, 'Kumar' =&gt; 40);\n" +
                            "\n" +
                            "&commat;keys = keys %data;\n" +
                            "$size = &commat;keys;\n" +
                            "print \"1 - Hash size:  is $size\\n\";\n" +
                            "\n" +
                            "@values = values %data;\n" +
                            "$size = &commat;values;\n" +
                            "print \"2 - Hash size:  is $size\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>")
                    .withCode("1 - Hash size: is 3\n" +
                            "2 - Hash size: is 3\n")
                    .withHtml("<h2>Add and Remove Elements in Hashes</h2>\n" +
                            "<p>Adding a new key/value pair can be done with one line of code using simple assignment operator. But to remove an element from the hash you need to use <b>delete</b> function as shown below in the example &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "%data = ('John Paul' =&gt; 45, 'Lisa' =&gt; 30, 'Kumar' =&gt; 40);\n" +
                            "&commat;keys = keys %data;\n" +
                            "$size = &commat;keys;\n" +
                            "print \"1 - Hash size:  is $size\\n\";\n" +
                            "\n" +
                            "# adding an element to the hash;\n" +
                            "$data{'Ali'} = 55;\n" +
                            "&commat;keys = keys %data;\n" +
                            "$size = &commat;keys;\n" +
                            "print \"2 - Hash size:  is $size\\n\";\n" +
                            "\n" +
                            "# delete the same element from the hash;\n" +
                            "delete $data{'Ali'};\n" +
                            "&commat;keys = keys %data;\n" +
                            "$size = &commat;keys;\n" +
                            "print \"3 - Hash size:  is $size\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("1 - Hash size: is 3\n" +
                            "2 - Hash size: is 4\n" +
                            "3 - Hash size: is 3\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .into(textView);
        } else if (category.equals(categories[8])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h1>Perl Conditional Statements - IF...ELSE</h1>\n")
                    .withHtml("<p>Perl conditional statements helps in the decision making, which require that the programmer specifies one or more conditions to be evaluated or tested by the program, along with a statement or statements to be executed if the condition is determined to be true, and optionally, other statements to be executed if the condition is determined to be false.</p>\n")
                    .withHtml("<p>Following is the general from of a typical decision making structure found in most of the programming languages &minus;</p>\n")
                    .withHtml("<center><img src=\"https://www.tutorialspoint.com/perl/images/decision_making.jpg\" alt=\"Decision making statements in Perl\" /></center>\n")
                    .withHtml("<p>The number 0, the strings '0' and \"\" , the empty list () , and undef are all <b>false</b> in a boolean context and all other values are <b>true</b>. Negation of a true value by <b>!</b> or <b>not</b> returns a special false value.</p>\n" +
                            "<p>Perl programming language provides the following types of conditional statements.</p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;width:5%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Statement &amp; Description</th></tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td>if statement\n" +
                            "<p>An <b>if statement</b> consists of a boolean expression followed by one or more statements.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td>if...else statement\n" +
                            "<p>An <b>if statement</b> can be followed by an optional <b>else statement</b>.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td>if...elsif...else statement\n" +
                            "<p>An <b>if statement</b> can be followed by an optional <b>elsif statement</b> and then by an optional <b>else statement</b>.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">4</td>\n" +
                            "<td>unless statement\n" +
                            "<p>An <b>unless statement</b> consists of a boolean expression followed by one or more statements.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">5</td>\n" +
                            "<td>unless...else statement\n" +
                            "<p>An <b>unless statement</b> can be followed by an optional <b>else statement</b>.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">6</td>\n" +
                            "<td>unless...elsif..else statement\n" +
                            "<p>An <b>unless statement</b> can be followed by an optional <b>elsif statement</b> and then by an optional <b>else statement</b>.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">7</td>\n" +
                            "<td>switch statement\n" +
                            "<p>With the latest versions of Perl, you can make use of the <b>switch</b> statement. which allows a simple way of comparing a variable value against various conditions.</p></td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h2>The ? : Operator</h2>\n" +
                            "<p>Let's check the <b>conditional operator ? :</b>which can be used to replace <b>if...else</b> statements. It has the following general form &minus;</p>\n" +
                            "<pre class=\"result notranslate\">\n" +
                            "Exp1 ? Exp2 : Exp3;\n" +
                            "</pre>\n" +
                            "<p>Where Exp1, Exp2, and Exp3 are expressions. Notice the use and placement of the colon.</p>\n" +
                            "<p>The value of a ? expression is determined like this: Exp1 is evaluated. If it is true, then Exp2 is evaluated and becomes the value of the entire ? expression. If Exp1 is false, then Exp3 is evaluated and its value becomes the value of the expression. Below is a simple example making use of this operator &minus;</p>\n")
                    .withCode("#!/usr/local/bin/perl\n" +
                            " \n" +
                            "$name = \"Ali\";\n" +
                            "$age = 10;\n" +
                            "\n" +
                            "$status = ($age &gt; 60 )? \"A senior citizen\" : \"Not a senior citizen\";\n" +
                            "\n" +
                            "print \"$name is  - $status\\n\";\n")
                    .withHtml("<p>This will produce the following result &minus;</p>")
                    .withCode("Ali is - Not a senior citizen\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .into(textView);
        } else if (category.equals(categories[9])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h1>Perl - Loops</h1>\n")
                    .withHtml("<p>There may be a situation when you need to execute a block of code several number of times. In general, statements are executed sequentially: The first statement in a function is executed first, followed by the second, and so on.</p>\n" +
                            "<p>Programming languages provide various control structures that allow for more complicated execution paths.</p>\n" +
                            "<p>A loop statement allows us to execute a statement or group of statements multiple times and following is the general form of a loop statement in most of the programming languages &minus;</p>\n")
                    .withHtml("<center><img src=\"https://www.tutorialspoint.com/perl/images/loop_architecture.jpg\" alt=\"Loop Architecture in Perl\" /><center>\n")
                    .withHtml("<p>Perl programming language provides the following types of loop to handle the looping requirements.</p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;width:5%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Loop Type &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td>while loop\n" +
                            "<p>Repeats a statement or group of statements while a given condition is true. It tests the condition before executing the loop body.</p></td></tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td>until loop\n" +
                            "<p>Repeats a statement or group of statements until a given condition becomes true. It tests the condition before executing the loop body.</p></td></tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td>for loop\n" +
                            "<p>Executes a sequence of statements multiple times and abbreviates the code that manages the loop variable.</p></td></tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">4</td>\n" +
                            "<td>foreach loop\n" +
                            "<p>The foreach loop iterates over a normal list value and sets the variable VAR to be each element of the list in turn.</p></td></tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">5</td>\n" +
                            "<td>do...while loop\n" +
                            "<p>Like a while statement, except that it tests the condition at the end of the loop body</p></td></tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">6</td>\n" +
                            "<td>nested loops\n" +
                            "<p>You can use one or more loop inside any another while, for or do..while loop.</p></td></tr>\n" +
                            "</table>\n" +
                            "<h2>Loop Control Statements</h2>\n" +
                            "<p>Loop control statements change the execution from its normal sequence. When execution leaves a scope, all automatic objects that were created in that scope are destroyed.</p>\n" +
                            "<p>Perl supports the following control statements. Click the following links to check their detail.</p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;width:5%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Control Statement &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td>next statement\n" +
                            "<p>Causes the loop to skip the remainder of its body and immediately retest its condition prior to reiterating.</p></td></tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td>last statement\n" +
                            "<p>Terminates the loop statement and transfers execution to the statement immediately following the loop.</p></td></tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td>continue statement\n" +
                            "<p>A continue BLOCK, it is always executed just before the conditional is about to be evaluated again.</p></td></tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">4</td>\n" +
                            "<td>redo statement\n" +
                            "<p>The redo command restarts the loop block without evaluating the conditional again. The continue block, if any, is not executed.</p></td></tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">5</td>\n" +
                            "<td>goto statement\n" +
                            "<p>Perl supports a goto command with three forms: goto label, goto expr, and goto &amp;name.</p></td></tr>\n" +
                            "</table>\n" +
                            "<h2>The Infinite Loop</h2>\n" +
                            "<p>A loop becomes infinite loop if a condition never becomes false. The <b>for</b> loop is traditionally used for this purpose. Since none of the three expressions that form the <b>for</b> loop are required, you can make an endless loop by leaving the conditional expression empty.</p>\n")
                    .withCode("#!/usr/local/bin/perl\n" +
                            " \n" +
                            "for( ; ; ) {\n" +
                            "   printf \"This loop will run forever.\\n\";\n" +
                            "}\n")
                    .withHtml("<p>You can terminate the above infinite loop by pressing the Ctrl + C keys.</p>\n" +
                            "<p>When the conditional expression is absent, it is assumed to be true. You may have an initialization and increment expression, but as a programmer more commonly use the for (;;) construct to signify an infinite loop.</p>\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .into(textView);
        } else if (category.equals(categories[10])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h1>Perl - Operators</h1>\n")
                    .withHtml("<h2>What is an Operator?</h2> \n" +
                            "<p>Simple answer can be given using the expression <i>4 + 5 is equal to 9</i>. Here 4 and 5 are called operands and + is called operator. Perl language supports many operator types, but following is a list of important and most frequently used operators &minus;</p>\n" +
                            "<ul class=\"list\">\n" +
                            "<li>Arithmetic Operators</li>\n" +
                            "<li>Equality Operators</li>\n" +
                            "<li>Logical Operators</li>\n" +
                            "<li>Assignment Operators</li>\n" +
                            "<li>Bitwise Operators</li>\n" +
                            "<li>Logical Operators</li>\n" +
                            "<li>Quote-like Operators</li>\n" +
                            "<li>Miscellaneous Operators</li>\n" +
                            "</ul>\n" +
                            "<p>Lets have a look at all the operators one by one.</p>\n" +
                            "<h2>Perl Arithmetic Operators</h2>\n" +
                            "<p>Assume variable $a holds 10 and variable $b holds 20, then following are the Perl arithmatic operators &minus;</p>\n" +
                            "<p></p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;width:5%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Operator &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>+ ( Addition )</b></p>\n" +
                            "<p>Adds values on either side of the operator</p>\n" +
                            "<p><b>Example</b> &minus; $a + $b will give 30</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>- (Subtraction)</b></p>\n" +
                            "<p>Subtracts right hand operand from left hand operand</p>\n" +
                            "<p><b>Example</b> &minus; $a - $b will give -10</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>* (Multiplication)</b></p>\n" +
                            "<p>Multiplies values on either side of the operator</p>\n" +
                            "<p><b>Example</b> &minus; $a * $b will give 200</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">4</td>\n" +
                            "<td><p><b>/ (Division)</b></p>\n" +
                            "<p>Divides left hand operand by right hand operand</p>\n" +
                            "<p><b>Example</b> &minus; $b / $a will give 2</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">5</td>\n" +
                            "<td><p><b>% (Modulus)</b></p>\n" +
                            "<p>Divides left hand operand by right hand operand and returns remainder</p>\n" +
                            "<p><b>Example</b> &minus; $b % $a will give 0</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">6</td>\n" +
                            "<td><p><b>** (Exponent)</b></p>\n" +
                            "<p>Performs exponential (power) calculation on operators</p>\n" +
                            "<p><b>Example</b> &minus; $a**$b will give 10 to the power 20</p></td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h2>Perl Equality Operators</h2>\n" +
                            "<p>These are also called relational operators. Assume variable $a holds 10 and variable $b holds 20 then, lets check the following numeric equality operators &minus;</p>\n" +
                            "<p>Show Example</p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;width:5%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Operator &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>== (equal to)</b></p>\n" +
                            "<p>Checks if the value of two operands are equal or not, if yes then condition becomes true.</p>\n" +
                            "<p><b>Example</b> &minus; ($a == $b) is not true.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>!= (not equal to)</b></p>\n" +
                            "<p>Checks if the value of two operands are equal or not, if values are not equal then condition becomes true.</p>\n" +
                            "<p><b>Example</b> &minus; ($a != $b) is true.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>&lt;=&gt;</b></p>\n" +
                            "<p>Checks if the value of two operands are equal or not, and returns -1, 0, or 1 depending on whether the left argument is numerically less than, equal to, or greater than the right argument.</p>\n" +
                            "<p><b>Example</b> &minus; ($a &lt;=&gt; $b) returns -1.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">4</td>\n" +
                            "<td><p><b>&gt; (greater than)</b></p>\n" +
                            "<p>Checks if the value of left operand is greater than the value of right operand, if yes then condition becomes true.</p>\n" +
                            "<p><b>Example</b> &minus; ($a &gt; $b) is not true.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">5</td>\n" +
                            "<td><p><b>&lt; (less than)</b></p>\n" +
                            "<p>Checks if the value of left operand is less than the value of right operand, if yes then condition becomes true.</p>\n" +
                            "<p><b>Example</b> &minus; ($a &lt; $b) is true.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">6</td>\n" +
                            "<td><p><b>&gt;= (greater than or equal to)</b></p>\n" +
                            "<p>Checks if the value of left operand is greater than or equal to the value of right operand, if yes then condition becomes true.</p>\n" +
                            "<p><b>Example</b> &minus; ($a &gt;= $b) is not true.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">7</td>\n" +
                            "<td><p><b>&lt;= (less than or equal to)</b></p>\n" +
                            "<p>Checks if the value of left operand is less than or equal to the value of right operand, if yes then condition becomes true.</p>\n" +
                            "<p><b>Example</b> &minus; ($a &lt;= $b) is true.</p></td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<p>Below is a list of equity operators. Assume variable $a holds \"abc\" and variable $b holds \"xyz\" then, lets check the following string equality operators &minus;</p>\n" +
                            "<p>Show Example</p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;width:5%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Operator &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>lt</b></p>\n" +
                            "<p>Returns true if the left argument is stringwise less than the right argument.</p>\n" +
                            "<p><b>Example</b> &minus; ($a lt $b) is true.</p>\n" +
                            "</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>gt</b></p>\n" +
                            "<p>Returns true if the left argument is stringwise greater than the right argument.</p>\n" +
                            "<p><b>Example</b> &minus; ($a gt $b) is false.</p>\n" +
                            "</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>le</b></p>\n" +
                            "<p>Returns true if the left argument is stringwise less than or equal to the right argument.</p>\n" +
                            "<p><b>Example</b> &minus; ($a le $b) is true.</p>\n" +
                            "</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">4</td>\n" +
                            "<td><p><b>ge</b></p>\n" +
                            "<p>Returns true if the left argument is stringwise greater than or equal to the right argument.</p>\n" +
                            "<p><b>Example</b> &minus; ($a ge $b) is false.</p>\n" +
                            "</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">5</td>\n" +
                            "<td><p><b>eq</b></p>\n" +
                            "<p>Returns true if the left argument is stringwise equal to the right argument.</p>\n" +
                            "<p><b>Example</b> &minus; ($a eq $b) is false.</p>\n" +
                            "</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">6</td>\n" +
                            "<td><p><b>ne</b></p>\n" +
                            "<p>Returns true if the left argument is stringwise not equal to the right argument.</p>\n" +
                            "<p><b>Example</b> &minus; ($a ne $b) is true.</p>\n" +
                            "</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">7</td>\n" +
                            "<td><p><b>cmp</b></p>\n" +
                            "<p>Returns -1, 0, or 1 depending on whether the left argument is stringwise less than, equal to, or greater than the right argument.</p>\n" +
                            "<p><b>Example</b> &minus; ($a cmp $b) is -1.</p>\n" +
                            "</td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h2>Perl Assignment Operators</h2>\n" +
                            "<p>Assume variable $a holds 10 and variable $b holds 20, then below are the assignment operators available in Perl and their usage &minus;</p>\n" +
                            "<p>Show Example</p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;width:5%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Operator &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>=</b></p>\n" +
                            "<p>Simple assignment operator, Assigns values from right side operands to left side operand</p>\n" +
                            "<p><b>Example</b> &minus; $c = $a + $b will assigned value of $a + $b into $c</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>+=</b></p>\n" +
                            "<p>Add AND assignment operator, It adds right operand to the left operand and assign the result to left operand</p>\n" +
                            "<p><b>Example</b> &minus; $c += $a is equivalent to $c = $c + $a</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>-=</b></p>\n" +
                            "<p>Subtract AND assignment operator, It subtracts right operand from the left operand and assign the result to left operand</p>\n" +
                            "<p><b>Example</b> &minus; $c -= $a is equivalent to $c = $c - $a</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">4</td>\n" +
                            "<td><p><b>*=</b></p>\n" +
                            "<p>Multiply AND assignment operator, It multiplies right operand with the left operand and assign the result to left operand</p>\n" +
                            "<p><b>Example</b> &minus; $c *= $a is equivalent to $c = $c * $a</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">5</td>\n" +
                            "<td><p><b>/=</b></p>\n" +
                            "<p>Divide AND assignment operator, It divides left operand with the right operand and assign the result to left operand</p>\n" +
                            "<p><b>Example</b> &minus; $c /= $a is equivalent to $c = $c / $a</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">6</td>\n" +
                            "<td><p><b>%=</b></p>\n" +
                            "<p>Modulus AND assignment operator, It takes modulus using two operands and assign the result to left operand</p>\n" +
                            "<p><b>Example</b> &minus; $c %= $a is equivalent to $c = $c % a</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">7</td>\n" +
                            "<td><p><b>**=</b></p>\n" +
                            "<p>Exponent AND assignment operator, Performs exponential (power) calculation on operators and assign value to the left operand</p>\n" +
                            "<p><b>Example</b> &minus; $c **= $a is equivalent to $c = $c ** $a</p></td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h2>Perl Bitwise Operators</h2>\n" +
                            "<p>Bitwise operator works on bits and perform bit by bit operation. Assume if $a = 60; and $b = 13; Now in binary format they will be as follows &minus;</p>\n" +
                            "<p>$a = 0011 1100</p>\n" +
                            "<p>$b = 0000 1101</p>\n" +
                            "<p>-----------------</p>\n" +
                            "<p>$a&amp;$b = 0000 1100</p>\n" +
                            "<p>$a|$b = 0011 1101</p>\n" +
                            "<p>$a^$b = 0011 0001</p>\n" +
                            "<p>~$a&nbsp; = 1100 0011</p>\n" +
                            "<p>There are following Bitwise operators supported by Perl language, assume if $a = 60; and $b = 13</p>\n" +
                            "<p>Show Example</p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;width:5%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Operator &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>&amp;</b></p>\n" +
                            "<p>Binary AND Operator copies a bit to the result if it exists in both operands.</p>\n" +
                            "<p><b>Example</b> &minus; ($a &amp; $b) will give 12 which is 0000 1100</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>|</b></p>\n" +
                            "<p>Binary OR Operator copies a bit if it exists in eather operand.</p>\n" +
                            "<p><b>Example</b> &minus; ($a | $b) will give 61 which is 0011 1101</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>^</b></p>\n" +
                            "<p>Binary XOR Operator copies the bit if it is set in one operand but not both.</p>\n" +
                            "<p><b>Example</b> &minus; ($a ^ $b) will give 49 which is 0011 0001</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">4</td>\n" +
                            "<td><p><b>~</b></p>\n" +
                            "<p>Binary Ones Complement Operator is unary and has the efect of 'flipping' bits.</p>\n" +
                            "<p><b>Example</b> &minus; (~$a ) will give -61 which is 1100 0011 in 2's complement form due to a signed binary number.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">5</td>\n" +
                            "<td><p><b>&lt;&lt;</b></p>\n" +
                            "<p>Binary Left Shift Operator. The left operands value is moved left by the number of bits specified by the right operand.</p>\n" +
                            "<p><b>Example</b> &minus; $a &lt;&lt; 2 will give 240 which is 1111 0000</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">6</td>\n" +
                            "<td><p><b>&gt;&gt;</b></p>\n" +
                            "<p>Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand.</p>\n" +
                            "<p><b>Example</b> &minus; $a &gt;&gt; 2 will give 15 which is 0000 1111</p></td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h2>Perl Logical Operators</h2>\n" +
                            "<p>There are following logical operators supported by Perl language. Assume variable $a holds true and variable $b holds false then &minus;</p>\n" +
                            "<p>Show Example</p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;width:5%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Operator &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>and</b></p>\n" +
                            "<p>Called Logical AND operator. If both the operands are true then then condition becomes true.</p>\n" +
                            "<p><b>Example</b> &minus; ($a and $b) is false.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>&amp;&amp;</b></p>\n" +
                            "<p>C-style Logical AND operator copies a bit to the result if it exists in both operands.</p>\n" +
                            "<p><b>Example</b> &minus; ($a &amp;&amp; $b) is false.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>or</b></p>\n" +
                            "<p>Called Logical OR Operator. If any of the two operands are non zero then then condition becomes true.</p>\n" +
                            "<p><b>Example</b> &minus; ($a or $b) is true.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">4</td>\n" +
                            "<td><p><b>||</b></p>\n" +
                            "<p>C-style Logical OR operator copies a bit if it exists in eather operand.</p>\n" +
                            "<p><b>Example</b> &minus; ($a || $b) is true.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">5</td>\n" +
                            "<td><p><b>not</b></p>\n" +
                            "<p>Called Logical NOT Operator. Use to reverses the logical state of its operand. If a condition is true then Logical NOT operator will make false.</p>\n" +
                            "<p><b>Example</b> &minus; not($a and $b) is true.</p></td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h2>Quote-like Operators</h2>\n" +
                            "<p>There are following Quote-like operators supported by Perl language. In the following table, a {} represents any pair of delimiters you choose.</p>\n" +
                            "<p>Show Example</p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;width:5%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Operator &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>q{ }</b></p>\n" +
                            "<p>Encloses a string with-in single quotes</p>\n" +
                            "<p><b>Example</b> &minus; q{abcd} gives 'abcd'</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>qq{ }</b></p>\n" +
                            "<p>Encloses a string with-in double quotes</p>\n" +
                            "<p><b>Example</b> &minus; qq{abcd} gives \"abcd\"</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>qx{ }</b></p>\n" +
                            "<p>Encloses a string with-in invert quotes</p>\n" +
                            "<p><b>Example</b> &minus; qx{abcd} gives `abcd`</p></td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h2>Miscellaneous Operators</h2>\n" +
                            "<p>There are following miscellaneous operators supported by Perl language. Assume variable a holds 10 and variable b holds 20 then &minus;</p>\n" +
                            "<p>Show Example</p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;width:5%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Operator &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>.</b></p>\n" +
                            "<p>Binary operator dot (.) concatenates two strings.</p>\n" +
                            "<p><b>Example</b> &minus; If $a = \"abc\", $b = \"def\" then $a.$b will give \"abcdef\"</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>x</b></p>\n" +
                            "<p>The repetition operator x returns a string consisting of the left operand repeated the number of times specified by the right operand.</p>\n" +
                            "<p><b>Example</b> &minus; ('-' x 3) will give ---.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>..</b></p>\n" +
                            "<p>The range operator .. returns a list of values counting (up by ones) from the left value to the right value</p>\n" +
                            "<p><b>Example</b> &minus; (2..5) will give (2, 3, 4, 5)</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">4</td>\n" +
                            "<td><p><b>++</b></p>\n" +
                            "<p>Auto Increment operator increases integer value by one</p>\n" +
                            "<p><b>Example</b> &minus; $a++ will give 11</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">5</td>\n" +
                            "<td><p><b>--</b></p>\n" +
                            "<p>Auto Decrement operator decreases integer value by one</p>\n" +
                            "<p><b>Example</b> &minus; $a-- will give 9</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">6</td>\n" +
                            "<td><p><b>-&gt;</b></p>\n" +
                            "<p>The arrow operator is mostly used in dereferencing a method or variable from an object or a class name</p>\n" +
                            "<p><b>Example</b> &minus; $obj-&gt;$a is an example to access variable $a from object $obj.</p></td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h2>Perl Operators Precedence</h2>\n" +
                            "<p>The following table lists all operators from highest precedence to lowest.</p>\n" +
                            "<p>Show Example</p>\n")
                    .withCode("left\tterms and list operators (leftward)\n" +
                            "left\t-&gt;\n" +
                            "nonassoc\t++ --\n" +
                            "right\t**\n" +
                            "right\t! ~ \\ and unary + and -\n" +
                            "left\t=~ !~\n" +
                            "left\t* / % x\n" +
                            "left\t+ - .\n" +
                            "left\t&lt;&lt; &gt;&gt;\n" +
                            "nonassoc\tnamed unary operators\n" +
                            "nonassoc\t&lt; &gt; &lt;= &gt;= lt gt le ge\n" +
                            "nonassoc\t== != &lt;=&gt; eq ne cmp ~~\n" +
                            "left\t&amp;\n" +
                            "left\t| ^\n" +
                            "left\t&amp;&amp;\n" +
                            "left\t|| //\n" +
                            "nonassoc\t..  ...\n" +
                            "right\t?:\n" +
                            "right\t= += -= *= etc.\n" +
                            "left\t, =&gt;\n" +
                            "nonassoc\tlist operators (rightward)\n" +
                            "right\tnot\n" +
                            "left\tand\n" +
                            "left\tor xor\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .into(textView);
        } else if (category.equals(categories[11])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h1>Perl - Date and Time</h1>\n")
                    .withHtml("p>This chapter will give you the basic understanding on how to process and manipulate dates and times in Perl.</p>\n" +
                            "<h2>Current Date and Time</h2>\n" +
                            "<p>Let's start with  <b>localtime()</b> function, which returns values for the current date and time if given no arguments. Following is the 9-element list returned by the <b>localtime</b> function while using in list context &minus;</p>\n")
                    .withCode("sec,     # seconds of minutes from 0 to 61\n" +
                            "min,     # minutes of hour from 0 to 59\n" +
                            "hour,    # hours of day from 0 to 24\n" +
                            "mday,    # day of month from 1 to 31\n" +
                            "mon,     # month of year from 0 to 11\n" +
                            "year,    # year since 1900\n" +
                            "wday,    # days since sunday\n" +
                            "yday,    # days since January 1st\n" +
                            "isdst    # hours of daylight savings time\n")
                    .withHtml("<p>Try the following example to print different elements returned by localtime() function &minus;</p>\n")
                    .withCode("#!/usr/local/bin/perl\n" +
                            " \n" +
                            "@months = qw( Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec );\n" +
                            "@days = qw(Sun Mon Tue Wed Thu Fri Sat Sun);\n" +
                            "\n" +
                            "($sec,$min,$hour,$mday,$mon,$year,$wday,$yday,$isdst) = localtime();\n" +
                            "print \"$mday $months[$mon] $days[$wday]\\n\";\n")
                    .withHtml("<p>When the above code is executed, it produces the following result &minus;</p>")
                    .withCode("16 Feb Sat\n")
                    .withHtml("<p>If you will use localtime() function in scalar context, then it will return date and time from the current time zone set in the system. Try the following example to print current date and time in full format &minus;</p>")
                    .withCode("#!/usr/local/bin/perl\n" +
                            " \n" +
                            "$datestring = localtime();\n" +
                            "print \"Local date and time $datestring\\n\";\n")
                    .withHtml("<p>When the above code is executed, it produces the following result &minus;</p>\n")
                    .withCode("Local date and time Sat Feb 16 06:50:45 2013\n")
                    .withHtml("<h2>GMT Time</h2>\n" +
                            "<p>The function <b>gmtime()</b> works just like localtime() function but the returned values are localized for the standard Greenwich time zone. When called in list context, $isdst, the last value returned by gmtime, is always 0. There is no Daylight Saving Time in GMT.</p>\n" +
                            "<p>You should make a note on the fact that localtime() will return the current local time on the machine that runs the script and gmtime() will return the universal Greenwich Mean Time, or GMT (or UTC).</p>\n" +
                            "<p>Try the following example to print the current date and time but on GMT scale &minus;</p>\n")
                    .withCode("#!/usr/local/bin/perl\n" +
                            "\n" +
                            "$datestring = gmtime();\n" +
                            "print \"GMT date and time $datestring\\n\";\n")
                    .withHtml("<p>When the above code is executed, it produces the following result &minus;</p>\n")
                    .withCode("GMT date and time Sat Feb 16 13:50:45 2013\n")
                    .withHtml("<h2>Format Date and Time</h2>\n" +
                            "<p>You can use localtime() function to get a list of 9-elements and later you can use the <b>printf()</b> function to format date and time based on your requirements as follows &minus;</p>\n")
                    .withCode("#!/usr/local/bin/perl\n" +
                            " \n" +
                            "($sec,$min,$hour,$mday,$mon,$year,$wday,$yday,$isdst) = localtime();\n" +
                            "\n" +
                            "printf(\"Time Format - HH:MM:SS\\n\");\n" +
                            "printf(\"%02d:%02d:%02d\", $hour, $min, $sec);")
                    .withHtml("<p>When the above code is executed, it produces the following result &minus;</p>\n")
                    .withCode("Time Format - HH:MM:SS\n" +
                            "06:58:52\n")
                    .withHtml("<h2>Epoch time</h2>\n" +
                            "<p>You can use the time() function to get epoch time, i.e., the numbers of seconds that have elapsed since a given date, in Unix is January 1, 1970.</p>\n")
                    .withCode("#!/usr/local/bin/perl\n" +
                            " \n" +
                            "$epoc = time();\n" +
                            "\n" +
                            "print \"Number of seconds since Jan 1, 1970 - $epoc\\n\";\n")
                    .withHtml("<p>When the above code is executed, it produces the following result &minus;</p>")
                    .withCode("Number of seconds since Jan 1, 1970 - 1361022130\n")
                    .withHtml("<p>You can convert a given number of seconds into date and time string as follows &minus;</p>\n")
                    .withCode("#!/usr/local/bin/perl\n" +
                            "\n" +
                            "$datestring = localtime();\n" +
                            "print \"Current date and time $datestring\\n\";\n" +
                            "\n" +
                            "$epoc = time();\n" +
                            "$epoc = $epoc - 12 * 60 * 60;   # one day before of current date.\n" +
                            "\n" +
                            "$datestring = localtime($epoc);\n" +
                            "print \"Yesterday's date and time $datestring\\n\";\n")
                    .withHtml("<p>When the above code is executed, it produces the following result &minus;</p>\n")
                    .withCode("Current date and time Sat Feb 16 07:05:39 2013\n" +
                            "Yesterday's date and time Fri Feb 15 19:05:39 2013\n")
                    .withHtml("h2>POSIX Function strftime()</h2>\n" +
                            "<p>You can use the POSIX function <b>strftime()</b> to format date and time with the help of the following table. Please note that the specifiers marked with an asterisk (*) are locale-dependent.</p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;\">Specifier</th>\n" +
                            "<th style=\"text-align:center;\">Replaced by</th>\n" +
                            "<th style=\"text-align:center;\">Example</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%a</code></td>\n" +
                            "<td>Abbreviated weekday name *</td>\n" +
                            "<td class=\"ts\"><code>Thu</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%A</code></td>\n" +
                            "<td>Full weekday name * </td>\n" +
                            "<td class=\"ts\"><code>Thursday</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%b</code></td>\n" +
                            "<td>Abbreviated month name *</td>\n" +
                            "<td class=\"ts\"><code>Aug</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%B</code></td>\n" +
                            "<td>Full month name *</td>\n" +
                            "<td class=\"ts\"><code>August</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%c</code></td>\n" +
                            "<td>Date and time representation *</td>\n" +
                            "<td class=\"ts\"><code>Thu Aug 23 14:55:02 2001</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%C</code></td>\n" +
                            "<td>Year divided by 100 and truncated to integer (<code>00-99</code>)</td>\n" +
                            "<td class=\"ts\"><code>20</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%d</code></td>\n" +
                            "<td>Day of the month, zero-padded (<code>01-31</code>)</td>\n" +
                            "<td class=\"ts\"><code>23</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%D</code></td>\n" +
                            "<td>Short <code>MM/DD/YY</code> date, equivalent to <code>%m/%d/%y</code></td>\n" +
                            "<td class=\"ts\"><code>08/23/01</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%e</code></td>\n" +
                            "<td>Day of the month, space-padded (<code> 1-31</code>)</td>\n" +
                            "<td class=\"ts\"><code>23</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%F</code></td>\n" +
                            "<td>Short <code>YYYY-MM-DD</code> date, equivalent to <code>%Y-%m-%d</code></td>\n" +
                            "<td class=\"ts\"><code>2001-08-23</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%g</code></td>\n" +
                            "<td>Week-based year, last two digits (<code>00-99</code>)</td>\n" +
                            "<td class=\"ts\"><code>01</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%G</code></td>\n" +
                            "<td>Week-based year</td>\n" +
                            "<td class=\"ts\"><code>2001</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%h</code></td>\n" +
                            "<td>Abbreviated month name * (same as <code>%b</code>)</td>\n" +
                            "<td class=\"ts\"><code>Aug</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%H</code></td>\n" +
                            "<td>Hour in 24h format (<code>00-23</code>)</td>\n" +
                            "<td class=\"ts\"><code>14</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%I</code></td>\n" +
                            "<td>Hour in 12h format (<code>01-12</code>)</td>\n" +
                            "<td class=\"ts\"><code>02</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%j</code></td>\n" +
                            "<td>Day of the year (<code>001-366</code>)</td>\n" +
                            "<td class=\"ts\"><code>235</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%m</code></td>\n" +
                            "<td>Month as a decimal number (<code>01-12</code>)</td>\n" +
                            "<td class=\"ts\"><code>08</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%M</code></td>\n" +
                            "<td>Minute (<code>00-59</code>)</td>\n" +
                            "<td class=\"ts\"><code>55</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%n</code></td>\n" +
                            "<td>New-line character (<code>'\\n'</code>)</td>\n" +
                            "<td></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%p</code></td>\n" +
                            "<td>AM or PM designation</td>\n" +
                            "<td class=\"ts\"><code>PM</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%r</code></td>\n" +
                            "<td>12-hour clock time *</td>\n" +
                            "<td class=\"ts\"><code>02:55:02 pm</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%R</code></td>\n" +
                            "<td>24-hour <code>HH:MM</code> time, equivalent to <code>%H:%M</code></td>\n" +
                            "<td class=\"ts\"><code>14:55</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%S</code></td>\n" +
                            "<td>Second (<code>00-61</code>)</td>\n" +
                            "<td class=\"ts\"><code>02</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%t</code></td>\n" +
                            "<td>Horizontal-tab character (<code>'\\t'</code>)</td>\n" +
                            "<td></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%T</code></td>\n" +
                            "<td>ISO 8601 time format (<code>HH:MM:SS</code>), equivalent to <code>%H:%M:%S</code></td>\n" +
                            "<td class=\"ts\"><code>14:55</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%u</code></td>\n" +
                            "<td>ISO 8601 weekday as number with Monday as <code>1</code> (<code>1-7</code>)</td>\n" +
                            "<td class=\"ts\"><code>4</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%U</code></td>\n" +
                            "<td>Week number with the first Sunday as the first day of week one (<code>00-53</code>)</td>\n" +
                            "<td class=\"ts\"><code>33</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%V</code></td>\n" +
                            "<td>ISO 8601 week number (<code>00-53</code>)</td>\n" +
                            "<td class=\"ts\"><code>34</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%w</code></td>\n" +
                            "<td>Weekday as a decimal number with Sunday as <code>0</code> (<code>0-6</code>)</td>\n" +
                            "<td class=\"ts\"><code>4</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%W</code></td>\n" +
                            "<td>Week number with the first Monday as the first day of week one (<code>00-53</code>)</td>\n" +
                            "<td class=\"ts\"><code>34</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%x</code></td>\n" +
                            "<td>Date representation *</td>\n" +
                            "<td class=\"ts\"><code>08/23/01</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%X</code></td>\n" +
                            "<td>Time representation *</td>\n" +
                            "<td class=\"ts\"><code>14:55:02</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%y</code></td>\n" +
                            "<td>Year, last two digits (<code>00-99</code>)</td>\n" +
                            "<td class=\"ts\"><code>01</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%Y</code></td>\n" +
                            "<td>Year</td>\n" +
                            "<td class=\"ts\"><code>2001</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%z</code></td>\n" +
                            "<td><p>ISO 8601 offset from UTC in timezone (1 minute = 1, 1 hour = 100)</p>\n" +
                            "<p>If timezone cannot be termined, no characters</p></td>\n" +
                            "<td class=\"ts\"><code>+100</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%Z</code></td>\n" +
                            "<td><p>Timezone name or abbreviation *</p>\n" +
                            "<p>If timezone cannot be termined, no characters</p></td>\n" +
                            "<td class=\"ts\"><code>CDT</code></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\"><code>%%</code></td>\n" +
                            "<td>A <code>%</code> sign</td>\n" +
                            "<td class=\"ts\"><code>%</code></td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<p>Let's check the following example to understand the usage &minus;</p>\n")
                    .withCode("#!/usr/local/bin/perl\n" +
                            "use POSIX qw(strftime);\n" +
                            "\n" +
                            "$datestring = strftime \"%a %b %e %H:%M:%S %Y\", localtime;\n" +
                            "printf(\"date and time - $datestring\\n\");\n" +
                            "\n" +
                            "# or for GMT formatted appropriately for your locale:\n" +
                            "$datestring = strftime \"%a %b %e %H:%M:%S %Y\", gmtime;\n" +
                            "printf(\"date and time - $datestring\\n\");\n")
                    .withHtml("<p>When the above code is executed, it produces the following result &minus;</p>\n")
                    .withCode("date and time - Sat Feb 16 07:10:23 2013\n" +
                            "date and time - Sat Feb 16 14:10:23 2013\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .into(textView);
        } else if (category.equals(categories[12])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h1>Perl - Subroutines</h1>\n")
                    .withHtml("<p>A Perl subroutine or function is a group of statements that together performs a task. You can divide up your code into separate subroutines. How you divide up your code among different subroutines is up to you, but logically the division usually is so each function performs a specific task.</p>\n" +
                            "<p>Perl uses the terms subroutine, method and function interchangeably.</p>\n" +
                            "<h2>Define and Call a Subroutine</h2>\n" +
                            "<p>The general form of a subroutine definition in Perl programming language is as follows &minus;</p>\n")
                    .withCode("sub subroutine_name {\n" +
                            "   body of the subroutine\n" +
                            "}\n")
                    .withHtml("<p>The typical way of calling that Perl subroutine is as follows &minus;</p>")
                    .withCode("subroutine_name( list of arguments );\n")
                    .withHtml("<p>In versions of Perl before 5.0, the syntax for calling subroutines was slightly different as shown below. This still works in the newest versions of Perl, but it is not recommended since it bypasses the subroutine prototypes.</p>\n")
                    .withCode("&amp;subroutine_name( list of arguments );\n")
                    .withHtml("<p>Let's have a look into the following example, which defines a simple function and then call it. Because Perl compiles your program before executing it, it doesn't matter where you declare your subroutine.</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "# Function definition\n" +
                            "sub Hello {\n" +
                            "   print \"Hello, World!\\n\";\n" +
                            "}\n" +
                            "\n" +
                            "# Function call\n" +
                            "Hello();")
                    .withHtml("<p>When above program is executed, it produces the following result &minus;</p>\n")
                    .withCode("Hello, World!\n")
                    .withHtml("<h2>Passing Arguments to a Subroutine</h2>\n" +
                            "<p>You can pass various arguments to a subroutine like you do in any other programming language and they can be acessed inside the function using the special array @_. Thus the first argument to the function is in $_[0], the second is in $_[1], and so on.</p>\n" +
                            "<p>You can pass arrays and hashes as arguments like any scalar but passing more than one array or hash normally causes them to lose their separate identities. So we will use references ( explained in the next tutorial ) to pass any array or hash.</p> \n" +
                            "<p>Let's try the following example, which takes a list of numbers and then prints their average &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "# Function definition\n" +
                            "sub Average {\n" +
                            "   # get total number of arguments passed.\n" +
                            "   $n = scalar(@_);\n" +
                            "   $sum = 0;\n" +
                            "\n" +
                            "   foreach $item (@_) {\n" +
                            "      $sum += $item;\n" +
                            "   }\n" +
                            "   $average = $sum / $n;\n" +
                            "\n" +
                            "   print \"Average for the given numbers : $average\\n\";\n" +
                            "}\n" +
                            "\n" +
                            "# Function call\n" +
                            "Average(10, 20, 30);")
                    .withHtml("<p>When above program is executed, it produces the following result &minus;</p>\n")
                    .withCode("Average for the given numbers : 20")
                    .withHtml("<h2>Passing Lists to Subroutines</h2>\n" +
                            "<p>Because the @_ variable is an array, it can be used to supply lists to a subroutine. However, because of the way in which Perl accepts and parses lists and arrays, it can be difficult to extract the individual elements from @_. If you have to pass a list along with other scalar arguments, then make list as the last argument as shown below &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "# Function definition\n" +
                            "sub PrintList {\n" +
                            "   my @list = @_;\n" +
                            "   print \"Given list is @list\\n\";\n" +
                            "}\n" +
                            "$a = 10;\n" +
                            "@b = (1, 2, 3, 4);\n" +
                            "\n" +
                            "# Function call with list parameter\n" +
                            "PrintList($a, @b);\n")
                    .withHtml("<p>When above program is executed, it produces the following result &minus;</p>\n")
                    .withCode("Given list is 10 1 2 3 4\n")
                    .withHtml("<h2>Passing Hashes to Subroutines</h2>\n" +
                            "<p>When you supply a hash to a subroutine or operator that accepts a list, then hash is automatically translated into a list of key/value pairs. For example &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "# Function definition\n" +
                            "sub PrintHash {\n" +
                            "   my (%hash) = @_;\n" +
                            "\n" +
                            "   foreach my $key ( keys %hash ) {\n" +
                            "      my $value = $hash{$key};\n" +
                            "      print \"$key : $value\\n\";\n" +
                            "   }\n" +
                            "}\n" +
                            "%hash = ('name' =&gt; 'Tom', 'age' =&gt; 19);\n" +
                            "\n" +
                            "# Function call with hash parameter\n" +
                            "PrintHash(%hash);\n")
                    .withHtml("<p>When above program is executed, it produces the following result &minus;</p>\n")
                    .withCode("name : Tom\n" +
                            "age : 19\n")
                    .withHtml("<h2>Returning Value from a Subroutine</h2>\n" +
                            "<p>You can return a value from subroutine like you do in any other programming language. If you are not returning a value from a subroutine then whatever calculation is last performed in a subroutine is automatically also the return value.</p>\n" +
                            "<p>You can return arrays and hashes from the subroutine like any scalar but returning more than one array or hash normally causes them to lose their separate identities. So we will use references ( explained in the next chapter ) to return any array or hash from a function.</p>\n" +
                            "<p>Let's try the following example, which takes a list of numbers and then returns their average &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "# Function definition\n" +
                            "sub Average {\n" +
                            "   # get total number of arguments passed.\n" +
                            "   $n = scalar(@_);\n" +
                            "   $sum = 0;\n" +
                            "\n" +
                            "   foreach $item (@_) {\n" +
                            "      $sum += $item;\n" +
                            "   }\n" +
                            "   $average = $sum / $n;\n" +
                            "\n" +
                            "   return $average;\n" +
                            "}\n" +
                            "\n" +
                            "# Function call\n" +
                            "$num = Average(10, 20, 30);\n" +
                            "print \"Average for the given numbers : $num\\n\";\n")
                    .withHtml("<p>When above program is executed, it produces the following result &minus;</p>\n")
                    .withCode("Average for the given numbers : 20\n")
                    .withHtml("<h2>Private Variables in a Subroutine</h2>\n" +
                            "<p>By default, all variables in Perl are global variables, which means they can be accessed from anywhere in the program. But you can create <b>private</b> variables called <b>lexical variables</b> at any time with the <b>my</b> operator.</p>\n" +
                            "<p>The <b>my</b> operator confines a variable to a particular region of code in which it can be used and accessed. Outside that region, this variable cannot be used or accessed. This region is called its scope. A lexical scope is usually a block of code with a set of braces around it, such as those defining the body of the subroutine or those marking the code blocks of <i>if, while, for, foreach,</i> and <i>eval</i> statements.</p>\n" +
                            "<p>Following is an example showing you how to define a single or multiple private variables using <b>my</b> operator &minus;</p>\n")
                    .withCode("sub somefunc {\n" +
                            "   my $variable; # $variable is invisible outside somefunc()\n" +
                            "   my ($another, @an_array, %a_hash); # declaring many variables at once\n" +
                            "}\n")
                    .withHtml("<p>Let's check the following example to distinguish between global and private variables &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "# Global variable\n" +
                            "$string = \"Hello, World!\";\n" +
                            "\n" +
                            "# Function definition\n" +
                            "sub PrintHello {\n" +
                            "   # Private variable for PrintHello function\n" +
                            "   my $string;\n" +
                            "   $string = \"Hello, Perl!\";\n" +
                            "   print \"Inside the function $string\\n\";\n" +
                            "}\n" +
                            "# Function call\n" +
                            "PrintHello();\n" +
                            "print \"Outside the function $string\\n\";\n")
                    .withHtml("<p>When above program is executed, it produces the following result &minus;</p>\n")
                    .withCode("Inside the function Hello, Perl!\n" +
                            "Outside the function Hello, World!\n")
                    .withHtml("<h2>Temporary Values via local()</h2>\n" +
                            "<p>The <b>local</b> is mostly used when the current value of a variable must be visible to called subroutines. A local just gives temporary values to global (meaning package) variables. This is known as <i>dynamic scoping</i>. Lexical scoping is done with my, which works more like C's auto declarations.</p>\n" +
                            "<p>If more than one variable or expression is given to local, they must be placed in parentheses. This operator works by saving the current values of those variables in its argument list on a hidden stack and restoring them upon exiting the block, subroutine, or eval.</p>\n" +
                            "<p>Let's check the following example to distinguish between global and local variables &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "# Global variable\n" +
                            "$string = \"Hello, World!\";\n" +
                            "\n" +
                            "sub PrintHello {\n" +
                            "   # Private variable for PrintHello function\n" +
                            "   local $string;\n" +
                            "   $string = \"Hello, Perl!\";\n" +
                            "   PrintMe();\n" +
                            "   print \"Inside the function PrintHello $string\\n\";\n" +
                            "}\n" +
                            "sub PrintMe {\n" +
                            "   print \"Inside the function PrintMe $string\\n\";\n" +
                            "}\n" +
                            "\n" +
                            "# Function call\n" +
                            "PrintHello();\n" +
                            "print \"Outside the function $string\\n\";\n")
                    .withHtml("<p>When above program is executed, it produces the following result &minus;</p>\n")
                    .withCode("Inside the function PrintMe Hello, Perl!\n" +
                            "Inside the function PrintHello Hello, Perl!\n" +
                            "Outside the function Hello, World!\n")
                    .withHtml("<h2>State Variables via state()</h2>\n" +
                            "<p>There are another type of lexical variables, which are similar to private variables but they maintain their state and they do not get reinitialized upon multiple calls of the subroutines. These variables are defined using the <b>state</b> operator and available starting from Perl 5.9.4.</p>\n" +
                            "<p>Let's check the following example to demonstrate the use of <b>state</b> variables &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "use feature 'state';\n" +
                            "\n" +
                            "sub PrintCount {\n" +
                            "   state $count = 0; # initial value\n" +
                            "\n" +
                            "   print \"Value of counter is $count\\n\";\n" +
                            "   $count++;\n" +
                            "}\n" +
                            "\n" +
                            "for (1..5) {\n" +
                            "   PrintCount();\n" +
                            "}\n")
                    .withHtml("<p>When above program is executed, it produces the following result &minus;</p>")
                    .withCode("Value of counter is 0\n" +
                            "Value of counter is 1\n" +
                            "Value of counter is 2\n" +
                            "Value of counter is 3\n" +
                            "Value of counter is 4\n")
                    .withHtml("<p>Prior to Perl 5.10, you would have to write it like this &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "{\n" +
                            "   my $count = 0; # initial value\n" +
                            "\n" +
                            "   sub PrintCount {\n" +
                            "      print \"Value of counter is $count\\n\";\n" +
                            "      $count++;\n" +
                            "   }\n" +
                            "}\n" +
                            "\n" +
                            "for (1..5) {\n" +
                            "   PrintCount();\n" +
                            "}\n")
                    .withHtml("<h2>Subroutine Call Context</h2>\n" +
                            "<p>The context of a subroutine or statement is defined as the type of return value that is expected. This allows you to use a single function that returns different values based on what the user is expecting to receive. For example, the following localtime() returns a string when it is called in scalar context, but it returns a list when it is called in list context.</p>\n")
                    .withCode("my $datestring = localtime( time );")
                    .withHtml("<p>In this example, the value of $timestr is now a string made up of the current date and time, for example, Thu Nov 30 15:21:33 2000. Conversely &minus;</p>\n")
                    .withCode("($sec,$min,$hour,$mday,$mon, $year,$wday,$yday,$isdst) = localtime(time);\n")
                    .withHtml("<p>Now the individual variables contain the corresponding values returned by localtime() subroutine.</p>\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .into(textView);
        } else if (category.equals(categories[13])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h1>Perl - References</h1>\n")
                    .withHtml("<p>A Perl reference is a scalar data type that holds the location of another value which could be scalar, arrays, or hashes. Because of its scalar nature, a reference can be used anywhere, a scalar can be used.</p>\n" +
                            "<p>You can construct lists containing references to other lists, which can contain references to hashes, and so on. This is how the nested data structures are built in Perl.</p>\n" +
                            "<h2>Create References</h2>\n" +
                            "<p>It is easy to create a reference for any variable, subroutine or value by prefixing it with a backslash as follows &minus;</p>\n")
                    .withCode("$scalarref = \\$foo;\n" +
                            "$arrayref  = \\@ARGV;\n" +
                            "$hashref   = \\%ENV;\n" +
                            "$coderef   = \\&amp;handler;\n" +
                            "$globref   = \\*foo;\n")
                    .withHtml("<p>You cannot create a reference on an I/O handle (filehandle or dirhandle) using the backslash operator but a reference to an anonymous array can be created using the square brackets as follows &minus;</p>")
                    .withCode("$arrayref = [1, 2, ['a', 'b', 'c']];\n")
                    .withHtml("<p>Similar way you can create a reference to an anonymous hash using the curly brackets as follows &minus;</p>")
                    .withCode("$hashref = {\n" +
                            "   'Adam'  =&gt; 'Eve',\n" +
                            "   'Clyde' =&gt; 'Bonnie',\n" +
                            "};\n")
                    .withHtml("<p>A reference to an anonymous subroutine can be created by using sub without a subname as follows &minus;</p>\n")
                    .withCode("$coderef = sub { print \"Boink!\\n\" };\n")
                    .withHtml("<h2>Dereferencing</h2>\n" +
                            "<p>Dereferencing returns the value from a reference point to the location. To dereference a reference simply use $, @ or % as prefix of the reference variable depending on whether the reference is pointing to a scalar, array, or hash. Following is the example to explain the concept &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "$var = 10;\n" +
                            "\n" +
                            "# Now $r has reference to $var scalar.\n" +
                            "$r = \\$var;\n" +
                            "\n" +
                            "# Print value available at the location stored in $r.\n" +
                            "print \"Value of $var is : \", $$r, \"\\n\";\n" +
                            "\n" +
                            "@var = (1, 2, 3);\n" +
                            "# Now $r has reference to @var array.\n" +
                            "$r = \\@var;\n" +
                            "# Print values available at the location stored in $r.\n" +
                            "print \"Value of @var is : \",  @$r, \"\\n\";\n" +
                            "\n" +
                            "%var = ('key1' =&gt; 10, 'key2' =&gt; 20);\n" +
                            "# Now $r has reference to %var hash.\n" +
                            "$r = \\%var;\n" +
                            "# Print values available at the location stored in $r.\n" +
                            "print \"Value of %var is : \", %$r, \"\\n\";\n")
                    .withHtml("<p>When above program is executed, it produces the following result &minus;</p>")
                    .withCode("Value of 10 is : 10\n" +
                            "Value of 1 2 3 is : 123\n" +
                            "Value of %var is : key220key110\n")
                    .withHtml("<p>If you are not sure about a variable type, then its easy to know its type using <b>ref</b>, which returns one of the following strings if its argument is a reference. Otherwise, it returns false &minus;</p>\n")
                    .withCode("SCALAR\n" +
                            "ARRAY\n" +
                            "HASH\n" +
                            "CODE\n" +
                            "GLOB\n" +
                            "REF\n")
                    .withHtml("<p>Let's try the following example &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "$var = 10;\n" +
                            "$r = \\$var;\n" +
                            "print \"Reference type in r : \", ref($r), \"\\n\";\n" +
                            "\n" +
                            "@var = (1, 2, 3);\n" +
                            "$r = \\@var;\n" +
                            "print \"Reference type in r : \", ref($r), \"\\n\";\n" +
                            "\n" +
                            "%var = ('key1' =&gt; 10, 'key2' =&gt; 20);\n" +
                            "$r = \\%var;\n" +
                            "print \"Reference type in r : \", ref($r), \"\\n\";\n")
                    .withHtml("<p>When above program is executed, it produces the following result &minus;</p>\n")
                    .withCode("Reference type in r : SCALAR\n" +
                            "Reference type in r : ARRAY\n" +
                            "Reference type in r : HASH\n")
                    .withHtml("<h2>Circular References</h2>\n" +
                            "<p>A circular reference occurs when two references contain a reference to each other. You have to be careful while creating references otherwise a circular reference can lead to memory leaks. Following is an example &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            " my $foo = 100;\n" +
                            " $foo = \\$foo;\n" +
                            " \n" +
                            " print \"Value of foo is : \", $$foo, \"\\n\";\n")
                    .withHtml("<p>When above program is executed, it produces the following result &minus;</p>\n")
                    .withCode("Value of foo is : REF(0x9aae38)\n")
                    .withHtml("<h2>References to Functions</h2>\n" +
                            "<p>This might happen if you need to create a signal handler so you can produce a reference to a function by preceding that function name with \\&amp; and to dereference that reference you simply need to prefix reference variable using ampersand &amp;. Following is an example &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "# Function definition\n" +
                            "sub PrintHash {\n" +
                            "   my (%hash) = @_;\n" +
                            "   \n" +
                            "   foreach $item (%hash) {\n" +
                            "      print \"Item : $item\\n\";\n" +
                            "   }\n" +
                            "}\n" +
                            "%hash = ('name' =&gt; 'Tom', 'age' =&gt; 19);\n" +
                            "\n" +
                            "# Create a reference to above function.\n" +
                            "$cref = \\&amp;PrintHash;\n" +
                            "\n" +
                            "# Function call using reference.\n" +
                            "&amp;$cref(%hash);\n")
                    .withHtml("<p>When above program is executed, it produces the following result &minus;</p>\n")
                    .withCode("Item : name\n" +
                            "Item : Tom\n" +
                            "Item : age\n" +
                            "Item : 19\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .into(textView);
        } else if (category.equals(categories[14])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h1>Perl - Formats</h1>\n")
                    .withHtml("<p>Perl uses a writing template called a 'format' to output reports. To use the format feature of Perl, you have to define a format first and then you can use that format to write formatted data.</p>\n" +
                            "<h2>Define a Format</h2>\n" +
                            "<p>Following is the syntax to define a Perl format &minus;</p>\n")
                    .withCode("format FormatName =\n" +
                            "fieldline\n" +
                            "value_one, value_two, value_three\n" +
                            "fieldline\n" +
                            "value_one, value_two\n" +
                            ".\n")
                    .withHtml("<p>Here <b>FormatName</b> represents the name of the format. The <b>fieldline</b> is the specific way, the data should be formatted. The values lines represent the values that will be entered into the field line. You end the format with a single period.</p>\n" +
                            "<p>Next <b>fieldline</b> can contain any text or fieldholders. The fieldholders hold space for data that will be placed there at a later date. A fieldholder has the format &minus;</p>\n")
                    .withCode("@&lt;&lt;&lt;&lt;\n")
                    .withHtml("<p>This fieldholder is left-justified, with a field space of 5. You must count the @ sign and the &lt; signs to know the number of spaces in the field. Other field holders include &minus;</p>\n")
                    .withCode("@&gt;&gt;&gt;&gt; right-justified\n" +
                            "@|||| centered\n" +
                            "@####.## numeric field holder\n" +
                            "@* multiline field holder\n")
                    .withHtml("<p>An example format would be &minus;</p>\n")
                    .withCode("format EMPLOYEE =\n" +
                            "===================================\n" +
                            "@&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt; @&lt;&lt; \n" +
                            "$name $age\n" +
                            "@#####.##\n" +
                            "$salary\n" +
                            "===================================\n" +
                            ".\n")
                    .withHtml("<p>In this example, $name would be written as left justify within 22 character spaces and after that age will be written in two spaces.</p>\n" +
                            "<h2>Using the Format</h2>\n" +
                            "<p>In order to invoke this format declaration, we would use the <b>write</b> keyword &minus;</p>\n")
                    .withCode("write EMPLOYEE;\n")
                    .withHtml("<p>The problem is that the format name is usually the name of an open file handle, and the write statement will send the output to this file handle. As we want the data sent to the STDOUT, we must associate EMPLOYEE with the STDOUT filehandle. First, however, we must make sure that that STDOUT is our selected file handle, using the select() function.</p>\n")
                    .withCode("select(STDOUT);\n")
                    .withHtml("<p>We would then associate EMPLOYEE with STDOUT by setting the new format name with STDOUT, using the special variable $~ or $FORMAT_NAME as follows &minus;</p>\n")
                    .withCode("$~ = \"EMPLOYEE\";\n")
                    .withHtml("<p>When we now do a write(), the data would be sent to STDOUT. Remember: if you are going to write your report in any other file handle instead of STDOUT then you can use select() function to select that file handle and rest of the logic will remain the same.</p>\n" +
                            "<p>Let's take the following example. Here we have hard coded values just for showing the usage. In actual usage you will read values from a file or database to generate actual reports and you may need to write final report again into a file.</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "format EMPLOYEE =\n" +
                            "===================================\n" +
                            "@&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt; @&lt;&lt; \n" +
                            "$name $age\n" +
                            "@#####.##\n" +
                            "$salary\n" +
                            "===================================\n" +
                            ".\n" +
                            "\n" +
                            "select(STDOUT);\n" +
                            "$~ = EMPLOYEE;\n" +
                            "\n" +
                            "@n = (\"Ali\", \"Raza\", \"Jaffer\");\n" +
                            "@a  = (20,30, 40);\n" +
                            "@s = (2000.00, 2500.00, 4000.000);\n" +
                            "\n" +
                            "$i = 0;\n" +
                            "foreach (@n) {\n" +
                            "   $name = $_;\n" +
                            "   $age = $a[$i];\n" +
                            "   $salary = $s[$i++];\n" +
                            "   write;\n" +
                            "}\n")
                    .withHtml("<p>When executed, this will produce the following result &minus;</p>\n")
                    .withCode("===================================\n" +
                            "Ali                     20\n" +
                            "  2000.00\n" +
                            "===================================\n" +
                            "===================================\n" +
                            "Raza                    30\n" +
                            "  2500.00\n" +
                            "===================================\n" +
                            "===================================\n" +
                            "Jaffer                  40\n" +
                            "  4000.00\n" +
                            "===================================\n")
                    .withHtml("<h2>Define a Report Header</h2>\n" +
                            "<p>Everything looks fine. But you would be interested in adding a header to your report. This header will be printed on top of each page. It is very simple to do this. Apart from defining a template you would have to define a header and assign it to $^ or $FORMAT_TOP_NAME variable &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "format EMPLOYEE =\n" +
                            "===================================\n" +
                            "@&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt; @&lt;&lt; \n" +
                            "$name $age\n" +
                            "@#####.##\n" +
                            "$salary\n" +
                            "===================================\n" +
                            ".\n" +
                            "\n" +
                            "format EMPLOYEE_TOP =\n" +
                            "===================================\n" +
                            "Name                    Age\n" +
                            "===================================\n" +
                            ".\n" +
                            "\n" +
                            "select(STDOUT);\n" +
                            "$~ = EMPLOYEE;\n" +
                            "$^ = EMPLOYEE_TOP;\n" +
                            "\n" +
                            "@n = (\"Ali\", \"Raza\", \"Jaffer\");\n" +
                            "@a  = (20,30, 40);\n" +
                            "@s = (2000.00, 2500.00, 4000.000);\n" +
                            "\n" +
                            "$i = 0;\n" +
                            "foreach (@n) {\n" +
                            "   $name = $_;\n" +
                            "   $age = $a[$i];\n" +
                            "   $salary = $s[$i++];\n" +
                            "   write;\n" +
                            "}\n" +
                            "</pre>\n" +
                            "<p>Now your report will look like &minus;</p>\n" +
                            "<pre class=\"result notranslate\">\n" +
                            "===================================\n" +
                            "Name                    Age\n" +
                            "===================================\n" +
                            "===================================\n" +
                            "Ali                     20\n" +
                            "  2000.00\n" +
                            "===================================\n" +
                            "===================================\n" +
                            "Raza                    30\n" +
                            "  2500.00\n" +
                            "===================================\n" +
                            "===================================\n" +
                            "Jaffer                  40\n" +
                            "  4000.00\n" +
                            "===================================\n")
                    .withHtml("<h2>Define a Pagination</h2>\n" +
                            "<p>What about if your report is taking more than one page? You have a solution for that, simply use <b>$%</b> or $FORMAT_PAGE_NUMBER vairable along with header as follows &minus;</p>\n")
                    .withCode("format EMPLOYEE_TOP =\n" +
                            "===================================\n" +
                            "Name                    Age Page @&lt;\n" +
                            "                                 $%\n" +
                            "===================================                               \n" +
                            ".\n")
                    .withHtml("<p>Now your output will look like as follows &minus;</p>\n")
                    .withCode("===================================\n" +
                            "Name                    Age Page 1\n" +
                            "===================================\n" +
                            "===================================\n" +
                            "Ali                     20\n" +
                            "  2000.00\n" +
                            "===================================\n" +
                            "===================================\n" +
                            "Raza                    30\n" +
                            "  2500.00\n" +
                            "===================================\n" +
                            "===================================\n" +
                            "Jaffer                  40\n" +
                            "  4000.00\n" +
                            "===================================\n")
                    .withHtml("<h2>Number of Lines on a Page</h2>\n" +
                            "<p>You can set the number of lines per page using special variable <b>$=</b> ( or $FORMAT_LINES_PER_PAGE ), By default $= will be 60.</p>\n" +
                            "<h2>Define a Report Footer</h2>\n" +
                            "<p>While $^ or $FORMAT_TOP_NAME contains the name of the current header format, there is no corresponding mechanism to automatically do the same thing for a footer. If you have a fixed-size footer, you can get footers by checking variable $- or $FORMAT_LINES_LEFT before each write() and print the footer yourself if necessary using another format defined as follows &minus;</p>\n")
                    .withCode("format EMPLOYEE_BOTTOM =\n" +
                            "End of Page @&lt;\n" +
                            "            $%\n" +
                            ".\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .into(textView);
        } else if (category.equals(categories[15])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h1>Perl - File I/O</h1>\n")
                    .withHtml("<p>The basics of handling files are simple: you associate a <b>filehandle</b> with an external entity (usually a file) and then use a variety of operators and functions within Perl to read and update the data stored within the data stream associated with the filehandle.</p>\n" +
                            "<p>A filehandle is a named internal Perl structure that associates a physical file with a name. All filehandles are capable of read/write access, so you can read from and update any file or device associated with a filehandle. However, when you associate a filehandle, you can specify the mode in which the filehandle is opened.</p>\n" +
                            "<p>Three basic file handles are - <b>STDIN</b>, <b>STDOUT</b>, and <b>STDERR,</b> which represent standard input, standard output and standard error devices respectively.</p>\n" +
                            "<h2>Opening and Closing Files</h2>\n" +
                            "<p>There are following two functions with multiple forms, which can be used to open any new or existing file in Perl.</p>\n")
                    .withCode("open FILEHANDLE, EXPR\n" +
                            "open FILEHANDLE\n" +
                            "\n" +
                            "sysopen FILEHANDLE, FILENAME, MODE, PERMS\n" +
                            "sysopen FILEHANDLE, FILENAME, MODE\n")
                    .withHtml("<p>Here FILEHANDLE is the file handle returned by the <b>open</b> function and EXPR is the expression having file name and mode of opening the file.</p>\n" +
                            "<h2>Open Function</h2>\n" +
                            "<p>Following is the syntax to open <b>file.txt</b> in read-only mode. Here less than &lt; sign indicates that file has to be opend in read-only mode.</p>\n")
                    .withCode("open(DATA, \"&lt;file.txt\");\n")
                    .withHtml("<p>Here DATA is the file handle, which will be used to read the file. Here is the example, which will open a file and will print its content over the screen.</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "open(DATA, \"&lt;file.txt\") or die \"Couldn't open file file.txt, $!\";\n" +
                            "\n" +
                            "while(&lt;DATA&gt;) {\n" +
                            "   print \"$_\";\n" +
                            "}\n")
                    .withHtml("<p>Following is the syntax to open file.txt in writing mode. Here less than &gt; sign indicates that file has to be opend in the writing mode.</p>\n")
                    .withCode("open(DATA, \"&gt;file.txt\") or die \"Couldn't open file file.txt, $!\";\n")
                    .withHtml("<p>This example actually truncates (empties) the file before opening it for writing, which may not be the desired effect. If you want to open a file for reading and writing, you can put a plus sign before the &gt; or &lt; characters.</p>\n" +
                            "<p>For example, to open a file for updating without truncating it &minus;</p>\n")
                    .withCode("open(DATA, \"+&lt;file.txt\"); or die \"Couldn't open file file.txt, $!\";")
                    .withHtml("<p>To truncate the file first &minus;</p>\n")
                    .withCode("open DATA, \"+&gt;file.txt\" or die \"Couldn't open file file.txt, $!\";\n")
                    .withHtml("<p>You can open a file in the append mode. In this mode, writing point will be set to the end of the file.</p>")
                    .withCode("open(DATA,\"&gt;&gt;file.txt\") || die \"Couldn't open file file.txt, $!\";")
                    .withHtml("<p>A double &gt;&gt; opens the file for appending, placing the file pointer at the end, so that you can immediately start appending information. However, you can't read from it unless you also place a plus sign in front of it &minus;</p>\n")
                    .withCode("open(DATA,\"+&gt;&gt;file.txt\") || die \"Couldn't open file file.txt, $!\";\n")
                    .withHtml("<p>Following is the table, which gives the possible values of different modes</p>\n")
                    .withHtml("<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;width:10%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Entities &amp; Definition</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>&lt; or r</b></p>\n" +
                            "<p>Read Only Access</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>&gt; or w</b></p>\n" +
                            "<p>Creates, Writes, and Truncates</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>&gt;&gt; or a</b></p>\n" +
                            "<p>Writes, Appends, and Creates</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">4</td>\n" +
                            "<td><p><b>+&lt; or r+</b></p>\n" +
                            "<p>Reads and Writes</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">5</td>\n" +
                            "<td><p><b>+&gt; or w+</b></p>\n" +
                            "<p>Reads, Writes, Creates, and Truncates</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">6</td>\n" +
                            "<td><p><b>+&gt;&gt; or a+</b></p>\n" +
                            "<p>Reads, Writes, Appends, and Creates</p></td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h2>Sysopen Function</h2>\n" +
                            "<p>The <b>sysopen</b> function is similar to the main open function, except that it uses the system <b>open()</b> function, using the parameters supplied to it as the parameters for the system function &minus;</p>\n" +
                            "<p>For example, to open a file for updating, emulating the <b>+&lt;filename</b> format from open &minus;</p>\n")
                    .withCode("sysopen(DATA, \"file.txt\", O_RDWR);")
                    .withHtml("<p>Or to truncate the file before updating &minus;</p>\n")
                    .withCode("sysopen(DATA, \"file.txt\", O_RDWR|O_TRUNC );\n")
                    .withHtml("<p>You can use O_CREAT to create a new file and O_WRONLY- to open file in write only mode and O_RDONLY - to open file in read only mode.</p>\n" +
                            "<p>The <b>PERMS</b> argument specifies the file permissions for the file specified, if it has to be created. By default it takes <b>0x666</b>.</p>\n" +
                            "<p>Following is the table, which gives the possible values of MODE.</p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;width:5%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Entities &amp; Definition</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>O_RDWR</b></p>\n" +
                            "<p>Read and Write</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>O_RDONLY</b></p>\n" +
                            "<p>Read Only</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>O_WRONLY</b></p>\n" +
                            "<p>Write Only</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">4</td>\n" +
                            "<td><p><b>O_CREAT</b></p>\n" +
                            "<p>Create the file</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">5</td>\n" +
                            "<td><p><b>O_APPEND</b></p>\n" +
                            "<p>Append the file</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">6</td>\n" +
                            "<td><p><b>O_TRUNC</b></p>\n" +
                            "<p>Truncate the file</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">7</td>\n" +
                            "<td><p><b>O_EXCL</b></p>\n" +
                            "<p>Stops if file already exists</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">8</td>\n" +
                            "<td><p><b>O_NONBLOCK</b></p>\n" +
                            "<p>Non-Blocking usability</p></td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h2>Close Function</h2>\n" +
                            "<p>To close a filehandle, and therefore disassociate the filehandle from the corresponding file, you use the <b>close</b> function. This flushes the filehandle's buffers and closes the system's file descriptor.</p>\n")
                    .withCode("close FILEHANDLE\n" +
                            "close\n")
                    .withHtml("<p>If no FILEHANDLE is specified, then it closes the currently selected filehandle. It returns true only if it could successfully flush the buffers and close the file.</P>\n")
                    .withCode("close(DATA) || die \"Couldn't close file properly\";\n")
                    .withHtml("<h2>Reading and Writing Files</h2>\n" +
                            "<p>Once you have an open filehandle, you need to be able to read and write information. There are a number of different ways of reading and writing data into the file.</p>\n" +
                            "<h2>The &lt;FILEHANDL&gt; Operator</h2>\n" +
                            "<p>The main method of reading the information from an open filehandle is the &lt;FILEHANDLE&gt; operator. In a scalar context, it returns a single line from the filehandle. For example &minus;</P>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "print \"What is your name?\\n\";\n" +
                            "$name = &lt;STDIN&gt;;\n" +
                            "print \"Hello $name\\n\";\n")
                    .withHtml("<p>When you use the &lt;FILEHANDLE&gt; operator in a list context, it returns a list of lines from the specified filehandle. For example, to import all the lines from a file into an array &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "open(DATA,\"&lt;import.txt\") or die \"Can't open data\";\n" +
                            "@lines = &lt;DATA&gt;;\n" +
                            "close(DATA);\n")
                    .withHtml("<h2>getc Function</h2>\n" +
                            "<p>The getc function returns a single character from the specified FILEHANDLE, or STDIN if none is specified &minus;</p>\n")
                    .withCode("getc FILEHANDLE\n" +
                            "getc")
                    .withHtml("<p>If there was an error, or the filehandle is at end of file, then undef is returned instead.</p>\n" +
                            "<h2>read Function</h2>\n" +
                            "<p>The read function reads a block of information from the buffered filehandle: This function is used to read binary data from the file.</p>\n")
                    .withCode("read FILEHANDLE, SCALAR, LENGTH, OFFSET\n" +
                            "read FILEHANDLE, SCALAR, LENGTH\n")
                    .withHtml("<p>The length of the data read is defined by LENGTH, and the data is placed at the start of SCALAR if no OFFSET is specified. Otherwise data is placed after OFFSET bytes in SCALAR. The function returns the number of bytes read on success, zero at end of file, or undef if there was an error.</p>\n" +
                            "<h2>print Function</h2>\n" +
                            "<p>For all the different methods used for reading information from filehandles, the main function for writing information back is the print function.</p>\n")
                    .withCode("print FILEHANDLE LIST\n" +
                            "print LIST\n" +
                            "print\n")
                    .withHtml("<p>The print function prints the evaluated value of LIST to FILEHANDLE, or to the current output filehandle (STDOUT by default). For example &minus;</p>\n")
                    .withCode("print \"Hello World!\\n\";\n")
                    .withHtml("<h2>Copying Files</h2>\n" +
                            "<p>Here is the example, which opens an existing file file1.txt and read it line by line and generate another copy file file2.txt.</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "# Open file to read\n" +
                            "open(DATA1, \"&lt;file1.txt\");\n" +
                            "\n" +
                            "# Open new file to write\n" +
                            "open(DATA2, \"&gt;file2.txt\");\n" +
                            "\n" +
                            "# Copy data from one file to another.\n" +
                            "while(&lt;DATA1&gt;) {\n" +
                            "   print DATA2 $_;\n" +
                            "}\n" +
                            "close( DATA1 );\n" +
                            "close( DATA2 );\n")
                    .withHtml("<h2>Renaming a file</h2>\n" +
                            "<p>Here is an example, which shows how we can rename a file file1.txt to file2.txt. Assuming file is available in /usr/test directory.</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "rename (\"/usr/test/file1.txt\", \"/usr/test/file2.txt\" );\n")
                    .withHtml("<p>This function <b>renames</b> takes two arguments and it just renames the existing file.</p>\n" +
                            "<h2>Deleting an Existing File</h2>\n" +
                            "<p>Here is an example, which shows how to delete a file file1.txt using the <b>unlink</b> function.</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "unlink (\"/usr/test/file1.txt\");\n" +
                            "</pre>\n")
                    .withHtml("<h2>Positioning inside a File</h2>\n" +
                            "<p>You can use to <b>tell</b> function to know the current position of a file and <b>seek</b> function to point a particular position inside the file.</p>\n" +
                            "<h3>tell Function</h3>\n" +
                            "<p>The first requirement is to find your position within a file, which you do using the tell function &minus;</p>\n")
                    .withCode("tell FILEHANDLE\n" +
                            "tell\n")
                    .withHtml("<p>This returns the position of the file pointer, in bytes, within FILEHANDLE if specified, or the current default selected filehandle if none is specified.</p>\n" +
                            "<h3>seek Function</h3>\n" +
                            "<p>The seek function positions the file pointer to the specified number of bytes within a file &minus;</p>\n")
                    .withCode("seek FILEHANDLE, POSITION, WHENCE\n")
                    .withHtml("<p>The function uses the fseek system function, and you have the same ability to position relative to three different points: the start, the end, and the current position. You do this by specifying a value for WHENCE.</p>\n" +
                            "<p>Zero sets the positioning relative to the start of the file. For example, the line sets the file pointer to the 256th byte in the file.</p>\n")
                    .withCode("seek DATA, 256, 0;\n")
                    .withHtml("<h2>File Information</h2>\n" +
                            "<p>You can test certain features very quickly within Perl using a series of test operators known collectively as -X tests. For example, to perform a quick test of the various permissions on a file, you might use a script like this &minus;</p>\n")
                    .withCode("#/usr/bin/perl\n" +
                            "\n" +
                            "my $file = \"/usr/test/file1.txt\";\n" +
                            "my (@description, $size);\n" +
                            "if (-e $file) {\n" +
                            "   push @description, 'binary' if (-B _);\n" +
                            "   push @description, 'a socket' if (-S _);\n" +
                            "   push @description, 'a text file' if (-T _);\n" +
                            "   push @description, 'a block special file' if (-b _);\n" +
                            "   push @description, 'a character special file' if (-c _);\n" +
                            "   push @description, 'a directory' if (-d _);\n" +
                            "   push @description, 'executable' if (-x _);\n" +
                            "   push @description, (($size = -s _)) ? \"$size bytes\" : 'empty';\n" +
                            "   print \"$file is \", join(', ',@description),\"\\n\";\n" +
                            "}\n")
                    .withHtml("<p>Here is the list of features, which you can check for a file or directory &minus;</p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;width:5%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Operator &amp; Definition</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>-A</b></p>\n" +
                            "<p>Script start time minus file last access time, in days.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>-B</b></p>\n" +
                            "<p>Is it a binary file?</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>-C</b></p>\n" +
                            "<p>Script start time minus file last inode change time, in days.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>-M</b></p>\n" +
                            "<p>Script start time minus file modification time, in days.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">4</td>\n" +
                            "<td><p><b>-O</b></p>\n" +
                            "<p>Is the file owned by the real user ID?</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">5</td>\n" +
                            "<td><p><b>-R</b></p>\n" +
                            "<p>Is the file readable by the real user ID or real group?</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">6</td>\n" +
                            "<td><p><b>-S</b></p>\n" +
                            "<p>Is the file a socket?</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">7</td>\n" +
                            "<td><p><b>-T</b></p>\n" +
                            "<p>Is it a text file?</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">8</td>\n" +
                            "<td><p><b>-W</b></p>\n" +
                            "<p>Is the file writable by the real user ID or real group?</p></td></tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">9</td>\n" +
                            "<td><p><b>-X</b></p>\n" +
                            "<p>Is the file executable by the real user ID or real group?</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">10</td>\n" +
                            "<td><p><b>-b</b></p>\n" +
                            "<p>Is it a block special file?</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">11</td>\n" +
                            "<td><p><b>-c</b></p>\n" +
                            "<p>Is it a character special file?</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">12</td>\n" +
                            "<td><p><b>-d</b></p>\n" +
                            "<p>Is the file a directory?</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">13</td>\n" +
                            "<td><p><b>-e</b></p>\n" +
                            "<p>Does the file exist?</p></td></tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">14</td>\n" +
                            "<td><p><b>-f</b></p>\n" +
                            "<p>Is it a plain file?</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">15</td>\n" +
                            "<td><p><b>-g</b></p>\n" +
                            "<p>Does the file have the setgid bit set?</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">16</td>\n" +
                            "<td><p><b>-k</b></p>\n" +
                            "<p>Does the file have the sticky bit set?</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">17</td>\n" +
                            "<td><p><b>-l</b></p>\n" +
                            "<p>Is the file a symbolic link?</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">18</td>\n" +
                            "<td><p><b>-o</b></p>\n" +
                            "<p>Is the file owned by the effective user ID?</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">19</td>\n" +
                            "<td><p><b>-p</b></p>\n" +
                            "<p>Is the file a named pipe?</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">20</td>\n" +
                            "<td><p><b>-r</b></p>\n" +
                            "<p>Is the file readable by the effective user or group ID?</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">21</td>\n" +
                            "<td><p><b>-s</b></p>\n" +
                            "<p>Returns the size of the file, zero size = empty file.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">22</td>\n" +
                            "<td><p><b>-t</b></p>\n" +
                            "<p>Is the filehandle opened by a TTY (terminal)?</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">23</td>\n" +
                            "<td><p><b>-u</b></p>\n" +
                            "<p>Does the file have the setuid bit set?</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">24</td>\n" +
                            "<td><p><b>-w</b></p>\n" +
                            "<p>Is the file writable by the effective user or group ID?</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">25</td>\n" +
                            "<td><p><b>-x</b></p>\n" +
                            "<p>Is the file executable by the effective user or group ID?</p></td></tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">26</td>\n" +
                            "<td><p><b>-z</b></p>\n" +
                            "<p>Is the file size zero?</p></td>\n" +
                            "</tr>\n" +
                            "</table>\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .into(textView);
        } else if (category.equals(categories[16])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h1>Perl - Directories</h1>\n")
                    .withHtml("<p>Following are the standard functions used to play with directories.</p>\n")
                    .withCode("opendir DIRHANDLE, EXPR  # To open a directory\n" +
                            "readdir DIRHANDLE        # To read a directory\n" +
                            "rewinddir DIRHANDLE      # Positioning pointer to the begining\n" +
                            "telldir DIRHANDLE        # Returns current position of the dir\n" +
                            "seekdir DIRHANDLE, POS   # Pointing pointer to POS inside dir\n" +
                            "closedir DIRHANDLE       # Closing a directory.\n")
                    .withHtml("<h2>Display all the Files</h2>\n" +
                            "<p>There are various ways to list down all the files available in a particular directory. First let's use the simple way to get and list down all the files using the <b>glob</b> operator &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "# Display all the files in /tmp directory.\n" +
                            "$dir = \"/tmp/*\";\n" +
                            "my @files = glob( $dir );\n" +
                            "\n" +
                            "foreach (@files ) {\n" +
                            "   print $_ . \"\\n\";\n" +
                            "}\n" +
                            "\n" +
                            "# Display all the C source files in /tmp directory.\n" +
                            "$dir = \"/tmp/*.c\";\n" +
                            "@files = glob( $dir );\n" +
                            "\n" +
                            "foreach (@files ) {\n" +
                            "   print $_ . \"\\n\";\n" +
                            "}\n" +
                            "\n" +
                            "# Display all the hidden files.\n" +
                            "$dir = \"/tmp/.*\";\n" +
                            "@files = glob( $dir );\n" +
                            "foreach (@files ) {\n" +
                            "   print $_ . \"\\n\";\n" +
                            "}\n" +
                            "\n" +
                            "# Display all the files from /tmp and /home directories.\n" +
                            "$dir = \"/tmp/* /home/*\";\n" +
                            "@files = glob( $dir );\n" +
                            "\n" +
                            "foreach (@files ) {\n" +
                            "   print $_ . \"\\n\";\n" +
                            "}\n")
                    .withHtml("<p>Here is another example, which opens a directory and list out all the files available inside this directory.</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "opendir (DIR, '.') or die \"Couldn't open directory, $!\";\n" +
                            "while ($file = readdir DIR) {\n" +
                            "   print \"$file\\n\";\n" +
                            "}\n" +
                            "closedir DIR;\n")
                    .withHtml("<p>One more example to print the list of C source files you might use is &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "opendir(DIR, '.') or die \"Couldn't open directory, $!\";\n" +
                            "foreach (sort grep(/^.*\\.c$/,readdir(DIR))) {\n" +
                            "   print \"$_\\n\";\n" +
                            "}\n" +
                            "closedir DIR;\n")
                    .withHtml("<h2>Create new Directory</h2>\n" +
                            "<p>You can use <b>mkdir</b> function to create a new directory. You will need to have the required permission to create a directory.</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "$dir = \"/tmp/perl\";\n" +
                            "\n" +
                            "# This creates perl directory in /tmp directory.\n" +
                            "mkdir( $dir ) or die \"Couldn't create $dir directory, $!\";\n" +
                            "print \"Directory created successfully\\n\";\n")
                    .withHtml("<h2>Remove a directory</h2>\n" +
                            "<p>You can use <b>rmdir</b> function to remove a directory. You will need to have the required permission to remove a directory. Additionally this directory should be empty before you try to remove it.</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "$dir = \"/tmp/perl\";\n" +
                            "\n" +
                            "# This removes perl directory from /tmp directory.\n" +
                            "rmdir( $dir ) or die \"Couldn't remove $dir directory, $!\";\n" +
                            "print \"Directory removed successfully\\n\";\n")
                    .withHtml("<h2>Change a Directory</h2>\n" +
                            "<p>You can use <b>chdir</b> function to change a directory and go to a new location. You will need to have the required permission to change a directory and go inside the new directory.</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "$dir = \"/home\";\n" +
                            "\n" +
                            "# This changes perl directory  and moves you inside /home directory.\n" +
                            "chdir( $dir ) or die \"Couldn't go inside $dir directory, $!\";\n" +
                            "print \"Your new location is $dir\\n\";\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .into(textView);
        } else if (category.equals(categories[17])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h1>Perl - Error Handling</h1>\n")
                    .withHtml("<p>The execution and the errors always go together. If you are opening a file which does not exist. then if you did not handle this situation properly then your program is considered to be of bad quality.</p>\n" +
                            "<p>The program stops if an error occurs. So a proper error handling is used to handle various type of errors, which may occur during a program execution and take appropriate action instead of halting program completely.</p>\n" +
                            "<p>You can identify and trap an error in a number of different ways. Its very easy to trap errors in Perl and then handling them properly. Here are few methods which can be used.</p>\n" +
                            "<h2>The if statement</h2>\n" +
                            "<p>The <b>if statement</b> is the obvious choice when you need to check the return value from a statement; for example &minus;</p>\n")
                    .withCode("if(open(DATA, $file)) {\n" +
                            "   ...\n" +
                            "} else {\n" +
                            "   die \"Error: Couldn't open the file - $!\";\n" +
                            "}\n")
                    .withHtml("<p>Here variable $! returns the actual error message. Alternatively, we can reduce the statement to one line in situations where it makes sense to do so; for example &minus;</p>\n")
                    .withCode("open(DATA, $file) || die \"Error: Couldn't open the file $!\";")
                    .withHtml("<h2>The unless Function</h2>\n" +
                            "<p>The <b>unless</b> function is the logical opposite to if: statements can completely bypass the success status and only be executed if the expression returns false. For example &minus;</p>\n")
                    .withCode("unless(chdir(\"/etc\")) {\n" +
                            "   die \"Error: Can't change directory - $!\";\n" +
                            "}\n")
                    .withHtml("<p>The <b>unless</b> statement is best used when you want to raise an error or alternative only if the expression fails. The statement also makes sense when used in a single-line statement &minus;</p>\n")
                    .withCode("die \"Error: Can't change directory!: $!\" unless(chdir(\"/etc\"));\n")
                    .withHtml("<p>Here we die only if the chdir operation fails, and it reads nicely.</p>\n" +
                            "<h2>The ternary Operator</h2>\n" +
                            "<p>For very short tests, you can use the conditional operator <b>?:</b></p>\n")
                    .withCode("print(exists($hash{value}) ? 'There' : 'Missing',\"\\n\");")
                    .withHtml("<p>It's not quite so clear here what we are trying to achieve, but the effect is the same as using an <b>if</b> or <b>unless</b> statement. The conditional operator is best used when you want to quickly return one of the two values within an expression or statement.</p>\n" +
                            "<h2>The warn Function</h2>\n" +
                            "<p>The warn function just raises a warning, a message is printed to STDERR, but no further action is taken. So it is more useful if you just want to print a warning for the user and proceed with rest of the operation &minus;</P>\n")
                    .withCode("chdir('/etc') or warn \"Can't change directory\";\n")
                    .withHtml("<h2>The die Function</h2>\n" +
                            "<p>The die function works just like warn, except that it also calls exit. Within a normal script, this function has the effect of immediately terminating execution. You should use this function in case it is useless to proceed if there is an error in the program &minus;</p>\n")
                    .withCode("chdir('/etc') or die \"Can't change directory\";\n")
                    .withHtml("<h2>Errors within Modules</h2>\n" +
                            "<p>There are two different situations we should be able to handle &minus;</p>\n" +
                            "<ul class=\"list\">\n" +
                            "<li><p>Reporting an error in a module that quotes the module's filename and line number - this is useful when debugging a module, or when you specifically want to raise a module-related, rather than script-related, error.</p></li>\n" +
                            "<li><p>Reporting an error within a module that quotes the caller's information so that you can debug the line within the script that caused the error. Errors raised in this fashion are useful to the end-user, because they highlight the error in relation to the calling script's origination line.</p></li>\n" +
                            "</ul>\n" +
                            "<p>The <b>warn</b> and <b>die</b> functions work slightly differently than you would expect when called from within a module. For example, the simple module &minus;</p>\n")
                    .withCode("package T;\n" +
                            "\n" +
                            "require Exporter;\n" +
                            "@ISA = qw/Exporter/;\n" +
                            "@EXPORT = qw/function/;\n" +
                            "use Carp;\n" +
                            "\n" +
                            "sub function {\n" +
                            "   warn \"Error in module!\";\n" +
                            "}\n" +
                            "1;\n")
                    .withHtml("<p>When called from a script like below &minus;</p>\n")
                    .withCode("use T;\n" +
                            "function();")
                    .withHtml("<p>It will produce the following result &minus;</p>\n")
                    .withCode("Error in module! at T.pm line 9.\n")
                    .withHtml("<p>This is more or less what you might expected, but not necessarily what you want. From a module programmer's perspective, the information is useful because it helps to point to a bug within the module itself. For an end-user, the information provided is fairly useless, and for all but the hardened programmer, it is completely pointless.</p>\n" +
                            "<p>The solution for such problems is the Carp module, which provides a simplified method for reporting errors within modules that return information about the calling script. The Carp module provides four functions: carp, cluck, croak, and confess. These functions are discussed below.</p>\n" +
                            "<h2>The carp Function</h2>\n" +
                            "<p>The carp function is the basic equivalent of warn and prints the message to STDERR without actually exiting the script and printing the script name.</p>\n")
                    .withCode("package T;\n" +
                            "\n" +
                            "require Exporter;\n" +
                            "@ISA = qw/Exporter/;\n" +
                            "@EXPORT = qw/function/;\n" +
                            "use Carp;\n" +
                            "\n" +
                            "sub function {\n" +
                            "   carp \"Error in module!\";\n" +
                            "}\n" +
                            "1;\n")
                    .withHtml("<p>When called from a script like below &minus;</p>\n")
                    .withCode("use T;\n" +
                            "function();")
                    .withHtml("<p>It will produce the following result &minus;</p>\n")
                    .withCode("Error in module! at test.pl line 4\n")
                    .withHtml("<h2>The cluck Function</h2>\n" +
                            "<p>The cluck function is a sort of supercharged carp, it follows the same basic principle but also prints a stack trace of all the modules that led to the function being called, including the information on the original script.</p>\n")
                    .withCode("package T;\n" +
                            "\n" +
                            "require Exporter;\n" +
                            "@ISA = qw/Exporter/;\n" +
                            "@EXPORT = qw/function/;\n" +
                            "use Carp qw(cluck);\n" +
                            "\n" +
                            "sub function {\n" +
                            "   cluck \"Error in module!\";\n" +
                            "}\n" +
                            "1;\n")
                    .withHtml("<p>When called from a script like below &minus;</p>\n")
                    .withCode("use T;\n" +
                            "function();\n")
                    .withHtml("<p>It will produce the following result &minus;</p>\n")
                    .withCode("Error in module! at T.pm line 9\n" +
                            "   T::function() called at test.pl line 4\n")
                    .withHtml("<h2>The croak Function</h2>\n" +
                            "<p>The <b>croak</b> function is equivalent to <b>die</b>, except that it reports the caller one level up. Like die, this function also exits the script after reporting the error to STDERR &minus;</p>\n")
                    .withCode("package T;\n" +
                            "\n" +
                            "require Exporter;\n" +
                            "@ISA = qw/Exporter/;\n" +
                            "@EXPORT = qw/function/;\n" +
                            "use Carp;\n" +
                            "\n" +
                            "sub function {\n" +
                            "   croak \"Error in module!\";\n" +
                            "}\n" +
                            "1;\n")
                    .withHtml("<p>When called from a script like below &minus;</p>\n")
                    .withCode("use T;\n" +
                            "function();\n")
                    .withHtml("<p>It will produce the following result &minus;</p>\n")
                    .withCode("Error in module! at test.pl line 4\n")
                    .withHtml("<p>As with carp, the same basic rules apply regarding the including of line and file information according to the warn and die functions.</p>\n" +
                            "<h2>The confess Function</h2>\n" +
                            "<p>The <b>confess</b> function is like <b>cluck</b>; it calls die and then prints a stack trace all the way up to the origination script.</p>\n")
                    .withHtml("package T;\n" +
                            "\n" +
                            "require Exporter;\n" +
                            "@ISA = qw/Exporter/;\n" +
                            "@EXPORT = qw/function/;\n" +
                            "use Carp;\n" +
                            "\n" +
                            "sub function {\n" +
                            "   confess \"Error in module!\";\n" +
                            "}\n" +
                            "1;\n")
                    .withHtml("<p>When called from a script like below &minus;</p>\n")
                    .withHtml("use T;\n" +
                            "function();\n")
                    .withHtml("<p>It will produce the following result &minus;</p>\n")
                    .withHtml("Error in module! at T.pm line 9\n" +
                            "   T::function() called at test.pl line 4\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .into(textView);
        } else if (category.equals(categories[18])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h1>Perl - Special Variables</h1>\n")
                    .withHtml("<p>There are some variables which have a predefined and special meaning in Perl. They are the variables that use punctuation characters after the usual variable indicator ($, @, or %), such as $_ ( explained below ).</p>\n" +
                            "<p>Most of the special variables have an english like long name, e.g., Operating System Error variable $! can be written as $OS_ERROR. But if you are going to use english like names, then you would have to put one line <b>use English;</b> at the top of your program file. This guides the interpreter to pickup exact meaning of the variable.</p>\n" +
                            "<p>The most commonly used special variable is $_, which contains the default input and pattern-searching string. For example, in the following lines &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "foreach ('hickory','dickory','doc') {\n" +
                            "   print $_;\n" +
                            "   print \"\\n\";\n" +
                            "}\n")
                    .withHtml("<p>When executed, this will produce the following result &minus;</p>\n")
                    .withCode("hickory\n" +
                            "dickory\n" +
                            "doc\n")
                    .withHtml("<p>Again, let's check the same example without using $_ variable explicitly &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "foreach ('hickory','dickory','doc') {\n" +
                            "   print;\n" +
                            "   print \"\\n\";\n" +
                            "}\n")
                    .withHtml("<p>When executed, this will also produce the following result &minus;</p>\n")
                    .withCode("hickory\n" +
                            "dickory\n" +
                            "doc\n")
                    .withHtml("<p>The first time the loop is executed, \"hickory\" is printed. The second time around, \"dickory\" is printed, and the third time, \"doc\" is printed. That's because in each iteration of the loop, the current string is placed in $_, and is used by default by print. Here are the places where Perl will assume $_ even if you don't specify it &minus;</p>\n" +
                            "<ul class=\"list\">\n" +
                            "<li><p>Various unary functions, including functions like ord and int, as well as the all file tests (-f, -d) except for -t, which defaults to STDIN.</p></li>\n" +
                            "<li><p>Various list functions like print and unlink.</p></li>\n" +
                            "<li><p>The pattern-matching operations m//, s///, and tr/// when used without an =~ operator.</p></li>\n" +
                            "<li><p>The default iterator variable in a foreach loop if no other variable is supplied.</p></li>\n" +
                            "<li><p>The implicit iterator variable in the grep and map functions.</p></li>\n" +
                            "<li><p>The default place to put an input record when a line-input operation's result is tested by itself as the sole criterion of a while test (i.e., ). Note that outside of a while test, this will not happen.</p></li>\n" +
                            "</ul>\n" +
                            "<h2>Special Variable Types</h2>\n" +
                            "<p>Based on the usage and nature of special variables, we can categorize them in the following categories &minus;</p>\n" +
                            "<ul class=\"list\">\n" +
                            "<li>Global Scalar Special Variables.</li>\n" +
                            "<li>Global Array Special Variables.</li>\n" +
                            "<li>Global Hash Special Variables.</li>\n" +
                            "<li>Global Special Filehandles.</li>\n" +
                            "<li>Global Special Constants.</li>\n" +
                            "<li>Regular Expression Special Variables.</li>\n" +
                            "<li>Filehandle Special Variables.</li>\n" +
                            "</ul>\n" +
                            "<h2>Global Scalar Special Variables</h2>\n" +
                            "<p>Here is the list of all the scalar special variables. We have listed corresponding english like names along with the symbolic names.</p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$_</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The default input and pattern-searching space.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$ARG</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$.</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The current input line number of the last filehandle that was read. An explicit close on the filehandle resets the line number.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$NR</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$/</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The input record separator; newline by default. If set to the null string, it treats blank lines as delimiters.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$RS</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$,</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The output field separator for the print operator.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$OFS</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$\\</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The output record separator for the print operator.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$ORS</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$\"</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">Like \"$,\" except that it applies to list values interpolated into a double-quoted string (or similar interpreted string). Default is a space.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$LIST_SEPARATOR</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$;</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The subscript separator for multidimensional array emulation. Default is \"\\034\".</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$SUBSCRIPT_SEPARATOR</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$^L</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">What a format outputs to perform a formfeed. Default is \"\\f\".\n" +
                            "</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$FORMAT_FORMFEED</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$:</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The current set of characters after which a string may be broken to fill continuation fields (starting with ^) in a format. Default is \"\\n\"\".</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$FORMAT_LINE_BREAK_CHARACTERS</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$^A</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The current value of the write accumulator for format lines.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$ACCUMULATOR</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$#</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">Contains the output format for printed numbers (deprecated).</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$OFMT</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$?</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The status returned by the last pipe close, backtick (``) command, or system operator.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$CHILD_ERROR</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$!</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">If used in a numeric context, yields the current value of the errno variable, identifying the last system call error. If used in a string context, yields the corresponding system error string.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$OS_ERROR or $ERRNO</td></tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$@</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The Perl syntax error message from the last eval command.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$EVAL_ERROR\n" +
                            "</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$$</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The pid of the Perl process running this script.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$PROCESS_ID or $PID</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$&lt;</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The real user ID (uid) of this process.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$REAL_USER_ID or $UID</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$&gt;</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The effective user ID of this process.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$EFFECTIVE_USER_ID or $EUID</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$(</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The real group ID (gid) of this process.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$REAL_GROUP_ID or $GID</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$)</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The effective gid of this process.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$EFFECTIVE_GROUP_ID or $EGID</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$0</td>\n" +
                            "<td>Contains the name of the file containing the Perl script being executed.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$PROGRAM_NAME</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$[</td>\n" +
                            "<td>The index of the first element in an array and of the first character in a substring. Default is 0.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$]</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">Returns the version plus patchlevel divided by 1000.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$PERL_VERSION</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$^D</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The current value of the debugging flags.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$DEBUGGING</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$^E</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">Extended error message on some platforms.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$EXTENDED_OS_ERROR</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$^F</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The maximum system file descriptor, ordinarily 2.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$SYSTEM_FD_MAX</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$^H</td>\n" +
                            "<td>Contains internal compiler hints enabled by certain pragmatic modules.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$^I</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The current value of the inplace-edit extension. Use undef to disable inplace editing.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$INPLACE_EDIT</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$^M</td>\n" +
                            "<td>The contents of $M can be used as an emergency memory pool in case Perl dies with an out-of-memory error. Use of $M requires a special compilation of Perl. See the INSTALL document for more information.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$^O</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">Contains the name of the operating system that the current Perl binary was compiled for.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$OSNAME</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$^P</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The internal flag that the debugger clears so that it doesn't debug itself.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$PERLDB</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$^T</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The time at which the script began running, in seconds since the epoch.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$BASETIME</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$^W</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The current value of the warning switch, either true or false.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$WARNING</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$^X</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The name that the Perl binary itself was executed as.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$EXECUTABLE_NAME</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$ARGV</td>\n" +
                            "<td>Contains the name of the current file when reading from &lt;ARGV&gt;.\n" +
                            "</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h2>Global Array Special Variables</h2>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">@ARGV</td>\n" +
                            "<td width=\"70%\">The array containing the command-line arguments intended for the script.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">@INC</td>\n" +
                            "<td>The array containing the list of places to look for Perl scripts to be evaluated by the do, require, or use constructs.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">@F</td>\n" +
                            "<td>The array into which the input lines are split when the -a command-line switch is given.</td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h2>Global Hash Special Variables</h2>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">%INC</td>\n" +
                            "<td width=\"70%\">The hash containing entries for the filename of each file that has been included via do or require.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">%ENV</td>\n" +
                            "<td>The hash containing your current environment.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">%SIG</td>\n" +
                            "<td>The hash used to set signal handlers for various signals.</td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h2>Global Special Filehandles</h2>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">ARGV</td>\n" +
                            "<td>The special filehandle that iterates over command line filenames in @ARGV. Usually written as the null filehandle in &lt;&gt;.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">STDERR</td>\n" +
                            "<td>The special filehandle for standard error in any package.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">STDIN</td>\n" +
                            "<td>The special filehandle for standard input in any package.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">STDOUT</td>\n" +
                            "<td>The special filehandle for standard output in any package.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">DATA</td>\n" +
                            "<td>The special filehandle that refers to anything following the __END__ token in the file containing the script. Or, the special filehandle for anything following the __DATA__ token in a required file, as long as you're reading data in the same package __DATA__ was found in.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">_ (underscore)</td>\n" +
                            "<td>The special filehandle used to cache the information from the last stat, lstat, or file test operator.</td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h2>Global Special Constants</h2>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">__END__</td>\n" +
                            "<td width=\"70%\">Indicates the logical end of your program. Any following text is ignored, but may be read via the DATA filehandle.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">__FILE__</td>\n" +
                            "<td>Represents the filename at the point in your program where it's used. Not interpolated into strings.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">__LINE__</td>\n" +
                            "<td>Represents the current line number. Not interpolated into strings.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">__PACKAGE__</td>\n" +
                            "<td>Represents the current package name at compile time, or undefined if there is no current package. Not interpolated into strings.</td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h2>Regular Expression Special Variables</h2>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$digit</td>\n" +
                            "<td width=\"70%\">Contains the text matched by the corresponding set of parentheses in the last pattern matched. For example, $1 matches whatever was contained in the first set of parentheses in the previous regular expression.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$&amp;</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The string matched by the last successful pattern match.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$MATCH</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$`</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The string preceding whatever was matched by the last successful pattern match.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$PREMATCH</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$'</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The string following whatever was matched by the last successful pattern match.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$POSTMATCH</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$+</td>\n" +
                            "<td rowspan=\"2\">The last bracket matched by the last search pattern. This is useful if you don't know which of a set of alternative patterns was matched. For example : /Version: (.*)|Revision: (.*)/ &amp;&amp; ($rev = $+);</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$LAST_PAREN_MATCH</td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h2>Filehandle Special Variables</h2>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$|</td>\n" +
                            "<td style=\"vertical-align:middle;width:70%\" rowspan=\"2\">If set to nonzero, forces an fflush(3) after every write or print on the currently selected output channel.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$OUTPUT_AUTOFLUSH</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$%</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The current page number of the currently selected output channel.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$FORMAT_PAGE_NUMBER</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$=</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">\n" +
                            "The current page length (printable lines) of the currently selected output channel. Default is 60.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$FORMAT_LINES_PER_PAGE</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$-</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The number of lines left on the page of the currently selected output channel.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$FORMAT_LINES_LEFT</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$~</td>\n" +
                            "<td style=\"vertical-align:middle;\" rowspan=\"2\">The name of the current report format for the currently selected output channel. Default is the name of the filehandle.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$FORMAT_NAME</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$^</td>\n" +
                            "<td rowspan=\"2\">The name of the current top-of-page format for the currently selected output channel. Default is the name of the filehandle with _TOP appended.</td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">$FORMAT_TOP_NAME</td>\n" +
                            "</tr>\n" +
                            "</table>\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .into(textView);
        } else if (category.equals(categories[19])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h1>Perl - Coding Standard</h1>\n")
                    .withHtml("<p>Each programmer will, of course, have his or her own preferences in regards to formatting, but there are some general guidelines that will make your programs easier to read, understand, and maintain.</p>\n" +
                            "<p>The most important thing is to run your programs under the -w flag at all times. You may turn it off explicitly for particular portions of code via the no warnings pragma or the $^W variable if you must. You should also always run under use strict or know the reason why not. The use sigtrap and even use diagnostics pragmas may also prove useful.</p>\n" +
                            "<p>Regarding aesthetics of code lay out, about the only thing Larry cares strongly about is that the closing curly bracket of a multi-line BLOCK should line up with the keyword that started the construct. Beyond that, he has other preferences that aren't so strong &minus;</p>\n" +
                            "<ul class=\"list\">\n" +
                            "<li>4-column indent.</li>\n" +
                            "<li>Opening curly on same line as keyword, if possible, otherwise line up.</li>\n" +
                            "<li>Space before the opening curly of a multi-line BLOCK.</li>\n" +
                            "<li>One-line BLOCK may be put on one line, including curlies.</li>\n" +
                            "<li>No space before the semicolon.</li>\n" +
                            "<li>Semicolon omitted in \"short\" one-line BLOCK.</li>\n" +
                            "<li>Space around most operators.</li>\n" +
                            "<li>Space around a \"complex\" subscript (inside brackets).</li>\n" +
                            "<li>Blank lines between chunks that do different things.</li>\n" +
                            "<li>Uncuddled elses.</li>\n" +
                            "<li>No space between function name and its opening parenthesis.</li>\n" +
                            "<li>Space after each comma.</li>\n" +
                            "<li>Long lines broken after an operator (except and and or).</li>\n" +
                            "<li>Space after last parenthesis matching on current line.</li>\n" +
                            "<li>Line up corresponding items vertically.</li>\n" +
                            "<li>Omit redundant punctuation as long as clarity doesn't suffer.</li>\n" +
                            "</ul>\n" +
                            "<p>Here are some other more substantive style issues to think about: Just because you CAN do something a particular way doesn't mean that you SHOULD do it that way. Perl is designed to give you several ways to do anything, so consider picking the most readable one. For instance &minus;</p>\n")
                    .withCode("open(FOO,$foo) || die \"Can't open $foo: $!\";\n")
                    .withHtml("<p>Is better than &minus;</p>\n")
                    .withCode("die \"Can't open $foo: $!\" unless open(FOO,$foo);\n")
                    .withHtml("<p>Because the second way hides the main point of the statement in a modifier. On the other hand,</p>\n")
                    .withCode("print \"Starting analysis\\n\" if $verbose;\n")
                    .withHtml("<p>Is better than &minus;</p>\n")
                    .withCode("$verbose &amp;&amp; print \"Starting analysis\\n\";\n")
                    .withHtml("<p>Because the main point isn't whether the user typed -v or not.</p>\n" +
                            "<p>Don't go through silly contortions to exit a loop at the top or the bottom, when Perl provides the last operator so you can exit in the middle. Just \"outdent\" it a little to make it more visible &minus;</p>\n")
                    .withCode("LINE:\n" +
                            "for (;;) {\n" +
                            "   statements;\n" +
                            "   last LINE if $foo;\n" +
                            "   next LINE if /^#/;\n" +
                            "   statements;\n" +
                            "}\n")
                    .withHtml("<p>Let's see few more important points &minus;</p>\n" +
                            "<ul class=\"list\">\n" +
                            "<li><p>Don't be afraid to use loop labels--they're there to enhance readability as well as to allow multilevel loop breaks. See the previous example.</p></li>\n" +
                            "<li><p>Avoid using grep() (or map()) or `backticks` in a void context, that is, when you just throw away their return values. Those functions all have return values, so use them. Otherwise use a foreach() loop or the system() function instead.</p></li>\n" +
                            "<li><p>For portability, when using features that may not be implemented on every machine, test the construct in an eval to see if it fails. If you know what version or patchlevel a particular feature was implemented, you can test $] ($PERL_VERSION in English) to see if it will be there. The Config module will also let you interrogate values determined by the Configure program when Perl was installed.</p></li>\n" +
                            "<li><p>Choose mnemonic identifiers. If you can't remember what mnemonic means, you've got a problem.</p></li>\n" +
                            "<li><p>While short identifiers like $gotit are probably ok, use underscores to separate words in longer identifiers. It is generally easier to read $var_names_like_this than $VarNamesLikeThis, especially for non-native speakers of English. It's also a simple rule that works consistently with VAR_NAMES_LIKE_THIS.</p></li>\n" +
                            "<li><p>Package names are sometimes an exception to this rule. Perl informally reserves lowercase module names for \"pragma\" modules like integer and strict. Other modules should begin with a capital letter and use mixed case, but probably without underscores due to limitations in primitive file systems' representations of module names as files that must fit into a few sparse bytes.</p></li>\n" +
                            "<li><p>If you have a really hairy regular expression, use the /x modifier and put in some whitespace to make it look a little less like line noise. Don't use slash as a delimiter when your regexp has slashes or backslashes.</p></li>\n" +
                            "<li><p>Always check the return codes of system calls. Good error messages should go to STDERR, include which program caused the problem, what the failed system call and arguments were, and (VERY IMPORTANT) should contain the standard system error message for what went wrong. Here's a simple but sufficient example &minus; </li></p>\n" +
                            "</ul>\n")
                    .withCode("opendir(D, $dir) or die \"can't opendir $dir: $!\";\n")
                    .withHtml("<ul class=\"list\">\n" +
                            "<li><p>Think about reusability. Why waste brainpower on a one-shot when you might want to do something like it again? Consider generalizing your code. Consider writing a module or object class. Consider making your code run cleanly with use strict and use warnings (or -w) in effect. Consider giving away your code. Consider changing your whole world view. Consider... oh, never mind.</p></li>\n" +
                            "<li><p>Be consistent.</p></li>\n" +
                            "<li><p>Be nice.</p></li>\n" +
                            "</ul>\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .into(textView);
        } else if (category.equals(categories[20])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h1>Perl - Regular Expressions</h1>\n")
                    .withHtml("<p>A regular expression is a string of characters that defines the pattern or patterns you are viewing. The syntax of regular expressions in Perl is very similar to what you will find within other regular expression.supporting programs, such as <b>sed</b>, <b>grep</b>, and <b>awk</b>.</p>\n" +
                            "<p>The basic method for applying a regular expression is to use the pattern binding operators =~ and <b>!</b>~. The first operator is a test and assignment operator.</P>\n" +
                            "<p>There are three regular expression operators within Perl.</p>\n" +
                            "<ul class=\"list\"> \n" +
                            "<li>Match Regular Expression - m//</li>\n" +
                            "<li>Substitute Regular Expression - s///</li>\n" +
                            "<li>Transliterate Regular Expression - tr///</li>\n" +
                            "</ul>\n" +
                            "<p>The forward slashes in each case act as delimiters for the regular expression (regex) that you are specifying. If you are comfortable with any other delimiter, then you can use in place of forward slash.</P>\n" +
                            "<h2>The Match Operator</h2>\n" +
                            "<p>The match operator, m//, is used to match a string or statement to a regular expression. For example, to match the character sequence \"foo\" against the scalar $bar, you might use a statement like this &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "$bar = \"This is foo and again foo\";\n" +
                            "if ($bar =~ /foo/) {\n" +
                            "   print \"First time is matching\\n\";\n" +
                            "} else {\n" +
                            "   print \"First time is not matching\\n\";\n" +
                            "}\n" +
                            "\n" +
                            "$bar = \"foo\";\n" +
                            "if ($bar =~ /foo/) {\n" +
                            "   print \"Second time is matching\\n\";\n" +
                            "} else {\n" +
                            "   print \"Second time is not matching\\n\";\n" +
                            "}\n")
                    .withHtml("<p>When above program is executed, it produces the following result &minus;</p>\n")
                    .withCode("First time is matching\n" +
                            "Second time is matching\n")
                    .withHtml("<p>The m// actually works in the same fashion as the q// operator series.you can use any combination of naturally matching characters to act as delimiters for the expression. For example, m{}, m(), and m&gt;&lt; are all valid. So above example can be re-written as follows &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "$bar = \"This is foo and again foo\";\n" +
                            "if ($bar =~ m[foo]) {\n" +
                            "   print \"First time is matching\\n\";\n" +
                            "} else {\n" +
                            "   print \"First time is not matching\\n\";\n" +
                            "}\n" +
                            "\n" +
                            "$bar = \"foo\";\n" +
                            "if ($bar =~ m{foo}) {\n" +
                            "   print \"Second time is matching\\n\";\n" +
                            "} else {\n" +
                            "   print \"Second time is not matching\\n\";\n" +
                            "}\n")
                    .withHtml("<p>You can omit m from m// if the delimiters are forward slashes, but for all other delimiters you must use the m prefix.</p>\n" +
                            "<p>Note that the entire match expression, that is the expression on the left of =~ or !~ and the match operator, returns true (in a scalar context) if the expression matches. Therefore the statement &minus;</p>\n")
                    .withCode("$true = ($foo =~ m/foo/);\n")
                    .withHtml("<p>will set $true to 1 if $foo matches the regex, or 0 if the match fails. In a list context, the match returns the contents of any grouped expressions. For example, when extracting the hours, minutes, and seconds from a time string, we can use &minus;</p>\n")
                    .withCode("my ($hours, $minutes, $seconds) = ($time =~ m/(\\d+):(\\d+):(\\d+)/);\n")
                    .withHtml("<h2>Match Operator Modifiers</h2>\n" +
                            "<p>The match operator supports its own set of modifiers. The /g modifier allows for global matching. The /i modifier will make the match case insensitive. Here is the complete list of modifiers</p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Modifier &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>i</b></p>\n" +
                            "<p>Makes the match case insensitive.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>m</b></p>\n" +
                            "<p>Specifies that if the string has newline or carriage return characters, the ^ and $ operators will now match against a newline boundary, instead of a string boundary.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>o</b></p>\n" +
                            "<p>Evaluates the expression only once.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">4</td>\n" +
                            "<td><p><b>s</b></p>\n" +
                            "<p>Allows use of . to match a newline character.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">5</td>\n" +
                            "<td><p><b>x</b></p>\n" +
                            "<p>Allows you to use white space in the expression for clarity.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">6</td>\n" +
                            "<td><p><b>g</b></p>\n" +
                            "<p>Globally finds all matches.</p></td></tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">7</td>\n" +
                            "<td><p><b>cg</b></p>\n" +
                            "<p>Allows the search to continue even after a global match fails.</p></td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h2>Matching Only Once</h2>\n" +
                            "<p>There is also a simpler version of the match operator - the ?PATTERN? operator. This is basically identical to the m// operator except that it only matches once within the string you are searching between each call to reset.</p>\n" +
                            "<p>For example, you can use this to get the first and last elements within a list &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "@list = qw/food foosball subeo footnote terfoot canic footbrdige/;\n" +
                            "\n" +
                            "foreach (@list) {\n" +
                            "   $first = $1 if /(foo.*?)/;\n" +
                            "   $last = $1 if /(foo.*)/;\n" +
                            "}\n" +
                            "print \"First: $first, Last: $last\\n\";")
                    .withHtml("<p>When above program is executed, it produces the following result &minus;</p>\n")
                    .withCode("First: food, Last: footbrdige\n")
                    .withHtml("<h2>Regular Expression Variables</h2>\n" +
                            "<p>Regular expression variables include <b>$</b>, which contains whatever the last grouping match matched; <b>$&amp;</b>, which contains the entire matched string; <b>$`</b>, which contains everything before the matched string; and <b>$'</b>, which contains everything after the matched string. Following code demonstrates the result &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "$string = \"The food is in the salad bar\";\n" +
                            "$string =~ m/foo/;\n" +
                            "print \"Before: $`\\n\";\n" +
                            "print \"Matched: $&amp;\\n\";\n" +
                            "print \"After: $'\\n\";\n")
                    .withHtml("<p>When above program is executed, it produces the following result &minus;</p>\n")
                    .withCode("Before: The\n" +
                            "Matched: foo\n" +
                            "After: d is in the salad bar\n")
                    .withHtml("<h2>The Substitution Operator</h2>\n" +
                            "<p>The substitution operator, s///, is really just an extension of the match operator that allows you to replace the text matched with some new text. The basic form of the operator is &minus;</p>\n")
                    .withCode("s/PATTERN/REPLACEMENT/;\n")
                    .withHtml("<p>The PATTERN is the regular expression for the text that we are looking for. The REPLACEMENT is a specification for the text or regular expression that we want to use to replace the found text with. For example, we can replace all occurrences of <b>dog</b> with <b>cat</b> using the following regular expression &minus;</p>\n")
                    .withCode("#/user/bin/perl\n" +
                            "\n" +
                            "$string = \"The cat sat on the mat\";\n" +
                            "$string =~ s/cat/dog/;\n" +
                            "\n" +
                            "print \"$string\\n\";\n")
                    .withHtml("<p>When above program is executed, it produces the following result &minus;</p>\n")
                    .withCode("The dog sat on the mat\n")
                    .withHtml("<h2>Substitution Operator Modifiers</h2>\n" +
                            "<p>Here is the list of all the modifiers used with substitution operator.</p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;width:10%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Modifier &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>i</b></p>\n" +
                            "<p>Makes the match case insensitive.</p></td></tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>m</b></p>\n" +
                            "<p>Specifies that if the string has newline or carriage return characters, the ^ and $ operators will now match against a newline boundary, instead of a string boundary.</p></td></tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>o</b></p>\n" +
                            "<p>Evaluates the expression only once.</p></td></tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">4</td>\n" +
                            "<td><p><b>s</b></p>\n" +
                            "<p>Allows use of . to match a newline character.</p></td></tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">5</td>\n" +
                            "<td><p><b>x</b></p>\n" +
                            "<p>Allows you to use white space in the expression for clarity.</p></td></tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">6</td>\n" +
                            "<td><p><b>g</b></p>\n" +
                            "<p>Replaces all occurrences of the found expression with the replacement text.</p></td></tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">7</td>\n" +
                            "<td><p><b>e</b></p>\n" +
                            "<p>Evaluates the replacement as if it were a Perl statement, and uses its return value as the replacement text.</p></td></tr>\n" +
                            "</table>\n" +
                            "<h2>The Translation Operator</h2>\n" +
                            "<p>Translation is similar, but not identical, to the principles of substitution, but unlike substitution, translation (or transliteration) does not use regular expressions for its search on replacement values. The translation operators are &minus;</p>")
                    .withCode("tr/SEARCHLIST/REPLACEMENTLIST/cds\n" +
                            "y/SEARCHLIST/REPLACEMENTLIST/cds\n")
                    .withHtml("<p>The translation replaces all occurrences of the characters in SEARCHLIST with the corresponding characters in REPLACEMENTLIST. For example, using the \"The cat sat on the mat.\" string we have been using in this tutorial &minus;</p>\n")
                    .withCode("#/user/bin/perl\n" +
                            "\n" +
                            "$string = 'The cat sat on the mat';\n" +
                            "$string =~ tr/a/o/;\n" +
                            "\n" +
                            "print \"$string\\n\";\n")
                    .withHtml("<p>When above program is executed, it produces the following result &minus;</p>\n")
                    .withCode("The cot sot on the mot.\n")
                    .withHtml("<p>Standard Perl ranges can also be used, allowing you to specify ranges of characters either by letter or numerical value. To change the case of the string, you might use the following syntax in place of the <b>uc</b> function.</p>\n")
                    .withCode("$string =~ tr/a-z/A-Z/;")
                    .withHtml("<h2>Translation Operator Modifiers</h2>\n" +
                            "<p>Following is the list of operators related to translation.</p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;width:5%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Modifier &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>c</b></p>\n" +
                            "<p>Complements SEARCHLIST.</p></td></tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>d</b></p>\n" +
                            "<p>Deletes found but unreplaced characters.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>s</b></p>\n" +
                            "<p>Squashes duplicate replaced characters.</p></td></tr>\n" +
                            "</table>\n" +
                            "<p>The /d modifier deletes the characters matching SEARCHLIST that do not have a corresponding entry in REPLACEMENTLIST. For example &minus;</p>\n")
                    .withCode("#!/usr/bin/perl \n" +
                            "\n" +
                            "$string = 'the cat sat on the mat.';\n" +
                            "$string =~ tr/a-z/b/d;\n" +
                            "\n" +
                            "print \"$string\\n\";\n")
                    .withHtml("<p>When above program is executed, it produces the following result &minus;</p>\n")
                    .withCode("b b   b.\n")
                    .withHtml("<p>The last modifier, /s, removes the duplicate sequences of characters that were replaced, so &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "$string = 'food';\n" +
                            "$string = 'food';\n" +
                            "$string =~ tr/a-z/a-z/s;\n" +
                            "\n" +
                            "print \"$string\\n\";")
                    .withHtml("<p>When above program is executed, it produces the following result &minus;</p>\n")
                    .withCode("fod\n")
                    .withHtml("<h2>More Complex Regular Expressions</h2>\n" +
                            "<p>You don't just have to match on fixed strings. In fact, you can match on just about anything you could dream of by using more complex regular expressions. Here's a quick cheat sheet &minus;</p>\n" +
                            "<p>Following table lists the regular expression syntax that is available in Python.</p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;width:5%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Pattern &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>^</b></p>\n" +
                            "<p>Matches beginning of line.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>$</b></p>\n" +
                            "<p>Matches end of line.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>.</b></p>\n" +
                            "<p>Matches any single character except newline. Using m option allows it to match newline as well.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">4</td>\n" +
                            "<td><p><b>[...]</b></p>\n" +
                            "<p>Matches any single character in brackets.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">5</td>\n" +
                            "<td><p><b>[^...]</b></p>\n" +
                            "<p>Matches any single character not in brackets.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">6</td>\n" +
                            "<td><p><b>*</b></p>\n" +
                            "<p>Matches 0 or more occurrences of preceding expression.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">7</td>\n" +
                            "<td><p><b>+</b></p>\n" +
                            "<p>Matches 1 or more occurrence of preceding expression.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">8</td>\n" +
                            "<td><p><b>?</b></p>\n" +
                            "<p>Matches 0 or 1 occurrence of preceding expression.</p></td></tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">9</td>\n" +
                            "<td><p><b>{ n}</b></p>\n" +
                            "<p>Matches exactly n number of occurrences of preceding expression.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">10</td>\n" +
                            "<td><p><b>{ n,}</b></p>\n" +
                            "<p>Matches n or more occurrences of preceding expression.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">11</td>\n" +
                            "<td><p><b>{ n, m}</b></p>\n" +
                            "<p>Matches at least n and at most m occurrences of preceding expression.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">12</td>\n" +
                            "<td><p><b>a| b</b></p>\n" +
                            "<p>Matches either a or b.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">13</td>\n" +
                            "<td><p><b>\\w</b></p>\n" +
                            "<p>Matches word characters.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">14</td>\n" +
                            "<td><p><b>\\W</b></p>\n" +
                            "<p>Matches nonword characters.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">15</td>\n" +
                            "<td><p><b>\\s</b></p>\n" +
                            "<p>Matches whitespace. Equivalent to [\\t\\n\\r\\f].</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">16</td>\n" +
                            "<td><p><b>\\S</b></p>\n" +
                            "<p>Matches nonwhitespace.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">17</td>\n" +
                            "<td><p><b>\\d</b></p>\n" +
                            "<p>Matches digits. Equivalent to [0-9].</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">18</td>\n" +
                            "<td><p><b>\\D</b></p>\n" +
                            "<p>Matches nondigits.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">19</td>\n" +
                            "<td><p><b>\\A</b></p>\n" +
                            "<p>Matches beginning of string.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">20</td>\n" +
                            "<td><p><b>\\Z</b></p>\n" +
                            "<p>Matches end of string. If a newline exists, it matches just before newline.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">21</td>\n" +
                            "<td><p><b>\\z</b></p>\n" +
                            "<p>Matches end of string.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">22</td>\n" +
                            "<td><p><b>\\G</b></p>\n" +
                            "<p>Matches point where last match finished.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">23</td>\n" +
                            "<td><p><b>\\b</b></p>\n" +
                            "<p>Matches word boundaries when outside brackets. Matches backspace (0x08) when inside brackets.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">24</td>\n" +
                            "<td><p><b>\\B</b></p>\n" +
                            "<p>Matches nonword boundaries.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">25</td>\n" +
                            "<td><p><b>\\n, \\t, etc.</b></p>\n" +
                            "<p>Matches newlines, carriage returns, tabs, etc.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">26</td>\n" +
                            "<td><p><b>\\1...\\9</b></p>\n" +
                            "<p>Matches nth grouped subexpression.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">27</td>\n" +
                            "<td><p><b>\\10</b></p>\n" +
                            "<p>Matches nth grouped subexpression if it matched already. Otherwise refers to the octal representation of a character code.</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">28</td>\n" +
                            "<td><p><b>[aeiou]</b></p>\n" +
                            "<p>Matches a single character in the given set</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">29</td>\n" +
                            "<td><p><b>[^aeiou]</b></p>\n" +
                            "<p>Matches a single character outside the given set</p></td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<p>The ^ metacharacter matches the beginning of the string and the $ metasymbol matches the end of the string. Here are some brief examples.</p>\n")
                    .withCode("# nothing in the string (start and end are adjacent)\n" +
                            "/^$/   \n" +
                            "\n" +
                            "# a three digits, each followed by a whitespace\n" +
                            "# character (eg \"3 4 5 \")\n" +
                            "/(\\d\\s) {3}/  \n" +
                            "\n" +
                            "# matches a string in which every\n" +
                            "# odd-numbered letter is a (eg \"abacadaf\")\n" +
                            "/(a.)+/  \n" +
                            "\n" +
                            "# string starts with one or more digits\n" +
                            "/^\\d+/\n" +
                            "\n" +
                            "# string that ends with one or more digits\n" +
                            "/\\d+$/\n")
                    .withHtml("<p>Lets have a look at another example.</p>")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "$string = \"Cats go Catatonic\\nWhen given Catnip\";\n" +
                            "($start) = ($string =~ /\\A(.*?) /);\n" +
                            "@lines = $string =~ /^(.*?) /gm;\n" +
                            "print \"First word: $start\\n\",\"Line starts: @lines\\n\";")
                    .withHtml("<p>When above program is executed, it produces the following result &minus;</p>\n")
                    .withCode("First word: Cats\n" +
                            "Line starts: Cats When\n")
                    .withHtml("<h2>Matching Boundaries</h2>\n" +
                            "<p>The <b>\\b</b> matches at any word boundary, as defined by the difference between the \\w class and the \\W class. Because \\w includes the characters for a word, and \\W the opposite, this normally means the termination of a word. The <b>\\B</b> assertion matches any position that is not a word boundary. For example &minus;</p>\n")
                    .withCode("/\\bcat\\b/ # Matches 'the cat sat' but not 'cat on the mat'\n" +
                            "/\\Bcat\\B/ # Matches 'verification' but not 'the cat on the mat'\n" +
                            "/\\bcat\\B/ # Matches 'catatonic' but not 'polecat'\n" +
                            "/\\Bcat\\b/ # Matches 'polecat' but not 'catatonic'\n")
                    .withHtml("<h2>Selecting Alternatives</h2>\n" +
                            "<p>The | character is just like the standard or bitwise OR within Perl. It specifies alternate matches within a regular expression or group. For example, to match \"cat\" or \"dog\" in an expression, you might use this &minus;</p>\n")
                    .withCode("if ($string =~ /cat|dog/)\n")
                    .withHtml("<p>You can group individual elements of an expression together in order to support complex matches. Searching for two people’s names could be achieved with two separate tests, like this &minus;</p>\n")
                    .withCode("if (($string =~ /Martin Brown/) ||  ($string =~ /Sharon Brown/))\n" +
                            "\n" +
                            "This could be written as follows\n" +
                            "\n" +
                            "if ($string =~ /(Martin|Sharon) Brown/)")
                    .withHtml("<h2>Grouping Matching</h2>\n" +
                            "<p>From a regular-expression point of view, there is no difference between except, perhaps, that the former is slightly clearer.</p>\n")
                    .withCode("$string =~ /(\\S+)\\s+(\\S+)/;\n" +
                            "\n" +
                            "and \n" +
                            "\n" +
                            "$string =~ /\\S+\\s+\\S+/;\n")
                    .withHtml("<p>However, the benefit of grouping is that it allows us to extract a sequence from a regular expression. Groupings are returned as a list in the order in which they appear in the original. For example, in the following fragment we have pulled out the hours, minutes, and seconds from a string.</p>\n")
                    .withCode("my ($hours, $minutes, $seconds) = ($time =~ m/(\\d+):(\\d+):(\\d+)/);\n")
                    .withHtml("<p>As well as this direct method, matched groups are also available within the special $x variables, where x is the number of the group within the regular expression. We could therefore rewrite the preceding example as follows &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "$time = \"12:05:30\";\n" +
                            "\n" +
                            "$time =~ m/(\\d+):(\\d+):(\\d+)/;\n" +
                            "my ($hours, $minutes, $seconds) = ($1, $2, $3);\n" +
                            "\n" +
                            "print \"Hours : $hours, Minutes: $minutes, Second: $seconds\\n\";\n")
                    .withHtml("<p>When above program is executed, it produces the following result &minus;</p>\n")
                    .withCode("Hours : 12, Minutes: 05, Second: 30\n")
                    .withHtml("<p>When groups are used in substitution expressions, the $x syntax can be used in the replacement text. Thus, we could reformat a date string using this &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "$date = '03/26/1999';\n" +
                            "$date =~ s#(\\d+)/(\\d+)/(\\d+)#$3/$1/$2#;\n" +
                            "\n" +
                            "print \"$date\\n\";\n")
                    .withHtml("<p>When above program is executed, it produces the following result &minus;</p>\n")
                    .withCode("1999/03/26\n")
                    .withHtml("<h2>The \\G Assertion</h2>\n" +
                            "<p>The \\G assertion allows you to continue searching from the point where the last match occurred. For example, in the following code, we have used \\G so that we can search to the correct position and then extract some information, without having to create a more complex, single regular expression &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "$string = \"The time is: 12:31:02 on 4/12/00\";\n" +
                            "\n" +
                            "$string =~ /:\\s+/g;\n" +
                            "($time) = ($string =~ /\\G(\\d+:\\d+:\\d+)/);\n" +
                            "$string =~ /.+\\s+/g;\n" +
                            "($date) = ($string =~ m{\\G(\\d+/\\d+/\\d+)});\n" +
                            "\n" +
                            "print \"Time: $time, Date: $date\\n\";\n")
                    .withHtml("<p>When above program is executed, it produces the following result &minus;</p>\n")
                    .withCode("Time: 12:31:02, Date: 4/12/00\n")
                    .withHtml("<p>The \\G assertion is actually just the metasymbol equivalent of the pos function, so between regular expression calls you can continue to use pos, and even modify the value of pos (and therefore \\G) by using pos as an lvalue subroutine.</p>\n" +
                            "<h2>Regular-expression Examples</h2>\n" +
                            "<h3>Literal Characters</h3>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;width:5%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Example &amp; Description</th></tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>Perl</b></p>\n" +
                            "<p>Match \"Perl\".</p></td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h3>Character Classes</h3>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;width:5%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Example &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>[Pp]ython</b></p>\n" +
                            "<p>Matches \"Python\" or \"python\"</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>rub[ye]</b></p>\n" +
                            "<p>Matches \"ruby\" or \"rube\"</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>[aeiou]</b></p>\n" +
                            "<p>Matches any one lowercase vowel</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">4</td>\n" +
                            "<td><p><b>[0-9]</b></p>\n" +
                            "<p>Matches any digit; same as [0123456789]</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">5</td>\n" +
                            "<td><p><b>[a-z]</b></p>\n" +
                            "<p>Matches any lowercase ASCII letter</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">6</td>\n" +
                            "<td><p><b>[A-Z]</b></p>\n" +
                            "<p>Matches any uppercase ASCII letter</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">7</td>\n" +
                            "<td><p><b>[a-zA-Z0-9]</b></p>\n" +
                            "<p>Matches any of the above</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">8</td>\n" +
                            "<td><p><b>[^aeiou]</b></p>\n" +
                            "<p>Matches anything other than a lowercase vowel</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">9</td>\n" +
                            "<td><p><b>[^0-9]</b></p>\n" +
                            "<p>Matches anything other than a digit</p></td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h3>Special Character Classes</h3>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr><th style=\"text-align:center;width:5%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Example &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>.</b></p>\n" +
                            "<p>Matches any character except newline</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>\\d</b></p>\n" +
                            "<p>Matches a digit: [0-9]</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>\\D</b></p>\n" +
                            "<p>Matches a nondigit: [^0-9]</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">4</td>\n" +
                            "<td><p><b>\\s</b></p>\n" +
                            "<p>Matches a whitespace character: [ \\t\\r\\n\\f]</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">5</td>\n" +
                            "<td><p><b>\\S</b></p>\n" +
                            "<p>Matches nonwhitespace: [^ \\t\\r\\n\\f]</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">6</td>\n" +
                            "<td><p><b>\\w</b></p>\n" +
                            "<p>Matches a single word character: [A-Za-z0-9_]</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">7</td>\n" +
                            "<td><p><b>\\W</b></p>\n" +
                            "<p>Matches a nonword character: [^A-Za-z0-9_]</p></td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h3>Repetition Cases</h3>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;width:5%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Example &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>ruby?</b></p>\n" +
                            "<p>Matches \"rub\" or \"ruby\": the y is optional</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>ruby*</b></p>\n" +
                            "<p>Matches \"rub\" plus 0 or more ys</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>ruby+</b></p>\n" +
                            "<p>Matches \"rub\" plus 1 or more ys</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">4</td>\n" +
                            "<td><p><b>\\d{3}</b></p>\n" +
                            "<p>Matches exactly 3 digits</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">5</td>\n" +
                            "<td><p><b>\\d{3,}</b></p>\n" +
                            "<p>Matches 3 or more digits</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">6.</td>\n" +
                            "<td><p><b>\\d{3,5}</b></p>\n" +
                            "<p>Matches 3, 4, or 5 digits</p></td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h3>Nongreedy Repetition</h3>\n" +
                            "<p>This matches the smallest number of repetitions &minus;</p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr><th style=\"text-align:center;width:5%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Example &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>&lt;.*&gt;</b></p>\n" +
                            "<p>Greedy repetition: matches \"&lt;python&gt;perl&gt;\"</p></td></tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>&lt;.*?&gt;</b></p>\n" +
                            "<p>Nongreedy: matches \"&lt;python&gt;\" in \"&lt;python&gt;perl&gt;\"</p></td></tr>\n" +
                            "</table>\n" +
                            "<h3>Grouping with Parentheses</h3>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr><th style=\"text-align:center;width:5%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Example &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>\\D\\d+</b></p>\n" +
                            "<p>No group: + repeats \\d</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>(\\D\\d)+</b></p>\n" +
                            "<p>Grouped: + repeats \\D\\d pair</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>([Pp]ython(, )?)+</b></p>\n" +
                            "<p>Match \"Python\", \"Python, python, python\", etc.</p></td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h3>Backreferences</h3>\n" +
                            "<p>This matches a previously matched group again &minus;</p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;width:5%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Example &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>([Pp])ython&amp;\\1ails</b></p>\n" +
                            "<p>Matches python&pails or Python&amp;Pails</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>(['\"])[^\\1]*\\1</b></p>\n" +
                            "<p>Single or double-quoted string. \\1 matches whatever the 1st group matched. \\2 matches whatever the 2nd group matched, etc.</p></td></tr>\n" +
                            "</table>\n" +
                            "<h3>Alternatives</h3>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr><th style=\"text-align:center;width:5%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Example &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>python|perl</b></p>\n" +
                            "<p>Matches \"python\" or \"perl\"</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>rub(y|le))</b></p>\n" +
                            "<p>Matches \"ruby\" or \"ruble\"</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>Python(!+|\\?)</b></p>\n" +
                            "<p>\"Python\" followed by one or more ! or one ?</p></td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h3>Anchors</h3>\n" +
                            "<p>This need to specify match positions.</p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;width:5%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Example &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>^Python</b></p>\n" +
                            "<p>Matches \"Python\" at the start of a string or internal line</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>Python$</b></p>\n" +
                            "<p>Matches \"Python\" at the end of a string or line</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>\\APython</b></p>\n" +
                            "<p>Matches \"Python\" at the start of a string</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">4</td>\n" +
                            "<td><p><b>Python\\Z</b></p>\n" +
                            "<p>Matches \"Python\" at the end of a string</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">5</td>\n" +
                            "<td><p><b>\\bPython\\b</b></p>\n" +
                            "<p>Matches \"Python\" at a word boundary</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">6</td>\n" +
                            "<td><p><b>\\brub\\B</b></p>\n" +
                            "<p>\\B is nonword boundary: match \"rub\" in \"rube\" and \"ruby\" but not alone</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">7</td>\n" +
                            "<td><p><b>Python(?=!)</b></p>\n" +
                            "<p>Matches \"Python\", if followed by an exclamation point</p></td></tr>\n" +
                            "<tr><td class=\"ts\">8</td>\n" +
                            "<td><p><b>Python(?!!)</b></p>\n" +
                            "<p>Matches \"Python\", if not followed by an exclamation point</p></td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h3>Special Syntax with Parentheses</h3>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr><th style=\"text-align:center;width:5%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Example &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>R(?#comment)</b></p>\n" +
                            "<p>Matches \"R\". All the rest is a comment</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>R(?i)uby</b></p>\n" +
                            "<p>Case-insensitive while matching \"uby\"</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>R(?i:uby)</b></p>\n" +
                            "<p>Same as above</p></td>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">4</td>\n" +
                            "<td><p><b>rub(?:y|le))</b></p>\n" +
                            "<p>Group only without creating \\1 backreference</p></td>\n" +
                            "</tr>\n" +
                            "</table>\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .into(textView);
        } else if (category.equals(categories[21])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h1>Perl - Sending Email</h1>\n")
                    .withHtml("<h2>Using sendmail Utility</h2>\n" +
                            "<h3>Sending a Plain Message</h3>\n" +
                            "<p>If you are working on Linux/Unix machine then you can simply use <b>sendmail</b> utility inside your Perl program to send email. Here is a sample script that can send an email to a given email ID. Just make sure the given path for sendmail utility is correct. This may be different for your Linux/Unix machine.</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            " \n" +
                            "$to = 'abcd@gmail.com';\n" +
                            "$from = 'webmaster@yourdomain.com';\n" +
                            "$subject = 'Test Email';\n" +
                            "$message = 'This is test email sent by Perl Script';\n" +
                            " \n" +
                            "open(MAIL, \"|/usr/sbin/sendmail -t\");\n" +
                            " \n" +
                            "# Email Header\n" +
                            "print MAIL \"To: $to\\n\";\n" +
                            "print MAIL \"From: $from\\n\";\n" +
                            "print MAIL \"Subject: $subject\\n\\n\";\n" +
                            "# Email Body\n" +
                            "print MAIL $message;\n" +
                            "\n" +
                            "close(MAIL);\n" +
                            "print \"Email Sent Successfully\\n\";\n")
                    .withHtml("<p>Actually, the above script is a client email script, which will draft email and submit to the server running locally on your Linux/Unix machine. This script will not be responsible for sending email to actual destination. So you have to make sure email server is properly configured and running on your machine to send email to the given email ID.</p>\n" +
                            "<h3>Sending an HTML Message</h3>\n" +
                            "<p>If you want to send HTML formatted email using sendmail, then you simply need to add <b>Content-type: text/html\\n</b> in the header part of the email as follows &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            " \n" +
                            "$to = 'abcd@gmail.com';\n" +
                            "$from = 'webmaster@yourdomain.com';\n" +
                            "$subject = 'Test Email';\n" +
                            "$message = '&lt;h1&gt;This is test email sent by Perl Script&lt;/h1&gt;';\n" +
                            " \n" +
                            "open(MAIL, \"|/usr/sbin/sendmail -t\");\n" +
                            " \n" +
                            "# Email Header\n" +
                            "print MAIL \"To: $to\\n\";\n" +
                            "print MAIL \"From: $from\\n\";\n" +
                            "print MAIL \"Subject: $subject\\n\\n\";\n" +
                            "print MAIL \"Content-type: text/html\\n\";\n" +
                            "# Email Body\n" +
                            "print MAIL $message;\n" +
                            "\n" +
                            "close(MAIL);\n" +
                            "print \"Email Sent Successfully\\n\";")
                    .withHtml("<h2>Using MIME::Lite Module</h2>\n" +
                            "<p>If you are working on windows machine, then you will not have access on sendmail utility. But you have alternate to write your own email client using MIME:Lite perl module. You can download this module from <a href=\"http://search.cpan.org/CPAN/authors/id/Y/YV/YVES/MIME-Lite-3.01.tar.gz\" rel=\"nofollow\"\" target=\"_blank\">MIME-Lite-3.01.tar.gz</a> and install it on your either machine Windows or Linux/Unix. To install it follow the simple steps &minus;</p>\n")
                    .withCode("$tar xvfz MIME-Lite-3.01.tar.gz\n" +
                            "$cd MIME-Lite-3.01\n" +
                            "$perl Makefile.PL\n" +
                            "$make\n" +
                            "$make install\n")
                    .withHtml("<p>That's it and you will have MIME::Lite module installed on your machine. Now you are ready to send your email with simple scripts explained below.</p>\n" +
                            "<h3>Sending a Plain Message</h3>\n" +
                            "<p>Now following is a script which will take care of sending email to the given email ID &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "use MIME::Lite;\n" +
                            " \n" +
                            "$to = 'abcd@gmail.com';\n" +
                            "$cc = 'efgh@mail.com';\n" +
                            "$from = 'webmaster@yourdomain.com';\n" +
                            "$subject = 'Test Email';\n" +
                            "$message = 'This is test email sent by Perl Script';\n" +
                            "\n" +
                            "$msg = MIME::Lite-&gt;new(\n" +
                            "                 From     =&gt; $from,\n" +
                            "                 To       =&gt; $to,\n" +
                            "                 Cc       =&gt; $cc,\n" +
                            "                 Subject  =&gt; $subject,\n" +
                            "                 Data     =&gt; $message\n" +
                            "                 );\n" +
                            "                 \n" +
                            "$msg-&gt;send;\n" +
                            "print \"Email Sent Successfully\\n\";\n")
                    .withHtml("<h3>Sending an HTML Message</h3>\n" +
                            "<p>If you want to send HTML formatted email using sendmail, then you simply need to add <b>Content-type: text/html\\n</b> in the header part of the email. Following is the script, which will take care of sending HTML formatted email &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "use MIME::Lite;\n" +
                            " \n" +
                            "$to = 'abcd@gmail.com';\n" +
                            "$cc = 'efgh@mail.com';\n" +
                            "$from = 'webmaster@yourdomain.com';\n" +
                            "$subject = 'Test Email';\n" +
                            "$message = '&lt;h1&gt;This is test email sent by Perl Script&lt;/h1&gt;';\n" +
                            "\n" +
                            "$msg = MIME::Lite-&gt;new(\n" +
                            "                 From     =&gt; $from,\n" +
                            "                 To       =&gt; $to,\n" +
                            "                 Cc       =&gt; $cc,\n" +
                            "                 Subject  =&gt; $subject,\n" +
                            "                 Data     =&gt; $message\n" +
                            "                 );\n" +
                            "                 \n" +
                            "$msg-&gt;attr(\"content-type\" =&gt; \"text/html\");         \n" +
                            "$msg-&gt;send;\n" +
                            "print \"Email Sent Successfully\\n\";\n")
                    .withHtml("<h3>Sending an Attachment</h3>\n" +
                            "<p>If you want to send an attachment, then following script serves the purpose &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "use MIME::Lite;\n" +
                            " \n" +
                            "$to = 'abcd@gmail.com';\n" +
                            "$cc = 'efgh@mail.com';\n" +
                            "$from = 'webmaster@yourdomain.com';\n" +
                            "$subject = 'Test Email';\n" +
                            "$message = 'This is test email sent by Perl Script';\n" +
                            "\n" +
                            "$msg = MIME::Lite-=&gt;new(\n" +
                            "                 From     =&gt; $from,\n" +
                            "                 To       =&gt; $to,\n" +
                            "                 Cc       =&gt; $cc,\n" +
                            "                 Subject  =&gt; $subject,\n" +
                            "                 Type     =&gt; 'multipart/mixed'\n" +
                            "                 );\n" +
                            "                 \n" +
                            "# Add your text message.\n" +
                            "$msg-&gt;attach(Type         =&gt; 'text',\n" +
                            "             Data         =&gt; $message\n" +
                            "             );\n" +
                            "            \n" +
                            "# Specify your file as attachement.\n" +
                            "$msg-&gt;attach(Type         =&gt; 'image/gif',\n" +
                            "             Path         =&gt; '/tmp/logo.gif',\n" +
                            "             Filename     =&gt; 'logo.gif',\n" +
                            "             Disposition  =&gt; 'attachment'\n" +
                            "            );       \n" +
                            "$msg-&gt;send;\n" +
                            "print \"Email Sent Successfully\\n\";\n")
                    .withHtml("<p>You can attach as many files as you like in your email using attach() method.</p>\n" +
                            "<h2>Using SMTP Server</h2>\n" +
                            "<p>If your machine is not running an email server then you can use any other email server available at the remote location. But to use any other email server you will need to have an id, its password, URL, etc. Once you have all the required information, you simple need to provide that information in <b>send()</b> method as follows &minus;</p>\n")
                    .withCode("$msg-&gt;send('smtp', \"smtp.myisp.net\", AuthUser=&gt;\"id\", AuthPass=&gt;\"password\" );\n")
                    .withHtml("<p>You can contact your email server administrator to have the above used information and if a user id and password is not already available then your administrator can create it in minutes.</p>\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .into(textView);
        } else if (category.equals(categories[22])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h1>Perl - Socket Programming</h1>\n")
                    .withHtml("<h2>What is a Socket?</h2>\n" +
                            "<p>Socket is a Berkeley UNIX mechanism of creating a virtual duplex connection between different processes. This was later ported on to every known OS enabling communication between systems across geographical location running on different OS software. If not for the socket, most of the network communication between systems would never ever have happened.</p>\n" +
                            "<p>Taking a closer look; a typical computer system on a network receives and sends information as desired by the various applications running on it. This information is routed to the system, since a unique IP address is designated to it. On the system, this information is given to the relevant applications, which listen on different ports. For example an internet browser listens on port 80 for information received from the web server. Also we can write our custom applications which may listen and send/receive information on a specific port number.</p>\n" +
                            "<p>For now, let's sum up that a socket is an IP address and a port, enabling connection to send and recieve data over a network.</p>\n" +
                            "<p>To explain above mentioned socket concept we will take an example of Client - Server Programming using Perl. To complete a client server architecture we would have to go through the following steps &minus;</p>\n" +
                            "<h2>To Create a Server</h2>\n" +
                            "<ul class=\"list\">\n" +
                            "<li><p>Create a socket using <b>socket</b> call.</p></li>\n" +
                            "<li><p>Bind the socket to a port address using <b>bind</b> call.</p></li>\n" +
                            "<li><p>Listen to the socket at the port address using <b>listen</b> call. </p></li>\n" +
                            "<li><p>Accept client connections using <b>accept</b> call.</p></li>\n" +
                            "</ul>\n" +
                            "<h2>To Create a Client</h2>\n" +
                            "<ul class=\"list\">\n" +
                            "<li><p>Create a socket with <b>socket</b> call.</p></li>\n" +
                            "<li><p>Connect (the socket) to the server using <b>connect</b> call.</p></li>\n" +
                            "</ul>\n" +
                            "<p>Following diagram shows the complete sequence of the calls used by Client and Server to communicate with each other &minus;</p>\n" +
                            "<center><img src=\"https://www.tutorialspoint.com/perl/images/perl_socket.jpg\" alt=\"Perl Socket\" /></center>\n" +
                            "<h2>Server Side Socket Calls</h2>\n" +
                            "<h3>The socket() call</h3>\n" +
                            "<p>The <b>socket()</b> call is the first call in establishing a network connection is creating a socket. This call has the following syntax &minus;</p>\n")
                    .withCode("socket( SOCKET, DOMAIN, TYPE, PROTOCOL );\n")
                    .withHtml("<p>The above call creates a SOCKET and other three arguments are integers which should have the following values for TCP/IP connections.</p>\n" +
                            "<ul class=\"list\">\n" +
                            "<li><p><b>DOMAIN</b> should be PF_INET. It's probable 2 on your computer.</p></li>\n" +
                            "<li><p><b>TYPE</b> should be SOCK_STREAM for TCP/IP connection.</p></li>\n" +
                            "<li><p><b>PROTOCOL</b> should be <b>(getprotobyname('tcp'))[2]</b>. It is the particular protocol such as TCP to be spoken over the socket.</p></li>\n" +
                            "</ul>\n" +
                            "<p>So socket function call issued by the server will be something like this &minus;</p>\n")
                    .withCode("use Socket     # This defines PF_INET and SOCK_STREAM\n" +
                            "\n" +
                            "socket(SOCKET,PF_INET,SOCK_STREAM,(getprotobyname('tcp'))[2]);\n")
                    .withHtml("<h3>The bind() call</h3>\n" +
                            "<p>The sockets created by socket() call are useless until they are bound to a hostname and a port number. Server uses the following <b>bind()</b> function to specify the port at which they will be accepting connections from the clients.</p>\n")
                    .withCode("bind( SOCKET, ADDRESS );\n")
                    .withHtml("<p>Here SOCKET is the descriptor returned by socket() call and ADDRESS is a socket address ( for TCP/IP ) containing three elements &minus;</p>\n" +
                            "<ul class=\"list\">\n" +
                            "<li><p>The address family (For TCP/IP, that's AF_INET, probably 2 on your system).</p></li>\n" +
                            "<li><p>The port number (for example 21).</p></li>\n" +
                            "<li><p>The internet address of the computer (for example 10.12.12.168).</p></li>\n" +
                            "</ul>\n" +
                            "<p>As the bind() is used by a server, which does not need to know its own address so the argument list looks like this &minus;</p>\n")
                    .withCode("use Socket        # This defines PF_INET and SOCK_STREAM\n" +
                            "\n" +
                            "$port = 12345;    # The unique port used by the sever to listen requests\n" +
                            "$server_ip_address = \"10.12.12.168\";\n" +
                            "bind( SOCKET, pack_sockaddr_in($port, inet_aton($server_ip_address)))\n" +
                            "   or die \"Can't bind to port $port! \\n\";\n")
                    .withHtml("<p>The <b>or die</b> clause is very important because if a server dies without outstanding connections, the port won't be immediately reusable unless you use the option SO_REUSEADDR using <b>setsockopt()</b> function. Here <b>pack_sockaddr_in()</b> function is being used to pack the Port and IP address into binary format.</p>\n" +
                            "<h3>The listen() call</h3>\n" +
                            "<p>If this is a server program, then it is required to issue a call to <b>listen()</b> on the specified port to listen, i.e., wait for the incoming requests. This call has the following syntax &minus;</p>\n")
                    .withCode("listen( SOCKET, QUEUESIZE );")
                    .withHtml("<p>The above call uses SOCKET descriptor returned by socket() call and QUEUESIZE is the maximum number of outstanding connection request allowed simultaneously.</p>\n" +
                            "<h3>The accept() call</h3>\n" +
                            "<p>If this is a server program then it is required to issue a call to the <b>access()</b> function to accept the incoming connections. This call has the following syntax &minus;</p>\n")
                    .withCode("accept( NEW_SOCKET, SOCKET );\n")
                    .withHtml("<p>The accept call receive SOCKET descriptor returned by socket() function and upon successful completion, a new socket descriptor NEW_SOCKET is returned for all future communication between the client and the server. If access() call fails, then it returns FLASE which is defined in Socket module which we have used initially.</p>\n" +
                            "<p>Generally, accept() is used in an infinite loop. As soon as one connection arrives the server either creates a child process to deal with it or serves it himself and then goes back to listen for more connections.</p>\n")
                    .withCode("while(1) {\n" +
                            "   accept( NEW_SOCKET, SOCKT );\n" +
                            "   .......\n" +
                            "}\n")
                    .withHtml("<p>Now all the calls related to server are over and let us see a call which will be required by the client.</p>\n" +
                            "<h2>Client Side Socket Calls</h2>\n" +
                            "<h3>The connect() call</h3>\n" +
                            "<p>If you are going to prepare client program, then first you will use <b>socket()</b> call to create a socket and then you would have to use <b>connect()</b> call to connect to the server. You already have seen socket() call syntax and it will remain similar to server socket() call, but here is the syntax for <b>connect()</b> call &minus;</p>\n")
                    .withCode("connect( SOCKET, ADDRESS );\n")
                    .withHtml("<p>Here SCOKET is the socket descriptor returned by socket() call issued by the client and ADDRESS is a socket address similar to <i>bind</i> call, except that it contains the IP address of the remote server.</p>\n")
                    .withCode("$port = 21;    # For example, the ftp port\n" +
                            "$server_ip_address = \"10.12.12.168\";\n" +
                            "connect( SOCKET, pack_sockaddr_in($port, inet_aton($server_ip_address)))\n" +
                            "   or die \"Can't connect to port $port! \\n\";\n")
                    .withHtml("<p>If you connect to the server successfully, then you can start sending your commands to the server using SOCKET descriptor, otherwise your client will come out by giving an error message.</p>\n" +
                            "<h2>Client - Server Example</h2>\n" +
                            "<p>Following is a Perl code to implement a simple client-server program using Perl socket. Here server listens for incoming requests and once connection is established, it simply replies <i>Smile from the server</i>. The client reads that message and print on the screen. Let's see how it has been done, assuming we have our server and client on the same machine.</p>\n" +
                            "<h3>Script to Create a Server</h3>")
                    .withCode("#!/usr/bin/perl -w\n" +
                            "# Filename : server.pl\n" +
                            "\n" +
                            "use strict;\n" +
                            "use Socket;\n" +
                            "\n" +
                            "# use port 7890 as default\n" +
                            "my $port = shift || 7890;\n" +
                            "my $proto = getprotobyname('tcp');\n" +
                            "my $server = \"localhost\";  # Host IP running the server\n" +
                            "\n" +
                            "# create a socket, make it reusable\n" +
                            "socket(SOCKET, PF_INET, SOCK_STREAM, $proto)\n" +
                            "   or die \"Can't open socket $!\\n\";\n" +
                            "setsockopt(SOCKET, SOL_SOCKET, SO_REUSEADDR, 1)\n" +
                            "   or die \"Can't set socket option to SO_REUSEADDR $!\\n\";\n" +
                            "\n" +
                            "# bind to a port, then listen\n" +
                            "bind( SOCKET, pack_sockaddr_in($port, inet_aton($server)))\n" +
                            "   or die \"Can't bind to port $port! \\n\";\n" +
                            "\n" +
                            "listen(SOCKET, 5) or die \"listen: $!\";\n" +
                            "print \"SERVER started on port $port\\n\";\n" +
                            "\n" +
                            "# accepting a connection\n" +
                            "my $client_addr;\n" +
                            "while ($client_addr = accept(NEW_SOCKET, SOCKET)) {\n" +
                            "   # send them a message, close connection\n" +
                            "   my $name = gethostbyaddr($client_addr, AF_INET );\n" +
                            "   print NEW_SOCKET \"Smile from the server\";\n" +
                            "   print \"Connection recieved from $name\\n\";\n" +
                            "   close NEW_SOCKET;\n" +
                            "}\n")
                    .withHtml("<p>To run the server in background mode issue the following command on Unix prompt &minus;</p>\n")
                    .withCode("$perl sever.pl&amp;\n")
                    .withHtml("<h3>Script to Create a Client</h3>\n")
                    .withCode("!/usr/bin/perl -w\n" +
                            "# Filename : client.pl\n" +
                            "\n" +
                            "use strict;\n" +
                            "use Socket;\n" +
                            "\n" +
                            "# initialize host and port\n" +
                            "my $host = shift || 'localhost';\n" +
                            "my $port = shift || 7890;\n" +
                            "my $server = \"localhost\";  # Host IP running the server\n" +
                            "\n" +
                            "# create the socket, connect to the port\n" +
                            "socket(SOCKET,PF_INET,SOCK_STREAM,(getprotobyname('tcp'))[2])\n" +
                            "   or die \"Can't create a socket $!\\n\";\n" +
                            "connect( SOCKET, pack_sockaddr_in($port, inet_aton($server)))\n" +
                            "   or die \"Can't connect to port $port! \\n\";\n" +
                            "\n" +
                            "my $line;\n" +
                            "while ($line = &lt;SOCKET&gt;) {\n" +
                            "   print \"$line\\n\";\n" +
                            "}\n" +
                            "close SOCKET or die \"close: $!\";\n")
                    .withHtml("<p>Now let's start our client at the command prompt, which will connect to the server and read message sent by the server and displays the same on the screen as follows &minus;</p>\n")
                    .withCode("$perl client.pl\n" +
                            "Smile from the server\n")
                    .withHtml("<p><b>NOTE</b> &minus; If you are giving the actual IP address in dot notation, then it is recommended to provide IP address in the same format in both client as well as server to avoid any confusion.</p>\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .into(textView);
        } else if (category.equals(categories[23])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h1>Object Oriented Programming in PERL</h1>\n")
                    .withHtml("<p>We have already studied references in Perl and Perl anonymous arrays and hashes. Object Oriented concept in Perl is very much based on references and anonymous array and hashes. Let's start learning basic concepts of Object Oriented Perl.</p>\n" +
                            "<h2>Object Basics</h2>\n" +
                            "<p>There are three main terms, explained from the point of view of how Perl handles objects. The terms are object, class, and method.</p>\n" +
                            "<ul class=\"list\">\n" +
                            "<li><p>An <b>object</b> within Perl is merely a reference to a data type that knows what class it belongs to. The object is stored as a reference in a scalar variable. Because a scalar only contains a reference to the object, the same scalar can hold different objects in different classes.</p></li>\n" +
                            "<li><p>A <b>class</b> within Perl is a package that contains the corresponding methods required to create and manipulate objects.</p></li>\n" +
                            "<li><p>A <b>method</b> within Perl is a subroutine, defined with the package. The first argument to the method is an object reference or a package name, depending on whether the method affects the current object or the class.</p></li>\n" +
                            "</ul>\n" +
                            "<p>Perl provides a <b>bless()</b> function, which is used to return a reference which ultimately becomes an object.</p>\n" +
                            "<h2>Defining a Class</h2>\n" +
                            "<p>It is very simple to define a class in Perl. A class is corresponding to a Perl Package in its simplest form. To create a class in Perl, we first build a package.</p>\n" +
                            "<p>A package is a self-contained unit of user-defined variables and subroutines, which can be re-used over and over again.</p>\n" +
                            "<p>Perl Packages provide a separate namespace within a Perl program which keeps subroutines and variables independent from conflicting with those in other packages.</p>\n" +
                            "<p>To declare a class named Person in Perl we do &minus;</p>\n" +
                            "<pre class=\"prettyprint notranslate\">\n" +
                            "package Person;\n" +
                            "</pre>\n" +
                            "<p>The scope of the package definition extends to the end of the file, or until another package keyword is encountered.</p>\n" +
                            "<h2>Creating and Using Objects</h2>\n" +
                            "<p>To create an instance of a class (an object) we need an object constructor. This constructor is a method defined within the package. Most programmers choose to name this object constructor method new, but in Perl you can use any name.</p>\n" +
                            "<p>You can use any kind of Perl variable as an object in Perl. Most Perl programmers choose either references to arrays or hashes.</p>\n" +
                            "<p>Let's create our constructor for our Person class using a Perl hash reference. When creating an object, you need to supply a constructor, which is a subroutine within a package that returns an object reference. The object reference is created by blessing a reference to the package's class. For example &minus;</p>\n")
                    .withCode("package Person;\n" +
                            "sub new {\n" +
                            "   my $class = shift;\n" +
                            "   my $self = {\n" +
                            "      _firstName =&gt; shift,\n" +
                            "      _lastName  =&gt; shift,\n" +
                            "      _ssn       =&gt; shift,\n" +
                            "   };\n" +
                            "   # Print all the values just for clarification.\n" +
                            "   print \"First Name is $self-&gt;{_firstName}\\n\";\n" +
                            "   print \"Last Name is $self-&gt;{_lastName}\\n\";\n" +
                            "   print \"SSN is $self-&gt;{_ssn}\\n\";\n" +
                            "   bless $self, $class;\n" +
                            "   return $self;\n" +
                            "}\n")
                    .withHtml("<p>Now Let us see how to create an Object.</p>")
                    .withCode("$object = new Person( \"Mohammad\", \"Saleem\", 23234345);")
                    .withHtml("<p>You can use simple hash in your consturctor if you don't want to assign any value to any class variable. For example &minus;</P>\n")
                    .withCode("package Person;\n" +
                            "sub new {\n" +
                            "   my $class = shift;\n" +
                            "   my $self = {};\n" +
                            "   bless $self, $class;\n" +
                            "   return $self;\n" +
                            "}\n")
                    .withHtml("<h2>Defining Methods</h2>\n" +
                            "<p>Other object-oriented languages have the concept of security of data to prevent a programmer from changing an object data directly and they provide accessor methods to modify object data. Perl does not have private variables but we can still use the concept of helper methods to manipulate object data.</p>\n" +
                            "<p>Lets define a helper method to get person’s first name &minus;</p>\n")
                    .withCode("sub getFirstName {\n" +
                            "   return $self-&gt;{_firstName};\n" +
                            "}")
                    .withHtml("<p>Another helper function to set person’s first name &minus;</p>\n")
                    .withCode("sub setFirstName {\n" +
                            "   my ( $self, $firstName ) = @_;\n" +
                            "   $self-&gt;{_firstName} = $firstName if defined($firstName);\n" +
                            "   return $self-&gt;{_firstName};\n" +
                            "}\n")
                    .withHtml("<p>Now lets have a look into complete example: Keep Person package and helper functions into Person.pm file.</p>\n")
                    .withCode("#!/usr/bin/perl \n" +
                            "\n" +
                            "package Person;\n" +
                            "\n" +
                            "sub new {\n" +
                            "   my $class = shift;\n" +
                            "   my $self = {\n" +
                            "      _firstName =&gt; shift,\n" +
                            "      _lastName  =&gt; shift,\n" +
                            "      _ssn       =&gt; shift,\n" +
                            "   };\n" +
                            "   # Print all the values just for clarification.\n" +
                            "   print \"First Name is $self-&gt;{_firstName}\\n\";\n" +
                            "   print \"Last Name is $self-&gt;{_lastName}\\n\";\n" +
                            "   print \"SSN is $self-&gt;{_ssn}\\n\";\n" +
                            "   bless $self, $class;\n" +
                            "   return $self;\n" +
                            "}\n" +
                            "sub setFirstName {\n" +
                            "   my ( $self, $firstName ) = @_;\n" +
                            "   $self-&gt;{_firstName} = $firstName if defined($firstName);\n" +
                            "   return $self-&gt;{_firstName};\n" +
                            "}\n" +
                            "\n" +
                            "sub getFirstName {\n" +
                            "   my( $self ) = @_;\n" +
                            "   return $self-&gt;{_firstName};\n" +
                            "}\n" +
                            "1;\n")
                    .withHtml("<p>Now let's make use of Person object in employee.pl file as follows &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "use Person;\n" +
                            "\n" +
                            "$object = new Person( \"Mohammad\", \"Saleem\", 23234345);\n" +
                            "# Get first name which is set using constructor.\n" +
                            "$firstName = $object-&gt;getFirstName();\n" +
                            "\n" +
                            "print \"Before Setting First Name is : $firstName\\n\";\n" +
                            "\n" +
                            "# Now Set first name using helper function.\n" +
                            "$object-&gt;setFirstName( \"Mohd.\" );\n" +
                            "\n" +
                            "# Now get first name set by helper function.\n" +
                            "$firstName = $object-&gt;getFirstName();\n" +
                            "print \"Before Setting First Name is : $firstName\\n\";\n")
                    .withHtml("<p>When we execute above program, it produces the following result &minus;</p>\n")
                    .withCode("First Name is Mohammad\n" +
                            "Last Name is Saleem\n" +
                            "SSN is 23234345\n" +
                            "Before Setting First Name is : Mohammad\n" +
                            "Before Setting First Name is : Mohd.\n")
                    .withHtml("<h2>Inheritance</h2>\n" +
                            "<p>Object-oriented programming has very good and useful concept called inheritance. Inheritance simply means that properties and methods of a parent class will be available to the child classes. So you don't have to write the same code again and again, you can just inherit a parent class.</p>\n" +
                            "<p>For example, we can have a class Employee, which inherits from Person. This is referred to as an \"isa\" relationship because an employee is a person. Perl has a special variable, @ISA, to help with this. @ISA governs (method) inheritance.</p>\n" +
                            "<p>Following are the important points to be considered while using inheritance &minus;</P>\n" +
                            "<ul class=\"list\">\n" +
                            "<li><p>Perl searches the class of the specified object for the given method or attribute, i.e., variable.</p></li>\n" +
                            "<li><p>Perl searches the classes defined in the object class's @ISA array.</p></li>\n" +
                            "<li><p>If no method is found in steps 1 or 2, then Perl uses an AUTOLOAD subroutine, if one is found in the @ISA tree.</p></li>\n" +
                            "<li><p>If a matching method still cannot be found, then Perl searches for the method within the UNIVERSAL class (package) that comes as part of the standard Perl library.</p></li>\n" +
                            "<li><p>If the method still has not found, then Perl gives up and raises a runtime exception.</p></li>\n" +
                            "</ul>\n" +
                            "<p>So to create a new Employee class that will inherit methods and attributes from our Person class, we simply code as follows: Keep this code into Employee.pm.</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "package Employee;\n" +
                            "use Person;\n" +
                            "use strict;\n" +
                            "our @ISA = qw(Person);    # inherits from Person\n")
                    .withHtml("<p>Now Employee Class has all the methods and attributes inherited from Person class and you can use them as follows: Use main.pl file to test it &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "use Employee;\n" +
                            "\n" +
                            "$object = new Employee( \"Mohammad\", \"Saleem\", 23234345);\n" +
                            "# Get first name which is set using constructor.\n" +
                            "$firstName = $object-&gt;getFirstName();\n" +
                            "\n" +
                            "print \"Before Setting First Name is : $firstName\\n\";\n" +
                            "\n" +
                            "# Now Set first name using helper function.\n" +
                            "$object-&gt;setFirstName( \"Mohd.\" );\n" +
                            "\n" +
                            "# Now get first name set by helper function.\n" +
                            "$firstName = $object-&gt;getFirstName();\n" +
                            "print \"After Setting First Name is : $firstName\\n\";\n")
                    .withHtml("<p>When we execute above program, it produces the following result &minus;</p>")
                    .withCode("First Name is Mohammad\n" +
                            "Last Name is Saleem\n" +
                            "SSN is 23234345\n" +
                            "Before Setting First Name is : Mohammad\n" +
                            "Before Setting First Name is : Mohd.\n")
                    .withHtml("<h2>Method Overriding</h2>\n" +
                            "<p>The child class Employee inherits all the methods from the parent class Person. But if you would like to override those methods in your child class then you can do it by giving your own implementation. You can add your additional functions in child class or you can add or modify the functionality of an existing methods in its parent class. It can be done as follows: modify Employee.pm file.</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "package Employee;\n" +
                            "use Person;\n" +
                            "use strict;\n" +
                            "our @ISA = qw(Person);    # inherits from Person\n" +
                            "\n" +
                            "# Override constructor\n" +
                            "sub new {\n" +
                            "   my ($class) = @_;\n" +
                            "\n" +
                            "   # Call the constructor of the parent class, Person.\n" +
                            "   my $self = $class-&gt;SUPER::new( $_[1], $_[2], $_[3] );\n" +
                            "   # Add few more attributes\n" +
                            "   $self-&gt;{_id}   = undef;\n" +
                            "   $self-&gt;{_title} = undef;\n" +
                            "   bless $self, $class;\n" +
                            "   return $self;\n" +
                            "}\n" +
                            "\n" +
                            "# Override helper function\n" +
                            "sub getFirstName {\n" +
                            "   my( $self ) = @_;\n" +
                            "   # This is child class function.\n" +
                            "   print \"This is child class helper function\\n\";\n" +
                            "   return $self-&gt;{_firstName};\n" +
                            "}\n" +
                            "\n" +
                            "# Add more methods\n" +
                            "sub setLastName{\n" +
                            "   my ( $self, $lastName ) = @_;\n" +
                            "   $self-&gt;{_lastName} = $lastName if defined($lastName);\n" +
                            "   return $self-&gt;{_lastName};\n" +
                            "}\n" +
                            "\n" +
                            "sub getLastName {\n" +
                            "   my( $self ) = @_;\n" +
                            "   return $self-&gt;{_lastName};\n" +
                            "}\n" +
                            "\n" +
                            "1;\n")
                    .withHtml("<p>Now let's again try to use Employee object in our main.pl file and execute it.</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "use Employee;\n" +
                            "\n" +
                            "$object = new Employee( \"Mohammad\", \"Saleem\", 23234345);\n" +
                            "# Get first name which is set using constructor.\n" +
                            "$firstName = $object-&gt;getFirstName();\n" +
                            "\n" +
                            "print \"Before Setting First Name is : $firstName\\n\";\n" +
                            "\n" +
                            "# Now Set first name using helper function.\n" +
                            "$object-&gt;setFirstName( \"Mohd.\" );\n" +
                            "\n" +
                            "# Now get first name set by helper function.\n" +
                            "$firstName = $object-&gt;getFirstName();\n" +
                            "print \"After Setting First Name is : $firstName\\n\";")
                    .withHtml("<p>When we execute above program, it produces the following result &minus;</p>\n")
                    .withCode("First Name is Mohammad\n" +
                            "Last Name is Saleem\n" +
                            "SSN is 23234345\n" +
                            "This is child class helper function\n" +
                            "Before Setting First Name is : Mohammad\n" +
                            "This is child class helper function\n" +
                            "After Setting First Name is : Mohd.\n")
                    .withHtml("<h2>Default Autoloading</h2>\n" +
                            "<p>Perl offers a feature which you would not find in any other programming languages: a default subroutine. Which means, if you define a function called <b>AUTOLOAD(),</b> then any calls to undefined subroutines will call AUTOLOAD() function automatically. The name of the missing subroutine is accessible within this subroutine as $AUTOLOAD.</p>\n" +
                            "<p>Default autoloading functionality is very useful for error handling. Here is an example to implement AUTOLOAD, you can implement this function in your own way.</p>\n")
                    .withCode("sub AUTOLOAD {\n" +
                            "   my $self = shift;\n" +
                            "   my $type = ref ($self) || croak \"$self is not an object\";\n" +
                            "   my $field = $AUTOLOAD;\n" +
                            "   $field =~ s/.*://;\n" +
                            "   unless (exists $self->{$field}) {\n" +
                            "      croak \"$field does not exist in object/class $type\";\n" +
                            "   }\n" +
                            "   if (@_) {\n" +
                            "      return $self-&gt;($name) = shift;\n" +
                            "   } else {\n" +
                            "      return $self-&gt;($name);\n" +
                            "   }\n" +
                            "}\n")
                    .withHtml("<h2>Destructors and Garbage Collection</h2>\n" +
                            "<p>If you have programmed using object oriented programming before, then you will be aware of the need to create a <b>destructor</b> to free the memory allocated to the object when you have finished using it. Perl does this automatically for you as soon as the object goes out of scope.</p> \n" +
                            "<p>In case you want to implement your destructor, which should take care of closing files or doing some extra processing then you need to define a special method called <b>DESTROY</b>. This method will be called on the object just before Perl frees the memory allocated to it. In all other respects, the DESTROY method is just like any other method, and you can implement whatever logic you want inside this method.</p>\n" +
                            "<p>A destructor method is simply a member function (subroutine) named DESTROY, which will be called automatically in following cases &minus;</p>\n" +
                            "<ul class=\"list\">\n" +
                            "<li>When the object reference's variable goes out of scope.</li>\n" +
                            "<li>When the object reference's variable is undef-ed.</li>\n" +
                            "<li>When the script terminates</li>\n" +
                            "<li>When the perl interpreter terminates</li>\n" +
                            "</ul>\n" +
                            "<p>For Example, you can simply put the following method DESTROY in your class &minus;</p>\n")
                    .withCode("package MyClass;\n" +
                            "...\n" +
                            "sub DESTROY {\n" +
                            "   print \"MyClass::DESTROY called\\n\";\n")
                    .withHtml("<h2>Object Oriented Perl Example</h2>\n" +
                            "<p>Here is another nice example, which will help you to understand Object Oriented Concepts of Perl. Put this source code into any perl file and execute it.</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "# Following is the implementation of simple Class.\n" +
                            "package MyClass;\n" +
                            "\n" +
                            "sub new {\n" +
                            "   print \"MyClass::new called\\n\";\n" +
                            "   my $type = shift;            # The package/type name\n" +
                            "   my $self = {};               # Reference to empty hash\n" +
                            "   return bless $self, $type;   \n" +
                            "}\n" +
                            "\n" +
                            "sub DESTROY {\n" +
                            "   print \"MyClass::DESTROY called\\n\";\n" +
                            "}\n" +
                            "\n" +
                            "sub MyMethod {\n" +
                            "   print \"MyClass::MyMethod called!\\n\";\n" +
                            "}\n" +
                            "\n" +
                            "\n" +
                            "# Following is the implemnetation of Inheritance.\n" +
                            "package MySubClass;\n" +
                            "\n" +
                            "@ISA = qw( MyClass );\n" +
                            "\n" +
                            "sub new {\n" +
                            "   print \"MySubClass::new called\\n\";\n" +
                            "   my $type = shift;            # The package/type name\n" +
                            "   my $self = MyClass-&gt;new;     # Reference to empty hash\n" +
                            "   return bless $self, $type;  \n" +
                            "}\n" +
                            "\n" +
                            "sub DESTROY {\n" +
                            "   print \"MySubClass::DESTROY called\\n\";\n" +
                            "}\n" +
                            "\n" +
                            "sub MyMethod {\n" +
                            "   my $self = shift;\n" +
                            "   $self-&gt;SUPER::MyMethod();\n" +
                            "   print \"   MySubClass::MyMethod called!\\n\";\n" +
                            "}\n" +
                            "\n" +
                            "# Here is the main program using above classes.\n" +
                            "package main;\n" +
                            "\n" +
                            "print \"Invoke MyClass method\\n\";\n" +
                            "\n" +
                            "$myObject = MyClass-&gt;new();\n" +
                            "$myObject-&gt;MyMethod();\n" +
                            "\n" +
                            "print \"Invoke MySubClass method\\n\";\n" +
                            "\n" +
                            "$myObject2 = MySubClass-&gt;new();\n" +
                            "$myObject2-&gt;MyMethod();\n" +
                            "\n" +
                            "print \"Create a scoped object\\n\";\n" +
                            "{\n" +
                            "   my $myObject2 = MyClass-&gt;new();\n" +
                            "}\n" +
                            "# Destructor is called automatically here\n" +
                            "\n" +
                            "print \"Create and undef an object\\n\";\n" +
                            "$myObject3 = MyClass-&gt;new();\n" +
                            "undef $myObject3;\n" +
                            "\n" +
                            "print \"Fall off the end of the script...\\n\";\n" +
                            "# Remaining destructors are called automatically here\n")
                    .withHtml("<p>When we execute above program, it produces the following result &minus;</p>\n")
                    .withCode("Invoke MyClass method\n" +
                            "MyClass::new called\n" +
                            "MyClass::MyMethod called!\n" +
                            "Invoke MySubClass method\n" +
                            "MySubClass::new called\n" +
                            "MyClass::new called\n" +
                            "MyClass::MyMethod called!\n" +
                            "MySubClass::MyMethod called!\n" +
                            "Create a scoped object\n" +
                            "MyClass::new called\n" +
                            "MyClass::DESTROY called\n" +
                            "Create and undef an object\n" +
                            "MyClass::new called\n" +
                            "MyClass::DESTROY called\n" +
                            "Fall off the end of the script...\n" +
                            "MyClass::DESTROY called\n" +
                            "MySubClass::DESTROY called\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .into(textView);
        } else if (category.equals(categories[24])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h1>Perl - Database Access</h1>")
                    .withHtml("<p>This chapter teaches you how to access a database inside your Perl script. Starting from Perl 5 has become very easy to write database applications using <b>DBI</b> module. DBI stands for <b>Database Independent Interface</b> for Perl, which means DBI provides an abstraction layer between the Perl code and the underlying database, allowing you to switch database implementations really easily.</p>\n" +
                            "<p>The DBI is a database access module for the Perl programming language. It provides a set of methods, variables, and conventions that provide a consistent database interface, independent of the actual database being used.</p>\n" +
                            "<h2>Architecture of a DBI Application</h2>\n" +
                            "<p>DBI is independent of any database available in backend. You can use DBI whether you are working with Oracle, MySQL or Informix, etc.</p>\n")
                    .withHtml("<p>Here DBI is responsible of taking all SQL commands through the API, (i.e., Application Programming Interface) and to dispatch them to the appropriate driver for actual execution. And finally, DBI is responsible of taking results from the driver and giving back it to the calling scritp.</p>\n" +
                            "<h2>Notation and Conventions</h2>\n" +
                            "<p>Throughout this chapter following notations will be used and it is recommended that you should also follow the same convention.</p>\n")
                    .withCode("$dsn    Database source name\n" +
                            "$dbh    Database handle object\n" +
                            "$sth    Statement handle object\n" +
                            "$h      Any of the handle types above ($dbh, $sth, or $drh)\n" +
                            "$rc     General Return Code  (boolean: true=ok, false=error)\n" +
                            "$rv     General Return Value (typically an integer)\n" +
                            "@ary    List of values returned from the database.\n" +
                            "$rows   Number of rows processed (if available, else -1)\n" +
                            "$fh     A filehandle\n" +
                            "undef   NULL values are represented by undefined values in Perl\n" +
                            "\\%attr  Reference to a hash of attribute values passed to methods\n")
                    .withHtml("<h2>Database Connection</h2>\n" +
                            "<p>Assuming we are going to work with MySQL database. Before connecting to a database make sure of the followings. You can take help of our MySQL tutorial in case you are not aware about how to create database and tables in MySQL database.</p>\n" +
                            "<ul class=\"list\">\n" +
                            "<li><p>You have created a database with a name TESTDB.</p></li>\n" +
                            "<li><p>You have created a table with a name TEST_TABLE in TESTDB.</p></li>\n" +
                            "<li><p>This table is having fields FIRST_NAME, LAST_NAME, AGE, SEX and INCOME.</p></li>\n" +
                            "<li><p>User ID \"testuser\" and password \"test123\" are set to access TESTDB.</p></li>\n" +
                            "<li><p>Perl Module DBI is installed properly on your machine.</p></li>\n" +
                            "<li><p>You have gone through MySQL tutorial to understand MySQL Basics.</p></li>\n" +
                            "</ul>\n" +
                            "<p>Following is the example of connecting with MySQL database \"TESTDB\" &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "use DBI\n" +
                            "use strict;\n" +
                            "\n" +
                            "my $driver = \"mysql\"; \n" +
                            "my $database = \"TESTDB\";\n" +
                            "my $dsn = \"DBI:$driver:database=$database\";\n" +
                            "my $userid = \"testuser\";\n" +
                            "my $password = \"test123\";\n" +
                            "\n" +
                            "my $dbh = DBI-&gt;connect($dsn, $userid, $password ) or die $DBI::errstr;\n")
                    .withHtml("<p>If a connection is established with the datasource then a Database Handle is returned and saved into $dbh for further use otherwise $dbh is set to <i>undef</i> value and $DBI::errstr returns an error string.</p>\n" +
                            "<h2>INSERT Operation</h2>\n" +
                            "<p>INSERT operation is required when you want to create some records into a table. Here we are using table TEST_TABLE to create our records. So once our database connection is established, we are ready to create records into TEST_TABLE. Following is the procedure to create single record into TEST_TABLE. You can create as many as records you like using the same concept.</p>\n" +
                            "<p>Record creation takes the following steps &minus;</p>\n" +
                            "<ul class=\"list\">\n" +
                            "<li><p>Preparing SQL statement with INSERT statement. This will be done using <b>prepare()</b> API.</p></li>\n" +
                            "<li><p>Executing SQL query to select all the results from the database. This will be done using <b>execute()</b> API.</p></li>\n" +
                            "<li><p>Releasing Statement handle. This will be done using <b>finish()</b> API</b>.</p></li>\n" +
                            "<li><p>If everything goes fine then <b>commit</b> this operation otherwise you can <b>rollback</b> complete transaction. Commit and Rollback are explained in next sections.</p></li>\n" +
                            "</ul>\n")
                    .withCode("my $sth = $dbh-&gt;prepare(\"INSERT INTO TEST_TABLE\n" +
                            "                       (FIRST_NAME, LAST_NAME, SEX, AGE, INCOME )\n" +
                            "                         values\n" +
                            "                       ('john', 'poul', 'M', 30, 13000)\");\n" +
                            "$sth-&gt;execute() or die $DBI::errstr;\n" +
                            "$sth-&gt;finish();" +
                            "$dbh-&gt;commit or die $DBI::errstr;\n\n")
                    .withHtml("<h2>Using Bind Values</h2>\n" +
                            "<p>There may be a case when values to be entered is not given in advance. So you can use bind variables which will take the required values at run time. Perl DBI modules make use of a question mark in place of actual value and then actual values are passed through execute() API at the run time. Following is the example &minus;</p>\n")
                    .withCode("my $first_name = \"john\";\n" +
                            "my $last_name = \"poul\";\n" +
                            "my $sex = \"M\";\n" +
                            "my $income = 13000;\n" +
                            "my $age = 30;\n" +
                            "my $sth = $dbh-&gt;prepare(\"INSERT INTO TEST_TABLE\n" +
                            "                        (FIRST_NAME, LAST_NAME, SEX, AGE, INCOME )\n" +
                            "                          values\n" +
                            "                        (?,?,?,?)\");\n" +
                            "$sth-&gt;execute($first_name,$last_name,$sex, $age, $income) \n" +
                            "          or die $DBI::errstr;\n" +
                            "$sth-&gt;finish();\n" +
                            "$dbh-&gt;commit or die $DBI::errstr;")
                    .withHtml("<h2>READ Operation</h2>\n" +
                            "<p>READ Operation on any database means to fetch some useful information from the database, i.e., one or more records from one or more tables. So once our database connection is established, we are ready to make a query into this database. Following is the procedure to query all the records having AGE greater than 20. This will take four steps &minus;</p>\n" +
                            "<ul class=\"list\">\n" +
                            "<li><p>Preparing SQL SELECT query based on required conditions. This will be done using <b>prepare()</b> API.</p></li>\n" +
                            "<li><p>Executing SQL query to select all the results from the database. This will be done using <b>execute()</b> API.</p></li>\n" +
                            "<li><p>Fetching all the results one by one and printing those results.This will be done using <b>fetchrow_array()</b> API.</p></li>\n" +
                            "<li><p>Releasing Statement handle. This will be done using <b>finish()</b> API.</p></li>\n" +
                            "</ul>\n")
                    .withCode("my $sth = $dbh-&gt;prepare(\"SELECT FIRST_NAME, LAST_NAME\n" +
                            "                        FROM TEST_TABLE \n" +
                            "                        WHERE AGE &gt; 20\");\n" +
                            "$sth-&gt;execute() or die $DBI::errstr;\n" +
                            "print \"Number of rows found :\" + $sth-&gt;rows;\n" +
                            "while (my @row = $sth-&gt;fetchrow_array()) {\n" +
                            "   my ($first_name, $last_name ) = @row;\n" +
                            "   print \"First Name = $first_name, Last Name = $last_name\\n\";\n" +
                            "}\n" +
                            "$sth-&gt;finish();\n")
                    .withHtml("<h2>Using Bind Values</h2>\n" +
                            "<p>There may be a case when condition is not given in advance. So you can use bind variables, which will take the required values at run time. Perl DBI modules makes use of a question mark in place of actual value and then the actual values are passed through execute() API at the run time. Following is the example &minus;</p>\n")
                    .withCode("$age = 20;\n" +
                            "my $sth = $dbh-&gt;prepare(\"SELECT FIRST_NAME, LAST_NAME\n" +
                            "                        FROM TEST_TABLE\n" +
                            "                        WHERE AGE &gt; ?\");\n" +
                            "$sth-&gt;execute( $age ) or die $DBI::errstr;\n" +
                            "print \"Number of rows found :\" + $sth-&gt;rows;\n" +
                            "while (my @row = $sth-&gt;fetchrow_array()) {\n" +
                            "   my ($first_name, $last_name ) = @row;\n" +
                            "   print \"First Name = $first_name, Last Name = $last_name\\n\";\n" +
                            "}\n" +
                            "$sth-&gt;finish();\n")
                    .withHtml("<h2>UPDATE Operation</h2>\n" +
                            "<p>UPDATE Operation on any database means to update one or more records already available in the database tables. Following is the procedure to update all the records having SEX as 'M'. Here we will increase AGE of all the males by one year. This will take three steps &minus;</p>\n" +
                            "<ul class=\"list\">\n" +
                            "<li><p>Preparing SQL query based on required conditions. This will be done using <b>prepare()</b> API.</p></li>\n" +
                            "<li><p>Executing SQL query to select all the results from the database. This will be done using <b>execute()</b> API.</p></li>\n" +
                            "<li><p>Releasing Statement handle. This will be done using <b>finish()</b> API.</p></li>\n" +
                            "<li><p>If everything goes fine then <b>commit</b> this operation otherwise you can <b>rollback</b> complete transaction. See next section for commit and rollback APIs.</p></li>\n" +
                            "</ul>\n")
                    .withCode("my $sth = $dbh-&gt;prepare(\"UPDATE TEST_TABLE\n" +
                            "                        SET   AGE = AGE + 1 \n" +
                            "                        WHERE SEX = 'M'\");\n" +
                            "$sth-&gt;execute() or die $DBI::errstr;\n" +
                            "print \"Number of rows updated :\" + $sth-&gt;rows;\n" +
                            "$sth-&gt;finish();\n" +
                            "$dbh-&gt;commit or die $DBI::errstr;\n")
                    .withHtml("<h2>Using Bind Values</h2>\n" +
                            "<p>There may be a case when condition is not given in advance. So you can use bind variables, which will take required values at run time. Perl DBI modules make use of a question mark in place of actual value and then the actual values are passed through execute() API at the run time. Following is the example &minus;</p>\n")
                    .withCode("$sex = 'M';\n" +
                            "my $sth = $dbh-&gt;prepare(\"UPDATE TEST_TABLE\n" +
                            "                        SET   AGE = AGE + 1\n" +
                            "                        WHERE SEX = ?\");\n" +
                            "$sth-&gt;execute('$sex') or die $DBI::errstr;\n" +
                            "print \"Number of rows updated :\" + $sth-&gt;rows;\n" +
                            "$sth-&gt;finish();\n" +
                            "$dbh-&gt;commit or die $DBI::errstr;\n")
                    .withCode("<p>In some case you would like to set a value, which is not given in advance so you can use binding value as follows. In this example income of all males will be set to 10000.</p>\n")
                    .withHtml("$sex = 'M';\n" +
                            "$income = 10000;\n" +
                            "my $sth = $dbh-&gt;prepare(\"UPDATE TEST_TABLE\n" +
                            "                        SET   INCOME = ?\n" +
                            "                        WHERE SEX = ?\");\n" +
                            "$sth-&gt;execute( $income, '$sex') or die $DBI::errstr;\n" +
                            "print \"Number of rows updated :\" + $sth-&gt;rows;\n" +
                            "$sth-&gt;finish();\n")
                    .withCode("<h2>DELETE Operation</h2>\n" +
                            "<p>DELETE operation is required when you want to delete some records from your database. Following is the procedure to delete all the records from TEST_TABLE where AGE is equal to 30. This operation will take the following steps.</p>\n" +
                            "<ul class=\"list\">\n" +
                            "<li><p>Preparing SQL query based on required conditions. This will be done using <b>prepare()</b> API.</p></li>\n" +
                            "<li><p>Executing SQL query to delete required records from the database. This will be done using <b>execute()</b> API.</p></li>\n" +
                            "<li><p>Releasing Statement handle. This will be done using <b>finish()</b> API.</p></li>\n" +
                            "<li><p>If everything goes fine then <b>commit</b> this operation otherwise you can <b>rollback</b> complete transaction.</p></li>\n" +
                            "</ul>\n")
                    .withCode("$age = 30;\n" +
                            "my $sth = $dbh-&gt;prepare(\"DELETE FROM TEST_TABLE\n" +
                            "                         WHERE AGE = ?\");\n" +
                            "$sth-&gt;execute( $age ) or die $DBI::errstr;\n" +
                            "print \"Number of rows deleted :\" + $sth-&gt;rows;\n" +
                            "$sth-&gt;finish();\n" +
                            "$dbh-&gt;commit or die $DBI::errstr;\n")
                    .withHtml("<h2>Using do Statement</h2>\n" +
                            "<p>If you're doing an UPDATE, INSERT, or DELETE there is no data that comes back from the database, so there is a short cut to perform this operation. You can use <b>do</b> statement to execute any of the command as follows.</p>")
                    .withCode("$dbh-&gt;do('DELETE FROM TEST_TABLE WHERE age =30');\n")
                    .withHtml("<p><b>do</b> returns a true value if it succeeded, and a false value if it failed. Actually, if it succeeds it returns the number of affected rows. In the example it would return the number of rows that were actually deleted.</p>\n" +
                            "<h2>COMMIT Operation</h2>\n" +
                            "<p>Commit is the operation which gives a green signal to database to finalize the changes and after this operation no change can be reverted to its orignal position.</p>\n" +
                            "<p>Here is a simple example to call <b>commit</b> API.</p>\n")
                    .withCode("$dbh-&gt;commit or die $dbh-&gt;errstr;\n")
                    .withHtml("<h2>ROLLBACK Operation</h2>\n" +
                            "<p>If you are not satisfied with all the changes or you encounter an error in between of any operation , you can revert those changes to use <b>rollback</b> API.</p>\n" +
                            "<p>Here is a simple example to call <b>rollback</b> API.</p>\n")
                    .withCode("$dbh-&gt;rollback or die $dbh-&gt;errstr;\n")
                    .withHtml("<h2>Begin Transaction</h2>\n" +
                            "<p>Many databases support transactions. This means that you can make a whole bunch of queries which would modify the databases, but none of the changes are actually made. Then at the end, you issue the special SQL query <b>COMMIT</b>, and all the changes are made simultaneously. Alternatively, you can issue the query ROLLBACK, in which case all the changes are thrown away and database remains unchanged.</p>\n" +
                            "<p>Perl DBI module provided <b>begin_work</b> API, which enables transactions (by turning AutoCommit off) until the next call to commit or rollback. After the next commit or rollback, AutoCommit will automatically be turned on again.</p>\n")
                    .withCode("$rc  = $dbh-&gt;begin_work  or die $dbh-&gt;errstr;")
                    .withHtml("<h2>AutoCommit Option</h2>\n" +
                            "<p>If your transactions are simple, you can save yourself the trouble of having to issue a lot of commits. When you make the connect call, you can specify an <b>AutoCommit</b> option which will perform an automatic commit operation after every successful query. Here's what it looks like &minus;</p>\n")
                    .withCode("my $dbh = DBI-&gt;connect($dsn, $userid, $password,\n" +
                            "              {AutoCommit =&gt; 1}) \n" +
                            "              or die $DBI::errstr;\n")
                    .withHtml("<p>Here AutoCommit can take value 1 or 0, where 1 means AutoCommit is on and 0 means AutoCommit is off.</p>\n" +
                            "<h2>Automatic Error Handling</h2>\n" +
                            "<p>When you make the connect call, you can specify a RaiseErrors option that handles errors for you automatically. When an error occurs, DBI will abort your program instead of returning a failure code. If all you want is to abort the program on an error, this can be convenient. Here's what it looks like &minus;</p>\n")
                    .withCode("my $dbh = DBI-&gt;connect($dsn, $userid, $password,\n" +
                            "              {RaiseError =&gt; 1})\n" +
                            "              or die $DBI::errstr;\n")
                    .withHtml("<p>Here RaiseError can take value 1 or 0.</p>\n" +
                            "<h2>Disconnecting Database</h2>\n" +
                            "<p>To disconnect Database connection, use <b>disconnect</b> API as follows &minus;</p>\n")
                    .withCode("$rc = $dbh-&gt;disconnect  or warn $dbh-&gt;errstr;\n")
                    .withHtml("<p>The transaction behaviour of the disconnect method is, sadly, undefined. Some database systems (such as Oracle and Ingres) will automatically commit any outstanding changes, but others (such as Informix) will rollback any outstanding changes. Applications not using AutoCommit should explicitly call commit or rollback before calling disconnect.</p>\n" +
                            "<h2>Using NULL Values</h2>\n" +
                            "<p>Undefined values, or undef, are used to indicate NULL values. You can insert and update columns with a NULL value as you would a non-NULL value. These examples insert and update the column age with a NULL value &minus;</p>\n")
                    .withCode("$sth = $dbh-&gt;prepare(qq {\n" +
                            "         INSERT INTO TEST_TABLE (FIRST_NAME, AGE) VALUES (?, ?)\n" +
                            "       });\n" +
                            "$sth-&gt;execute(\"Joe\", undef);")
                    .withHtml("<p>Here <b>qq{}</b> is used to return a quoted string to <b>prepare</b> API. However, care must be taken when trying to use NULL values in a WHERE clause. Consider &minus;</p>\n")
                    .withCode("SELECT FIRST_NAME FROM TEST_TABLE WHERE age = ?\n")
                    .withHtml("<p>Binding an undef (NULL) to the placeholder will not select rows, which have a NULL age! At least for database engines that conform to the SQL standard. Refer to the SQL manual for your database engine or any SQL book for the reasons for this. To explicitly select NULLs you have to say \"WHERE age IS NULL\".</p>\n" +
                            "<p>A common issue is to have a code fragment handle a value that could be either defined or undef (non-NULL or NULL) at runtime. A simple technique is to prepare the appropriate statement as needed, and substitute the placeholder for non-NULL cases &minus;</p>\n")
                    .withCode("$sql_clause = defined $age? \"age = ?\" : \"age IS NULL\";\n" +
                            "$sth = $dbh-&gt;prepare(qq {\n" +
                            "         SELECT FIRST_NAME FROM TEST_TABLE WHERE $sql_clause\n" +
                            "       });\n" +
                            "$sth-&gt;execute(defined $age ? $age : ());\n")
                    .withHtml("<h2>Some Other DBI Functions</h2>\n" +
                            "<h3>available_drivers</h3>\n")
                    .withCode("@ary = DBI-&gt;available_drivers;\n" +
                            "@ary = DBI-&gt;available_drivers($quiet);")
                    .withHtml("<p>Returns a list of all available drivers by searching for DBD::* modules through the directories in @INC. By default, a warning is given if some drivers are hidden by others of the same name in earlier directories. Passing a true value for $quiet will inhibit the warning.</p>\n" +
                            "<h3>installed_drivers</h3>")
                    .withCode("%drivers = DBI-&gt;installed_drivers();\n")
                    .withHtml("<p>Returns a list of driver name and driver handle pairs for all drivers 'installed' (loaded) into the current process. The driver name does not include the 'DBD::' prefix.</p>\n" +
                            "<h3>data_sources</h3>\n")
                    .withCode("@ary = DBI-&gt;data_sources($driver);\n")
                    .withHtml("<p>Returns a list of data sources (databases) available via the named driver. If $driver is empty or undef, then the value of the DBI_DRIVER environment variable is used.</p>\n" +
                            "<h3>quote</h3>\n")
                    .withCode("$sql = $dbh-&gt;quote($value);\n" +
                            "$sql = $dbh-&gt;quote($value, $data_type);")
                    .withHtml("<p>Quote a string literal for use as a literal value in an SQL statement, by escaping any special characters (such as quotation marks) contained within the string and adding the required type of outer quotation marks.</p>\n")
                    .withCode("$sql = sprintf \"SELECT foo FROM bar WHERE baz = %s\",\n" +
                            "                $dbh-&gt;quote(\"Don't\");\n")
                    .withHtml("<p>For most database types, quote would return 'Don''t' (including the outer quotation marks). It is valid for the quote() method to return an SQL expression that evaluates to the desired string. For example &minus;</p>\n")
                    .withCode("$quoted = $dbh-&gt;quote(\"one\\ntwo\\0three\")\n" +
                            "\n" +
                            "may produce results which will be equivalent to\n" +
                            "\n" +
                            "CONCAT('one', CHAR(12), 'two', CHAR(0), 'three')\n")
                    .withHtml("<h2>Methods Common to All Handles</h2>\n" +
                            "<h3>err</h3>\n")
                    .withCode("$rv = $h-&gt;err;\n" +
                            "or\n" +
                            "$rv = $DBI::err\n" +
                            "or\n" +
                            "$rv = $h-&gt;err\n")
                    .withHtml("<p>Returns the native database engine error code from the last driver method called. The code is typically an integer but you should not assume that. This is equivalent to $DBI::err or $h-&gt;err.</p>\n" +
                            "<h3>errstr</h3>")
                    .withCode("$str = $h-&gt;errstr;\n" +
                            "or\n" +
                            "$str = $DBI::errstr\n" +
                            "or\n" +
                            "$str = $h-&gt;errstr\n")
                    .withHtml("<p>Returns the native database engine error message from the last DBI method called. This has the same lifespan issues as the \"err\" method described above. This is equivalent to $DBI::errstr or $h-&gt;errstr.</p>\n" +
                            "<h3>rows</h3>\n")
                    .withCode("$rv = $h-&gt;rows;\n" +
                            "or\n" +
                            "$rv = $DBI::rows\n")
                    .withHtml("<p>This returns the number of rows effected by previous SQL statement and equivalent to $DBI::rows.</p>\n" +
                            "<h3>trace</h3>\n")
                    .withCode("$h-&gt;trace($trace_settings);\n")
                    .withHtml("<p>DBI sports an extremely useful ability to generate runtime tracing information of what it's doing, which can be a huge time-saver when trying to track down strange problems in your DBI programs. You can use different values to set trace level. These values varies from 0 to 4. The value 0 means disable trace and 4 means generate complete trace.</p>\n" +
                            "<h2>Interpolated Statements are Prohibited</h2>\n" +
                            "<p>It is highly recommended not to use interpolated statements as follows &minus;</p>\n")
                    .withCode("while ($first_name = &lt;&gt;) {\n" +
                            "   my $sth = $dbh-&gt;prepare(\"SELECT * \n" +
                            "                          FROM TEST_TABLE \n" +
                            "                          WHERE FIRST_NAME = '$first_name'\");\n" +
                            "   $sth-&gt;execute();\n" +
                            "   # and so on ...\n" +
                            "}\n")
                    .withHtml("<p>Thus don't use interpolated statement instead use <b>bind value</b> to prepare dynamic SQL statement.</p>\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .into(textView);
        } else if (category.equals(categories[25])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h1>Perl - CGI Programming</h1>")
                    .withHtml("<h2>What is CGI ?</h2>\n" +
                            "<ul class=\"list\">\n" +
                            "<li><p>A Common Gateway Interface, or CGI, is a set of standards that defines how information is exchanged between the web server and a custom script.</p></li>\n" +
                            "<li><p>The CGI specs are currently maintained by the NCSA and NCSA defines CGI is as follows &minus;</p></li>\n" +
                            "<li><p><i>The Common Gateway Interface, or CGI, is a standard for external gateway programs to interface with information servers such as HTTP servers.</i></p></li> \n" +
                            "<li><p>The current version is CGI/1.1 and CGI/1.2 is under progress.</p></li>\n" +
                            "</ul>\n" +
                            "<h2>Web Browsing</h2>\n" +
                            "<p>To understand the concept of CGI, lets see what happens when we click a hyper link available on a web page to browse a particular web page or URL.</p>\n" +
                            "<ul class=\"list\">\n" +
                            "<li><p>Your browser contacts web server using HTTP protocol and demands for the URL, i.e., web page filename.</p></li>\n" +
                            "<li><p>Web Server will check the URL and will look for the filename requested. If web server finds that file then it sends the file back to the browser without any further execution otherwise sends an error message indicating that you have requested a wrong file.</p></li>\n" +
                            "<li><p>Web browser takes response from web server and displays either the received file content or an error message in case file is not found.</p></li>\n" +
                            "</ul>\n" +
                            "<p>However, it is possible to set up HTTP server in such a way so that whenever a file in a certain directory is requested that file is not sent back; instead it is executed as a program, and whatever that program outputs as a result, that is sent back for your browser to display. This can be done by using a special functionality available in the web server and it is called <b>Common Gateway Interface</b> or CGI and such programs which are executed by the server to produce final result, are called CGI scripts. These CGI programs can be a PERL Script, Shell Script, C or C++ program, etc.</p>\n" +
                            "<p>Before you proceed with CGI Programming, make sure that your Web Server supports CGI functionality and it is configured to handle CGI programs. All the CGI programs to be executed by the web server are kept in a pre-configured directory. This directory is called CGI directory and by convention it is named as /cgi-bin. By convention Perl CGI files will have extention as <b>.cgi</b>.</p>\n" +
                            "<h2>First CGI Program</h2>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "print \"Content-type:text/html\\r\\n\\r\\n\";\n" +
                            "print '&lt;html&gt;';\n" +
                            "print '&lt;head&gt;';\n" +
                            "print '&lt;title&gt;Hello Word - First CGI Program&lt;/title&gt;';\n" +
                            "print '&lt;/head&gt;';\n" +
                            "print '&lt;body&gt;';\n" +
                            "print '&lt;h2&gt;Hello Word! This is my first CGI program&lt;/h2&gt;';\n" +
                            "print '&lt;/body&gt;';\n" +
                            "print '&lt;/html&gt;';\n" +
                            "\n" +
                            "1;\n")
                    .withHtml("<p>Now if you click <b>hello.cgi</b> link then request goes to web server who search for hello.cgi in /cgi-bin directory, execute it and whatever result got generated, web server sends that result back to the web browser, which is as follows &minus;</p>\n" +
                            "<pre class=\"prettyprint notranslate\">\n" +
                            "<h3>Hello Word! This is my first CGI program</h3>\n" +
                            "</pre>\n" +
                            "<p>This hello.cgi script is a simple Perl script which is writing its output on STDOUT file, i.e., screen. There is one important and extra feature available which is first line to be printed <b>Content-type:text/html\\r\\n\\r\\n</b>. This line is sent back to the browser and specifies the content type to be displayed on the browser screen. Now you must have undertood basic concept of CGI and you can write many complicated CGI programs using Perl. This script can interact with any other exertnal system also to exchange information such as a database, web services, or any other complex interfaces.</p>\n" +
                            "<h2>Understanding HTTP Header</h2>\n" +
                            "<p>The very first line <b>Content-type:text/html\\r\\n\\r\\n</b> is a part of HTTP header, which is sent to the browser so that browser can understand the incoming content from server side. All the HTTP header will be in the following form &minus;</p>\n")
                    .withCode("HTTP Field Name: Field Content\n")
                    .withHtml("<p>For Example &minus;</p>\n")
                    .withCode("<font color=Red>Content-type:</font><font color=blue>text/html\\r\\n\\r\\n</font>\n")
                    .withHtml("<p>There are few other important HTTP headers, which you will use frequently in your CGI Programming.</p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;width:5%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Header &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr>\n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>Content-type: String</b></p>\n" +
                            "<p>A MIME string defining the format of the content being returned. Example is Content-type:text/html</p></td>\n" +
                            "</tr>\n" +
                            "<tr> \n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>Expires: Date String</b></p>\n" +
                            "<p>The date when the information becomes invalid. This should be used by the browser to decide when a page needs to be refreshed. A valid date string should be in the format 01 Jan 1998 12:00:00 GMT.</p></td> \n" +
                            "</tr>\n" +
                            "<tr> \n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>Location: URL String</b></p>\n" +
                            "<p>The URL that should be returned instead of the URL requested. You can use this filed to redirect a request to any other location.</p></td> \n" +
                            "</tr>\n" +
                            "<tr> \n" +
                            "<td class=\"ts\">4</td>\n" +
                            "<td><p><b>Last-modified: String</b></p>\n" +
                            "<p>The date of last modification of the file.</p></td> \n" +
                            "</tr>\n" +
                            "<tr> \n" +
                            "<td class=\"ts\">5</td>\n" +
                            "<td><p><b>Content-length: String</b></p>\n" +
                            "<p>The length, in bytes, of the data being returned. The browser uses this value to report the estimated download time for a file.</p></td>\n" +
                            "</tr>\n" +
                            "<tr> \n" +
                            "<td class=\"ts\">6</td>\n" +
                            "<td><p><b>Set-Cookie: String</b></p>\n" +
                            "<p>Set the cookie passed through the <i>string</i></p></td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<h2>CGI Environment Variables</h2>\n" +
                            "<p>All the CGI program will have access to the following environment variables. These variables play an important role while writing any CGI program.</p>\n" +
                            "<table class=\"table table-bordered\">\n" +
                            "<tr>\n" +
                            "<th style=\"text-align:center;width:5%\">Sr.No.</th>\n" +
                            "<th style=\"text-align:center;\">Variables Names &amp; Description</th>\n" +
                            "</tr>\n" +
                            "<tr> \n" +
                            "<td class=\"ts\">1</td>\n" +
                            "<td><p><b>CONTENT_TYPE</b></p>\n" +
                            "<p>The data type of the content. Used when the client is sending attached content to the server. For example file upload, etc.</p></td> \n" +
                            "</tr>\n" +
                            "<tr> \n" +
                            "<td class=\"ts\">2</td>\n" +
                            "<td><p><b>CONTENT_LENGTH</b></p>\n" +
                            "<p>The length of the query information. It's available only for POST requests</p></td> \n" +
                            "</tr>\n" +
                            "<tr> \n" +
                            "<td class=\"ts\">3</td>\n" +
                            "<td><p><b>HTTP_COOKIE</b></p>\n" +
                            "<p>Returns the set cookies in the form of key &amp; value pair.</p></td> \n" +
                            "</tr>\n" +
                            "<tr> \n" +
                            "<td class=\"ts\">4</td>\n" +
                            "<td><p><b>HTTP_USER_AGENT</b></p>\n" +
                            "<p>The User-Agent request-header field contains information about the user agent originating the request. Its name of the web browser.</p></td> \n" +
                            "</tr>\n" +
                            "<tr> \n" +
                            "<td class=\"ts\">5</td>\n" +
                            "<td><p><b>PATH_INFO</b></p>\n" +
                            "<p>The path for the CGI script.</p></td> \n" +
                            "</tr>\n" +
                            "<tr> \n" +
                            "<td class=\"ts\">6</td>\n" +
                            "<td><p><b>QUERY_STRING</b></p>\n" +
                            "<p>The URL-encoded information that is sent with GET method request.</p></td> \n" +
                            "</tr>\n" +
                            "<tr> \n" +
                            "<td class=\"ts\">7</td>\n" +
                            "<td><p><b>REMOTE_ADDR</b></p>\n" +
                            "<p>The IP address of the remote host making the request. This can be useful for logging or for authentication purpose.</p></td> \n" +
                            "</tr>\n" +
                            "<tr> \n" +
                            "<td class=\"ts\">8</td>\n" +
                            "<td><p><b>REMOTE_HOST</b></p>\n" +
                            "<p>The fully qualified name of the host making the request. If this information is not available then REMOTE_ADDR can be used to get IR address.</p></td> \n" +
                            "</tr>\n" +
                            "<tr> \n" +
                            "<td class=\"ts\">9</td>\n" +
                            "<td><p><b>REQUEST_METHOD</b></p>\n" +
                            "<p>The method used to make the request. The most common methods are GET and POST.</p></td>\n" +
                            "</tr>\n" +
                            "<tr> \n" +
                            "<td class=\"ts\">10</td>\n" +
                            "<td><p><b>SCRIPT_FILENAME</b></p>\n" +
                            "<p>The full path to the CGI script.</p></td>\n" +
                            "</tr>\n" +
                            "<tr> \n" +
                            "<td class=\"ts\">11</td>\n" +
                            "<td><p><b>SCRIPT_NAME</b></p>\n" +
                            "<p>The name of the CGI script.</p></td>\n" +
                            "</tr>\n" +
                            "<tr> \n" +
                            "<td class=\"ts\">12</td>\n" +
                            "<td><p><b>SERVER_NAME</b></p>\n" +
                            "<p>The server's hostname or IP Address.</p></td>\n" +
                            "</tr>\n" +
                            "<tr> \n" +
                            "<td class=\"ts\">13</td>\n" +
                            "<td><p><b>SERVER_SOFTWARE</b></p>\n" +
                            "<p>The name and version of the software the server is running.</p></td>\n" +
                            "</tr>\n" +
                            "</table>\n" +
                            "<p>Here is a small CGI program to list down all the CGI variables supported by your Web server. Click this link to see the result <a href=\"https://www.tutorialspoint.com/cgi-bin/get_env.cgi\" target=\"_blank\">Get Environment</a></p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "print \"Content-type: text/html\\n\\n\";\n" +
                            "print \"&lt;font size=+1&gt;Environment&lt;/font&gt;\\n\";\n" +
                            "foreach (sort keys %ENV) {\n" +
                            "   print \"&lt;b&gt;$_&lt;/b&gt;: $ENV{$_}&lt;br&gt;\\n\";\n" +
                            "}\n" +
                            "\n" +
                            "1;\n")
                    .withHtml("<h2>Raise a \"File Download\" Dialog Box?</h2>\n" +
                            "<p>Sometime it is desired that you want to give option where a user will click a link and it will pop up a \"File Download\" dialogue box to the user instead of displaying actual content. This is very easy and will be achived through HTTP header.</p>\n" +
                            "<p>This HTTP header will be different from the header mentioned in previous section. For example, if you want to make a <b>FileName</b> file downloadable from a given link then it's syntax will be as follows &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "# HTTP Header\n" +
                            "print \"Content-Type:application/octet-stream; name = \\\"FileName\\\"\\r\\n\";\n" +
                            "print \"Content-Disposition: attachment; filename = \\\"FileName\\\"\\r\\n\\n\";\n" +
                            "\n" +
                            "# Actual File Content will go hear.\n" +
                            "open( FILE, \"&lt;FileName\" );\n" +
                            "while(read(FILE, $buffer, 100) ) {\n" +
                            "   print(\"$buffer\");\n" +
                            "}\n")
                    .withHtml("<h2>GET and POST Methods</h2>\n" +
                            "<p>You must have come across many situations when you need to pass some information from your browser to the web server and ultimately to your CGI Program handling your requests. Most frequently browser uses two methods to pass this information to the web server. These methods are <b>GET</b> Method and <b>POST</b> Method. Let's check them one by one.</p>\n" +
                            "<h2>Passing Information using GET Method</h2>\n" +
                            "<p>The GET method sends the encoded user information appended to the page URL itself. The page and the encoded information are separated by the ? character as follows &minus;</p>\n")
                    .withCode("http://www.test.com/cgi-bin/hello.cgi?key1=value1&amp;key2=value2\n")
                    .withHtml("<p>The GET method is the defualt method to pass information from a browser to the web server and it produces a long string that appears in your browser's Location:box. You should never use GET method if you have password or other sensitive information to pass to the server. The GET method has size limitation: only 1024 characters can be passed in a request string.</p>\n" +
                            "<p>This information is passed using <b>QUERY_STRING</b> header and will be accessible in your CGI Program through QUERY_STRING environment variable which you can parse and use in your CGI program.</p>\n" +
                            "<p>You can pass information by simply concatenating key and value pairs alongwith any URL or you can use HTML &lt;FORM&gt; tags to pass information using GET method.</p>\n" +
                            "<h2>Simple URL Example: Get Method</h2>\n" +
                            "<p>Here is a simple URL which will pass two values to hello_get.cgi program using GET method.</p>\n" +
                            "<a style=\"text-decoration:none;\" href=\"/cgi-bin/hello_get.cgi?first_name=ZARA&last_name=ALI\" target=\"_blank\">http://www.tutorialspoint.com/cgi-bin/hello_get.cgi?first_name=ZARA&last_name=ALI</a>\n" +
                            "<p>Below is <b>hello_get.cgi</b> script to handle input given by web browser.</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "local ($buffer, @pairs, $pair, $name, $value, %FORM);\n" +
                            "# Read in text\n" +
                            "$ENV{'REQUEST_METHOD'} =~ tr/a-z/A-Z/;\n" +
                            "if ($ENV{'REQUEST_METHOD'} eq \"GET\") {\n" +
                            "   $buffer = $ENV{'QUERY_STRING'};\n" +
                            "}\n" +
                            "# Split information into name/value pairs\n" +
                            "@pairs = split(/&/, $buffer);\n" +
                            "foreach $pair (@pairs) {\n" +
                            "   ($name, $value) = split(/=/, $pair);\n" +
                            "   $value =~ tr/+/ /;\n" +
                            "   $value =~ s/%(..)/pack(\"C\", hex($1))/eg;\n" +
                            "   $FORM{$name} = $value;\n" +
                            "}\n" +
                            "$first_name = $FORM{first_name};\n" +
                            "$last_name  = $FORM{last_name};\n" +
                            "\n" +
                            "print \"Content-type:text/html\\r\\n\\r\\n\";\n" +
                            "print \"&lt;html&gt;\";\n" +
                            "print \"&lt;head&gt;\";\n" +
                            "print \"&lt;title&gt;Hello - Second CGI Program&lt;/title&gt;\";\n" +
                            "print \"&lt;/head&gt;\";\n" +
                            "print \"&lt;body&gt;\";\n" +
                            "print \"&lt;h2&gt;Hello $first_name $last_name - Second CGI Program&lt;/h2&gt;\";\n" +
                            "print \"&lt;/body&gt;\";\n" +
                            "print \"&lt;/html&gt;\";\n" +
                            "\n" +
                            "1;\n")
                    .withHtml("<h2>Simple FORM Example: GET Method</h2>\n" +
                            "<p>Here is a simple example, which passes two values using HTML FORM and submit button. We are going to use the same CGI script hello_get.cgi to handle this input.</p>\n")
                    .withCode("&lt;FORM action = \"/cgi-bin/hello_get.cgi\" method = \"GET\"&gt;\n" +
                            "First Name: &lt;input type = \"text\" name = \"first_name\"&gt;  &lt;br&gt;\n" +
                            "\n" +
                            "Last Name: &lt;input type = \"text\" name = \"last_name\"&gt;\n" +
                            "&lt;input type = \"submit\" value = \"Submit\"&gt;\n" +
                            "&lt;/FORM&gt;\n")
                    .withHtml("<h2>Using Cookies in CGI</h2>\n" +
                            "<p>HTTP protocol is a stateless protocol. But for a commercial website it is required to maintain session information among different pages. For example one user registration ends after transactions which spans through many pages. But how to maintain user's session information across all the web pages?</p>\n" +
                            "<p>In many situations, using cookies is the most efficient method of remembering and tracking preferences, purchases, commissions, and other information required for better visitor experience or site statistics.</p>\n" +
                            "<h2>How It Works</h2>\n" +
                            "<p>Your server sends some data to the visitor's browser in the form of a cookie. The browser may accept the cookie. If it does, it is stored as a plain text record on the visitor's hard drive. Now, when the visitor arrives at another page on your site, the cookie is available for retrieval. Once retrieved, your server knows/remembers what was stored.</p>\n" +
                            "<p>Cookies are a plain text data record of 5 variable-length fields &minus;</p>\n" +
                            "<ul class=\"list\">\n" +
                            "<li><p><b>Expires</b> &minus; The date the cookie will expire. If this is blank, the cookie will expire when the visitor quits the browser.</p></li>\n" +
                            "<li><p><b>Domain</b> &minus; The domain name of your site.</p></li>\n" +
                            "<li><p><b>Path</b> &minus; The path to the directory or web page that set the cookie. This may be blank if you want to retrieve the cookie from any directory or page.</p></li>\n" +
                            "<li><p><b>Secure</b> &minus; If this field contains the word \"secure\" then the cookie may only be retrieved with a secure server. If this field is blank, no such restriction exists.</p></li>\n" +
                            "<li><p><b>Name = Value</b> &minus; Cookies are set and retrviewed in the form of key and value pairs.</p></li>\n" +
                            "</ul>\n" +
                            "<h2>Setting up Cookies</h2>\n" +
                            "<p>It is very easy to send cookies to browser. These cookies will be sent along with the HTTP Header. Assuming you want to set UserID and Password as cookies. So it will be done as follows &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "print \"Set-Cookie:UserID = XYZ;\\n\";\n" +
                            "print \"Set-Cookie:Password = XYZ123;\\n\";\n" +
                            "print \"Set-Cookie:Expires = Tuesday, 31-Dec-2007 23:12:40 GMT\";\\n\";\n" +
                            "print \"Set-Cookie:Domain = www.tutorialspoint.com;\\n\";\n" +
                            "print \"Set-Cookie:Path = /perl;\\n\";\n" +
                            "print \"Content-type:text/html\\r\\n\\r\\n\";\n" +
                            "...........Rest of the HTML Content goes here....\n")
                    .withHtml("<p>Here we used <b>Set-Cookie</b> HTTP header to set cookies. It is optional to set cookies attributes like Expires, Domain, and Path. It is important to note that cookies are set before sending magic line <b>\"Content-type:text/html\\r\\n\\r\\n</b>.</p>\n" +
                            "<h2>Retrieving Cookies</h2>\n" +
                            "<p>It is very easy to retrieve all the set cookies. Cookies are stored in CGI environment variable HTTP_COOKIE and they will have following form.</p>\n")
                    .withCode("key1 = value1;key2 = value2;key3 = value3....\n")
                    .withHtml("<p>Here is an example of how to retrieve cookies.</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "$rcvd_cookies = $ENV{'HTTP_COOKIE'};\n" +
                            "@cookies = split /;/, $rcvd_cookies;\n" +
                            "foreach $cookie ( @cookies ) {\n" +
                            "   ($key, $val) = split(/=/, $cookie); # splits on the first =.\n" +
                            "   $key =~ s/^\\s+//;\n" +
                            "   $val =~ s/^\\s+//;\n" +
                            "   $key =~ s/\\s+$//;\n" +
                            "   $val =~ s/\\s+$//;\n" +
                            "   if( $key eq \"UserID\" ) {\n" +
                            "      $user_id = $val;\n" +
                            "   } elsif($key eq \"Password\") {\n" +
                            "      $password = $val;\n" +
                            "   }\n" +
                            "}\n" +
                            "print \"User ID  = $user_id\\n\";\n" +
                            "print \"Password = $password\\n\";\n")
                    .withHtml("<p>This will produce the following result, provided above cookies have been set before calling retrieval cookies script.</p>\n")
                    .withCode("User ID = XYZ\n" +
                            "Password = XYZ123\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .into(textView);
        } else if (category.equals(categories[26])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h2>What are Packages?</h2>\n" +
                            "<p>The <b>package</b> statement switches the current naming context to a specified namespace (symbol table). Thus &minus;</p>\n" +
                            "<ul class=\"list\">\n" +
                            "<li><p>A package is a collection of code which lives in its own namespace.</p></li>\n" +
                            "<li><p>A namespace is a named collection of unique variable names (also called a symbol table).</p></li>\n" +
                            "<li><p>Namespaces prevent variable name collisions between packages.</p></li>\n" +
                            "<li><p>Packages enable the construction of modules which, when used, won't clobber variables and functions outside of the modules's own namespace.</p></li>\n" +
                            "<li><p>The package stays in effect until either another package statement is invoked, or until the end of the current block or file.</p></li>\n" +
                            "<li><p>You can explicitly refer to variables within a package using the <b>::</b> package qualifier.</p></li>\n" +
                            "</ul>\n" +
                            "<p>Following is an example having main and Foo packages in a file. Here special variable __PACKAGE__ has been used to print the package name.</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "# This is main package\n" +
                            "$i = 1; \n" +
                            "print \"Package name : \" , __PACKAGE__ , \" $i\\n\"; \n" +
                            "\n" +
                            "package Foo;\n" +
                            "# This is Foo package\n" +
                            "$i = 10; \n" +
                            "print \"Package name : \" , __PACKAGE__ , \" $i\\n\"; \n" +
                            "\n" +
                            "package main;\n" +
                            "# This is again main package\n" +
                            "$i = 100; \n" +
                            "print \"Package name : \" , __PACKAGE__ , \" $i\\n\"; \n" +
                            "print \"Package name : \" , __PACKAGE__ ,  \" $Foo::i\\n\"; \n" +
                            "\n")
                    .withHtml("<p>When above code is executed, it produces the following result &minus;</p>\n")
                    .withCode("Package name : main 1\n" +
                            "Package name : Foo 10\n" +
                            "Package name : main 100\n" +
                            "Package name : main 10\n")
                    .withHtml("<h2>BEGIN and END Blocks</h2>\n" +
                            "<p>You may define any number of code blocks named BEGIN and END, which act as constructors and destructors respectively.</P>\n")
                    .withCode("BEGIN { ... }\n" +
                            "END { ... }\n" +
                            "BEGIN { ... }\n" +
                            "END { ... }\n")
                    .withHtml("<ul class=\"list\">\n" +
                            "<li><p>Every <b>BEGIN</b> block is executed after the perl script is loaded and compiled but before any other statement is executed.</p></li>\n" +
                            "<li><p>Every END block is executed just before the perl interpreter exits.</p></li>\n" +
                            "<li><p>The BEGIN and END blocks are particularly useful when creating Perl modules.</p></li>\n" +
                            "</ul>\n" +
                            "<p>Following example shows its usage &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "package Foo;\n" +
                            "print \"Begin and Block Demo\\n\";\n" +
                            "\n" +
                            "BEGIN { \n" +
                            "   print \"This is BEGIN Block\\n\" \n" +
                            "}\n" +
                            "\n" +
                            "END { \n" +
                            "   print \"This is END Block\\n\" \n" +
                            "}\n" +
                            "\n")
                    .withHtml("<p>When above code is executed, it produces the following result &minus;</p>\n")
                    .withCode("This is BEGIN Block\n" +
                            "Begin and Block Demo\n" +
                            "This is END Block\n")
                    .withHtml("<h2>What are Perl Modules?</h2>\n" +
                            "<p>A Perl module is a reusable package defined in a library file whose name is the same as the name of the package with a .pm as extension.</p>\n" +
                            "<p>A Perl module file called <b>Foo.pm</b> might contain statements like this.</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "package Foo;\n" +
                            "sub bar { \n" +
                            "   print \"Hello $_[0]\\n\" \n" +
                            "}\n" +
                            "\n" +
                            "sub blat { \n" +
                            "   print \"World $_[0]\\n\" \n" +
                            "}\n")
                    .withHtml("<p>Few important points about Perl modules</p>\n" +
                            "<ul class=\"list\">\n" +
                            "<li><p>The functions <b>require</b> and <b>use</b> will load a module.</p></li>\n" +
                            "<li><p>Both use the list of search paths in <b>@INC</b> to find the module.</p></li>\n" +
                            "<li><p>Both functions <b>require</b> and <b>use</b> call the <b>eval</b> function to process the code.</p></li>\n" +
                            "<li><p>The <b>1;</b> at the bottom causes eval to evaluate to TRUE (and thus not fail).</p></li>\n" +
                            "</ul>\n" +
                            "<h2>The Require Function</h2>\n" +
                            "<p>A module can be loaded by calling the <b>require</b> function as follows &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "require Foo;\n" +
                            "\n" +
                            "Foo::bar( \"a\" );\n" +
                            "Foo::blat( \"b\" );\n")
                    .withHtml("<p>You must have noticed that the subroutine names must be fully qualified to call them. It would be nice to enable the subroutine <b>bar</b> and <b>blat</b> to be imported into our own namespace so we wouldn't have to use the Foo:: qualifier.</p>\n" +
                            "<h2>The Use Function</h2>\n" +
                            "<p>A module can be loaded by calling the <b>use</b> function.</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "use Foo;\n" +
                            "\n" +
                            "bar( \"a\" );\n" +
                            "blat( \"b\" );\n")
                    .withHtml("<p>Notice that we didn't have to fully qualify the package's function names. The <b>use</b> function will export a list of symbols from a module given a few added statements inside a module.</p>\n")
                    .withCode("require Exporter;\n" +
                            "@ISA = qw(Exporter);\n")
                    .withHtml("<p>Then, provide a list of symbols (scalars, lists, hashes, subroutines, etc) by filling the list variable named <b>@EXPORT</b>: For Example &minus;</p>\n")
                    .withCode("package Module;\n" +
                            "\n" +
                            "require Exporter;\n" +
                            "@ISA = qw(Exporter);\n" +
                            "@EXPORT = qw(bar blat);\n" +
                            "\n" +
                            "sub bar { print \"Hello $_[0]\\n\" }\n" +
                            "sub blat { print \"World $_[0]\\n\" }\n" +
                            "sub splat { print \"Not $_[0]\\n\" }  # Not exported!\n")
                    .withHtml("<h2>Create the Perl Module Tree</h2>\n" +
                            "<p>When you are ready to ship your Perl module, then there is standard way of creating a Perl Module Tree. This is done using <b>h2xs</b> utility. This utility comes along with Perl. Here is the syntax to use h2xs &minus;</p>\n")
                    .withCode("$h2xs -AX -n  ModuleName\n")
                    .withHtml("<p>For example, if your module is available in <b>Person.pm</b> file, then simply issue the following command &minus;</p>\n")
                    .withCode("$h2xs -AX -n Person\n")
                    .withHtml("<p>This will produce the following result &minus;</p>\n")
                    .withCode("Writing Person/lib/Person.pm\n" +
                            "Writing Person/Makefile.PL\n" +
                            "Writing Person/README\n" +
                            "Writing Person/t/Person.t\n" +
                            "Writing Person/Changes\n" +
                            "Writing Person/MANIFEST")
                    .withHtml("<p>Here is the descritpion of these options &minus;</p>\n" +
                            "<ul class=\"list\">\n" +
                            "<li><p><b>-A</b> omits the Autoloader code (best used by modules that define a large number of infrequently used subroutines).</p></li>\n" +
                            "<li><p><b>-X</b> omits XS elements (eXternal Subroutine, where eXternal means external to Perl, i.e., C).</p></li>\n" +
                            "<li><p><b>-n</b> specifies the name of the module.</p></li>\n" +
                            "</ul>\n" +
                            "<p>So above command creates the following structure inside Person directory. Actual result is shown above.</p>\n" +
                            "<ul class=\"list\">\n" +
                            "<li>Changes</li>\n" +
                            "<li>Makefile.PL</li>\n" +
                            "<li>MANIFEST (contains the list of all files in the package)</li>\n" +
                            "<li>README</li>\n" +
                            "<li>t/ (test files)</li>\n" +
                            "<li>lib/ ( Actual source code goes here</lI>\n" +
                            "</ul>\n" +
                            "<p>So finally, you <b>tar</b> this directory structure into a file Person.tar.gz and you can ship it. You will have to update README file with the proper instructions. You can also provide some test examples files in t directory.</p>\n" +
                            "<h2>Installing Perl Module</h2>\n" +
                            "<p>Download a Perl module in the form tar.gz file. Use the following sequence to install any Perl Module <b>Person.pm</b> which has been downloaded in as <b>Person.tar.gz</b> file.</p>\n")
                    .withCode("tar xvfz Person.tar.gz\n" +
                            "cd Person\n" +
                            "perl Makefile.PL\n" +
                            "make\n" +
                            "make install")
                    .withHtml("<p>The Perl interpreter has a list of directories in which it searches for modules (global array @INC).</p>\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .into(textView);
        } else if (category.equals(categories[27])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("<h1>Perl - Process Management</h1>\n")
                    .withHtml("<p>You can use Perl in various ways to create new processes as per your requirements. This tutorial will list down few important and most frequently used methods of creating and managing Perl processes.</p>\n" +
                            "<ul class=\"list\">\n" +
                            "<li><p>You can use special variables <b>$$</b> or <b>$PROCESS_ID</b> to get current process ID.</p></li>\n" +
                            "<li><p>Every process created using any of the mentioned methods, maintains its own virtual environment with-in <b>%ENV</b> variable.</p></li>\n" +
                            "<li><p>The <b>exit()</b> function always exits just the child process which executes this function and the main process as a whole will not exit unless all running child-processes have exited.</p></li>\n" +
                            "<li><p>All open handles are dup()-ed in child-processes, so that closing any handles in one process does not affect the others.</p></li>\n" +
                            "</ul>\n" +
                            "<h2>Backstick Operator</h2>\n" +
                            "<p>This simplest way of executing any Unix command is by using backstick operator. You simply put your command inside the backstick operator, which will result in execution of the command and returns its result which can be stored as follows &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "@files = `ls -l`;\n" +
                            "\n" +
                            "foreach $file (@files) {\n" +
                            "   print $file;\n" +
                            "}\n")
                    .withHtml("<p>When the above code is executed, it lists down all the files and directories available in the current directory &minus;</p>\n")
                    .withCode("drwxr-xr-x 3 root root 4096 Sep 14 06:46 9-14\n" +
                            "drwxr-xr-x 4 root root 4096 Sep 13 07:54 android\n" +
                            "-rw-r--r-- 1 root root  574 Sep 17 15:16 index.htm\n" +
                            "drwxr-xr-x 3  544  401 4096 Jul  6 16:49 MIME-Lite-3.01\n" +
                            "-rw-r--r-- 1 root root   71 Sep 17 15:16 test.pl\n" +
                            "drwx------ 2 root root 4096 Sep 17 15:11 vAtrJdy\n")
                    .withHtml("<h2>The system() Function</h2>\n" +
                            "<p>You can also use <b>system()</b> function to execute any Unix command, whose output will go to the output of the perl script. By default, it is the screen, i.e., STDOUT, but you can redirect it to any file by using redirection operator &gt; &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "system( \"ls -l\")")
                    .withHtml("<p>When above code is executed, it lists down all the files and directories available in the current directory &minus;</p>\n")
                    .withCode("drwxr-xr-x 3 root root 4096 Sep 14 06:46 9-14\n" +
                            "drwxr-xr-x 4 root root 4096 Sep 13 07:54 android\n" +
                            "-rw-r--r-- 1 root root  574 Sep 17 15:16 index.htm\n" +
                            "drwxr-xr-x 3  544  401 4096 Jul  6 16:49 MIME-Lite-3.01\n" +
                            "-rw-r--r-- 1 root root   71 Sep 17 15:16 test.pl\n" +
                            "drwx------ 2 root root 4096 Sep 17 15:11 vAtrJdy\n")
                    .withHtml("<p>Be careful when your command contains shell environmental variables like $PATH or $HOME. Try following three scenarios &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "$PATH = \"I am Perl Variable\";\n" +
                            "\n" +
                            "system('echo $PATH');  # Treats $PATH as shell variable\n" +
                            "system(\"echo $PATH\");  # Treats $PATH as Perl variable\n" +
                            "system(\"echo \\$PATH\"); # Escaping $ works.\n")
                    .withHtml("<p>When above code is executed, it produces the following result depending on what is set in shell variable $PATH.</p>\n")
                    .withCode("/usr/local/bin:/bin:/usr/bin:/usr/local/sbin:/usr/sbin:/sbin\n" +
                            "I am Perl Variable\n" +
                            "/usr/local/bin:/bin:/usr/bin:/usr/local/sbin:/usr/sbin:/sbin\n")
                    .withHtml("<h2>The fork() Function</h2>\n" +
                            "<p>Perl provides a <b>fork()</b> function that corresponds to the Unix system call of the same name. On most Unix-like platforms where the fork() system call is available, Perl's fork() simply calls it. On some platforms such as Windows where the fork() system call is not available, Perl can be built to emulate fork() at the interpreter level.</p>\n" +
                            "<p>The fork() function is used to clone a current process. This call create a new process running the same program at the same point. It returns the child pid to the parent process, 0 to the child process, or undef if the fork is unsuccessful.</p>\n" +
                            "<p>You can use <b>exec()</b> function within a process to launch the requested executable, which will be executed in a separate process area and exec() will wait for it to complete before exiting with the same exit status as that process.</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "if(!defined($pid = fork())) {\n" +
                            "   # fork returned undef, so unsuccessful\n" +
                            "   die \"Cannot fork a child: $!\";\n" +
                            "} elsif ($pid == 0) {\n" +
                            "   print \"Printed by child process\\n\";\n" +
                            "   exec(\"date\") || die \"can't exec date: $!\";\n" +
                            "  \n" +
                            "} else {\n" +
                            "   # fork returned 0 nor undef\n" +
                            "   # so this branch is parent\n" +
                            "   print \"Printed by parent process\\n\";\n" +
                            "   $ret = waitpid($pid, 0);\n" +
                            "   print \"Completed process id: $ret\\n\";\n" +
                            "\n" +
                            "}\n")
                    .withHtml("<p>When above code is executed, it produces the following result &minus;</p>\n")
                    .withCode("Printed by parent process\n" +
                            "Printed by child process\n" +
                            "Tue Sep 17 15:41:08 CDT 2013\n" +
                            "Completed process id: 17777\n")
                    .withHtml("<p>The <b>wait()</b> and <b>waitpid()</b> can be passed as a pseudo-process ID returned by fork(). These calls will properly wait for the termination of the pseudo-process and return its status. If you fork without ever waiting on your children using <b>waitpid()</b> function, you will accumulate zombies. On Unix systems, you can avoid this by setting $SIG{CHLD} to \"IGNORE\" as follows &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "local $SIG{CHLD} = \"IGNORE\";\n" +
                            " \n" +
                            "if(!defined($pid = fork())) {\n" +
                            "   # fork returned undef, so unsuccessful\n" +
                            "   die \"Cannot fork a child: $!\";\n" +
                            "} elsif ($pid == 0) {\n" +
                            "   print \"Printed by child process\\n\";\n" +
                            "   exec(\"date\") || die \"can't exec date: $!\";\n" +
                            "  \n" +
                            "} else {\n" +
                            "   # fork returned 0 nor undef\n" +
                            "   # so this branch is parent\n" +
                            "   print \"Printed by parent process\\n\";\n" +
                            "   $ret = waitpid($pid, 0);\n" +
                            "   print \"Completed process id: $ret\\n\";\n" +
                            "\n" +
                            "}\n")
                    .withHtml("<p>When above code is executed, it produces the following result &minus;</p>\n")
                    .withCode("Printed by parent process\n" +
                            "Printed by child process\n" +
                            "Tue Sep 17 15:44:07 CDT 2013\n" +
                            "Completed process id: -1\n")
                    .withHtml("<h2>The kill() Function</h2>\n" +
                            "<p>Perl <b>kill('KILL', (Process List))</b> function can be used to terminate a pseudo-process by passing it the ID returned by fork().</p>\n" +
                            "<p>Note that using kill('KILL', (Process List)) on a pseudo-process() may typically cause memory leaks, because the thread that implements the pseudo-process does not get a chance to clean up its resources.</p>\n" +
                            "<p>You can use <b>kill()</b> function to send any other signal to target processes, for example following will send SIGINT to a process IDs 104 and 102 &minus;</p>\n")
                    .withCode("#!/usr/bin/perl\n" +
                            "\n" +
                            "kill('INT', 104, 102);\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .withHtml("\n\n<hr />\n<hr />\n<hr />\n")
                    .into(textView);
        }
    }
}
