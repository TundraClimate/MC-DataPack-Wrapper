package io.github.tundraclimate.fs

import io.github.tundraclimate.fs.filetype.MCMeta
import java.io.File

class MCMetaFileWriter(private val file: File): MCFileWriter<MCMeta> {
    override fun write(content: MCMeta) {
        if (file.extension == "mcmeta" && file.exists()) {
            file.writeBytes(content.body.toByteArray())
        }
    }
}