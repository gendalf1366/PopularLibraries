package ru.gendalf13666.popularlibraries.helpers

import android.content.Context
import java.io.File

class FolderHelper(context: Context) {

    companion object {
        private const val IMAGE_FOLDER = "image"
    }

    private val externalFilesDir: File? = context.getExternalFilesDir(null)

    init {
        imageFolder()
            .takeIf { it.mkdirs() }
            ?.takeIf { it.exists() }
    }
    fun imageFolder() = File(externalFilesDir, IMAGE_FOLDER)
}
