package io.github.tundraclimate

import java.io.File

class DataPack(path: String = "", name: String) {
    private val packDir = File(path, name)

    init {
        packDir.mkdirs()
    }

    fun createFile(childPath: String, parentPath: File? = null): File =
        File(parentPath ?: packDir, childPath).also { it.createNewFile() }

    fun createDir(childPath: String, parentPath: File? = null): File =
        File(parentPath ?: packDir, childPath).also { it.mkdirs() }

    fun minecraft(file: String): File {
        val mc = createDir("data/minecraft")
        val created = File(mc, file)
        created.mkdirs()
        return created
    }
}