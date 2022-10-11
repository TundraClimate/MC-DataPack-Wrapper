package io.github.tundraclimate.fs

interface MCFileWriter <T: MCFile> {
    fun write(content: T)
}