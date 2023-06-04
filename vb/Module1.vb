Module Module1


    Private ReadOnly a As Integer


    Sub Main1()

    End Sub

End Module

Module m2
    Sub main()
        ' Dim x As New Module1
        Dim x As New System.Random()
        Microsoft.VisualBasic.Rnd()
        Microsoft.VisualBasic.Randomize()
        Dim xx() As Double = {1, 2, 3}
        'Dim hfeu[10] as integer
        ' Dim z As New Integer[100]

        'Dim x(100) As Double
        'Dim ccc = 1
        'Dim u As Newew  Integer[ccc]
        Dim jjj As New _
            System.Collections.Generic.List(Of String)({"a", "b"})
        ' oder
        Dim jjjj As New List(Of String)(New String() {"n", "n"})
        LBound(xx)
        UBound(xx)
    End Sub
End Module

Module m3

End Module

Module m32

End Module


Namespace c4

    Module m3

    End Module

    Public Module Module1
    End Module
End Namespace

Namespace c4
    Module m4

    End Module
    ' Module 3m 'error

    '    End Module
End Namespace

Partial Class x

End Class

Partial Class d
    Dim x
End Class

Class d
    ' Dim x
    Dim y
End Class

Class d
    ' Dim x
    Dim y2
End Class
Class dd
    Class fr
        Public x
    End Class
    Public adr As New fr

End Class

Module m33
    Sub x()
        Dim x As dd.fr
        Dim b As New dd
        b.adr.x = 1
        x = New dd.fr
        Dim z As dd.fr = New dd.fr
        z.x = 1
        'Dim watea As New wata
        'wata.ahlodri()  'Shared i As Integer
    End Sub

    'static Sub ahlodri() ' static shared not valid

    'End Sub
    Dim b As Single
    Sub n()
        Static d As Integer
        'shared g As single
    End Sub
    Class h

    End Class
End Module


Class UHFlass
    'Private Const i As Integer
    ReadOnly j As Integer = 1
    Private ReadOnly z As Integer


    Sub New()
        'i = 10
        j = 1000
    End Sub
End Class