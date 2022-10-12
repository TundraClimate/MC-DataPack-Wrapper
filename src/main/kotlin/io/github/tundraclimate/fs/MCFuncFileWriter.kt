package io.github.tundraclimate.fs

import io.github.tundraclimate.fs.filetype.MCFunc
import java.io.File

class MCFuncFileWriter(private val file: File): MCFileWriter<MCFunc> {
    override fun write(content: MCFunc) {
        if (file.extension == "mcfunction" && file.exists()) {
            file.writeBytes(content.body.toByteArray())
        }
    }
}