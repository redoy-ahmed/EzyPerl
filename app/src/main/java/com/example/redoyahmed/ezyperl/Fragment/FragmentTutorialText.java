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
                    .withHtml("")
                    .into(textView);
        } else if (category.equals(categories[8])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("")
                    .into(textView);
        } else if (category.equals(categories[9])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("")
                    .into(textView);
        } else if (category.equals(categories[10])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("")
                    .into(textView);
        } else if (category.equals(categories[11])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("")
                    .into(textView);
        } else if (category.equals(categories[12])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("")
                    .into(textView);
        } else if (category.equals(categories[13])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("")
                    .into(textView);
        } else if (category.equals(categories[14])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("")
                    .into(textView);
        } else if (category.equals(categories[15])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("")
                    .into(textView);
        } else if (category.equals(categories[16])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("")
                    .into(textView);
        } else if (category.equals(categories[17])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("")
                    .into(textView);
        } else if (category.equals(categories[18])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("")
                    .into(textView);
        } else if (category.equals(categories[19])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("")
                    .into(textView);
        } else if (category.equals(categories[20])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("")
                    .into(textView);
        } else if (category.equals(categories[21])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("")
                    .into(textView);
        } else if (category.equals(categories[22])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("")
                    .into(textView);
        } else if (category.equals(categories[23])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("")
                    .into(textView);
        } else if (category.equals(categories[24])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("")
                    .into(textView);
        } else if (category.equals(categories[25])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("")
                    .into(textView);
        } else if (category.equals(categories[26])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("")
                    .into(textView);
        } else if (category.equals(categories[27])) {
            Codeview.with(getContext())
                    .setStyle(Code.DEFAULT_STYLE)
                    .setAutoWrap(Code.autoWrap)
                    .setLang(Settings.Lang.PERL)
                    .withHtml("")
                    .into(textView);
        }
    }
}
