/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Converter 
{
    public static final String[][] HEX_MIPS_TABLE =

            {

                /*{name},  {format},   {opcode(hex)}, {funct(hex)}*/

                {"add",    "R_TYPE",      "0",           "20"},

                {"addi",   "I_TYPE",      "8",           null},

                {"addiu",  "I_TYPE",      "9",           null},

                {"addu",   "R_TYPE",      "0",           "21"},

                {"and",    "R_TYPE",      "0",           "24"},

                {"andi",   "I_TYPE",      "c",           null},

                {"beq",    "I_TYPE",      "4",           null},

                {"bne",    "I_TYPE",      "5",           null},

                {"j",      "J_TYPE",      "2",           null},

                {"jal",    "J_TYPE",      "3",           null},

                {"jr",     "R_TYPE",      "0",           "8"},

                {"lbu",    "I_TYPE",      "24",          null},

                {"lhu",    "I_TYPE",      "25",          null},

                {"ll",     "I_TYPE",      "30",          null},

                {"lui",    "I_TYPE",      "f",           null},

                {"lw",     "I_TYPE",      "23",          null},

                {"nor",    "R_TYPE",      "0",           "27"},

                {"or",     "R_TYPE",      "0",           "25"},

                {"ori",    "I_TYPE",      "d",           null},

                {"slt",    "R_TYPE",      "0",           "2a"},

                {"slti",   "I_TYPE",      "a",           null},

                {"sltiu",  "I_TYPE",      "b",           null},

                {"sltu",   "R_TYPE",      "0",           "2b"},

                {"sll",    "R_TYPE",      "0",           "0"},

                {"srl",    "R_TYPE",      "0",           "2"},

                {"sb",     "I_TYPE",      "28",          null},

                {"sc",     "I_TYPE",      "38",          null},

                {"sh",     "I_TYPE",      "29",          null},

                {"sw",     "I_TYPE",      "2b",          null},

                {"sub",    "R_TYPE",      "0",           "22"},

                {"subu",   "R_TYPE",      "0",           "23"}

            };




        public static final String[][] REGISTERS =

            {

                /*name      number(hex)*/

                {"$zero",   "0"},

                {"$at",     "1"},

                {"$v0",     "2"},

                {"$v1",     "3"},

                {"$a0",     "4"},

                {"$a1",     "5"},

                {"$a2",     "6"},

                {"$a3",     "7"},

                {"$t0",     "8"},

                {"$t1",     "9"},

                {"$t2",     "a"},

                {"$t3",     "b"},

                {"$t4",     "c"},

                {"$t5",     "d"},

                {"$t6",     "e"},

                {"$t7",     "f"},

                {"$s0",     "10"},

                {"$s1",     "11"},

                {"$s2",     "12"},

                {"$s3",     "13"},

                {"$s4",     "14"},

                {"$s5",     "15"},

                {"$s6",     "16"},

                {"$s7",     "17"},

                {"$t8",     "18"},

                {"$t9",     "19"},

                {"$k0",     "1a"},

                {"$k1",     "1b"},

                {"$gp",     "1c"},

                {"$sp",     "1d"},

                {"$fp",     "1e"},

                {"$ra",     "1f"}

            };






}
