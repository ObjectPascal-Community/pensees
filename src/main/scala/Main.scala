/*
 *  Copyright 2024 Ștefan-Iulian Alecu and Winterthur LSP Contributors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.objectpascalcommunity.winterthur

import lsp.WinterthurLanguageServer

import java.io.{InputStream, OutputStream, PrintStream}
import org.eclipse.lsp4j.jsonrpc.Launcher
import org.eclipse.lsp4j.services.LanguageClient

object Main:
  def main(args: Array[String]): Unit =
    val systemIn = System.in
    val systemOut = System.out

    // Redirect System.out to System.err to avoid non-LSP messages going to System.out
    System.setOut(PrintStream(System.err))

    val server = WinterthurLanguageServer()
    val launcher = Launcher.createLauncher(
      server,
      classOf[LanguageClient],
      systemIn,
      systemOut
    )

    server.connect(launcher.getRemoteProxy)
    launcher.startListening()
