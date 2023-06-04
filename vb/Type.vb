Module Types
    Sub Main()
        Console.WriteLine(Microsoft.VisualBasic.Strings.UCase("Test"))

        Dim str$ = "Test"
        Select Case Microsoft.VisualBasic.Information.VarType(str)
            Case Microsoft.VisualBasic.VariantType.String
                Console.WriteLine("a string was detected")
            Case 2
            Case Else
                WriteLine("different type")
        End Select
        Console.WriteLine(Microsoft.VisualBasic.Information.VarType(str))

        ' ettype (Operator or method: object.gettype() with implicit boxing operation)
        Dim oj As Object = CType(str, Object)
        Console.WriteLine(oj.GetType())
        ' or
        Console.WriteLine(DirectCast(str, Object).GetType())

        ' or in short form, implicit casting
        Console.WriteLine(str.GetType())
    End Sub
End Module