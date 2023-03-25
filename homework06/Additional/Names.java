package homework06.Additional;

import java.util.Random;

public enum Names {
  Abraham, Addison, Adrian, Albert, Alec, Alfred, Alvin, Andrew,
  Andy, Archibald, Archie, Arlo, Arthur,
  Austen, Barnabe, Bartholomew, Bertram, Bramwell,
  Byam, Cardew, Chad, Chance, Colin, Coloman, Curtis,
  Cuthbert, Daniel, Darryl, David, Dickon, Donald, Dougie, Douglas, Earl,
  Ebenezer, Edgar, Edmund, Edward, Edwin, Elliot, Emil, Floyd, Franklin, Frederick,
  Gabriel, Galton, Gareth, George, Gerard, Gilbert, Gorden, Gordon, Graham, Grant, Henry,
  Hervey, Hudson, Hugh, Ian, Jack, Jaime, James, Jason, Jeffrey, John, Jolyon, Jonas,
  Joseph, Joshua, Julian, Justin, Kurt, Lanny, Larry, Laurence, Lawton, Lester, Malcolm, Marcus,
  Mark, Marshall, Martin, Marvin, Matt, Maximilian, Michael, Miles, Murray, Myron, Nate, Nathan,
  Neil, Nicholas, Nicolas, Norman, Oliver, Oscar, Osric, Owen, Patrick, Paul, Peleg, Philip, Phillipps,
  Raymond, Reginald, Rhys, Richard, Robert, Roderick, Rodger, Roger, Ronald, Rowland, Rufus, Russell, 
  Sebastian, Shahaf, Simon, Stephen, Swaine, Thomas, Tobias, Travis, Victor, Vincent, Vivian, Wayne, Wilfred, 
  William, Winston, Zadoc,Abigail, Ada, Addy, Adelaide, Adele, Agatha, Agnes, Alaina, Alanna, Alberta, Alice,
  Aliso, Alvina, Amanda, Ambe, Amelia, Amy, Andrea, Ange, Angela, Anna, Annabe, Arda, Audrey, Augusta, Autum,
  Avi, Barbara, Beatrice, Belinda, Bella, Berenice, Bertha, Brenda, Bridget, Bronwen, Cadence, Carmelita, Caroline,
  Carolyn, Carolynn, Cassandra, Cecilia, Cecily, Celia, Charis, Charisse, Charity, Charlotte, Charmaine, Cheryl,
  Chloe, Christabel, Claribel, Clarissa, Clementine, Cleo, Cordelia, Cristalyn, Crystal, Cynthia, Daisy, Daphne, 
  Davina, Dawn, Deanna, Deanne, Deborah, Dede, Delia, Denise, Destiny, Diana, Dolores, Dora, Doreen,
  Dorothy, Drusilla, Dulcie, Edith, Edna, Edwina, Effie, Eileen, Eleanor, Elektra, Elizabeth, Ella, Ellen,
  Emma, Enid, Estelle, Ethel, Eudora, Eunice, Eva, Faith, Felicity, Fiona, Flora, Galenka, Gaynor, Gemma,
  Genevieve, Georgiana, Gertie, Gertrude, Gia, Glenda, Gwen, Gwenda, Gwendolen, Gwendoline, Gwendolyn,
  Hannah, Harriet, Helen, Henrietta, Hero, Hester, Honor, Hope, Ida, Imelda, Imogen, InnogeIona, Irene,
  IriIsla, Ivy, Jacqueline, Jacqui, Jane, Jemima, Jenna, Jennifer, Jessica, Jessie, Joanna, Joanne, 
  Joelle, Joey, Josephine, Judith, Julianne, June, Karen, Kathleen, Kaylee, Kierra, Lara, Laura, Lauren, Leah,
  Lettice, Liana, Lilla, Lillia, Lois, Lorelei, Loretta, Lorna, Lorraine, Louisa, Lucinda, Lucy, Lynnette, Mabel,
  Madge, Maggie, Marcia, Marcie, Margaret, Marian, Marianne, Marilyn, Marissa, Marjorie, Marsha, Matilda, Maud, Maude, Mavis,
  May, Medea, Mehitable, Melanie, Melissa, Michele, Millicent, Minna, Moira, Myra, Myrna, Myrtle, Nadine, Naila;
///
private static final Names[] arr = values();
private static final int len = arr.length;
private static final Random rnd = new Random();

public static String getRandName()  {
  return arr[rnd.nextInt(len)].toString();
}
}

