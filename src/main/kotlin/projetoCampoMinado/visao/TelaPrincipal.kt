package projetoCampoMinado.visao

import projetoCampoMinado.modelo.Tabuleiro
import projetoCampoMinado.modelo.TabuleiroEvento
import javax.swing.JFrame
import javax.swing.JOptionPane
import javax.swing.SwingUtilities

fun main(args: Array<String>) {
    TelaPrincipal()
}

class TelaPrincipal : JFrame() {
    private val tabuleiro = Tabuleiro(qtdLinhas = 16, qtdColunas = 30, qtdMinas = 50)
    private val painelTabuleiro = PainelTabuleiro(tabuleiro)

    init {
        tabuleiro.onEvento(this::mostrarResultado)
        add(painelTabuleiro)

        setSize(690, 438)
        setLocationRelativeTo(null)
        defaultCloseOperation = EXIT_ON_CLOSE
        title = "Campo minado"
        isVisible = true
    }

    private fun mostrarResultado(evento: TabuleiroEvento) {
        SwingUtilities.invokeLater {
            val msg = when(evento) {
                TabuleiroEvento.VITORIA -> "Voce ganhou!"
                TabuleiroEvento.DERROTA -> "Voce perdeu... :P"
            }

            JOptionPane.showMessageDialog(this, msg)
            tabuleiro.reiniciar()

            painelTabuleiro.repaint()
            painelTabuleiro.validate()
        }
    }
}