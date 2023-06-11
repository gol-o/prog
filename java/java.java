import java.util.Date;
import static java.lang.System.out; // import static element

public class Java {
    public static void main(String[] args) {
    }
}

// @formatter:off
/*********************************************************************************
/* Java Peculiarities
/*********************************************************************************
• James Gosling 1994
• Goal: complete operating system environment, Java physical machine
• Simplicity, C-Syntax
• Object orientation, Reusability
• Robustness (Faulttolerance, Memory, etc.)
• Performance (Compiler, Interpreter, Compiler)
• Scalability
• Portability and architecture neutrality
  • Platform neutral bytecode
  • Java virtual machine (JVM) as interpreter on each platform
• GUI
• Multithreading (concurrent programming)
• Automatic memory management (allocation and release)
• Exception handling
• Security

• Plattforms
  • Java Card (Chipkarte)
  • Java ME, Micro Edition (Embedded)
  • Java SE, Java API Standard Edition
  • Jave EE, Enterprise Edition (Web-App)
  • div. OS: Windows, Linux, Solaris, Mac OS X
• JDK Java Development Kit
  • Übersetzer, Bibliotheken
  • https://www.oracle.com
  • Alternatively: OpenJDK
• JRE Java Runtime Environment
  • Laufzeitumgebung, Programme ausführen
  • https://java.com
• Java SE Core API Docs
  • https://docs.oracle.com/en/java/javase/11/

• Release cycle
  • 6 months
  • 3 years with long term support (commercial)
  • some components are chargeable */

/*********************************************************************************
/* Virtual Machine
/*********************************************************************************
• JRE: Java Runtime Environment for Java programs
• JVM: Java Virtual Machine
• Java API: Main Java classes
• Further program libraries
• Generation of intermediate code (bytecode), no native machine code
• Java Virtual Machine (JVM)
• Abstraction layer between Java program and operating system
• Interpretation/Execution of Java bytecode
• JIT compiler → Just-In-Time compilation
• Each launched Java program runs in its own virtual machine
• Components JVM
  • Class loader and resolver
  • Garbage collection: Memory management and automatic memory cleaning
  • Execution engine */

/*********************************************************************************
/* Main Structure, predetermined Order
/*********************************************************************************
1. Package declaration (optional)
   • Namespace, preventing "name clashes"
   • Class libraries
   • Logically connected Classes
   • Position relative to the root directory (.class file)
2. Importdeclaration (optional)
   • brings certain classes or entire packages into visibility
   • java.lang implicitly
3. Type declarations
   • Public Class (one per file)
   • Classes
   • Interfaces */

/*
package location.usa.east;

import static java.lang.System.out; // import static element
import java.util.Date;
*/

// @formatter:on
class PowerStation {
    private static int peakPerf = 1250;
    private Date commissioning;

    public static void main(String[] args) {
        out.printf("Peak Performance: %d MW\n", peakPerf);
        PowerStation ps = new PowerStation();
    }
}

class Generator {
}

interface ControlUnit {
}

// @formatter:off
/*********************************************************************************
/* Commandline 
/*********************************************************************************
1. Windows Key, cmd, where java
2. set PATH=%PATH%;C:\Program Files\Java\jdk1.8.0_121\bin
3. cd %HOME%/Desktop
4. md javaprojects
5. cd javaprojects
6. notepad "Message.java" */

/*
package javaprojects;
import java.lang.string; // imported by default
import java.util.Date;
*/

// @formatter:on
/* public */ class Message {
    public static void main(String[] args) {
        System.out.println("Hello " + args[0] + ", today is " + new Date());
    }
}

// @formatter:off
/*
7. javac Message.java
8. java -cp ..\ javaprojects.Message Hans */

/*********************************************************************************
/* Batch, Java Archive
/*********************************************************************************
Batchfile
1. File: RunMessage.bat
@echo off
java Message
pause

2. Verknüpfung erstellen
Symbole: %SystemRoot%\system32\SHELL32.dll

JAR-File
1. pack: jar -cvf Message.jar Message.class
2. unpack and run: java -cp Message.jar Message

Eclipse: File/Export/Java... */

//================================================================================
// Eclipse Project
//================================================================================
// @formatter:off
class SysInfo {
    public static void main(String[] args) {
        System.out.println( System.getProperty( "java.version"     ) ); // sysout+ctrl+space
        System.out.println( System.getProperty( "os.version"       ) );
        System.out.println( System.getProperty( "user.name"        ) );
        System.out.println( System.getProperty( "user.home"        ) );
        System.out.println( System.getProperty( "console.encoding" ) );
        System.out.println( System.getProperty( "file.separator"   ) );
    }
}

/*********************************************************************************
/* Eclipse Shortcuts
/*********************************************************************************
ctrl+f11          run
f11               debug
ctrl+shift+b      toggle breakpoint
ctrl+./,          goto next/previous error
alt+shift+q       errorlog   
f2                error message
ctrl+1            quick fix
ctrl+shift+l      key assist
ctrl+d            delete line
ctrl+alt+↓/↑      copy line
alt+↓/↑           move line
ctrl+shift+p      matching bracket
ctrl+shift+/, c   comment
ctrl+shift+space  context info
ctrl+-            collapse
ctrl+shift+/      collapse all
ctrl+shift+f      reformat
alt+e+k           bookmark
alt+shift+q, q    bookmark view
for+ctrl+space    template for(...)
sysout+csp        template System.out...
ctrl+f7           change view
ctrl+f6           editors, switch between splitted windows
alt+→/←           switch tabs
ctrl+shift+m      add import
alt+shift+s       source
alt+shift+z       surround with
alt+shift+t       refactor
alt+shift+o       mark occurrences */

/*********************************************************************************
/* Eclipse Settings
/*********************************************************************************
font: window/preferences/general/appearance/colors, fonts/java/java editor
color theme: window/preferences/general/appearance/theme
spelling: window/preferences/general/editors/text editors/spelling
templates: window/preferences/java/editor/templates
code templates: window/preferences/java/code style/code templates, delete "TODO..."
keys: window/preferences/general/keys
typing, autoinsert: window/preferences/java/editor/typing
line numbers, show whitespace: window/preferences/general/editors/text editors
spaces for tabs: window/preferences/java/code style/formatter/edit/indentation
line wrapping: window/preferences/java/code style/formatter/edit/line wrapping
breadcrump: hide breadcrump
save actions: window/preferences/java/editor/save actions, format source code, configure/code style/use blocks...
export profile: window/preferences/java/codestyle/formatter/export all
export preferences: file/export/general/preferences

Searching
• regex for blanks before nl: \040+\r\n
• regex for multiple blank lines: ^(\r\n){2,} → \r\n

Views
• 'Outline' (package as symbol)
• 'Navigator' (package as folder)

• Project Properties
  • Java Build Path
    • Source, Libraries
      • Add JARs, Add Library
  • Java Code Style
    • Enable project specific settings
      • Qualify all generated field accesses with 'this'
      • Use 'is' prefix for getters that returned boolean
      • Add '@Override' annotation for new overriding methods
  • Java Compiler
    • Uncheck Preserve unused (never read) local variables
  • Java Editor
    • Save Actions: performs the selected actions on save
      • Format source code
      • Organize imports
      • Additional actions
        • Add missing '@Override' annotations
        • Remove unnecessary casts
  • Javadoc Location

Projectfolder/.project (XML)
<projectDescription>
  <name>Projectname</name>
  ...
</projectDescription>

Terminal
1. Help/Install New Software
2. List installed: 'What is already installed?' or Window/Preferences/Install/Update/Uninstall or update
3. Latest Eclipse Release ("http://download.eclipse.org/releases/latest")
4. Work with: --All Available Sites--
5. Search for: 'TM Terminal'
6. Symbol: 'Open a Terminal', Ctrl+Alt+Shift+T
7. Choose terminal: Local Terminal, Encoding: UTF-8

Terminate Process
• taskkill /f /im javaw*
• Task-Manager: Ctrl+Shift+Esc */

//================================================================================
// Eclipse Commandline Arguments
//================================================================================
// @formatter:off
class Commandline {
    /**
     * @param args
     * Übergabe von Aufrufparametern bei Programmstart
     * theoret. Eingabelänge: 8191 Zeichen
     * 1. Run/Run Configurations/Arguments
     * 2. Program arguments: 1317 Maier Produktion
     */
    public static void main(String[] args) {
        System.out.println( "Personalnummer: " + args[0] );
        System.out.println( "Name: "           + args[1] );
        System.out.println( "Abteilung: "      + args[2] );

        // more flexible
        for (String item : args) {
            System.out.println( item );
        }
    }
}

//================================================================================
// Javadoc
//================================================================================
// @formatter:off
/**
 * Implementierung der Personenklasse
 * 
 * @author T. Maier, Datum der letzten Änderung: 10.10.2010
 *         Steht in Verbindung mit der Klasse 'Personalverwaltung'
 * @see Personalverwaltung#graphInterface() Dialogmaske
 */
class Personal {
    /**
     * Methode 'save' für das Speichern aller Personaldatensätze
     *
     * @return Anzahl der gespeicherten Datensätze
     */
    static int save() {
        return 0;
    }

    /**
     * Methode 'abteilung' für das Festlegen der Abteilung
     *
     * @param args Übergabeparameter in Form der Abteilungsnummer
     */
    static void abteilung(int args) {
    }
}

/**
 * Generate Javadoc
 * 1. Project/Generate Javadoc
 * 2. Javadoc command: C:\Program Files\Java\jdk1.8.0_121\bin\javadoc.exe
 * 3. Destination: Projectpath
 */

