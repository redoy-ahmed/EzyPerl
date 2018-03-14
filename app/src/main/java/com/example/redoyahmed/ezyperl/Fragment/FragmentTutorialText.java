package com.example.redoyahmed.ezyperl.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.redoyahmed.ezyperl.Database.DbHelper;
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
                    .withHtml("<h2>Perl and the Web</h2>\n" + "<ul class=\"list\">\n" + "<li><p>Perl used to be the most popular web programming language due to its text manipulation capabilities and rapid development cycle.</p></li>\n" + "<li><p>Perl is widely known as the duct-tape of the Internet.</p></li>\n" + "<li><p>Perl can handle encrypted Web data, including e-commerce transactions.</p></li>\n" + "<li><p>Perl can be embedded into web servers to speed up processing by as much as 2000%.</p></li>\n" + "<li><p>Perl's mod_perl allows the Apache web server to embed a Perl interpreter.</p></li>\n" + "<li><p>Perl's DBI package makes web-database integration easy.</p></li>\n" + "</ul>\n" + "<h2>Perl is Interpreted</h2>\n" + "<p>Perl is an interpreted language, which means that your code can be run as is, without a compilation stage that creates a non portable executable program.</p>\n" + "<p>Traditional compilers convert programs into machine language. When you run a Perl program, it's first compiled into a byte code, which is then converted ( as the program runs) into machine instructions. So it is not quite the same as shells, or Tcl, which are <b>strictly</b> interpreted without an intermediate representation.</p>\n" + "<p>It is also not like most versions of C or C++, which are compiled directly into a machine dependent format. It is somewhere in between, along with Python and awk and Emacs .elc files.</p>\n")
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
                    .into(textView);
        } else if (category.equals(categories[2])) {

        } else if (category.equals(categories[3])) {

        } else if (category.equals(categories[4])) {

        } else if (category.equals(categories[5])) {

        } else if (category.equals(categories[6])) {

        } else if (category.equals(categories[7])) {

        } else if (category.equals(categories[8])) {

        } else if (category.equals(categories[9])) {

        } else if (category.equals(categories[10])) {

        } else if (category.equals(categories[11])) {

        } else if (category.equals(categories[12])) {

        } else if (category.equals(categories[13])) {

        } else if (category.equals(categories[14])) {

        } else if (category.equals(categories[15])) {

        } else if (category.equals(categories[16])) {

        } else if (category.equals(categories[17])) {

        } else if (category.equals(categories[18])) {

        } else if (category.equals(categories[19])) {

        } else if (category.equals(categories[20])) {

        } else if (category.equals(categories[21])) {

        } else if (category.equals(categories[22])) {

        } else if (category.equals(categories[23])) {

        } else if (category.equals(categories[24])) {

        } else if (category.equals(categories[25])) {

        } else if (category.equals(categories[26])) {

        } else if (category.equals(categories[27])) {

        }
    }
}
