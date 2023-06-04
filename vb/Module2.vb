Imports System.Console
Imports ConsoleApp1


Class Formm
    Inherits System.Windows.Forms

    Public Sub New()
        MyBase.New()
        Me.InitializeComponent()
        '    CreateGraphics()

    End Sub

    Private Sub Formm_Paint(ByVal sender As Object, ByVal e As System.Windows.Forms.PaintEventArgs) Handles Me.Paint
        Dim blueBrush As New Drawing.SolidBrush(System.Drawing.Color.Blue)

        e.Graphics.FillRectangle(blueBrush, 20, 30, 1, 1)
    End Sub

    Dim pen As System.Drawing.Graphics

    Private Sub Formm_Load(ByVal sender As System.Object,
                           ByVal e As System.EventArgs) Handles MyBase.Load
        pen = Me.CreateGraphics()
        pen.DrawLine(New System.Drawing.Pen(Drawing.Color.Red, 1), 10, 10, 20, 20)
    End Sub


    Private components As System.ComponentModel.IContainer

    Private Sub InitializeComponent()
        components = New System.ComponentModel.Container
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.Text = "Form2"
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 13)
        Me.ClientSize = New System.Drawing.Size(528, 517)
        Me.ResumeLayout(False)
        Me.Refresh()
    End Sub
End Class


Module Module2
    Sub main()
        'Netzwerkadministration.NetAppStart
        Dim u As New Formm
    End Sub
End Module

MustInherit Class ElectronicDevice
    Protected ReadOnly betriebsspannung
    Protected verbrauchø As Single
    MustOverride Overrides Function ToString() As String
End Class


Class Computer
    Inherits ElectronicDevice
    Public Shared ReadOnly netzwerk(300) As Computer
    Private Shared network As System.Collections.Generic.List(Of Computer)
    Private ip4 As String
    Private Const bereich As String = "Produktion"
    Protected ReadOnly preis As Single
    Protected ram As UShort = 16000
    Protected plattenKap As UShort
    Protected ReadOnly taktfrequenz As Single
    Protected ReadOnly cpu As String

    Property ipAdresse As String
        Get
            Return ip4
        End Get
        Set(value As String)
            ip4 = value
        End Set
    End Property

    WriteOnly Property plattenSpeicher As UShort
        Set(value As UShort)
            plattenKap = value
        End Set
    End Property

    Enum Gehäusetyp
        DESKTOP
        TOWER
        MIDI
        MINI
        RACK
        ANDERE
    End Enum

    'Auto-Property
    ReadOnly Property gehäuse As Gehäusetyp

    Public Sub New(ip4 As String, preis As Single, ram As UShort, plattenKap As UShort,
                   taktfrequenz As Single, cpu As String, gehäuse As Gehäusetyp)
        Me.ip4 = ip4
        Me.preis = preis
        Me.ram = ram
        Me.plattenKap = plattenKap
        Me.taktfrequenz = taktfrequenz
        Me.cpu = cpu
        Me.gehäuse = gehäuse
    End Sub

    Sub SpeicherZufügen(Optional ram As UShort = 16000)
        If ram < 8000 Then Throw New ArgumentOutOfRangeException
        Me.ram += ram
    End Sub

    Overrides Function ToString() As String
        'Throw New NotImplementedException()
        Return "IP: " & ip4 & vbCrLf & "CPU: " & cpu & vbCrLf
    End Function

    Overrides Function Equals(obj As Object) As Boolean
        Dim computer = TryCast(obj, Computer)
        Return computer IsNot Nothing AndAlso
               ip4 = computer.ip4 AndAlso
               ram = computer.ram AndAlso
               cpu = computer.cpu
    End Function
End Class

Class Notebook:Inherits Computer
    Private ReadOnly sound As Boolean = True
    Private betriebsdauer As Single

    Public Sub New(sound As Boolean, betriebsdauer As Single,
                   ip4 As String, preis As Single,
                   taktfrequenz As Single, cpu As String)
        MyBase.New(ip4, preis, 16000, 500, taktfrequenz, cpu, Computer.Gehäusetyp.ANDERE)
        Me.sound = sound
        Me.betriebsdauer = betriebsdauer
    End Sub
End Class

Class Netzwerkadministration
    Shared Sub NetAppStart()
        Dim dellComp As New Computer("133.234.253.3", 799, 32000, 500, 4.3,
                                     "Intel", Computer.Gehäusetyp.MIDI)
        dellComp.ipAdresse = "200.200.55.33"
        WriteLine(dellComp.ToString())
    End Sub
End Class