//================================================================================
// Package
//================================================================================
// @formatter:off
/**
 * primär zur Gliederung einer Codebase
 * Vermeidung von Namenskonflikte (name clashes) bei großen Projekten 
 *   Entwicklerteam A und B möchten jeweils die Klasse CustomerSales verwenden
 *   Ad-hoc: CustomerSalesA, CustomerSalesB, ...
 *   Lösung: 1. File: CustomerSales.java
 *           2. Ordner customermanagement
 *              package customermanagement → class CustomerSales { }
 *           3. Ordner businessanalytics  
 *              package businessanalytics  → class CustomerSales { }
 * Struktur Java Framework
 *   C:\Program Files\Java\jdk1.8.0_45\src.zip\java: \awt \io \lang \math \time \ util u.a.
 * Programmcode eng verknüpft mit Speicherort (Paketanpassung beim Verschieben d. Klasse)
 * weitere Strukturierung mittels Subpackages, eine/mehrere public Klassen pro Package
 * speichereffizient im Vergleich zu geschachtelten Klassen
 * Darstellung: Packetsymbol
 */

/**
 * Calling convention
 * Package structure
 * a.b.c.ClassFile.class
 * Current position: File level => java -cp "..\..\.." a.b.c.ClassFile
 * alternatively "../../.." or ../../.. or ..\..\..
 * Current position: Package level => java a.b.c.ClassFile
 */

/**
 * Package Structure
 * No ambiguities since all import statements need to be fully qualified
 * 1. For creating an object of a class located in a different package the
 *    constructor of the class has to be public or protected (if derived).
 * 2. It is not possible to create an object of a nonpublic class in a 
 *    different package.
 *
 * default package +Base { }
 * a +Base { }
 * └b ~Base { }
 *  └c +Base { }
 *   └a +Base { }
 *   └b +Base { #Base() }
 *   └c +Base { #f() }
 *   └d Main { }
 * Base
 * a.Base
 * a.b.Base
 * a.b.c.Base
 * a.b.c.a.Base
 * a.b.c.d.Main
 * if Main tries to address Base
 */
// @formatter:off
class Main {
    void f() {
        Base bs; // error, classes in the default package cannot be imported
        a.Base b;
        a.b.Base b; // error, a.b.Base is not public (default package access level)
        a.b.c.Base b;
        a.b.c.a.Base b;

        class Derived extends a.b.c.b.Base { }
        Derived d = new Derived(); // ok, constructor protected
        d.f(); // error, protected method not visible
    }
}

//================================================================================
// Visibility and Scope
//================================================================================
// @formatter:on
class VisibilityScope {
    // 4 access modifiers
    int i; // package scope
    private int j;
    protected int k; // behaves like public in the same package and private in another
    public int l;

    // static elements
    static int s; // stored in the permanent generation area of heap (permgen)
    static Object o = new Object(); // reference would be stored in permgen whereas the Object itself
                                    // would be placed in young generation area of heap

    static void init() {
        VisibilityScope vs = new VisibilityScope();
        vs.j = 0; // ok, access to private element internally
    }
}

class VS1 {
    VS1() {
        VisibilityScope vs = new VisibilityScope();
        vs.i = 0;
        vs.j = 0; // error, private attribute (private access)
        vs.k = 0;
        vs.l = 0;
        vs.s = 0;
        VisibilityScope.s = 0;
    }
}

class VS2 extends VisibilityScope {
    VS2() {
        i = 0;
        j = 0; // error, private
        k = 0;
        l = 0;

        s = 0;
        VisibilityScope.s = 0;
    }
}

//================================================================================
// Datatypes
//================================================================================
// @formatter:off
class Datatypes {
    int i; // zero-initialized

    Datatypes() {
        // Integer
        int i; // not initialized
        System.out.println("value of i=" + i); // error

        // convenient reading of large numbers
        long l = 373_823_374_934L;
        int b = 0b1111_0000_1111_0000;
        int h = 0xAFAE_B00B;

        // String
        java.lang.String s = "Hello";

        // append whitespace
        s = "  ".concat(s).concat("  ");
        System.out.println(s);

        // delete needless whitespace (but doesn't modify s)
        System.out.println(s.trim());

        // reverse
        StringBuilder strBHello = new StringBuilder("Hello");
        strBHello.reverse(); // modifies string
        System.out.println("reversed=" + strBHello);
        strBHello.reverse();
        System.out.println("original=" + strBHello);

        System.out.println(new StringBuilder("reverse").reverse()/* .toString() */);

        // long string
        String strLong = "The basic concept of a pattern can also be seen as " +
                         "the basic concept of program design: adding a layer " +
                         "of abstraction.";

        // string literals produce memory garbage excluded from garbage collection
        String str1 = "abc"; // anonymous string object in the string pool cleaned up when the class is unloaded
        String str2 = "abc";
        System.out.println("str1 == str2 ?: " + (str1 == str2)); // have same address
        System.out.println("str1 hashcode=" + str1.hashCode());  // have same hashcode
        System.out.println("str2 hashcode=" + str2.hashCode());

        // referenced String objects
        String strRef1 = new String("abc");
        String strRef2 = new String("abc");
        System.out.println("strRef1 == strRef2 ?: " + (strRef1 == strRef2)); // have not same address

        String sr = new String("abc");
        StringBuffer sb = new StringBuffer("abc");

        System.out.println("compared=" + sr.compareTo(sb.toString())); // = 0
        System.out.println("equals=" + sr.equals(sb.toString()));      // true

        // compareTo method (not working on primitive types)
        char c1 = 'U', c2 = 'V';
        System.out.println("U - V = " + new Character(c1).compareTo(c2)); // -1
        // S1.compareTo(S2) → calculating CharacterCode(S1) - CharacterCode(S2)

        Character charObjA = new Character('A');
        System.out.println("character code A=" + (int) charObjA); // 65
        String sC = "C";
        // toCharArray transforms the string to an array of chars
        System.out.println("character code of \"C\"=" + (int) sC.toCharArray()[0]);

        // calculate the distance between the two characters, if the first operand is a
        // different type then the second one needs to be converted in that type
        // compareTo works only with uniform types
        System.out.println("A-C=" + charObjA.compareTo(sC.charAt(0)));
        System.out.println("Z-A=" + "Z".compareTo("A")); // ok
        System.out.println("Y-X=" + new Character('Y').compareTo('X'));

        // Date and Time
        System.out.println(new java.util.Date());

        // formatted date
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("MM-yyyy-EE");
        System.out.println(sdf.format(new Date()));

        // Date-format: EEEE/MMMM weekday name, month name written out
        sdf = new java.text.SimpleDateFormat("yyyy-MMMM-EEEE", java.util.Locale.ENGLISH);
        System.out.println(sdf.format(new Date()));
    }
}

//================================================================================
// Composite Types
//================================================================================
// @formatter:off
class BaseClass {
    int i;     // zero-initialized
    boolean b; // default false

    BaseClass() {
        System.out.println("First ctor");
        System.out.println(i); // 0
        System.out.println(b); // false
    }

    BaseClass(int i) {
        this(i, true); // call other constructor, must be the first statement
        System.out.println("second ctor");
    }

    BaseClass(int i, boolean b) {
        this.i = i;
        this.b = b;
        System.out.println("third ctor");
    }

    static void init() {
        // alternatively constructing objects with double brace initializer list but less efficient
        BaseClass bc = new BaseClass() {
            {
                i = 1;
                b = false;
            }
        };

        BaseClass[] bcArray = {
            new BaseClass() {
                {
                    i = 0;
                    b = true;
                }
            },
            new BaseClass() {
                {
                    i = 1;
                    b = true;
                }
            },
            new BaseClass() {
                {
                    i = 0;
                    b = false;
                }
            } 
        };

        System.out.println("i=" + bc.i + ", b=" + bc.b);
        System.out.println("i=" + bcArray[0].i);
    }
}

// @formatter:on
class InitializationBlock {
    int i;

    InitializationBlock() {
        System.out.println("ctor");
        System.out.println("i=" + i);
    }

    {
        // Initialization block performed before constructor execution 
        System.out.println("init block");
        i = 1;
    }
}

// @formatter:off
class StaticBlock {
    int i;
    static int s;

    StaticBlock() {
        System.out.println("ctor");
    }

    static
    {
        // performed when the class is loaded for the first time before constructor
        // execution (requires one object instantiation)
        System.out.println("static initialization block");
        s = 1; // initializing static field
        i = 1; // error, can't make a static reference to a non-static field
    }

    static void run() {
        StaticBlock s = new StaticBlock(); // executes static block
        StaticBlock s2 = new StaticBlock(); // class is already loaded, no static block
    }
}

class InitStaticBlock {
    // third action 
    InitStaticBlock()
    {
        System.out.println("constructor");
    }

    // second action
    {
         System.out.println("init block");
    }
    
    // first action
    static
    {
         System.out.println("static block");
    }
}

// @formatter:on
class Enums {
    enum Color {
        RED, GREEN, BLUE
    };

    Color col;
    Color col1 = Color.RED;

    Enums() {
        System.out.println(col); // null, therefore enum variable needs to be initialized 
        System.out.println(col1);
    }

    // improved enum
    enum Status {
        // mixed initial values
        ON(1), OFF(0), ERROR(-1), SERVICING("maintain"), CALL(223344, "Smith");

        int i;
        String s;

        // for every value in brackets exists a corresponding constructor
        Status(int i) {
            this.i = i;
            this.s = ""; // else null
        }

        Status(String s) {
            this.s = s;
        }

        Status(int i, String s) {
            this.i = i;
            this.s = s;
        }
    }

    Status s;

    Enums(int i) {
        // show enum values
        for (Status s : Status.values()) { // local s
            System.out.println(s);
            System.out.println(s.i);
            System.out.println(s.s);
        }

        // default value
        System.out.println(s); // output: null

        s = Status.SERVICING;
        System.out.println(s); // output: SERVICING
    }
}

