package io.github.tundraclimate.fs.filetype

import io.github.tundraclimate.fs.MCFile

class MCFunc(val body: String): MCFile {
    constructor(lines: List<String>): this(lines.reduce { it, next -> "$it\n$next" })
}