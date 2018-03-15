package com.example.redoyahmed.ezyperl.Utils;

/**
 * Created by redoy.ahmed on 15-Mar-2018.
 */

public class PractiseCodes {

    public static final String introductionCode = "print \"Hello, world\\n\";\n" +
            "print 'Hello, world\\n';";

    public static final String environmentCode = "$a = 10;\n" +
            "print \"Value of a = $a\\n\";\n" +
            "print 'Value of a = $a\\n';";

    public static final String syntaxOverviewCode = "$result = \"This is \\\"number\\\"\";\n" +
            "print \"$result\\n\";\n" +
            "print \"\\$result\\n\";";

    public static final String dataTypesCode = "# This is case of interpolation.\n" +
            "$str = \"Welcome to my \\ntutorial!\";\n" +
            "print \"$str\\n\";\n" +
            "\n" +
            "# This is case of non-interpolation.\n" +
            "$str = 'Welcome to my \\ntutorial!';\n" +
            "print \"$str\\n\";\n" +
            "\n" +
            "# Only W will become upper case.\n" +
            "$str = \"\\uwelcome to my tutorial!\";\n" +
            "print \"$str\\n\";\n" +
            "\n" +
            "# Whole line will become capital.\n" +
            "$str = \"\\UWelcome to my tutorial!\";\n" +
            "print \"$str\\n\";\n" +
            "\n" +
            "# A portion of line will become capital.\n" +
            "$str = \"Welcome to my \\Ututorial!\"; \n" +
            "print \"$str\\n\";\n" +
            "\n" +
            "# Backsalash non alpha-numeric including spaces.\n" +
            "$str = \"\\QWelcome to my tutorial\";\n" +
            "print \"$str\\n\";";

    public static final String variablesCode = "$age = 25;             # An integer assignment\n" +
            "$name = \"John Paul\";   # A string \n" +
            "$salary = 1445.50;     # A floating point\n" +
            "\n" +
            "print \"Age = $age\\n\";\n" +
            "print \"Name = $name\\n\";\n" +
            "print \"Salary = $salary\\n\";";

    public static final String scalarsCode = "$age = 25;             # An integer assignment\n" +
            "$name = \"John Paul\";   # A string \n" +
            "$salary = 1445.50;     # A floating point\n" +
            "\n" +
            "print \"Age = $age\\n\";\n" +
            "print \"Name = $name\\n\";\n" +
            "print \"Salary = $salary\\n\";";

    public static final String arraysCode = "@ages = (25, 30, 40);             \n" +
            "@names = (\"John Paul\", \"Lisa\", \"Kumar\");\n" +
            "\n" +
            "print \"\\$ages[0] = $ages[0]\\n\";\n" +
            "print \"\\$ages[1] = $ages[1]\\n\";\n" +
            "print \"\\$ages[2] = $ages[2]\\n\";\n" +
            "print \"\\$names[0] = $names[0]\\n\";\n" +
            "print \"\\$names[1] = $names[1]\\n\";\n" +
            "print \"\\$names[2] = $names[2]\\n\";";

    public static final String hashesCode = "%data = ('John Paul', 45, 'Lisa', 30, 'Kumar', 40);\n" +
            "\n" +
            "print \"\\$data{'John Paul'} = $data{'John Paul'}\\n\";\n" +
            "print \"\\$data{'Lisa'} = $data{'Lisa'}\\n\";\n" +
            "print \"\\$data{'Kumar'} = $data{'Kumar'}\\n\";";

    public static final String ifElseCode = "$a = 100;\n" +
            "# check the boolean condition using if statement\n" +
            "if( $a  ==  20 ) {\n" +
            "   # if condition is true then print the following\n" +
            "   printf \"a has a value which is 20\\n\";\n" +
            "} elsif( $a ==  30 ) {\n" +
            "   # if condition is true then print the following\n" +
            "   printf \"a has a value which is 30\\n\";\n" +
            "} else {\n" +
            "   # if none of the above conditions is true\n" +
            "   printf \"a has a value which is $a\\n\";\n" +
            "}";