// @formatter:off
class Array {
    Array() {
        double[] measurements = new double[500]; // zero-initialized

        for (double d : measurements) { // read only
            d = 1; // no effect
        }

        for (int i = 0; i < measurements.length; i++) {
            measurements[i] = Math.random();
        }

        // measurements implicit a type of Arrays class
        System.out.println(java.util.Arrays.toString(measurements)); // unsorted

        // sorting
        java.util.Arrays.sort(measurements); // overwrites the original values
        System.out.println(java.util.Arrays.toString(measurements)); // sorted

        // for preserving the original list create a clone
        int[] itemID = new int[1000];
        for (int i = 0; i < itemID.length; i++) { // fill the array with for-loop, Arrays fill-method not working 
            itemID[i] = (int) (5 * Math.random());
        }
        System.out.println(java.util.Arrays.toString(itemID));

        int[] itemClone = new int[1000];
        itemClone = itemID.clone();
        java.util.Arrays.sort(itemClone);
        System.out.println(java.util.Arrays.toString(itemClone));

        // object array
        class Person {
            String name = Character.toString((char) (new java.util.Random().nextInt(26) + 65));
            int age = new java.util.Random().nextInt(61) + 20;
        }

        Person[] personArray = new Person[1000]; // array of 1000 Person references
        java.util.Arrays.fill(personArray, new Person()); // duplicates the Person's reference

        for (int i = 0; i < personArray.length; i++) // usage of property length
            personArray[i] = new Person(); // create new Persons and let the references point to them

        for (Person p : personArray)
            System.out.println("Person: " + p.name + ", age=" + p.age);

        // alternative initializations
        // 1. use initialization list
        Person[] persArray1 = { new Person(), new Person() };

        // 2. use anonymous class based objects
        new Person() {
            {
                name = "A";
                age = 20;
            }
        };

        // array of anonymous objects
        Person[] persArray2 = 
            new Person[] { // with double braces and anonymous classes
                new Person() {
                    {
                        name = "A";
                        age = 30;
                    }
                },
                new Person() {
                    {
                        name = "B";
                        age = 50;
                    }
                },
                new Person() {
                    {
                        name = "C";
                        age = 40;
                    }
                }
            };

        for (Person p : persArray2)
            System.out.println("Person: " + p.name + ", age=" + p.age);

        // 3. use List
        java.util.List<Integer> integerList = java.util.Arrays.asList(1, 2, 3);
        Integer[] integerArray = integerList.toArray(new Integer[integerList.size()]);

        java.util.List<Person> persList = java.util.Arrays.asList(new Person(), new Person(), new Person());
        Person[] persArray3 = persList.toArray(new Person[persList.size()]);

        for (Person p : persArray3)
            System.out.println("Person: " + p.name + ", age=" + p.age);
    }
}

//================================================================================
// Inheritance
//================================================================================
// @formatter:on
class ParentClass {
    int i;
}

class ChildClass extends ParentClass {
    int i;

    ChildClass() {
        super.i = 2;
        i = 1;

        System.out.println("i form child=" + i);
        System.out.println("i from parent=" + super.i);
    }
}

// Abstract class
abstract class AbstC {
    // abstract method
    abstract void f();

    // inherited method
    void g() {
        // ...
    }
}

class A {
    void g() {
        AbstC abst; // allowed to declare a reference
        abst = new AbstC(); // error, no instance allowed
    }
}

class B extends AbstC {
    @Override
    void f() { // must override g from abstract Class
        // ...
    }

    @Override
    void g() { // should override f from abstract Class (optional)
        super.g(); // call to abstract class allowed
    }
}

interface I {
    public void f();
}

interface I1 extends I {
    public void g();
}

class C implements I1 {
    @Override
    public void f() { // must override f from Interface
        // ...
    }

    @Override
    public void g() {
        // ...
    }
}

// an override request may be forwarded
abstract class AbstC2 implements I1 {
}

abstract class AbstC3 extends AbstC2 {
}

class D extends AbstC3 {
    @Override
    public void f() {
    }

    @Override
    public void g() {
    }
}

class E extends AbstC3 { // error, interface hasn't been implemented
}

// Interface
class Interface {
    interface ICalc {
        abstract int operation(int a, int b); // optional abstract
    }

    class Adder implements ICalc {
        @Override
        public int operation(int a, int b) {
            return a + b;
        }
    }

    class Subtracter implements ICalc {
        @Override
        public int operation(int a, int b) {
            return a - b;
        }
    }

    class Multiplier implements ICalc {
        @Override
        public int operation(int a, int b) {
            return a * b;
        }
    }

    class Divider implements ICalc {
        @Override
        public int operation(int a, int b) {
            return a / b;
        }
    }

    Interface() {
        ICalc calculate; // generic reference

        calculate = new Divider(); // references instance of the implementing class
        System.out.println("class type: " + calculate.getClass()); // Interface$Divider

        int result = calculate.operation(441, 17);
        System.out.println("result of operation=" + result); // 25

        calculate = new Multiplier();
        result = calculate.operation(441, 17);
        System.out.println("result of operation=" + result); // 7497

        calculate = new Adder();
        result = calculate.operation(441, 17);
        System.out.println("result of operation=" + result); // 458

        calculate = new Subtracter();
        result = calculate.operation(441, 17);
        System.out.println("result of operation=" + result); // 424
    }
}

