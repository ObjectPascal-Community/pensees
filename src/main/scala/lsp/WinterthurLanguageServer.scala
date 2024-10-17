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

package org.objectpascalcommunity.winterthur.lsp

import org.eclipse.lsp4j.services.{
  LanguageServer,
  LanguageClientAware,
  TextDocumentService,
  WorkspaceService,
  LanguageClient
}
import org.eclipse.lsp4j._
import java.util.concurrent.CompletableFuture

class WinterthurLanguageServer extends LanguageServer with LanguageClientAware:

  override def connect(client: LanguageClient): Unit = ???

  override def exit(): Unit = ???

  override def getWorkspaceService(): WorkspaceService = ???

  override def shutdown(): CompletableFuture[Object] = ???

  override def initialize(
      params: InitializeParams
  ): CompletableFuture[InitializeResult] = ???

  override def getTextDocumentService(): TextDocumentService = ???
