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
                    .withHtml("<center><img src=\"https://www.tutorialspoint.com/perl/images/decision_making.jpg\" alt=\"Decision making statements in Perl\" />\n")
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
                    .withHtml("<center><img src=\"https://www.tutorialspoint.com/perl/images/loop_architecture.jpg\" alt=\"Loop Architecture in Perl\" />\n")
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