//================================================================================
// Streaming
//================================================================================
// @formatter:on
class Streaming {
    Streaming() {
        /**
         *--------------------
         * OutputStream
         *--------------------
         * Abstract superclass of all classes representing an output stream of bytes.
         * An output stream accepts output bytes and sends them to some sink.
         * Applications that need to define a subclass of OutputStream must always
         * provide at least the write-method that writes one byte of output.
         */
        class Output extends java.io.OutputStream {
            @Override
            public void write(int b) throws java.io.IOException {
                // ...
            }
        }

        /**
         *--------------------
         * FileOutputStream
         *--------------------
         * Class that implements the write-method of the OutputStream class (for byte streaming)
         * It is not guaranteed that the bytes will be persisted in the physical device.
         * On the contrary, in most cases they will be written in a system buffer.
         * It's the operating system's and the hardware's responsibility when and how to
         * write those bytes in the physical device.
         */
        // @formatter:off
        final String fileName = System.getProperty("user.home") +
                                java.io.File.separator + "Desktop" +
                                java.io.File.separator + "output.txt";

        // @formatter:on
        try {
            java.io.OutputStream out = new java.io.FileOutputStream(fileName);
            String content = "abcdefghijklmnopqrstuvwxyz";
            byte[] byteSequence = content.getBytes();

            out.write(byteSequence);
            out.write(byteSequence, 0, 2); // write subsequence

            System.out.println("ready.");
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        /**
         *--------------------
         * Writer
         *--------------------
         * Separator
         * OS dependent path separator
         *   windows: "\"
         *   linux: "/"
         * Line Separator
         *   windows: "\r\n" (CRLF, Wagenrücklauf, Zeilenvorschub)
         */
        java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("yyyy-MMMM-EEEE", java.util.Locale.ENGLISH);
        String formattedDate = df.format(new java.util.Date());

        String sp1 = java.io.File.separator;
        String sp2 = System.getProperty("file.separator"); // same as above but not type safe and can be overridden
        String usrDir = System.getProperty("user.home");
        String CRLF = System.getProperty("line.separator");

        java.io.File f1 = null, f2 = null;
        java.io.FileWriter fw = null;
        java.io.BufferedWriter bw = null;
        java.io.PrintWriter pw = null;

        // File
        f1 = new java.io.File(usrDir + sp1 + "Desktop" + sp1 + formattedDate + ".txt");
        f2 = new java.io.File(usrDir + sp2 + "Desktop" + sp2 + "test.txt");

        // Physical File
        // File object has no write-method and close-method, therefore a FileWriter is needed
        try {
            // file 1
            fw = new java.io.FileWriter(f1);
            fw.close();

            // file 2
            fw = new java.io.FileWriter(f2);
            fw.close();

            // FileWriter can be build without a File object
            fw = new java.io.FileWriter(usrDir + sp2 + "Desktop" + sp2 + "test.txt");
            fw.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        // File delete
        // @formatter:off
        if (javax.swing.JOptionPane.showConfirmDialog(null,
                                                      "Delete files?",
                                                      "",
                                                      javax.swing.JOptionPane.YES_NO_OPTION)
                == javax.swing.JOptionPane.YES_OPTION) {
            // @formatter:on
            f1.delete(); // throws no exception
            f2.delete();
            // alternatively the 'Files' class provides a delete method that throws an io-exception
            try {
                if (f1.exists()) { // files are already deleted
                    java.nio.file.Files.delete(f1.toPath());
                    // or
                    java.nio.file.Files.deleteIfExists(f2.toPath());
                }
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }

        // FileWriter
        // time measurement
        f1 = new java.io.File(usrDir + sp1 + "Desktop" + sp1 + "measurement data" + ".csv");
        long start = System.currentTimeMillis();
        System.out.println("Running...");
        try {
            fw = new java.io.FileWriter(f1);
            fw.write("#;measurement;time" + CRLF);
            for (long i = 0; i < 100_000_0; i++) {
                fw.write(Long.toString(i + 1) + ";");
                fw.write(Double.toString(Math.random()) + ";");
                fw.write(Long.toString(System.currentTimeMillis()) + CRLF);
            }
        } catch (java.io.IOException e1) {
            e1.printStackTrace();
        } finally {
            if (fw != null)
                try {
                    fw.close();
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }
        }
        System.out.println("Elapsed time=" + (System.currentTimeMillis() - start) + "ms");

        // Buffered Writer
        // Without buffering, each invocation of a write() method would cause characters
        // to be converted into bytes that would then be written immediately to the file
        // → inefficient
        start = System.currentTimeMillis();
        System.out.println("Running...");
        try {
            // @formatter:off
            bw = new java.io.BufferedWriter(
                    new java.io.FileWriter(f1));
            // @formatter:on
            bw.write("#;measurement;time" + CRLF);
            for (long i = 0; i < 100_000_0; i++) {
                bw.write(Long.toString(i + 1) + ";");
                bw.write(Double.toString(Math.random()) + ";");
                bw.write(Long.toString(System.currentTimeMillis()) + CRLF);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null)
                try {
                    bw.close(); // includes closing the wrapped FileWriter
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }
        }
        System.out.println("Elapsed time=" + (System.currentTimeMillis() - start) + "ms");

        // PrintWriter
        // for convenient writing different datatypes
        try {
            // @formatter:off
            pw = new java.io.PrintWriter(
                    new java.io.BufferedWriter(
                        new java.io.FileWriter(usrDir + sp1 + "Desktop" + sp1 + "measurement data.txt")));
            // @formatter:on
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        // print-method doesn't throw an exception but check-method could be used 
        pw.println("     #  data    time"); // implicit CRLF
        for (long i = 0; i < 100_000; i++) {
            pw.printf("%6d%8.4f%15d" + CRLF, i + 1, Math.random(), System.currentTimeMillis());
            if (pw.checkError()) {
                // an error has encountered
                System.out.println("printing error...");
                break;
            }
        }
        pw.close();

        // Reader
        try {
            java.io.FileReader fr = new java.io.FileReader(f1);
            java.io.BufferedReader br = new java.io.BufferedReader(fr);
            br.readLine(); // ignore first row
            String ss;
            double total = 0;
            long num = 0;
            while ((ss = br.readLine()) != null) {
                total += Float.parseFloat(ss.split(";")[1]);
                num++;
            }
            System.out.println("Average: " + total / num);
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

//================================================================================
// Inner classes
//================================================================================
// @formatter:off
/*
• Logically grouping classes that are only used in one place
• If a class is useful to only one other class and keep it together
• Kind of "Helper class"
• Increases encapsulation
• Nested class has access to private parts of the surrounding and may hidden from outside
• Can lead to more readable and maintainable code
• Nesting small classes within top-level classes places the code closer to where it is used
*/

// @formatter:on
class OuterClass {
    int i;
    public int j;
    private int k;
    protected int l;
    int m;

    // nested inner classes are called inner classes
    class InnerClass {
        int m; // m 'shadows' outer m of the enclosing
        private int n;

        // inner class can have a constructor
        InnerClass() {
            m = 1;
            n = 1;
        }

        void accessOuter() {
            // full access to Outer fields
            m = i;
            m = j;
            m = k;
            m = l;
            m = OuterClass.this.m; // access to outer attribute with this-method,
            f(); // call outer method
        }
    }

    void f() {
        System.out.println("f from outer");
        int s = OuterInner.s; // access to final static field
    }

    class OuterInner {
         static int s = 1; // error
        /* inner instances are always associated with an 
           outer instance, that is, the static fields won't 
           be exposed to other instances of outer class, thus,
           static fields aren't sharable between different 
           outer instances, because of that, static field 
           persistence vary for different instances of outer 
           class, so it will break the rules of static concept */

        final static int s = 1; // ok, compile-time constant (inlined)        

        class InnerInner {
            int i;
        }
    }

    //------------------
    // Static nested
    //------------------
    static class InnerStat // static classes are called static nested classes
    {
        static int i; // static attribute in static class ok
        static InnerClass s; /* static reference, but not initialized, access
                                leads to runtime error (nullpointer exception) */
        // static InnerClass s2 = new InnerClass(); // error, InnerClass is not static
        // enclosing context missing
        static InnerClass s3 = new OuterClass().new InnerClass(); /* ok, now
                                                                     initialized */
        int j;
    }

    private class PrivInnerClass /* inner classes can be declared private, public,
                                    protected or package private */
    {
        private int i;
    }

    //------------------
    // Local classes
    //------------------
    void g() // local classes (only final or abstract)
    {
        final class FinalClass {
            int i;

            void f() {
            }
        }

        abstract class AbstractClass {
            int i;

            void f() {
            }

            abstract void g();
        }

        final class FinalClass2 extends AbstractClass {
            @Override
            void g() {
            }
        }
    }

    OuterClass() {
        InnerClass innerRef;
        // innerRef.m = 0; // error, not static
        // innerRef.n = 0; // error

        InnerClass innerRef2 = null;
        // innerRef2.m = 0; // warning, null pointer access, runtime error

        // ++ Inner.m; // error, not static

        int m = ++new InnerClass().m; /* first create an instance to get access to
                                         inner m */
        System.out.println("value of inner m=" + m); // m=2

        int n = ++new InnerClass().n; // ok, access to inner private attribute
        System.out.println("value of inner private n=" + n); // n=2

        this.m = 1; // init membervariable, this reference because m is shadowed

        /* create an instance of InnerClass and get access to the hidden m of the
           OuterClass */
        new InnerClass().accessOuter();

        /* creation of an inner object without the enclosing outer object isn't
           possible */
        // new InnerClass2.InnerInnerClass(); // error
        int s = OuterInner.s; // access to static ok

        // first create an 'outer' object
        OuterInner i = new OuterInner();
        // then apply the new operator on the outer object
        OuterInner.InnerInner ii = i.new InnerInner();
        // OuterInner.InnerInner ii = new i.InnerInner(); // error, i isn't a type
        // or in short form
        OuterInner.InnerInner ii2 = new OuterInner().new InnerInner();
        // . ↔ 'opens' the outer class and makes the inner class 'visible'

        // inner, outer different types
        // ii = (OuterInner.InnerInner)i; // error

        // access to static class
        this.i = InnerStat.i; // direct, i static element in static class
        this.i = new InnerStat().j; // j non-static hence create object

        /* static inner class type can be addressed directly, therefore it's not
           necessary to create an outer object */
        OuterClass.InnerStat o = new OuterClass.InnerStat();

        // access to private inner class
        this.i = new PrivInnerClass().i; // inside the class ok
    }

    //------------------
    // Inheritance in
    // inner classes
    //------------------
    class InnerDerivation {
        class InnerBase {
        }

        class InnerDerivedInner extends InnerBase {
            int i = OuterClass.InnerDerivation.InnerDerivedOuter.s;
        }

        class InnerDerivedOuter extends OuterBase {
            InnerDerivedOuter() {
                /* an inner class can't define static elements, but can
                   inherit static elements */
                int j = i; // i inherited from OuterBase
                int k = s; // s inherited from OuterBase
                int l = OuterClass.InnerDerivation.InnerDerivedOuter.s; // classpath
                int m = OuterBase.s;
            }
        }

        class AccessToDerivedStatic {
            // get the inherited static element
            int getStatic() {
                return InnerDerivedOuter.s;
            }

            void get() {
                // fully qualified datatype
                OuterClass.InnerDerivation.AccessToDerivedStatic obj = new OuterClass.InnerDerivation.AccessToDerivedStatic();

                System.out.println("static value=" + obj.getStatic());
            }
        }
    }
}

class OuterBase {
    int i;
    static int s;
}

//------------------
// Memory leaks
//------------------
class LeakFactory {
    /* non-static inner classes holds a reference to the instance
       of the outer class */
    class Leak {
        double[] data = new double[5];

        Leak() {
            java.util.Arrays.fill(data, java.lang.Math.PI);
        }

        protected void finalize() // must be protected
        {
            System.out.println("Leak dying");
        }
    }

    Leak getLeak() {
        return new Leak();
    }

    protected void finalize() // must be protected
    {
        System.out.println("Factory dying");
    }
}

class MemoryLeak {
    LeakFactory.Leak[] leaker;

    MemoryLeak() {
        leaker = new LeakFactory.Leak[3];
        LeakFactory factory = new LeakFactory();

        for (int i = 0; i < leaker.length; i++) {
            leaker[i] =

                    /* version 1: usage of factory instance for all leaks */
                    // factory.getLeak();

                    /* version 2: anonymous object instantiation */
                    new LeakFactory().getLeak(); /* normally LeakFactory dies immediately
                                                    after creation, but since getLeak keeps
                                                    it alive, it dies after getLeak has 
                                                    already died */

            System.out.println("#" + (i + 1));
            for (int j = 0; j < leaker[i].data.length; j++)
                System.out.println("#" + (j + 1) + ": " + leaker[i].data[j]);
        }
    }

    static void run() {
        new MemoryLeak();
        System.gc(); // call garbage collector

        new java.util.Scanner(System.in).next(); // wait for input 
    }
}

//------------------
// Examples
//------------------
class Hybrid {
    int power;

    class ElectricEngine {
        final int power = 100;
    }

    class FuelEngine {
        final int power = 150;
    }

    Hybrid() {
        power = new ElectricEngine().power + new FuelEngine().power;
        System.out.println("power total=" + power);
        System.out.println("system ready.");
    }
}

abstract class Sensor extends javax.swing.JFrame {
    @Override
    public void paint(java.awt.Graphics g) {
        g.drawImage(circuit, 0, 50, this);
    }

    void getImage(String imagePath) {
        circuit = java.awt.Toolkit.getDefaultToolkit().getImage(imagePath);
        setVisible(true);
        setSize(500, 500);
    }

    final float price;
    final String supplier;
    final String subassembly;
    final String designation;
    final java.util.Date commissioning;
    java.util.Date lastReview;
    java.awt.Image circuit;

    public float getPrice() {
        return price;
    }

    public Sensor(float price, String supplier, String subassembly, String designation) {
        this.commissioning = new Date();
        this.price = price;
        this.supplier = supplier;
        this.subassembly = subassembly;
        this.designation = designation;
    }

    abstract void initiateTestMode();
}

class MagneticSensor extends Sensor {
    public MagneticSensor(float voltageSupply, float powerConsumption, float price, String supplier, String subassembly, String designation, float sensitivity) {
        super(price, supplier, subassembly, designation);
        this.voltageSupply = voltageSupply;
        this.powerConsumption = powerConsumption;
        this.sensitivityRef = new Sensitivity(sensitivity);
        this.workingTemperature = new WorkingTemperature();
    }

    public MagneticSensor() {
        super(10, "MRA", "UNIT-A", "M333");
        this.voltageSupply = 3;
    }

    final float voltageSupply;
    float powerConsumption;

    class WorkingTemperature {
        float workingTemperature;
        final char[] unit = "°C".toCharArray();
    }

    class Sensitivity {
        float sensitivity;
        static final String unit = "mV/gauss";

        public Sensitivity(float sensitivity) {
            this.sensitivity = sensitivity;
        }
    }

    static class Sensitivity2 {
        float localSensitivity;
        static float globalSensitivity;
        static final String unit = "mV/gauss";
    }

    // references for access
    WorkingTemperature workingTemperature = null;
    Sensitivity sensitivityRef = null;

    @Override
    void initiateTestMode() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

class PhotoelectricSensor extends Sensor {
    public PhotoelectricSensor(float price, String supplier, String subassembly, String designation) {
        super(price, supplier, subassembly, designation);
    }

    static final String type = "Photoelectric";
    static final String model = "";
    float inputCurrent;
    float inputVoltage;
    float outputVoltage;

    @Override
    void initiateTestMode() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

class SensorTypes {
    SensorTypes() {
        MagneticSensor m = new MagneticSensor(3, 0.01f, 2.5f, null, null, null, 0.05f);
        m.getImage(System.getProperty("user.home") + java.io.File.separator + "Desktop" + java.io.File.separator + "SetResetCircuit.png");
        m.sensitivityRef.sensitivity = .6f;

        MagneticSensor.Sensitivity sensObj = new MagneticSensor().new Sensitivity(.5f);
        m.sensitivityRef = sensObj;

        String unit = MagneticSensor.Sensitivity.unit; // directly
        MagneticSensor.Sensitivity2.globalSensitivity = 0.04f;

        // non-static element as new inner instance
        MagneticSensor.Sensitivity2 sensObj2 = new MagneticSensor.Sensitivity2();
        sensObj2.localSensitivity = 0.03f;
    }
}

//============================
// Anonymous classes
//============================

/* Anonymous classes are expressions which defines a nameless class in an
   expression, they are derived from existing classes or interfaces and have only
   one unique defintion with with simultaneous creation of an object */

class AnonymousClass {
    // nested class
    class Inner {
        int i;

        Inner() {
            i = 0;
        }

        void innerFunc() {
            System.out.println("Inner responding");
        }
    }

    void getObject(Inner in) // get an Inner object
    {
        in.innerFunc();
    }

    AnonymousClass() {
        // passing an Inner Object
        getObject(new Inner()); // 1. output: Inner responding

        // passing an anonymous class with overwritten base class method
        getObject(new Inner() /* 2. output: 'overwritten',
                                 innerFunc() has been changed */
        {
            // overwrite method innerFunc() and change behaviour
            void innerFunc() {
                System.out.println("overwritten");
            }
        });
        // defining local anonymous class in a method 
        methodWithAnonClass();

        // deriving from an inner class and use double initialization
        class Derived extends Inner {
            { /* initialization block */
                i = 1;
            }
        }
    }

    void methodWithAnonClass() {
        int local = 2;
        final int local2 = 3;

        Object o = new Object() {
            int i;
            int j;
            { /* initializer list (instance initialization section)
               this can be used for double brace initialization */
                i = local;
                j = local2;
            }

            public int getInner() {
                return i;
            }
        };
        System.out.println(o.getClass().getName());
        // System.out.println(o.getInner()); // error, not visible
    }
}

/* Problems with double brace initialization
   If there are different implementations of the equal-method, which doesn't
   allow instances of subclasses to be passed for comparison then precaution
   should be taken when double brace initialization is applied. 
   Another problem is that all anonymous classes contain a reference to their 
   enclosing instance so the incurred memory chunks won't be considered by the
   garbage collector */

class DoubleBraceInitialization {
    class Person {
        String name;
        int age;

        void personList() /* static methods in non-static inner classes not allowed
                             there is no chance to access a non-static inner class
                             instance without going through an outer class instance */
        {
            Person p = new Person() {
                {
                    name = "frank";
                    age = 40;
                }
            };
            // Person[] pl1 = new Person[]; // error
            Person[] pl2 = new Person[10];
            // Person[] pl3 = new Person[] {  name="frank"; age=30; };  // error
            // Person[] pl4 = new Person[] {{ name="frank"; age=30; }}; // error
            Person[] pl5 = new Person[] { new Person(), new Person() };
            Person[] pl6 = new Person[] { new Person() {
                {
                    name = "jeff";
                    age = 33;
                }
            }, new Person() {
                {
                    name = "tom";
                    age = 44;
                }
            } };
            for (Person person : pl6)
                System.out.println(person.name + ", age=" + person.age);
        }
    }

    class PersonComparison1 extends Person {
        @Override
        /* method 1 */
        public boolean equals(Object o) {
            if (o instanceof Person) {
                Person p = (Person) o;
                return name.equals(p.name) && age == p.age;
            }
            return false;
        }
    }

    class PersonComparison2 extends Person {
        @Override
        /* method 2 */
        public boolean equals(Object o) {
            if (o != null && o.getClass().equals(Person.class)) {
                Person p = (Person) o;
                return name.equals(p.name) && age == p.age;
            }
            return false;
        }
    }

    DoubleBraceInitialization() {
        // compare 2 persons with equals method-1
        // (instance check, accepts subclasses)
        PersonComparison1 p1 = new PersonComparison1() {
            {
                name = "Tom";
                age = 30;
            }
        };
        PersonComparison1 p2 = new PersonComparison1() {
            {
                name = "Tom";
                age = 30;
            }
        };
        System.out.println("p1 is equals p2: " + p1.equals(p2)); // true
        // anonymous subclass is an instance of Person class
        System.out.println("p1, p2 are instance of Person class: " + (p1 instanceof Person) + ", " + (p2 instanceof Person));

        // compare 2 persons with equals method-2
        // (getClass check, doesn't accept subclasses)
        PersonComparison2 p3 = new PersonComparison2() {
            {
                name = "Tom";
                age = 30;
            }
        };
        PersonComparison2 p4 = new PersonComparison2() {
            {
                name = "Tom";
                age = 30;
            }
        };

        System.out.println("p3 is equals p4: " + p3.equals(p4)); // false
        // anonymous subclass is not equals Person class

        System.out.println("getClass p3, p4 provides Person class: " + (p3.getClass().equals(Person.class)) + ", " // false
                + (p4.getClass().equals(Person.class))); // false
        System.out.println(p3.getClass()); // class javabasics.DoubleBraceInitialization$3
        System.out.println(p4.getClass()); // class javabasics.DoubleBraceInitialization$4
        // compare: object.getClass(), Class.class, Class.getClass() → error
    }
}

/* Derivation from an inner class without enclosing context of the outer class
   gives an error, remedy: make the inner class static */
class DerivedFromInnerClass /* extends AnonymousClass.Inner */
{
    {
        // i = 1;
    }
}

class DerivedFromInnerClass2 {
    static class A {
        static class B {
            static class C {
            }
        }
    }

    class D extends A.B.C {
    }
}

class DerivedFromInnerClass3 extends DerivedFromInnerClass2.A.B.C // ok
{
}

//============================
// Graphics
//============================

class Frame {
    Frame() {
        /* create a top-level window with title and border (the border area
           is included in the overall size of the frame) */
        java.awt.Frame f = new java.awt.Frame();

        // dimensions: width 400, height 400 
        f.setSize(400, 400);
        // or
        f.setSize(new java.awt.Dimension(400, 400));

        // move and resize the component, 500 x 500 frame @ position 400/200
        f.setBounds(400, 200, 500, 500);

        f.setVisible(true);
        f.setBackground(java.awt.Color.red);

        // create a Graphics context for this frame
        java.awt.Graphics g = f.getGraphics();

        // set brush color
        g.setColor(java.awt.Color.white);

        /* methods for refreshing screen */
        switch (3) {
        case 1: // 1. draw directly
        {
            g.drawString("direct...", 150, 30); // but unstable behavior
            break;
        }
        case 2: // 2. loop
        {
            for (int i = 50; i < 400; i += 10) {
                g.drawString("loop...", i, i);
            }
            break;
        }
        case 3: // 3. update (unstable) 
        {
            f.update(g); /* forwarding the update to any 
                            lightweight components, must stand before
                            each draw-operation */
            g.drawString("update...", 200, 100);
            break;
        }
        case 4: // 4. printAll
        {
            f.printAll(g);
            g.drawString("print...", 200, 100);
            break;
        }
        case 5: // 5. derivation
        {
            //...
            break;
        }
        }
    }
}

class FrameBarChart {
    FrameBarChart() {
        java.awt.Frame f = new java.awt.Frame();
        f.setBounds(400, 200, 500, 500);
        f.setVisible(true);
        f.setBackground(java.awt.Color.red);

        /* WindowListener for close the window with system X-symbol
           Frame has no default close operation like JFrame therefore
           it's mandatory to define a close operation for fully termination
           of the java process */
        f.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                e.getWindow().dispose();
                System.exit(0);
            }
        });

        // KeyListener for close window by pressing any key
        f.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                f.dispose(); /* terminate window (and perhaps
                                the java vm), for terminating
                                the vm in any case use 
                                System.exit(0) */
                System.exit(0);
            }
        });

        java.awt.Graphics g = f.getGraphics();
        g.setColor(java.awt.Color.white);
        f.printAll(g);

        /* the hidden upper left position (0,0) is under the title bar of the
           frame window */
        // draw a box
        g.drawLine(8, 30, 300, 30); // height title bar: ~ 30 pixels
                                    // width left window border: ~ 8 pixels
        g.drawLine(300, 30, 300, 200);
        g.drawLine(300, 200, 8, 200);
        g.drawLine(8, 200, 8, 30);

        // draw a random bar chart
        for (int i = 1; i < 11; i++) {
            g.setColor(new java.awt.Color(120, 120, 25 * i));
            g.fillRect(20 * i, 200, 10, (int) (-Math.random() * 150));
        }
    }
}

class JFrameLines {
    JFrameLines() {
        javax.swing.JFrame f = new javax.swing.JFrame();
        f.setBounds(200, 200, 500, 500);
        f.setVisible(true);

        /* JFrame has a default close operation
           without setting that the process may still run 
           after closing the window */
        f.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);

        /* JFrame has a default pane, so either the pane background color has
           to be transparent and the frame color dominates or only pane's 
           background color is visible */
        f.setBackground(java.awt.Color.blue); // at first this has no effect
        // setting panes alpha-channel
        int alpha;
        alpha = 255; // ↔ opaque
        alpha = 0; // ↔ transparent
        f.getContentPane().setBackground(new java.awt.Color(0, 0, 0, alpha));
        // now the the frame background color is shining through (blue)

        java.awt.Graphics g = f.getGraphics();
        java.util.Random r = new java.util.Random();
        // random lines
        while (true) {
            g.drawLine(0, 0, r.nextInt(500), r.nextInt(500));
            g.setColor(new java.awt.Color(0, 0, r.nextInt(255)));
        }
    }
}

class JFrameTextAlignment {
    JFrameTextAlignment() {
        javax.swing.JFrame f = new javax.swing.JFrame();
        f.setBounds(500, 500, 300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        boolean b = false;

        // ContentPane background color blue
        f.getContentPane().setBackground(java.awt.Color.blue);

        // Frame foreground color yellow
        f.setForeground(java.awt.Color.yellow);

        // ContentPanes foreground color determines added components (label, etc.)
        f.getContentPane().setForeground(java.awt.Color.red);

        java.awt.Graphics gF = f.getGraphics(); // frame context
        java.awt.Graphics gP = f.getContentPane().getGraphics(); // pane context

        int fontsize = 20; // in pt = 1/72 x inch
        // Font object
        java.awt.Font font = new java.awt.Font("Sans Serif", java.awt.Font.PLAIN, fontsize);
        gF.setFont(font);
        gP.setFont(font);

        gP.setColor(java.awt.Color.red);
        gF.drawString("Frame", 0, 100); /* frames x=0 coordinate is covered
                                           by the border */

        // content pane's origin is below frame's title bar
        gP.drawRect(0, 0, 200, 100);

        /* methods to convert fontsize (pt) to pixels */
        // 1. calculate screen resolution
        int dpi = java.awt.Toolkit.getDefaultToolkit().getScreenResolution();
        int pix = (int) (fontsize * dpi / 72.0); // fontsize * 96 / 72

        // 2. calculate font's height
        if (b) {
            int height = gP.getFontMetrics().getHeight(); // 26 pixels

            // distances from baseline to top/bottom
            int ascend = gP.getFontMetrics().getAscent(); // 21 pixels
            int descend = gP.getFontMetrics().getDescent(); // 5 pixels

            gP.drawString("Pane", 0, pix);
            gP.drawString("Pane", 60, height);
            gP.drawString("Pane", 180, 15);
        }

        // 3. retrieve font properties
        // calculating centered vertical assignment
        if (b) {
            int top = 150;
            int bottom = 250;
            int center = top + (bottom + 1 - top) / 2; // integer division +1

            gP.setColor(java.awt.Color.white);
            gP.drawLine(0, top, 100, top);
            gP.drawLine(0, bottom, 100, bottom);
            gP.setColor(java.awt.Color.green); // draw centerline
            gP.drawLine(0, center, 100, center);

            // calculate the modified baseline
            java.awt.FontMetrics fm = gP.getFontMetrics(font);
            int baseline = center + fm.getAscent() - (fm.getAscent() + fm.getDescent() / 2);
            gP.drawString("centered", 0, baseline);
        }

        // 4. calculate enclosing rectangle
        if (b) {
            java.awt.FontMetrics fm = gP.getFontMetrics(font);
            java.awt.geom.Rectangle2D rect = fm.getStringBounds("Pane", gP);

            int textHeight = (int) (rect.getHeight());
            int textWidth = (int) (rect.getWidth());
            int panelHeight = f.getContentPane().getHeight();
            int panelWidth = f.getContentPane().getWidth();

            int x = (panelWidth - textWidth) / 2 - fm.getAscent();
            int y = (panelHeight - textHeight) / 2 + fm.getAscent();

            gP.drawString("Pane", x, y);
            gP.drawRect(x, y, textWidth, textHeight);
        }

        // 5. use TextLayout
        b = true;
        if (b) {
            // getFontRenderContext works only with Graphics2D objects
            java.awt.Graphics2D g2D = (java.awt.Graphics2D) gP;
            java.awt.font.FontRenderContext frc = g2D.getFontRenderContext();
            java.awt.font.TextLayout layout = new java.awt.font.TextLayout("TextLayout", font, frc);
            java.awt.geom.Rectangle2D bounds = layout.getBounds(); // returns a
                                                                   // rectangle
                                                                   // center (only calculated)
            int x = (int) ((f.getContentPane().getWidth() - bounds.getWidth()) / 2.0);
            int y = (int) ((f.getContentPane().getHeight() + bounds.getHeight()) / 2.0);
            g2D.setFont(font);
            g2D.setColor(java.awt.Color.green);
            // subtract font leading space
            g2D.drawString("TextLayout", 100, (int) (bounds.getHeight() - layout.getLeading()));
        }
    }
}

class JFrameCircle {
    JFrameCircle() {
        javax.swing.JFrame f = new javax.swing.JFrame();
        f.setBounds(500, 500, 300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(java.awt.Color.blue);
        java.awt.Graphics g = f.getGraphics();
        f.printAll(g);

        for (int i = 0; i < 360; i += 2) {
            g.setColor(new java.awt.Color((int) (i * 255.0 / 360), (int) (i * 255.0 / 360), (int) (i * 255.0 / 360)));
            g.drawLine(150, 150, 150 + (int) (Math.cos(Math.toRadians(i)) * 100), 150 - (int) (Math.sin(Math.toRadians(i)) * 100));
        }
    }
}

/*
 * the border area is included in the overall size of the frame,
 *  the border effectively obscures a portion of the frame, constraining
 *   the area available for rendering and/or displaying subcomponents
 *    to the rectangle which has an upper-left corner location of
 *     (insets.left, insets.top), and has a size
 *      of width - (insets.left + insets.right) by height - 
 *      (insets.top + insets.bottom). 
 */

//        if (javax.swing.JOptionPane.showConfirmDialog(
//                    null,
//                    "Close Frame?",
//                    "Dialog",
//                    javax.swing.JOptionPane.YES_NO_OPTION)
//        == javax.swing.JOptionPane.YES_OPTION)
//           f.dispose();

class BombTrajectory {
    BombTrajectory() {
        int x0 = 20, y0 = 200, w = 60 /* winkel */, i = 0;
        float h = 0.001f, s = 0.001f, t = 0.001f, g = 9.81f, v0 = 50 /* velocity */;

        javax.swing.JFrame f = new javax.swing.JFrame();
        f.setBounds(500, 500, 300, 300);
        f.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.getContentPane().setBackground(java.awt.Color.black);
        java.awt.Graphics G = f.getContentPane().getGraphics();
        G.setColor(java.awt.Color.white);

        java.text.DecimalFormat dt = new java.text.DecimalFormat("0.0000");
        java.text.DecimalFormat ds = new java.text.DecimalFormat("0.00");

        do {
            // Formula: h = v0·sin(w)·t-½·g·t², s = v0·cos(w)·t
            h = v0 * (float) Math.sin(Math.toRadians(w)) * t - 0.5f * g * (float) Math.pow(t, 2);
            s = v0 * (float) Math.cos(Math.toRadians(w)) * t;
            System.out.printf("%10d%8.4f%10.4f%10.4f\n", i++, t, y0 - h, x0 + s);

            // draw sphere and data
            G.setColor(java.awt.Color.white);
            G.fillOval((int) (x0 + s), (int) (y0 - h), 10, 10);
            G.drawString("# " + Integer.toString(i), 20, 50);
            G.drawString("t/ms = " + dt.format(t), 20, 70);
            G.drawString("h/m = " + ds.format(h), 20, 90);
            G.drawString("s/m = " + ds.format(s), 20, 110);

            // delay
            try {
                Thread.sleep(1, 500000);
            } catch (Throwable th) {
            }

            // delete for next iteration
            G.setColor(java.awt.Color.black);
            G.fillOval((int) (x0 + s), (int) (y0 - h), 10, 10);
            G.drawString("# " + Integer.toString(i), 20, 50);
            G.drawString("t/ms = " + dt.format(t), 20, 70);
            G.drawString("h/m = " + ds.format(h), 20, 90);
            G.drawString("s/m = " + ds.format(s), 20, 110);

            t += 0.002;
        } while (h > 0);
    }
}

class BombTrajectoryDoubleBuffered {
    BombTrajectoryDoubleBuffered() {
        int x0 = 20, y0 = 200, w = 60 /* winkel */, i = 0;
        float h = 0.001f, s = 0.001f, t = 0.001f, g = 9.81f, v0 = 50 /* velocity */;

        javax.swing.JFrame f = new javax.swing.JFrame();
        f.setBounds(500, 500, 300, 300);
        f.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.getContentPane().setBackground(java.awt.Color.black);
        java.awt.Graphics G = f.getContentPane().getGraphics();
        G.setColor(java.awt.Color.white);

        java.text.DecimalFormat dt = new java.text.DecimalFormat("0.0000");
        java.text.DecimalFormat ds = new java.text.DecimalFormat("0.00");

        java.awt.GraphicsConfiguration gfxConf = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();

        java.awt.image.BufferedImage buf = gfxConf.createCompatibleImage(f.getWidth(), f.getHeight(), java.awt.image.BufferedImage.TYPE_INT_ARGB);
        G = buf.createGraphics();
        do {
            // Formula: h = v0·sin(w)·t-½·g·t², s = v0·cos(w)·t
            h = v0 * (float) Math.sin(Math.toRadians(w)) * t - 0.5f * g * (float) Math.pow(t, 2);
            s = v0 * (float) Math.cos(Math.toRadians(w)) * t;
            System.out.printf("%10d%8.4f%10.4f%10.4f\n", i++, t, y0 - h, x0 + s);

            // draw sphere and data
            G.setColor(java.awt.Color.white);
            G.fillOval((int) (x0 + s), (int) (y0 - h), 10, 10);
            G.drawString("# " + Integer.toString(i), 20, 50);
            G.drawString("t/ms = " + dt.format(t), 20, 70);
            G.drawString("h/m = " + ds.format(h), 20, 90);
            G.drawString("s/m = " + ds.format(s), 20, 110);

            while (!f.getGraphics().drawImage(buf, 0, 0, null))
                ;

            // delay
            for (long j = 0; j < 300_000L; j++)
                ;

            // 'delete' for next iteration
            G.setColor(java.awt.Color.black);
            G.fillRect(0, 0, f.getWidth(), f.getHeight()); /* will be drawn in
                                                              the next cycle */
            t += 0.002;

        } while (h > 0);
    }
}

class FrameDerived extends java.awt.Frame {
    FrameDerived() {
        setSize(500, 500);
        setVisible(true);
        setBackground(java.awt.Color.black);
        setForeground(java.awt.Color.white);
    }

    java.util.Random r = new java.util.Random();

    /* the default mechanism is to override the paint- or paintComponent-method
       update: clears the graphics context and calls then paint
       paint : displays the graphical data (in a loop with repaint) */
    @Override
    public void paint(java.awt.Graphics g) {
        super.paint(g);
        g.drawLine(250, 250, (int) (250 + 250 * r.nextGaussian()), (int) (250 + 250 * r.nextGaussian()));
        for (int j = 0; j < 2_000_000; j++)
            ;
        repaint(); // repeat drawing 
    }

    /* update-method could be overridden if the content of the graphics area
       shall be kept */
    @Override
    public void update(java.awt.Graphics g) {
        // comment out super.update for keeping graphics
        super.update(g);

        paint(g);
    }
}

class FrameDerivedDoubleBuffered extends java.awt.Frame// implements java.awt.event.ActionListener
{
    FrameDerivedDoubleBuffered() {
        setSize(500, 500);
        setVisible(true);
        setBackground(java.awt.Color.green);
        setForeground(java.awt.Color.black);

        // create an image of the frame
        bImage = (java.awt.image.BufferedImage) createImage(500, 500);
    }

    int x = 8, y = 200;

    enum direction {
        left, right
    };

    direction d = direction.right;
    java.awt.image.BufferedImage bImage; /* don't initialize here (null reference)
                                            can't create image */

    @Override
    public void update(java.awt.Graphics g) {
        paint(g);
    }

    @Override
    public void paint(java.awt.Graphics g) // inherited from Window
    {
        java.awt.Graphics2D g2D = bImage.createGraphics();
        g2D.fillOval(x, y, 50, 50);
        g.drawImage(bImage, 0, 0, null);

        try {
            Thread.sleep(5);
        } catch (Throwable th) {
        }
        g2D.setColor(java.awt.Color.green);
        g2D.fillOval(x, y, 50, 50);

        switch (d) {
        case right:
            if (x < 442)
                x++;
            else
                d = direction.left;
            break;
        case left:
            if (x > 8)
                x--;
            else
                d = direction.right;
            break;
        }
        repaint();
    }
}

class JFrameDerived extends javax.swing.JFrame {
    int x = 0, y = 0;

    JFrameDerived() {
        super("Writing on the JFrame");
        setSize(300, 499);
        setBounds(300, 300, 300, 300);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent me) {
                x = me.getX();
                y = me.getY();
                repaint();
            }
        });
        setVisible(true);
    }

    @Override
    public void paint(java.awt.Graphics g) {
        super.paint(g);
        g.drawString("Click the mouse inside the window.", 40, 45);
        g.drawString("X : " + x, 40, 60);
        g.drawString("Y : " + y, 40, 75);
    }
}

class zhuu extends javax.swing.JFrame {
    private final javax.swing.JPanel contentPane;

