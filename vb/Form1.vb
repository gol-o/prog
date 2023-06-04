Public Class Form1
    Inherits System.Windows.Forms.Form

    Protected Overrides Sub OnLoad(e As EventArgs)
        MyBase.OnLoad(e)
        Me.BackColor = System.Drawing.Color.Green
        Me.Size = New System.Drawing.Size(500, 300)

    End Sub

    Protected Overrides Sub OnPaint(e As PaintEventArgs)
        MyBase.OnPaint(e)
        Dim g As System.Drawing.Graphics = e.Graphics
        Dim p As New System.Drawing.Pen(System.Drawing.Color.Red)

        g.DrawLine(New System.Drawing.Pen(Color.Red, 2), 10, 10, 100, 100)
        ' g.DrawLine(New System.Drawing.Pen(New Color(RGB(0, 0, 244)), 4), 10, 10, 100, 100)

        g.DrawLine(p, 0, 250, 500, 250)
        g.DrawLine(p, 250, 0, 250, 500)

    End Sub
End Class