    public static final String loopsCode = "# for loop execution\n" +
            "for( $a = 10; $a < 20; $a = $a + 1 ) {\n" +
            "   print \"value of a: $a\\n\";\n" +
            "}";

    public static final String operatorsCode = "$a = \"abc\";\n" +
            "$b = \"xyz\";\n" +
            "\n" +
            "print \"Value of \\$a = $a and value of \\$b = $b\\n\";\n" +
            "\n" +
            "if( $a lt $b ) {\n" +
            "   print \"$a lt \\$b is true\\n\";\n" +
            "} else {\n" +
            "   print \"\\$a lt \\$b is not true\\n\";\n" +
            "}\n" +
            "\n" +
            "if( $a gt $b ) {\n" +
            "   print \"\\$a gt \\$b is true\\n\";\n" +
            "} else {\n" +
            "   print \"\\$a gt \\$b is not true\\n\";\n" +
            "}\n" +
            "\n" +
            "if( $a le $b ) {\n" +
            "   print \"\\$a le \\$b is true\\n\";\n" +
            "} else {\n" +
            "   print \"\\$a le \\$b is not true\\n\";\n" +
            "}\n" +
            "\n" +
            "if( $a ge $b ) {\n" +
            "   print \"\\$a ge \\$b is true\\n\";\n" +
            "} else {\n" +
            "   print \"\\$a ge \\$b is not true\\n\";\n" +
            "}\n" +
            "\n" +
            "if( $a ne $b ) {\n" +
            "   print \"\\$a ne \\$b is true\\n\";\n" +
            "} else {\n" +
            "   print \"\\$a ne \\$b is not true\\n\";\n" +
            "}\n" +
            "\n" +
            "$c = $a cmp $b;\n" +
            "print \"\\$a cmp \\$b returns $c\\n\";";

    public static final String dateAndTimeCode = "$datestring = gmtime();\n" +
            "print \"GMT date and time $datestring\\n\";";

    public static final String subroutinesCode = "# Function definition\n" +
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
            "Average(10, 20, 30);";

    public static final String referencesCode = "$var = 10;\n" +
            "$r = \\$var;\n" +
            "print \"Reference type in r : \", ref($r), \"\\n\";\n" +
            "\n" +
            "@var = (1, 2, 3);\n" +
            "$r = \\@var;\n" +
            "print \"Reference type in r : \", ref($r), \"\\n\";\n" +
            "\n" +
            "%var = ('key1' => 10, 'key2' => 20);\n" +
            "$r = \\%var;\n" +
            "print \"Reference type in r : \", ref($r), \"\\n\";";

    public static final String formatsCode = "format EMPLOYEE =\n" +
            "===================================\n" +
            "@<<<<<<<<<<<<<<<<<<<<<< @<< \n" +
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
            "}";

    public static final String filesCode = "open(DATA, \"<file.txt\") or die \"Couldn't open file file.txt, $!\";\n" +
            "\n" +
            "while(<DATA>) {\n" +
            "   print \"$_\";\n" +
            "}";

    public static final String directoriesCode = "# Display all the files in /tmp directory.\n" +
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
            "}";

    public static final String errorHandlingCode = "require Exporter;\n" +
            "@ISA = qw/Exporter/;\n" +
            "@EXPORT = qw/function/;\n" +
            "use Carp;\n" +
            "\n" +
            "sub function {\n" +
            "   warn \"Error in module!\";\n" +
            "}";

    public static final String specialVariablesCode = "foreach ('hickory','dickory','doc') {\n" +
            "   print;\n" +
            "   print \"\\n\";\n" +
            "}";

    public static final String codingstandardCodes = "LINE:\n" +
            "for (;;) {\n" +
            "   statements;\n" +
            "   last LINE if $foo;\n" +
            "   next LINE if /^#/;\n" +
            "   statements;\n" +
            "}";