    public zhuu() {
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new javax.swing.JPanel();
        contentPane.setBorder(new javax.swing.border.EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new java.awt.BorderLayout(0, 0));
        setContentPane(contentPane);
        setVisible(true);
    }
}

class Lambda {
    Lambda() {
        switch (8) {
        case 1:
            approach_1();
            break;
        case 2:
            approach_2();
            break;
        case 3:
            approach_3();
            break;
        case 4:
            approach_4.print();
            break;
        case 5:
            approach_5.print();
            break;
        case 6:
            approach_6.print();
            break;
        case 7:
            new LambdaGUI();
            break;
        case 8:
            new LambdaComparator();
            break;

        }
    }

    /* first approach: declare a structure with data and a method which
       prints the data and contains the query logic */
    void approach_1() {
        class Person {
            // three characters random string
            String name = Character.toString((char) (new java.util.Random().nextInt(26) + 65)) + Character.toString((char) (new java.util.Random().nextInt(26) + 65))
                    + Character.toString((char) (new java.util.Random().nextInt(26) + 65));
            // age between 10 and 80
            int age = new java.util.Random().nextInt(71) + 10;

            void print(String name, int ageLow, int ageHigh, int index) {
                if (this.name.equals(name) && age >= ageLow && age < ageHigh)
                    System.out.println("found #" + (index + 1) + " Name: " + this.name + ", age: " + age);
            }
        }

        // ArrayList with faster access than LinkedList
        java.util.List<Person> persList = new java.util.ArrayList<Person>();
        for (int i = 0; i < 3_500_000; i++)
            persList.add(new Person());

        for (int i = 0; i < persList.size(); i++)
            persList.get(i).print("AAA", 40, 61, i);

        System.out.println("ready.");
    }

