IMPORTANT WHEN RELEASING SERVER!
----------------------------------------------------------------------------------
Copy the runescape.db from the main C# Server folder (this is a blank database)
Copy this file into both bin/Release folder and bin/Debug folder.
This will reset all player's information / grandexchange etc.. the whole database pretty much.

If you have problems with SQLite
-----------------------------------------------------------------------------------
Community.CsharpSqlite.dll is built from
C# SQLite Port Project\Community.CsharpSqlite

which is SQLite 3.7.7.1 ported from C to C# it will be slower then the offical SQLite but it's worth it.

Since now it won't matter if your computer is 32 bit or 64 bit and you won't get confused which dll file to download for your computer.

You will need to recompile the SQLite Ported DLL if you want to update your C# Server to a newer .Net Framework version or use Mono.

This will work for all computers just recompile the Community.ChsarpSqlite project on your computer.

When you recompile the new .dll file just drag it into the main C# Server download and update the References to the new .dll file.

For any updates and bug fixes to the SQLite port just visit
https://code.google.com/p/csharp-sqlite/

