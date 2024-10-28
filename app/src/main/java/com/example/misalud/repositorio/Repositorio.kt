package com.example.misalud.repositorio
import com.example.misalud.model.Usuario
import com.example.misalud.model.Rutina

object Repositorio {
    private val usuarios = mutableListOf<Usuario>()
    private val rutinas = mutableListOf<Rutina>()

    fun addUsuario(usuario: Usuario) {
        usuarios.add(usuario)
    }

    fun getUsuario(): List<Usuario> = usuarios

    fun deleteUsuario(usuario: Usuario) {
        usuarios.remove(usuario)
    }

    fun addRutina(rutina: Rutina) {
        rutinas.add(rutina)
    }

    fun getRutina(): List<Rutina> = rutinas

    fun deleteRutina(rutina: Rutina) {
        rutinas.remove(rutina)
    }
}