    /* second approach: remove print routine and make class members private */
    void approach_2() {
        class Person {
            private String name = Character.toString((char) (new java.util.Random().nextInt(26) + 65)) + Character.toString((char) (new java.util.Random().nextInt(26) + 65))
                    + Character.toString((char) (new java.util.Random().nextInt(26) + 65));
            private int age = new java.util.Random().nextInt(71) + 10;

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }
        }

        class Printer {
            void print(java.util.List<Person> persList, String name, int ageLow, int ageHigh) {
                for (int i = 0; i < persList.size(); i++)
                    if (persList.get(i).getName().equals(name) && persList.get(i).getAge() >= ageLow && persList.get(i).getAge() < ageHigh)
                        System.out.println("found #" + (i + 1) + " Name: " + persList.get(i).getName() + ", age: " + persList.get(i).getAge());
            }
        }

        java.util.List<Person> persList = new java.util.ArrayList<Person>();
        for (int i = 0; i < 3_500_000; i++)
            persList.add(new Person());

        new Printer().print(persList, "ABC", 20, 31);
        System.out.println("ready.");
    }

    /* third approach: separate the print from the query logic */
    void approach_3() {
        class Person {
            private String name = Character.toString((char) (new java.util.Random().nextInt(26) + 65)) + Character.toString((char) (new java.util.Random().nextInt(26) + 65))
                    + Character.toString((char) (new java.util.Random().nextInt(26) + 65));
            private int age = new java.util.Random().nextInt(71) + 10;

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }
        }