    public static final String regularExpressionsCode = "$bar = \"This is foo and again foo\";\n" +
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
            "}";

    public static final String sendingEmailsCode = "$to = 'abcd@gmail.com';\n" +
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
            "print \"Email Sent Successfully\\n\";";

    public static final String socketProgrammingCode = "# Filename : server.pl\n" +
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
            "}";

    public static final String oopCode = "# Following is the implementation of simple Class.\n" +
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
            "   my $self = MyClass->new;     # Reference to empty hash\n" +
            "   return bless $self, $type;  \n" +
            "}\n" +
            "\n" +
            "sub DESTROY {\n" +
            "   print \"MySubClass::DESTROY called\\n\";\n" +
            "}\n" +
            "\n" +
            "sub MyMethod {\n" +
            "   my $self = shift;\n" +
            "   $self->SUPER::MyMethod();\n" +
            "   print \"   MySubClass::MyMethod called!\\n\";\n" +
            "}\n" +
            "\n" +
            "# Here is the main program using above classes.\n" +
            "package main;\n" +
            "\n" +
            "print \"Invoke MyClass method\\n\";\n" +
            "\n" +
            "$myObject = MyClass->new();\n" +
            "$myObject->MyMethod();\n" +
            "\n" +
            "print \"Invoke MySubClass method\\n\";\n" +
            "\n" +
            "$myObject2 = MySubClass->new();\n" +
            "$myObject2->MyMethod();\n" +
            "\n" +
            "print \"Create a scoped object\\n\";\n" +
            "{\n" +
            "   my $myObject2 = MyClass->new();\n" +
            "}\n" +
            "# Destructor is called automatically here\n" +
            "\n" +
            "print \"Create and undef an object\\n\";\n" +
            "$myObject3 = MyClass->new();\n" +
            "undef $myObject3;\n" +
            "\n" +
            "print \"Fall off the end of the script...\\n\";\n" +
            "# Remaining destructors are called automatically here";

    public static final String databaseAccessCode = "use DBI\n" +
            "use strict;\n" +
            "\n" +
            "my $driver = \"mysql\"; \n" +
            "my $database = \"TESTDB\";\n" +
            "my $dsn = \"DBI:$driver:database=$database\";\n" +
            "my $userid = \"testuser\";\n" +
            "my $password = \"test123\";\n" +
            "\n" +
            "my $dbh = DBI->connect($dsn, $userid, $password ) or die $DBI::errstr;" +
            "my $sth = $dbh->prepare(\"INSERT INTO TEST_TABLE\n" +
            "                       (FIRST_NAME, LAST_NAME, SEX, AGE, INCOME )\n" +
            "                         values\n" +
            "                       ('john', 'poul', 'M', 30, 13000)\");\n" +
            "$sth->execute() or die $DBI::errstr;\n" +
            "$sth->finish();\n" +
            "$dbh->commit or die $DBI::errstr;";

    public static final String cgiProgrammingCode = "";

    public static final String packagesAndModulesCode = "# This is main package\n" +
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
            "print \"Package name : \" , __PACKAGE__ ,  \" $Foo::i\\n\"; \n";

    public static final String processManagementCode = "";

    public static final String[] allCodes = {
            introductionCode,
            environmentCode,
            syntaxOverviewCode,
            dataTypesCode,
            variablesCode,
            scalarsCode,
            arraysCode,
            hashesCode,
            ifElseCode,
            loopsCode,
            operatorsCode,
            dateAndTimeCode,
            subroutinesCode,
            referencesCode,
            formatsCode,
            filesCode,
            directoriesCode,
            errorHandlingCode,
            specialVariablesCode,
            codingstandardCodes,
            regularExpressionsCode,
            sendingEmailsCode,
            socketProgrammingCode,
            oopCode,
            databaseAccessCode,
            cgiProgrammingCode,
            packagesAndModulesCode,
            processManagementCode
    };

}
