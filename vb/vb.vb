'------------------------------------------------------------------------------- 
' Windows Scripting Host
'------------------------------------------------------------------------------- 
employee = inputbox( "Name and Department" )

' check for delimiter
pos = instr( employee, ";" )
if not cbool( pos ) then ' try different delimiter
    pos = instr( employee, "," )
    if not cbool( pos ) then
        pos = instr( employee, " " )
        if not cbool( pos ) then
            msgbox "delimiter not included"
        end if
    end if
end if

filename = left( employee, pos - 1 )
desktop  = createobject( "wscript.shell" ).specialfolders( "desktop" )
set file = createobject( "scripting.filesystemobject" ).createtextfile( desktop + "/" + filename )

file.writeline( "employee record, timestamp: " + formatdatetime( now, vblongtime ) )
file.writeline( "---------------------------------------" )
file.writeline( "name: " + filename ) 
file.writeline( "dep : " + mid( employee, pos + 1 ) ) 
file.close( )

msgbox "record written"

'------------------------------------------------------------------------------- 
    ' System Framework
    '------------------------------------------------------------------------------- 
Imports System.Console

' Project Settings: Startobject 
#Const STARTMODULE  = True
#Const STARTCLASS   = False
#Const STARTCOMMAND = False
#Const STARTPROJECT = False

'------------------------------------------------------------------------------- 
' Startmodule
'------------------------------------------------------------------------------- 
Module MainModule
#If STARTMODULE Then
    Sub Main()
        WriteLine("Module Main")

        MsgBox("Hello " + Environment.UserName + vbCr +
               "It's " + DateTime.Now.ToShortTimeString)

        If Hour(Now) < 20 Then
            MsgBox("System shutdown in " + (#20:00# - TimeOfDay).ToString() + " hours")
        End If

        ' VB
        WriteLine(Global.Microsoft.VisualBasic.Hour(Global.Microsoft.VisualBasic.DateAndTime.Now))

        ' .NET Framework
        WriteLine(Global.System.DateTime.Now.Hour)
    End Sub
#End If
End Module

'------------------------------------------------------------------------------- 
' Startclass
'------------------------------------------------------------------------------- 
Class Application
#If STARTCLASS Then
    Shared Sub Main()
        Console.WriteLine("Class Main")
    End Sub
#End If
End Class

'------------------------------------------------------------------------------- 
' Commandline Arguments
'
' Project Properties/Debug/Command line arguments
' a) start from command line
' b) solution explorer/folder view/app_folder/bin/debug/project_name.exe
'    open with 'windows command processor'
'------------------------------------------------------------------------------- 
Module CommandLineArgs
#If STARTCOMMAND Then
    Sub Main(args As String())
        ' direct access
        WriteLine("First argument: " & args(0))

        ' loop
        For Each arg In args
            WriteLine(arg)
        Next
    End Sub
#End If
End Module

'------------------------------------------------------------------------------- 
' Preventing name clashes
'------------------------------------------------------------------------------- 
Namespace Development
    Module Project
        Sub StartApp()
            WriteLine("Dev Dep")
        End Sub
    End Module
End Namespace

Namespace CustomerSpace
    Module Project
        Public Sub StartApp()
            WriteLine("Customer Dep")
        End Sub
    End Module
End Namespace

Module ProjectAdmin
#If STARTPROJECT Then
    Sub Main()
        ' calling
        Call Development.Project.StartApp()
        ' or
        Call Development.StartApp()
        ' or
        Development.StartApp()

        CustomerSpace.StartApp()
    End Sub
#End If
End Module