        abstract class PersonChecker // or interface
        {
            abstract boolean check(Person p);
        }

        class Printer {
            void print(java.util.List<Person> persList, PersonChecker persCheck) {
                for (int i = 0; i < persList.size(); i++)
                    if (persCheck.check(persList.get(i)))
                        System.out.println("found #" + (i + 1) + " Name: " + persList.get(i).getName() + ", age: " + persList.get(i).getAge());
            }
        }

        java.util.List<Person> persList = new java.util.ArrayList<Person>();
        for (int i = 0; i < 3_500_000; i++)
            persList.add(new Person());

        new Printer().print(persList, new PersonChecker() {
            boolean check(Person p) {
                return p.getName().equals("ZZZ") && p.getAge() >= 50 && p.getAge() < 61;
            }
        });
        System.out.println("ready.");
    }

    /* forth approach: use a lambda expression */
    static class approach_4 /* use a static class because it's not possible to 
                               define a local interface */
    {
        class Person {
            private String name = Character.toString((char) (new java.util.Random().nextInt(26) + 65)) + Character.toString((char) (new java.util.Random().nextInt(26) + 65))
                    + Character.toString((char) (new java.util.Random().nextInt(26) + 65));
            private int age = new java.util.Random().nextInt(71) + 10;

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }
        }

        /* an interface with only one method is a functional interface
           therefore the name of that method can be omitted in the implementation */
        interface IPersonChecker // not working with abstract class
        {
            public boolean check(Person p);
        }

        void print(java.util.List<Person> persList, IPersonChecker persCheck)
        {
            for (int i=0; i < persList.size(); i++)
                if ( persCheck.check(persList.get(i)) )
                    System.out.println("found #" + (i + 1) +
                                       " Name: " + persList.get(i).getName() +
                                       ", age: " + persList.get(i).getAge());
        }

        static void print()
        {
            java.util.List<Person> persList = new java.util.ArrayList<Person>();
            for (int i=0; i < 3_000_000; i++)
                persList.add(new approach_4().new Person());

            new approach_4().print(persList, /* new IPersonChecker()
                                                {
                                                    public boolean check(Person p)
                                                    {
                                                        return 
                                                        p.getName().equals("MMM") &&
                                                        p.getAge() >= 30          && 
                                                        p.getAge() <  41;
                                                    }
                                                }); */
                                   
                                             // lambda expression (Person p) -> ...
                                             p -> p.getName().equals("MMM") &&
                                                  p.getAge() >= 30          && 
                                                  p.getAge() <  41);
            System.out.println("ready.");
        }
    }

    /* fifth approach: use standard functional interfaces with lambda expressions */
    static class approach_5
    {
        class Person
        {
            private String name = 
                Character.toString((char)(new java.util.Random().nextInt(26)+65)) +
                Character.toString((char)(new java.util.Random().nextInt(26)+65)) +
                Character.toString((char)(new java.util.Random().nextInt(26)+65)); 
            private int    age  = new java.util.Random().nextInt(71)+10;
            
            public String getName() { return name; }
            public int    getAge () { return age;  }
        }
        
        /* instead of interface IPersonChecker use the standard functional inter-
           face Predicate<T> in the package java.util.function
            
        interface IPersonChecker ↔ Predicate<T>
        {
            public boolean check(Person p); ↔ public boolean test(T t);
        }
        with T = Person */
        
        void print(java.util.List<Person> persList, 
                   java.util.function.Predicate<Person> persCheck)
        {
            for (int i=0; i < persList.size(); i++)
                if ( persCheck.test(persList.get(i)) )
                    System.out.println("found #" + (i + 1) +
                                       " Name: " + persList.get(i).getName() +
                                       ", age: " + persList.get(i).getAge());
        }
        
        static void print()
        {
            java.util.List<Person> persList = new java.util.ArrayList<Person>();
            for (int i=0; i < 3_000_000; i++)
                persList.add(new approach_5().new Person());

            new approach_5().print(persList, p -> p.getName().equals("USA") &&
                                                  p.getAge() >= 10          && 
                                                  p.getAge() <  21);
            System.out.println("ready.");
        }
    }
    
    /* sixth approach: use lambda expressions throughout the application */
    static class approach_6
    {
        class Person
        {
            private String name = 
                Character.toString((char)(new java.util.Random().nextInt(26)+65)) +
                Character.toString((char)(new java.util.Random().nextInt(26)+65)) +
                Character.toString((char)(new java.util.Random().nextInt(26)+65)); 
            private int    age  = new java.util.Random().nextInt(71)+10;
            
            public String getName() { return name; }
            public int    getAge () { return age;  }

            // print method for one person
            public void printPerson ()
            {
                System.out.println(" Name: " + name + ", age: " + age);
            }
        }
        
        /* replace printPerson with a lambda expression according the pattern
           takes one argument and returns void, therefore implement the Consumer<T>
           functional interface         
            
        interface Consumer<T>
        {
            public void accept(T t)
        }
        with T = Person */
        
        void print(java.util.List<Person> persList, 
                   java.util.function.Predicate<Person> persCheck,
                   java.util.function.Consumer<Person> printer)
        {
            for (int i=0; i < persList.size(); i++)
                if ( persCheck.test(persList.get(i)) )
                {
                    System.out.printf("found #%d", i + 1);
                    printer.accept(persList.get(i));
                }
        }
        
        static void print()
        {
            java.util.List<Person> persList = new java.util.ArrayList<Person>();
            for (int i=0; i < 3_000_000; i++)
                persList.add(new approach_6().new Person());

            new approach_6().print( persList, 
                                    p -> p.getName().equals("TOP") &&
                                         p.getAge() >= 20          && 
                                         p.getAge() <  31,
                                    p -> p.printPerson() );
            System.out.println("ready.");
        }
    }
    
    /* accessing local variables of the enclosing scope */
    class LambdaAccessAndScope
    {
        
    }
    
    class LambdaGUI
    {
        LambdaGUI()
        {
             java.awt.Frame f = new java.awt.Frame();
             f.setSize(500, 500);
             f.setLayout(null);
             f.setVisible(true);
             
             java.awt.Button b = new java.awt.Button("click!");
             b.setSize(200, 100);
             b.setLocation(100, 100);
             
             /* lambda expression based on functional interface ActionListener
                with method void actionPerformed(ActionEvent e) */
             b.addActionListener( /* (java.awt.event.ActionEvent event) -> 
                                     or shorter */
                                  event ->
                                  javax.swing.JOptionPane.
                                      showMessageDialog(f, "has been clicked"));
                                                     /* f    → center of frame
                                                        null → center of screen */
             f.add(b);
        }
    }
    
    class LambdaComparator
    {
        class Person
        {
            String givenName;
            String surName;
            int    age;
        }
        
        LambdaComparator()
        {
            /* first approach: use Comparator interface to define an anonymous
               class with overridden compare method which will be passed to the 
               sort-method */            
            java.util.List<Person> personList = 
                java.util.Arrays.asList( new Person() {{givenName = "Tom";}},
                                         new Person() {{givenName = "Bob";}},
                                         new Person() {{givenName = "Jim";}},
                                         new Person() {{givenName = "Ben";}} );
                /* asList returns a fixed-size list backed by the specified array.
                   The list is a view on the original array, when the original array
                   is changed then the view is changed too (better performance and
                   memory efficient). */
            
            System.out.println("ascending sort order");
            java.util.Collections.sort(
                               personList, 
                               new java.util.Comparator<Person>() /* functional
                                                                     interface */
                               {
                                  public int compare(Person p1, Person p2)
                                  /* imposing a total ordering and defines the
                                     relation {(x, y) such that c.compare(x, y) <= 0} */
                                  {
                                      return p1.givenName.compareTo(p2.givenName);
                                  }                                
                               });
            
            for (Person p : personList)
                System.out.println(p.givenName);
            
            System.out.println("\ndescending sort order");
            java.util.Collections.sort(
                               personList,
                               new java.util.Comparator<Person>()
                               {
                                   public int compare(Person p1, Person p2)
                                   {
                                       return p2.givenName.compareTo(p1.givenName);
                                   }                                
                               });
            
            for (Person p : personList)
                System.out.println(p.givenName);
           
            /* second approach: since Comparator is a functional interface
               use lambda expressions */
            System.out.println("\nsorting with lambda expressions");
            java.util.List<Person> pList = new java.util.ArrayList<Person>();
            pList.add(new Person() {{surName = "Smith";  age = 33;}});
            pList.add(new Person() {{surName = "Meyer";  age = 20;}});
            pList.add(new Person() {{surName = "King";   age = 62;}});
            pList.add(new Person() {{surName = "Brown";  age = 45;}});
            pList.add(new Person() {{surName = "Parker"; age = 38;}});
            
            System.out.println("ascending sort order");            
            java.util.Collections.sort(pList, (p1, p2) -> 
                                              new Integer(p1.age).compareTo(p2.age));
                                              /* compareTo doesn't work on primitive
                                                 datatypes, hence create an Integer
                                                 instance */
            for (Person p : pList)
                System.out.println(p.surName + ", " + p.age);
            
            System.out.println("\ndescending sort order");            
            java.util.Collections.sort(pList, (p1, p2) -> 
                                              new Integer(p2.age).compareTo(p1.age));
            for (Person p : pList)
                System.out.println(p.surName + ", " + p.age);
        }
    }
    
    /* example calculator */
    static class Calculator
    {
        interface IMath // functional interface
        {
            int operation(int a, int b);
        }
        
        int operateBinary(int a, int b, IMath op)
        {
            return op.operation(a, b);
        }
     
        Calculator()
        {
            IMath add = (a, b) -> a + b;
            IMath sub = (a, b) -> a - b;
            System.out.println("40 + 2 = " +  operateBinary(40, 2, add));
            System.out.println("20 - 10 = " + operateBinary(20, 10, sub));    
        }
    }
    
    static class LambdaEmptyArgument
    {
        int i=1;
        
        interface IPrint
        {
            abstract void print();            
        }
        
        void getAbstract(IPrint iprint)
        {
            iprint.print();
        }
        
        LambdaEmptyArgument()
        {
            getAbstract(  () -> System.out.println("i=" + i) );
        }
    }
}

