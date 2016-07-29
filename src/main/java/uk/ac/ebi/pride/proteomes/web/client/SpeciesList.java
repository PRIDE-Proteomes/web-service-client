package uk.ac.ebi.pride.proteomes.web.client;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * SpeciesList
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-03T15:49:25.259+01:00")
public class SpeciesList   {
  

  /**
   * Gets or Sets speciesList
   */
  public enum SpeciesListEnum {
    _575412_NAME_ACANTHOSCURRIA_GENICULATA_ACANTHOSCURRIA_GENICULATA_("Species{taxid=575412, name='Acanthoscurria geniculata (Acanthoscurria geniculata)'}"),
    _29491_NAME_AEROMONAS_SALMONICIDA_SUBSP_SALMONICIDA_AEROMONAS_SALMONICIDA_SUBSP_SALMONICIDA_("Species{taxid=29491, name='Aeromonas salmonicida subsp. salmonicida (Aeromonas salmonicida subsp. salmonicida)'}"),
    _694569_NAME_AGGREGATIBACTER_ACTINOMYCETEMCOMITANS_D7S_1_AGGREGATIBACTER_ACTINOMYCETEMCOMITANS_D7S_1_("Species{taxid=694569, name='Aggregatibacter actinomycetemcomitans D7S-1 (Aggregatibacter actinomycetemcomitans D7S-1)'}"),
    _6269_NAME_ANISAKIS_SIMPLEX_ANISAKIS_SIMPLEX_("Species{taxid=6269, name='Anisakis simplex (Anisakis simplex)'}"),
    _7460_NAME_APIS_MELLIFERA_APIS_MELLIFERA_("Species{taxid=7460, name='Apis mellifera (Apis mellifera)'}"),
    _3702_NAME_ARABIDOPSIS_THALIANA_MOUSE_EAR_CRESS_("Species{taxid=3702, name='Arabidopsis thaliana (Mouse-ear cress)'}"),
    _5059_NAME_ASPERGILLUS_FLAVUS_ASPERGILLUS_FLAVUS_("Species{taxid=5059, name='Aspergillus flavus (Aspergillus flavus)'}"),
    _5085_NAME_ASPERGILLUS_FUMIGATUS_ASPERGILLUS_FUMIGATUS_("Species{taxid=5085, name='Aspergillus fumigatus (Aspergillus fumigatus)'}"),
    _5061_NAME_ASPERGILLUS_NIGER_ASPERGILLUS_NIGER_("Species{taxid=5061, name='Aspergillus niger (Aspergillus niger)'}"),
    _425011_NAME_ASPERGILLUS_NIGER_CBS_513_88_ASPERGILLUS_NIGER_CBS_513_88_("Species{taxid=425011, name='Aspergillus niger CBS 513.88 (Aspergillus niger CBS 513.88)'}"),
    _38783_NAME_AVENA_STRIGOSA_AVENA_STRIGOSA_("Species{taxid=38783, name='Avena strigosa (Avena strigosa)'}"),
    _5866_NAME_BABESIA_BIGEMINA_BABESIA_BIGEMINA_("Species{taxid=5866, name='Babesia bigemina (Babesia bigemina)'}"),
    _35084_NAME_BABESIA_SP_BABESIA_SP_("Species{taxid=35084, name='Babesia sp. (Babesia sp.)'}"),
    _226900_NAME_BACILLUS_CEREUS_ATCC_14579_BACILLUS_CEREUS_ATCC_14579_("Species{taxid=226900, name='Bacillus cereus ATCC 14579 (Bacillus cereus ATCC 14579)'}"),
    _1471_NAME_BACILLUS_METHANOLICUS_BACILLUS_METHANOLICUS_("Species{taxid=1471, name='Bacillus methanolicus (Bacillus methanolicus)'}"),
    _224308_NAME_BACILLUS_SUBTILIS_SUBSP_SUBTILIS_STR_168_BACILLUS_SUBTILIS_SUBSP_SUBTILIS_STR_168_("Species{taxid=224308, name='Bacillus subtilis subsp. subtilis str. 168 (Bacillus subtilis subsp. subtilis str. 168)'}"),
    _2_NAME_BACTERIA_BACTERIA_("Species{taxid=2, name='Bacteria (Bacteria)'}"),
    _803_NAME_BARTONELLA_QUINTANA_BARTONELLA_QUINTANA_("Species{taxid=803, name='Bartonella quintana (Bartonella quintana)'}"),
    _1134506_NAME_BARTONELLA_QUINTANA_JK_31_BARTONELLA_QUINTANA_JK_31_("Species{taxid=1134506, name='Bartonella quintana JK 31 (Bartonella quintana JK 31)'}"),
    _718308_NAME_BIOFILM_METAGENOME_BIOFILM_METAGENOME_("Species{taxid=718308, name='biofilm metagenome (biofilm metagenome)'}"),
    _546991_NAME_BLUMERIA_GRAMINIS_F_SP_HORDEI_DH14_BLUMERIA_GRAMINIS_F_SP_HORDEI_DH14_("Species{taxid=546991, name='Blumeria graminis f. sp. hordei DH14 (Blumeria graminis f. sp. hordei DH14)'}"),
    _7091_NAME_BOMBYX_MORI_BOMBYX_MORI_("Species{taxid=7091, name='Bombyx mori (Bombyx mori)'}"),
    _9913_NAME_BOS_TAURUS_BOS_TAURUS_("Species{taxid=9913, name='Bos taurus (Bos taurus)'}"),
    _515622_NAME_BUTYRIVIBRIO_PROTEOCLASTICUS_B316_BUTYRIVIBRIO_PROTEOCLASTICUS_B316_("Species{taxid=515622, name='Butyrivibrio proteoclasticus B316 (Butyrivibrio proteoclasticus B316)'}"),
    _6239_NAME_CAENORHABDITIS_ELEGANS_CAENORHABDITIS_ELEGANS_("Species{taxid=6239, name='Caenorhabditis elegans (Caenorhabditis elegans)'}"),
    _273068_NAME_CALDANAEROBACTER_SUBTERRANEUS_SUBSP_TENGCONGENSIS_MB4_CALDANAEROBACTER_SUBTERRANEUS_SUBSP_TENGCONGENSIS_MB4_("Species{taxid=273068, name='Caldanaerobacter subterraneus subsp. tengcongensis MB4 (Caldanaerobacter subterraneus subsp. tengcongensis MB4)'}"),
    _9838_NAME_CAMELUS_DROMEDARIUS_CAMELUS_DROMEDARIUS_("Species{taxid=9838, name='Camelus dromedarius (Camelus dromedarius)'}"),
    _360104_NAME_CAMPYLOBACTER_CONCISUS_13826_CAMPYLOBACTER_CONCISUS_13826_("Species{taxid=360104, name='Campylobacter concisus 13826 (Campylobacter concisus 13826)'}"),
    _929793_NAME_CAMPYLOBACTER_CONCISUS_UNSWCD_CAMPYLOBACTER_CONCISUS_UNSWCD_("Species{taxid=929793, name='Campylobacter concisus UNSWCD (Campylobacter concisus UNSWCD)'}"),
    _197_NAME_CAMPYLOBACTER_JEJUNI_CAMPYLOBACTER_JEJUNI_("Species{taxid=197, name='Campylobacter jejuni (Campylobacter jejuni)'}"),
    _237561_NAME_CANDIDA_ALBICANS_SC5314_CANDIDA_ALBICANS_SC5314_("Species{taxid=237561, name='Candida albicans SC5314 (Candida albicans SC5314)'}"),
    _174633_NAME_CANDIDATUS_KUENENIA_STUTTGARTIENSIS_CANDIDATUS_KUENENIA_STUTTGARTIENSIS_("Species{taxid=174633, name='Candidatus Kuenenia stuttgartiensis (Candidatus Kuenenia stuttgartiensis)'}"),
    _671143_NAME_CANDIDATUS_METHYLOMIRABILIS_OXYFERA_CANDIDATUS_METHYLOMIRABILIS_OXYFERA_("Species{taxid=671143, name='Candidatus Methylomirabilis oxyfera (Candidatus Methylomirabilis oxyfera)'}"),
    _264201_NAME_CANDIDATUS_PROTOCHLAMYDIA_AMOEBOPHILA_UWE25_CANDIDATUS_PROTOCHLAMYDIA_AMOEBOPHILA_UWE25_("Species{taxid=264201, name='Candidatus Protochlamydia amoebophila UWE25 (Candidatus Protochlamydia amoebophila UWE25)'}"),
    _210352_NAME_CECROPIA_PELTATA_CECROPIA_PELTATA_("Species{taxid=210352, name='Cecropia peltata (Cecropia peltata)'}"),
    _3055_NAME_CHLAMYDOMONAS_REINHARDTII_CHLAMYDOMONAS_REINHARDTII_("Species{taxid=3055, name='Chlamydomonas reinhardtii (Chlamydomonas reinhardtii)'}"),
    _906914_NAME_CHLAMYDOMONAS_REINHARDTII_CC3269_CHLAMYDOMONAS_REINHARDTII_CC3269_("Species{taxid=906914, name='Chlamydomonas reinhardtii CC3269 (Chlamydomonas reinhardtii CC3269)'}"),
    _1097_NAME_CHLOROBACULUM_TEPIDUM_CHLOROBACULUM_TEPIDUM_("Species{taxid=1097, name='Chlorobaculum tepidum (Chlorobaculum tepidum)'}"),
    _9534_NAME_CHLOROCEBUS_AETHIOPS_CHLOROCEBUS_AETHIOPS_("Species{taxid=9534, name='Chlorocebus aethiops (Chlorocebus aethiops)'}"),
    _7719_NAME_CIONA_INTESTINALIS_CIONA_INTESTINALIS_("Species{taxid=7719, name='Ciona intestinalis (Ciona intestinalis)'}"),
    _6491_NAME_CONUS_GEOGRAPHUS_CONUS_GEOGRAPHUS_("Species{taxid=6491, name='Conus geographus (Conus geographus)'}"),
    _29159_NAME_CRASSOSTREA_GIGAS_CRASSOSTREA_GIGAS_("Species{taxid=29159, name='Crassostrea gigas (Crassostrea gigas)'}"),
    _6655_NAME_CRYPTOCHITON_STELLERI_CRYPTOCHITON_STELLERI_("Species{taxid=6655, name='Cryptochiton stelleri (Cryptochiton stelleri)'}"),
    _7962_NAME_CYPRINUS_CARPIO_CYPRINUS_CARPIO_("Species{taxid=7962, name='Cyprinus carpio (Cyprinus carpio)'}"),
    _7955_NAME_DANIO_RERIO_DANIO_RERIO_("Species{taxid=7955, name='Danio rerio (Danio rerio)'}"),
    _546414_NAME_DEINOCOCCUS_DESERTI_VCD115_DEINOCOCCUS_DESERTI_VCD115_("Species{taxid=546414, name='Deinococcus deserti VCD115 (Deinococcus deserti VCD115)'}"),
    _1299_NAME_DEINOCOCCUS_RADIODURANS_DEINOCOCCUS_RADIODURANS_("Species{taxid=1299, name='Deinococcus radiodurans (Deinococcus radiodurans)'}"),
    _243230_NAME_DEINOCOCCUS_RADIODURANS_R1_DEINOCOCCUS_RADIODURANS_R1_("Species{taxid=243230, name='Deinococcus radiodurans R1 (Deinococcus radiodurans R1)'}"),
    _349161_NAME_DESULFOTOMACULUM_REDUCENS_MI_1_DESULFOTOMACULUM_REDUCENS_MI_1_("Species{taxid=349161, name='Desulfotomaculum reducens MI-1 (Desulfotomaculum reducens MI-1)'}"),
    _33083_NAME_DICTYOSTELIIDA_DICTYOSTELIIDA_("Species{taxid=33083, name='Dictyosteliida (Dictyosteliida)'}"),
    _44689_NAME_DICTYOSTELIUM_DISCOIDEUM_DICTYOSTELIUM_DISCOIDEUM_("Species{taxid=44689, name='Dictyostelium discoideum (Dictyostelium discoideum)'}"),
    _7215_NAME_DROSOPHILA_DROSOPHILA_("Species{taxid=7215, name='Drosophila (Drosophila)'}"),
    _7227_NAME_DROSOPHILA_MELANOGASTER_DROSOPHILA_MELANOGASTER_("Species{taxid=7227, name='Drosophila melanogaster (Drosophila melanogaster)'}"),
    _1351_NAME_ENTEROCOCCUS_FAECALIS_ENTEROCOCCUS_FAECALIS_("Species{taxid=1351, name='Enterococcus faecalis (Enterococcus faecalis)'}"),
    _9796_NAME_EQUUS_CABALLUS_EQUUS_CABALLUS_("Species{taxid=9796, name='Equus caballus (Equus caballus)'}"),
    _562_NAME_ESCHERICHIA_COLI_ESCHERICHIA_COLI_("Species{taxid=562, name='Escherichia coli (Escherichia coli)'}"),
    _83333_NAME_ESCHERICHIA_COLI_K_12_ESCHERICHIA_COLI_K_12_("Species{taxid=83333, name='Escherichia coli K-12 (Escherichia coli K-12)'}"),
    _155864_NAME_ESCHERICHIA_COLI_O157_H7_STR_EDL933_ESCHERICHIA_COLI_O157_H7_STR_EDL933_("Species{taxid=155864, name='Escherichia coli O157:H7 str. EDL933 (Escherichia coli O157:H7 str. EDL933)'}"),
    _544404_NAME_ESCHERICHIA_COLI_O157_H7_STR_TW14359_ESCHERICHIA_COLI_O157_H7_STR_TW14359_("Species{taxid=544404, name='Escherichia coli O157:H7 str. TW14359 (Escherichia coli O157:H7 str. TW14359)'}"),
    _511145_NAME_ESCHERICHIA_COLI_STR_K_12_SUBSTR_MG1655_ESCHERICHIA_COLI_STR_K_12_SUBSTR_MG1655_("Species{taxid=511145, name='Escherichia coli str. K-12 substr. MG1655 (Escherichia coli str. K-12 substr. MG1655)'}"),
    _3932_NAME_EUCALYPTUS_EUCALYPTUS_("Species{taxid=3932, name='Eucalyptus (Eucalyptus)'}"),
    _34317_NAME_EUCALYPTUS_GLOBULUS_EUCALYPTUS_GLOBULUS_("Species{taxid=34317, name='Eucalyptus globulus (Eucalyptus globulus)'}"),
    _60423_NAME_FAGUS_GRANDIFOLIA_FAGUS_GRANDIFOLIA_("Species{taxid=60423, name='Fagus grandifolia (Fagus grandifolia)'}"),
    _1239_NAME_FIRMICUTES_FIRMICUTES_("Species{taxid=1239, name='Firmicutes (Firmicutes)'}"),
    _56029_NAME_FRAXINUS_MANDSHURICA_FRAXINUS_MANDSHURICA_("Species{taxid=56029, name='Fraxinus mandshurica (Fraxinus mandshurica)'}"),
    _56031_NAME_FRAXINUS_NIGRA_FRAXINUS_NIGRA_("Species{taxid=56031, name='Fraxinus nigra (Fraxinus nigra)'}"),
    _52638_NAME_GAMMARUS_FOSSARUM_GAMMARUS_FOSSARUM_("Species{taxid=52638, name='Gammarus fossarum (Gammarus fossarum)'}"),
    _35554_NAME_GEOBACTER_SULFURREDUCENS_GEOBACTER_SULFURREDUCENS_("Species{taxid=35554, name='Geobacter sulfurreducens (Geobacter sulfurreducens)'}"),
    _184922_NAME_GIARDIA_LAMBLIA_ATCC_50803_GIARDIA_LAMBLIA_ATCC_50803_("Species{taxid=184922, name='Giardia lamblia ATCC 50803 (Giardia lamblia ATCC 50803)'}"),
    _7394_NAME_GLOSSINA_MORSITANS_GLOSSINA_MORSITANS_("Species{taxid=7394, name='Glossina morsitans (Glossina morsitans)'}"),
    _3847_NAME_GLYCINE_MAX_GLYCINE_MAX_("Species{taxid=3847, name='Glycine max (Glycine max)'}"),
    _114727_NAME_H1N1_SUBTYPE_H1N1_SUBTYPE_("Species{taxid=114727, name='H1N1 subtype (H1N1 subtype)'}"),
    _2239_NAME_HALOBACTERIUM_HALOBACTERIUM_("Species{taxid=2239, name='Halobacterium (Halobacterium)'}"),
    _478009_NAME_HALOBACTERIUM_SALINARUM_R1_HALOBACTERIUM_SALINARUM_R1_("Species{taxid=478009, name='Halobacterium salinarum R1 (Halobacterium salinarum R1)'}"),
    _85962_NAME_HELICOBACTER_PYLORI_26695_HELICOBACTER_PYLORI_26695_("Species{taxid=85962, name='Helicobacter pylori 26695 (Helicobacter pylori 26695)'}"),
    _9606_NAME_HOMO_SAPIENS_HUMAN_("Species{taxid=9606, name='Homo sapiens (Human)'}"),
    _37965_NAME_HYBRID_HYBRID_("Species{taxid=37965, name='hybrid (hybrid)'}"),
    _4934_NAME_LACHANCEA_KLUYVERI_LACHANCEA_KLUYVERI_("Species{taxid=4934, name='Lachancea kluyveri (Lachancea kluyveri)'}"),
    _1639_NAME_LISTERIA_MONOCYTOGENES_LISTERIA_MONOCYTOGENES_("Species{taxid=1639, name='Listeria monocytogenes (Listeria monocytogenes)'}"),
    _42156_NAME_LITOMOSOIDES_SIGMODONTIS_LITOMOSOIDES_SIGMODONTIS_("Species{taxid=42156, name='Litomosoides sigmodontis (Litomosoides sigmodontis)'}"),
    _86794_NAME_LOBARIA_PULMONARIA_LOBARIA_PULMONARIA_("Species{taxid=86794, name='Lobaria pulmonaria (Lobaria pulmonaria)'}"),
    _34305_NAME_LOTUS_JAPONICUS_LOTUS_JAPONICUS_("Species{taxid=34305, name='Lotus japonicus (Lotus japonicus)'}"),
    _7609_NAME_MARTHASTERIAS_GLACIALIS_MARTHASTERIAS_GLACIALIS_("Species{taxid=7609, name='Marthasterias glacialis (Marthasterias glacialis)'}"),
    _2214_NAME_METHANOSARCINA_ACETIVORANS_METHANOSARCINA_ACETIVORANS_("Species{taxid=2214, name='Methanosarcina acetivorans (Methanosarcina acetivorans)'}"),
    _449447_NAME_MICROCYSTIS_AERUGINOSA_NIES_843_MICROCYSTIS_AERUGINOSA_NIES_843_("Species{taxid=449447, name='Microcystis aeruginosa NIES-843 (Microcystis aeruginosa NIES-843)'}"),
    _10090_NAME_MUS_MUSCULUS_MOUSE_("Species{taxid=10090, name='Mus musculus (Mouse)'}"),
    _1773_NAME_MYCOBACTERIUM_TUBERCULOSIS_MYCOBACTERIUM_TUBERCULOSIS_("Species{taxid=1773, name='Mycobacterium tuberculosis (Mycobacterium tuberculosis)'}"),
    _1006581_NAME_MYCOPLASMA_GALLISEPTICUM_S6_MYCOPLASMA_GALLISEPTICUM_S6_("Species{taxid=1006581, name='Mycoplasma gallisepticum S6 (Mycoplasma gallisepticum S6)'}"),
    _348780_NAME_NATRONOMONAS_PHARAONIS_DSM_2160_NATRONOMONAS_PHARAONIS_DSM_2160_("Species{taxid=348780, name='Natronomonas pharaonis DSM 2160 (Natronomonas pharaonis DSM 2160)'}"),
    _107243_NAME_NOCCAEA_CAERULESCENS_NOCCAEA_CAERULESCENS_("Species{taxid=107243, name='Noccaea caerulescens (Noccaea caerulescens)'}"),
    _378548_NAME_NOVOSPHINGOBIUM_NITROGENIFIGENS_NOVOSPHINGOBIUM_NITROGENIFIGENS_("Species{taxid=378548, name='Novosphingobium nitrogenifigens (Novosphingobium nitrogenifigens)'}"),
    _8022_NAME_ONCORHYNCHUS_MYKISS_ONCORHYNCHUS_MYKISS_("Species{taxid=8022, name='Oncorhynchus mykiss (Oncorhynchus mykiss)'}"),
    _145943_NAME_OPHRYS_GARGANICA_OPHRYS_GARGANICA_("Species{taxid=145943, name='Ophrys garganica (Ophrys garganica)'}"),
    _145953_NAME_OPHRYS_SPHEGODES_OPHRYS_SPHEGODES_("Species{taxid=145953, name='Ophrys sphegodes (Ophrys sphegodes)'}"),
    _884019_NAME_OPHRYS_X_ARACHNITIFORMIS_SUBSP_ARCHIPELAGI_OPHRYS_X_ARACHNITIFORMIS_SUBSP_ARCHIPELAGI_("Species{taxid=884019, name='Ophrys x arachnitiformis subsp. archipelagi (Ophrys x arachnitiformis subsp. archipelagi)'}"),
    _8127_NAME_OREOCHROMIS_MOSSAMBICUS_OREOCHROMIS_MOSSAMBICUS_("Species{taxid=8127, name='Oreochromis mossambicus (Oreochromis mossambicus)'}"),
    _4530_NAME_ORYZA_SATIVA_ORYZA_SATIVA_("Species{taxid=4530, name='Oryza sativa (Oryza sativa)'}"),
    _70448_NAME_OSTREOCOCCUS_TAURI_OSTREOCOCCUS_TAURI_("Species{taxid=70448, name='Ostreococcus tauri (Ostreococcus tauri)'}"),
    _9935_NAME_OVIS_OVIS_("Species{taxid=9935, name='Ovis (Ovis)'}"),
    _9940_NAME_OVIS_ARIES_OVIS_ARIES_("Species{taxid=9940, name='Ovis aries (Ovis aries)'}"),
    _554_NAME_PECTOBACTERIUM_CAROTOVORUM_PECTOBACTERIUM_CAROTOVORUM_("Species{taxid=554, name='Pectobacterium carotovorum (Pectobacterium carotovorum)'}"),
    _298386_NAME_PHOTOBACTERIUM_PROFUNDUM_SS9_PHOTOBACTERIUM_PROFUNDUM_SS9_("Species{taxid=298386, name='Photobacterium profundum SS9 (Photobacterium profundum SS9)'}"),
    _4787_NAME_PHYTOPHTHORA_INFESTANS_PHYTOPHTHORA_INFESTANS_("Species{taxid=4787, name='Phytophthora infestans (Phytophthora infestans)'}"),
    _3347_NAME_PINUS_RADIATA_PINUS_RADIATA_("Species{taxid=3347, name='Pinus radiata (Pinus radiata)'}"),
    _5833_NAME_PLASMODIUM_FALCIPARUM_PLASMODIUM_FALCIPARUM_("Species{taxid=5833, name='Plasmodium falciparum (Plasmodium falciparum)'}"),
    _36329_NAME_PLASMODIUM_FALCIPARUM_3D7_PLASMODIUM_FALCIPARUM_3D7_("Species{taxid=36329, name='Plasmodium falciparum 3D7 (Plasmodium falciparum 3D7)'}"),
    _144042_NAME_POGONOMYRMEX_RUGOSUS_POGONOMYRMEX_RUGOSUS_("Species{taxid=144042, name='Pogonomyrmex rugosus (Pogonomyrmex rugosus)'}"),
    _47664_NAME_POPULUS_TREMULA_X_POPULUS_TREMULOIDES_POPULUS_TREMULA_X_POPULUS_TREMULOIDES_("Species{taxid=47664, name='Populus tremula x Populus tremuloides (Populus tremula x Populus tremuloides)'}"),
    _287_NAME_PSEUDOMONAS_AERUGINOSA_PSEUDOMONAS_AERUGINOSA_("Species{taxid=287, name='Pseudomonas aeruginosa (Pseudomonas aeruginosa)'}"),
    _208964_NAME_PSEUDOMONAS_AERUGINOSA_PAO1_PSEUDOMONAS_AERUGINOSA_PAO1_("Species{taxid=208964, name='Pseudomonas aeruginosa PAO1 (Pseudomonas aeruginosa PAO1)'}"),
    _294_NAME_PSEUDOMONAS_FLUORESCENS_PSEUDOMONAS_FLUORESCENS_("Species{taxid=294, name='Pseudomonas fluorescens (Pseudomonas fluorescens)'}"),
    _278161_NAME_PSEUDOTSUGA_MENZIESII_VAR_MENZIESII_PSEUDOTSUGA_MENZIESII_VAR_MENZIESII_("Species{taxid=278161, name='Pseudotsuga menziesii var. menziesii (Pseudotsuga menziesii var. menziesii)'}"),
    _10116_NAME_RATTUS_NORVEGICUS_RAT_("Species{taxid=10116, name='Rattus norvegicus (Rat)'}"),
    _101510_NAME_RHODOCOCCUS_JOSTII_RHA1_RHODOCOCCUS_JOSTII_RHA1_("Species{taxid=101510, name='Rhodococcus jostii RHA1 (Rhodococcus jostii RHA1)'}"),
    _1076_NAME_RHODOPSEUDOMONAS_PALUSTRIS_RHODOPSEUDOMONAS_PALUSTRIS_("Species{taxid=1076, name='Rhodopseudomonas palustris (Rhodopseudomonas palustris)'}"),
    _269796_NAME_RHODOSPIRILLUM_RUBRUM_ATCC_11170_RHODOSPIRILLUM_RUBRUM_ATCC_11170_("Species{taxid=269796, name='Rhodospirillum rubrum ATCC 11170 (Rhodospirillum rubrum ATCC 11170)'}"),
    _4932_NAME_SACCHAROMYCES_CEREVISIAE_SACCHAROMYCES_CEREVISIAE_("Species{taxid=4932, name='Saccharomyces cerevisiae (Saccharomyces cerevisiae)'}"),
    _559292_NAME_SACCHAROMYCES_CEREVISIAE_S288C_SACCHAROMYCES_CEREVISIAE_S288C_("Species{taxid=559292, name='Saccharomyces cerevisiae S288c (Saccharomyces cerevisiae S288c)'}"),
    _307796_NAME_SACCHAROMYCES_CEREVISIAE_YJM789_SACCHAROMYCES_CEREVISIAE_YJM789_("Species{taxid=307796, name='Saccharomyces cerevisiae YJM789 (Saccharomyces cerevisiae YJM789)'}"),
    _602_NAME_SALMONELLA_TYPHIMURIUM_SALMONELLA_TYPHIMURIUM_("Species{taxid=602, name='Salmonella typhimurium (Salmonella typhimurium)'}"),
    _6183_NAME_SCHISTOSOMA_MANSONI_SCHISTOSOMA_MANSONI_("Species{taxid=6183, name='Schistosoma mansoni (Schistosoma mansoni)'}"),
    _4896_NAME_SCHIZOSACCHAROMYCES_POMBE_SCHIZOSACCHAROMYCES_POMBE_("Species{taxid=4896, name='Schizosaccharomyces pombe (Schizosaccharomyces pombe)'}"),
    _1264690_NAME_SCHIZOSACCHAROMYCES_POMBE_927_SCHIZOSACCHAROMYCES_POMBE_927_("Species{taxid=1264690, name='Schizosaccharomyces pombe 927 (Schizosaccharomyces pombe 927)'}"),
    _284812_NAME_SCHIZOSACCHAROMYCES_POMBE_972H_SCHIZOSACCHAROMYCES_POMBE_972H_("Species{taxid=284812, name='Schizosaccharomyces pombe 972h- (Schizosaccharomyces pombe 972h-)'}"),
    _622_NAME_SHIGELLA_DYSENTERIAE_SHIGELLA_DYSENTERIAE_("Species{taxid=622, name='Shigella dysenteriae (Shigella dysenteriae)'}"),
    _198215_NAME_SHIGELLA_FLEXNERI_2A_STR_2457T_SHIGELLA_FLEXNERI_2A_STR_2457T_("Species{taxid=198215, name='Shigella flexneri 2a str. 2457T (Shigella flexneri 2a str. 2457T)'}"),
    _4081_NAME_SOLANUM_LYCOPERSICUM_SOLANUM_LYCOPERSICUM_("Species{taxid=4081, name='Solanum lycopersicum (Solanum lycopersicum)'}"),
    _4113_NAME_SOLANUM_TUBEROSUM_SOLANUM_TUBEROSUM_("Species{taxid=4113, name='Solanum tuberosum (Solanum tuberosum)'}"),
    _160791_NAME_SPHINGOMONAS_WITTICHII_SPHINGOMONAS_WITTICHII_("Species{taxid=160791, name='Sphingomonas wittichii (Sphingomonas wittichii)'}"),
    _1280_NAME_STAPHYLOCOCCUS_AUREUS_STAPHYLOCOCCUS_AUREUS_("Species{taxid=1280, name='Staphylococcus aureus (Staphylococcus aureus)'}"),
    _451515_NAME_STAPHYLOCOCCUS_AUREUS_SUBSP_AUREUS_USA300_FPR3757_STAPHYLOCOCCUS_AUREUS_SUBSP_AUREUS_USA300_FPR3757_("Species{taxid=451515, name='Staphylococcus aureus subsp. aureus USA300_FPR3757 (Staphylococcus aureus subsp. aureus USA300_FPR3757)'}"),
    _1282_NAME_STAPHYLOCOCCUS_EPIDERMIDIS_STAPHYLOCOCCUS_EPIDERMIDIS_("Species{taxid=1282, name='Staphylococcus epidermidis (Staphylococcus epidermidis)'}"),
    _407821_NAME_STEGODYPHUS_MIMOSARUM_STEGODYPHUS_MIMOSARUM_("Species{taxid=407821, name='Stegodyphus mimosarum (Stegodyphus mimosarum)'}"),
    _1314_NAME_STREPTOCOCCUS_PYOGENES_STREPTOCOCCUS_PYOGENES_("Species{taxid=1314, name='Streptococcus pyogenes (Streptococcus pyogenes)'}"),
    _160490_NAME_STREPTOCOCCUS_PYOGENES_M1_GAS_STREPTOCOCCUS_PYOGENES_M1_GAS_("Species{taxid=160490, name='Streptococcus pyogenes M1 GAS (Streptococcus pyogenes M1 GAS)'}"),
    _1349_NAME_STREPTOCOCCUS_UBERIS_STREPTOCOCCUS_UBERIS_("Species{taxid=1349, name='Streptococcus uberis (Streptococcus uberis)'}"),
    _1902_NAME_STREPTOMYCES_COELICOLOR_STREPTOMYCES_COELICOLOR_("Species{taxid=1902, name='Streptomyces coelicolor (Streptomyces coelicolor)'}"),
    _100226_NAME_STREPTOMYCES_COELICOLOR_A3_2_STREPTOMYCES_COELICOLOR_A3_2_("Species{taxid=100226, name='Streptomyces coelicolor A3(2) (Streptomyces coelicolor A3(2))'}"),
    _1140_NAME_SYNECHOCOCCUS_ELONGATUS_PCC_7942_SYNECHOCOCCUS_ELONGATUS_PCC_7942_("Species{taxid=1140, name='Synechococcus elongatus PCC 7942 (Synechococcus elongatus PCC 7942)'}"),
    _32049_NAME_SYNECHOCOCCUS_SP_PCC_7002_SYNECHOCOCCUS_SP_PCC_7002_("Species{taxid=32049, name='Synechococcus sp. PCC 7002 (Synechococcus sp. PCC 7002)'}"),
    _1148_NAME_SYNECHOCYSTIS_SP_PCC_6803_SYNECHOCYSTIS_SP_PCC_6803_("Species{taxid=1148, name='Synechocystis sp. PCC 6803 (Synechocystis sp. PCC 6803)'}"),
    _593117_NAME_THERMOCOCCUS_GAMMATOLERANS_EJ3_THERMOCOCCUS_GAMMATOLERANS_EJ3_("Species{taxid=593117, name='Thermococcus gammatolerans EJ3 (Thermococcus gammatolerans EJ3)'}"),
    _7787_NAME_TORPEDO_CALIFORNICA_TORPEDO_CALIFORNICA_("Species{taxid=7787, name='Torpedo californica (Torpedo californica)'}"),
    _5702_NAME_TRYPANOSOMA_BRUCEI_BRUCEI_TRYPANOSOMA_BRUCEI_BRUCEI_("Species{taxid=5702, name='Trypanosoma brucei brucei (Trypanosoma brucei brucei)'}"),
    _32644_NAME_UNIDENTIFIED_UNIDENTIFIED_("Species{taxid=32644, name='unidentified (unidentified)'}"),
    _51997_NAME_UNIDENTIFIED_CHIMERIC_SEQUENCE_UNIDENTIFIED_CHIMERIC_SEQUENCE_("Species{taxid=51997, name='unidentified chimeric sequence (unidentified chimeric sequence)'}"),
    _33090_NAME_VIRIDIPLANTAE_VIRIDIPLANTAE_("Species{taxid=33090, name='Viridiplantae (Viridiplantae)'}"),
    _3603_NAME_VITIS_VITIS_("Species{taxid=3603, name='Vitis (Vitis)'}"),
    _96939_NAME_VITIS_RIPARIA_VITIS_RIPARIA_("Species{taxid=96939, name='Vitis riparia (Vitis riparia)'}"),
    _29760_NAME_VITIS_VINIFERA_VITIS_VINIFERA_("Species{taxid=29760, name='Vitis vinifera (Vitis vinifera)'}"),
    _174934_NAME_WOLBACHIA_SP_WMELPOP_WOLBACHIA_SP_WMELPOP_("Species{taxid=174934, name='Wolbachia sp. wMelPop (Wolbachia sp. wMelPop)'}"),
    _630_NAME_YERSINIA_ENTEROCOLITICA_YERSINIA_ENTEROCOLITICA_("Species{taxid=630, name='Yersinia enterocolitica (Yersinia enterocolitica)'}"),
    _632_NAME_YERSINIA_PESTIS_YERSINIA_PESTIS_("Species{taxid=632, name='Yersinia pestis (Yersinia pestis)'}"),
    _4577_NAME_ZEA_MAYS_ZEA_MAYS_("Species{taxid=4577, name='Zea mays (Zea mays)'}");

    private String value;

    SpeciesListEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private List<SpeciesListEnum> speciesList = new ArrayList<SpeciesListEnum>();

  
  /**
   **/
  public SpeciesList speciesList(List<SpeciesListEnum> speciesList) {
    this.speciesList = speciesList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("speciesList")
  public List<SpeciesListEnum> getSpeciesList() {
    return speciesList;
  }
  public void setSpeciesList(List<SpeciesListEnum> speciesList) {
    this.speciesList = speciesList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpeciesList speciesList = (SpeciesList) o;
    return Objects.equals(this.speciesList, speciesList.speciesList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(speciesList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpeciesList {\n");
    
    sb.append("    speciesList: ").append(toIndentedString(speciesList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

