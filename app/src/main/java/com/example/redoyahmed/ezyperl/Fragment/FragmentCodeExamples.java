package com.example.redoyahmed.ezyperl.Fragment;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.redoyahmed.ezyperl.R;
import com.example.redoyahmed.ezyperl.Utils.Code;
import com.example.redoyahmed.ezyperl.Utils.Codeview;
import com.example.redoyahmed.ezyperl.Utils.Settings;
import com.example.redoyahmed.ezyperl.Utils.TouchMyWebView;

import br.tiagohm.codeview.CodeView;
import br.tiagohm.codeview.Language;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by redoy.ahmed on 18-Mar-2018.
 */

public class FragmentCodeExamples extends Fragment implements CodeView.OnHighlightListener {

    @BindView(R.id.codeView)
    public TouchMyWebView codeView;

    private View rootView;
    private ProgressDialog mProgressDialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_code_examples, container, false);
        ButterKnife.bind(this, rootView);
        loadDataIntoWidgets();
        return rootView;
    }

    private void loadDataIntoWidgets() {
        Codeview.with(getContext())
                .setStyle(Code.DEFAULT_STYLE)
                .setAutoWrap(Code.autoWrap)
                .setLang(Settings.Lang.PERL)
                .withHtml("</br> </br>")
                .withHtml("<h1>1.Print Something</h1>")
                .withHtml("code:")
                .withCode("#!/usr/bin/perl\n" +
                        "\n" +
                        "use warnings;\n" +
                        "\n" +
                        "$s = \"something\";\n" +
                        " print $s, \"\\n\";\n")
                .withHtml("output:")
                .withCode("something")
                .withHtml("<h1>2.Declare a variable</h1>")
                .withHtml("code:")
                .withCode("#!/usr/bin/perl\n" +
                        "\n" +
                        "use strict;\n" +
                        "use warnings;\n" +
                        "\n" +
                        "print(\"hello world!/n\")\n" +
                        "my $x= 9;\n" +
                        "my $y= 2;\n;")
                .withHtml("output:")
                .withCode("hello world!\n")
                .withHtml("<h1>3.If/else condition</h1>")
                .withHtml("code:")
                .withCode("#!/usr/bin/perl\n" +
                        "use warnings;\n" +
                        "\n" +
                        "$x=10;\n" +
                        "$y=11;\n" +
                        "\n" +
                        "if($x>$y){\n" +
                        "    print\"$x is greater than $y\",\"\\n\";\n" +
                        "    }\n" +
                        "elsif($x==$y){\n" +
                        "    print\"$x is equal to $y\",\"\\n\"\n" +
                        "    }\n" +
                        "else{\n" +
                        "    print\"$x is less than $y\",\"\\n\";\n" +
                        "    }\n" +
                        "\n" +
                        "print $x==$y ? \"yes\":\"no\";")
                .withHtml("output:")
                .withCode("10 is less than 11\n" +
                        "no")
                .withHtml("<h1>4.Average of three numbers</h1>")
                .withHtml("code:")
                .withCode("#! usr/bin/perl\n" +
                        "\n" +
                        "$x = 4; \n" +
                        "$y = 6; \n" +
                        "$z=2;\n" +
                        "\n" +
                        "$avg= ($x+$y+$z)/3;\n" +
                        "\n" +
                        "print \"average of $x, $y and $z is $avg \\n\";")
                .withHtml("output:")
                .withCode("average of 4, 6 and 2 is 4\n")
                .withHtml("<h1>5.Print even numbers in a range</h1>")
                .withHtml("code:")
                .withCode("#!/usr/bin/perl\n" +
                        "\n" +
                        "use strict; \n" +
                        "use warnings;\n" +
                        "\n" +
                        "my $n=10;\n" +
                        "\n" +
                        "for(my $i=0;$i<$n;$i++){\n" +
                        "    if ($i % 2 == 0) {\n" +
                        "        print \"$i\\n\";\n" +
                        "    }\n" +
                        "}")
                .withHtml("output:")
                .withCode("0\n" +
                        "2\n" +
                        "4\n" +
                        "6\n" +
                        "8\n")
                .withHtml("<h1>6.Factorial of a number</h1>")
                .withHtml("code:")
                .withCode("#!/usr/bin/perl\n" +
                        "\n" +
                        "use warnings;\n" +
                        "\n" +
                        " my ($n) = 5;\n" +
                        " my $ln_factorial =\n" +
                        " (0.5 * log(2 * 3.14159265358979))\n" +
                        " + ($n + 0.5) * log($n)\n" +
                        " - $n + 1 / (12 * $n)\n" +
                        " - 1 / (360 * ($n ** 3));\n" +
                        " print 2.71828 ** $ln_factorial, \"\\n\";")
                .withHtml("output:")
                .withCode("119.999583952976\n")
                .withHtml("<h1>7.Celsius to Fahrenheit conversion</h1>")
                .withHtml("code:")
                .withCode("#!/usr/bin/perl\n" +
                        "\n" +
                        "use warnings;\n" +
                        "\n" +
                        "$x=50;\n" +
                        "print\"the value of celsius temperature is $x\\n\";\n" +
                        "\n" +
                        "my $y=($x*9/5)+32;\n" +
                        "print\"the value of fahrenheit is $y\",\"\\n\";\n")
                .withHtml("output:")
                .withCode("the value of celsius temperature is 50\n" +
                        "the value of fahrenheit is 122\n")
                .withHtml("<h1>8.String comparison in PERL</h1>")
                .withHtml("code:")
                .withCode("#!/usr/bin/perl\n" +
                        "\n" +
                        "my $s1= \"AATTGAACCTAACTT\";\n" +
                        "my $s2= \"TGCATAGCCGTAGC\";\n" +
                        "\n" +
                        "if ($s1 eq $s2) {\n" +
                        "    print \"same string\\n\"\n" +
                        "    }\n" +
                        " elsif ($s1 gt $s2) {\n" +
                        "     print \"$s1 is greater than $s2\\n\"\n" +
                        "     }\n" +
                        " elsif ($s1 lt $s2) {\n" +
                        "     print \"$s1 is less than $s2\\n\"\n" +
                        "     }")
                .withHtml("output:")
                .withCode("AATTGAACCTAACTT is less than TGCATAGCCGTAGC\n")
                .withHtml("<h1>9.Math operators</h1>")
                .withHtml("code:")
                .withCode("#!/usr/bin/perl\n" +
                        "\n" +
                        "use warnings; \n" +
                        "use strict;\n" +
                        "\n" +
                        "my $x= 4; \n" +
                        "my $y= 2;\n" +
                        "\n" +
                        "print(\"the sum of $x and $y is \",$x+$y,\"\\n\");\n" +
                        "\n" +
                        "my $z= $x-$y;\n" +
                        "\n" +
                        "print(\"$x minus $y is $z\",\"\\n\");\n" +
                        "print \"$x modulo $y is \", $x % $y, \"\\n\";\n" +
                        "print\"a random integer number up to $x is \", int(rand($x)),\"\\n\";")
                .withHtml("output:")
                .withCode("the sum of 4 and 2 is 6\n" +
                        "4 minus 2 is 2\n" +
                        "4 modulo 2 is 0\n" +
                        "a random integer number up to 4 is 0\n")
                .withHtml("<h1>10.Power of a number</h1>")
                .withHtml("code:")
                .withCode("#!/usr/bin/perl\n" +
                        " \n" +
                        " use warnings;\n" +
                        " \n" +
                        " $x=5;\n" +
                        " $y=2;\n" +
                        " \n" +
                        " print $x ** $y, \"\\n\";")
                .withHtml("output:")
                .withCode("25\n")
                .withHtml("<h1>11.Circle related code</h1>")
                .withHtml("code:")
                .withCode("# use strict;\n" +
                        "# use warnings;\n" +
                        "#! usr/bin/perl\n" +
                        "\n" +
                        "$r = 5;\n" +
                        "$diameter = (2 * $r);\n" +
                        "$area = (3.14 * ($r ** 2));\n" +
                        "$cir = ($diameter * 3.14);\n" +
                        "\n" +
                        "print \"Radius: $r\\n Diameter: $diameter\\n Circumference: $cir\\n Area: $area\";")
                .withHtml("output:")
                .withCode("Radius: 5\n" +
                        " Diameter: 10\n" +
                        " Circumference: 31.4\n" +
                        " Area: 78.5\n")
                .withHtml("<h1>12.Prime numbers</h1>")
                .withHtml("code:")
                .withCode("#!/usr/bin/perl \n" +
                        "\n" +
                        "for(my $i=2;$i<=10;$i++)\n" +
                        "{\n" +
                        "  my $flag = 0; \n" +
                        "  \n" +
                        "  for(my $j=2; $j<10/2; $j++)\n" +
                        "  { \n" +
                        "\tif(($i%$j)==0 && ($i!=$j)) \n" +
                        "\t{ \n" +
                        "\t\t$flag = 1;\n" +
                        "\t\tlast;\n" +
                        "\t} \n" +
                        "  } \n" +
                        " \n" +
                        "  if($flag != 1) \n" +
                        "  { \n" +
                        "    print \"$i\\n\"; \n" +
                        "  } \n" +
                        "}")
                .withHtml("output:")
                .withCode("2\n" +
                        "3\n" +
                        "5\n" +
                        "7\n")
                .withHtml("<h1>13.Pyramid</h1>")
                .withHtml("code:")
                .withCode("#!/usr/bin/perl\n" +
                        "\n" +
                        "for(my $j=7;$j>0;$j--)\n" +
                        "{\n" +
                        "    for(my $i=1; $i<=$j;$i++)\n" +
                        "    {\n" +
                        "        print\"*\" ;\n" +
                        "        print\" \";\n" +
                        "    }\n" +
                        "    print\"\\n\";\n" +
                        "}")
                .withHtml("output:")
                .withCode("2\n" +
                        "3\n" +
                        "5\n" +
                        "7\n")
                .withHtml("<h1>14.Another pyramid</h1>")
                .withHtml("code:")
                .withCode("#!/usr/bin/perl\n" +
                        "\n" +
                        "use strict; \n" +
                        "use warnings;\n" +
                        "\n" +
                        "my $n=5;\n" +
                        "\n" +
                        "for(my $i=1; $i<=$n; $i++)\n" +
                        "{\n" +
                        "   for(my $j=$i; $j<=$n; $j++)\n" +
                        "   {\n" +
                        "     print \" \";\n" +
                        "   }\n" +
                        "   for(my $k=1; $k<=$i; $k++)\n" +
                        "   {\n" +
                        "     print \"*\";\n" +
                        "     print \" \";\n" +
                        "   }\n" +
                        "   print \"\\n\";\n" +
                        "}")
                .withHtml("output:")
                .withCode("     * \n" +
                        "    * * \n" +
                        "   * * * \n" +
                        "  * * * * \n" +
                        " * * * * * \n")
                .withHtml("<h1>15.Full Pyramid</h1>")
                .withHtml("code:")
                .withCode("#!/usr/bin/perl\n" +
                        "use strict; \n" +
                        "use warnings;\n" +
                        "\n" +
                        "for(my $i=1; $i<=3; $i++)\n" +
                        "{\n" +
                        "   for(my $j=$i; $j<=3; $j++)\n" +
                        "   {\n" +
                        "     print \" \";\n" +
                        "   }\n" +
                        "   for(my $k=1; $k<=$i; $k++)\n" +
                        "   {\n" +
                        "     print \"*\";\n" +
                        "     print \" \";\n" +
                        "   }\n" +
                        "   print \"\\n\";  }\n" +
                        "\n" +
                        "\n" +
                        "for(my $i=2; $i>0; $i--)\n" +
                        "{\n" +
                        "   for(my $j=$i; $j<=2; $j++)\n" +
                        "   {\n" +
                        "     print \" \";\n" +
                        "   }\n" +
                        "   for(my $k=1; $k<=$i; $k++)\n" +
                        "   {\n" +
                        "     print \" \";\n" +
                        "     print \"*\";\n" +
                        "   }\n" +
                        "   print \"\\n\";  }")
                .withHtml("output:")
                .withCode("   * \n" +
                        "  * * \n" +
                        " * * * \n" +
                        "  * *\n" +
                        "   *\n")
                .withHtml("<h1>16.Right Angle pyramid</h1>")
                .withHtml("code:")
                .withCode("#!/usr/bin/perl\n" +
                        "use strict; \n" +
                        "use warnings;\n" +
                        "\n" +
                        "my $n=5;\n" +
                        "\n" +
                        "for(my $i=0; $i<$n; $i++) #this loop is for getting new line\n" +
                        "{\n" +
                        "   for(my $j=0; $j<=$i; $j++) #this loop is for printing *\n" +
                        "   {\n" +
                        "     print \"*\";\n" +
                        "   }\n" +
                        "   print \"\\n\";\n" +
                        "}")
                .withHtml("output:")
                .withCode("*\n" +
                        "**\n" +
                        "***\n" +
                        "****\n" +
                        "*****\n")
                .withHtml("<h1>17.Another pyramid</h1>")
                .withHtml("code:")
                .withCode("#!/usr/bin/perl\n" +
                        "use strict; \n" +
                        "use warnings;\n" +
                        "\n" +
                        "for(my $i=1; $i<3; $i++)\n" +
                        "{\n" +
                        "   for(my $j=0;$j<$i;$j++)\n" +
                        "   {\n" +
                        "     print\"*\";\n" +
                        "   }\n" +
                        "   print\"\\n\";\n" +
                        "}\n" +
                        "for(my $i=3; $i>0; $i--)\n" +
                        "{\n" +
                        "   for(my $j=0;$j<$i;$j++)\n" +
                        "   {\n" +
                        "     print\"*\";\n" +
                        "   }\n" +
                        "   print\"\\n\";\n" +
                        "}")
                .withHtml("output:")
                .withCode("*\n" +
                        "**\n" +
                        "***\n" +
                        "**\n" +
                        "*\n")
                .withHtml("<h1>18.Print ASCI value</h1>")
                .withHtml("code:")
                .withCode("#!/usr/bin/perl\n" +
                        "\n" +
                        "print ord(a),\"\\n\";\n" +
                        "print chr(125),\"\\n\";")
                .withHtml("output:")
                .withCode("97\n" +
                        "}\n")
                .withHtml("<h1>19.Scalar variable</h1>")
                .withHtml("code:")
                .withCode("#!/usr/bin/perl\n" +
                        "\n" +
                        "$x= 3;\n" +
                        "$y= 4;\n" +
                        "$z=$x+$y;\n" +
                        "print( $z, \"\\n\")")
                .withHtml("output:")
                .withCode("7\n")
                .withHtml("<h1>20.Arrays</h1>")
                .withHtml("code:")
                .withCode(" #!/usr/bin/perl\n" +
                        " \n" +
                        " use strict; use warnings;\n" +
                        "\n" +
                        " my @animals = qw(cat dog cow);\n" +
                        " my @sounds = qw( Meow Woof Moo);\n" +
                        " \n" +
                        " for (my $i = 0; $i < @animals; $i++) {\n" +
                        "    print chr(65+$i), \" $animals[$i] $sounds[$i]\\n\"; \n" +
                        "    }")
                .withHtml("output:")
                .withCode("A cat Meow\n" +
                        "B dog Woof\n" +
                        "C cow Moo\n")
                .withHtml("<h1>21.Array implementation in PERL</h1>")
                .withHtml("code:")
                .withCode(" #!/usr/bin/perl\n" +
                        " \n" +
                        " use strict; use warnings;\n" +
                        "\n" +
                        " my @animals = qw(cat dog cow);\n" +
                        " my @sounds = qw( Meow Woof Moo);\n" +
                        " \n" +
                        " for (my $i = 0; $i < @animals; $i++) {\n" +
                        "    print chr(65+$i), \" $animals[$i] $sounds[$i]\\n\"; \n" +
                        "    }")
                .withHtml("output:")
                .withCode("A cat Meow\n" +
                        "B dog Woof\n" +
                        "C cow Moo\n")
                .into(codeView);
    }

    @Override
    public void onStartCodeHighlight() {
        mProgressDialog = ProgressDialog.show(rootView.getContext(), null, "Carregando...", true);
    }

    @Override
    public void onFinishCodeHighlight() {
        if (mProgressDialog != null) {
            mProgressDialog.dismiss();
        }
    }

    @Override
    public void onLanguageDetected(Language language, int relevance) {
        Toast.makeText(rootView.getContext(), "language: " + language + " relevance: " + relevance, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFontSizeChanged(int sizeInPx) {
        Log.d("TAG", "font-size: " + sizeInPx + "px");
    }

    @Override
    public void onLineClicked(int lineNumber, String content) {
        Toast.makeText(rootView.getContext(), "line: " + lineNumber + " html: " + content, Toast.LENGTH_SHORT).show();
    }
}