//============================
// Threads
//============================

/* Java thread creation is expensive because there is a fair bit of work involved:
   A large block of memory has to be allocated and initialized for the thread
   stack. System calls need to be made to create/register the native thread with
   the host OS. Descriptors needs to be created, initialized and added to JVM
   internal data structures. It is also expensive in the sense that the thread
   ties down resources as long as it is alive; e.g. the thread stack, any objects
   reachable from the stack, the JVM thread descriptors, the OS native thread
   descriptors. All these things are platform specific, but they are not cheap on
   any Java platform I've ever come across. */

// https://docs.oracle.com/javase/tutorial/uiswing/concurrency/

//============================
// Programming Patterns
//============================

//------------------
// Dependency
// Injection
//------------------

/* Problem: Traditionally each object is responsible for obtaining its own 
   references to the dependent objects it collaborate with. This leads to highly 
   coupled classes and hard-to-test code. Basically, instead of having the objects
   creating a dependency or asking a factory object to make one for them, you pass
   the needed dependencies into the constructor or via property setters. */

class DependencyInjection
{   
    interface IHotBeverages
    {
        void getHot();
    }•
    
    static class BeverageDispenser
    {
        IHotBeverages iHot; /* stores an interface reference, which one is will be
                               designated at initialization time */
        
        BeverageDispenser(IHotBeverages iHot)
        {
            this.iHot = iHot;
        }
        
        static void run()
        {
           BeverageDispenser bev = new BeverageDispenser(new HotBeverages());
           bev.iHot.getHot();
        }
    }
    
    static class HotBeverages implements IHotBeverages
    {
        @Override
        public void getHot()
        {
            System.out.println("producing hot beverage...");
            System.out.println("ready");
            System.out.println("enjoy your drink");
        }
    }
}