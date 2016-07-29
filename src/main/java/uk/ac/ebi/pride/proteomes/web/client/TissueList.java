package uk.ac.ebi.pride.proteomes.web.client;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * TissueList
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-03T15:49:25.259+01:00")
public class TissueList   {
  

  /**
   * Gets or Sets tissueList
   */
  public enum TissueListEnum {
    BTO_0001383_CVNAME_ALVEOLAR_BONE_("Tissue{cvTerm='BTO:0001383', cvName='alveolar bone'}"),
    BTO_0001795_CVNAME_ANTERIOR_SILK_GLAND_("Tissue{cvTerm='BTO:0001795', cvName='anterior silk gland'}"),
    BTO_0000157_CVNAME_AORTA_THORACICA_("Tissue{cvTerm='BTO:0000157', cvName='aorta thoracica'}"),
    BTO_0000091_CVNAME_ASCITES_("Tissue{cvTerm='BTO:0000091', cvName='ascites'}"),
    BTO_0000018_CVNAME_A_549_CELL_("Tissue{cvTerm='BTO:0000018', cvName='A-549 cell'}"),
    BTO_0001516_CVNAME_BA_F3_CELL_("Tissue{cvTerm='BTO:0001516', cvName='BA/F3 cell'}"),
    BTO_0000121_CVNAME_BILE_("Tissue{cvTerm='BTO:0000121', cvName='bile'}"),
    BTO_0000089_CVNAME_BLOOD_("Tissue{cvTerm='BTO:0000089', cvName='blood'}"),
    BTO_0000131_CVNAME_BLOOD_PLASMA_("Tissue{cvTerm='BTO:0000131', cvName='blood plasma'}"),
    BTO_0000132_CVNAME_BLOOD_PLATELET_("Tissue{cvTerm='BTO:0000132', cvName='blood platelet'}"),
    BTO_0000133_CVNAME_BLOOD_SERUM_("Tissue{cvTerm='BTO:0000133', cvName='blood serum'}"),
    BTO_0000141_CVNAME_BONE_MARROW_("Tissue{cvTerm='BTO:0000141', cvName='bone marrow'}"),
    BTO_0000583_CVNAME_BONE_MARROW_CANCER_CELL_("Tissue{cvTerm='BTO:0000583', cvName='bone marrow cancer cell'}"),
    BTO_0000142_CVNAME_BRAIN_("Tissue{cvTerm='BTO:0000142', cvName='brain'}"),
    BTO_0000149_CVNAME_BREAST_("Tissue{cvTerm='BTO:0000149', cvName='breast'}"),
    BTO_0000356_CVNAME_BREAST_CANCER_CELL_LINE_("Tissue{cvTerm='BTO:0000356', cvName='breast cancer cell line'}"),
    BTO_0000155_CVNAME_BRONCHOALVEOLAR_LAVAGE_("Tissue{cvTerm='BTO:0000155', cvName='bronchoalveolar lavage'}"),
    BTO_0000164_CVNAME_BURKITT_LYMPHOMA_CELL_("Tissue{cvTerm='BTO:0000164', cvName='Burkitt lymphoma cell'}"),
    BTO_0001518_CVNAME_B_LYMPHOMA_CELL_LINE_("Tissue{cvTerm='BTO:0001518', cvName='B-lymphoma cell line'}"),
    BTO_0003699_CVNAME_C1R_CELL_("Tissue{cvTerm='BTO:0003699', cvName='C1R cell'}"),
    BTO_0001010_CVNAME_CALLUS_("Tissue{cvTerm='BTO:0001010', cvName='callus'}"),
    BTO_0002750_CVNAME_CALU_3_CELL_("Tissue{cvTerm='BTO:0002750', cvName='Calu-3 cell'}"),
    BTO_0000199_CVNAME_CARDIAC_MUSCLE_("Tissue{cvTerm='BTO:0000199', cvName='cardiac muscle'}"),
    BTO_000072_CVNAME_CARPEL_("Tissue{cvTerm='BTO:000072', cvName='carpel'}"),
    BTO_0000459_CVNAME_FIBROSARCOMA_CELL_("Tissue{cvTerm='BTO:0000459', cvName='fibrosarcoma cell'}"),
    BTO_0004059_CVNAME_CCD_18CO_CELL_("Tissue{cvTerm='BTO:0004059', cvName='CCD-18Co cell'}"),
    BTO_0000214_CVNAME_CELL_CULTURE_("Tissue{cvTerm='BTO:0000214', cvName='cell culture'}"),
    BTO_0000221_CVNAME_CELL_SUSPENSION_CULTURE_("Tissue{cvTerm='BTO:0000221', cvName='cell suspension culture'}"),
    BTO_0000233_CVNAME_CEREBRAL_CORTEX_("Tissue{cvTerm='BTO:0000233', cvName='cerebral cortex'}"),
    BTO_0000237_CVNAME_CEREBROSPINAL_FLUID_("Tissue{cvTerm='BTO:0000237', cvName='cerebrospinal fluid'}"),
    BTO_0000238_CVNAME_CEREBROVASCULAR_ENDOTHELIAL_CELL_("Tissue{cvTerm='BTO:0000238', cvName='cerebrovascular endothelial cell'}"),
    BTO_0002842_CVNAME_CHOLANGIOMA_CELL_("Tissue{cvTerm='BTO:0002842', cvName='cholangioma cell'}"),
    BTO_0001708_CVNAME_COELOMIC_FLUID_("Tissue{cvTerm='BTO:0001708', cvName='coelomic fluid'}"),
    BTO_0000269_CVNAME_COLON_("Tissue{cvTerm='BTO:0000269', cvName='colon'}"),
    BTO_0001616_CVNAME_COLORECTAL_CANCER_CELL_LINE_("Tissue{cvTerm='BTO:0001616', cvName='colorectal cancer cell line'}"),
    BTO_0000281_CVNAME_CONIDIOPHORE_("Tissue{cvTerm='BTO:0000281', cvName='conidiophore'}"),
    BTO_0000283_CVNAME_CONIDIUM_("Tissue{cvTerm='BTO:0000283', cvName='conidium'}"),
    BTO_0003415_CVNAME_CONJUNCTIVA_("Tissue{cvTerm='BTO:0003415', cvName='conjunctiva'}"),
    BTO_0000286_CVNAME_CORNEA_("Tissue{cvTerm='BTO:0000286', cvName='cornea'}"),
    BTO_0000300_CVNAME_COTYLEDON_("Tissue{cvTerm='BTO:0000300', cvName='cotyledon'}"),
    BTO_0002217_CVNAME_CULTURE_SUPERNATANT_("Tissue{cvTerm='BTO:0002217', cvName='culture supernatant'}"),
    BTO_0000338_CVNAME_DENTAL_PLAQUE_("Tissue{cvTerm='BTO:0000338', cvName='dental plaque'}"),
    BTO_0000369_CVNAME_EGG_("Tissue{cvTerm='BTO:0000369', cvName='Egg'}"),
    BTO_0000377_CVNAME_ELEMENTARY_BODY_("Tissue{cvTerm='BTO:0000377', cvName='elementary body'}"),
    BTO_0000379_CVNAME_EMBRYO_("Tissue{cvTerm='BTO:0000379', cvName='embryo'}"),
    BTO_0000669_CVNAME_EMBRYONIC_CELL_LINE_("Tissue{cvTerm='BTO:0000669', cvName='embryonic cell line'}"),
    BTO_0001176_CVNAME_ENDOTHELIAL_CELL_("Tissue{cvTerm='BTO:0001176', cvName='endothelial cell'}"),
    BTO_0000424_CVNAME_ERYTHROCYTE_("Tissue{cvTerm='BTO:0000424', cvName='erythrocyte'}"),
    BTO_0005136_CVNAME_ES_E14_CELL_("Tissue{cvTerm='BTO:0005136', cvName='ES-E14 cell'}"),
    BTO_0000491_CVNAME_EXCRETION_("Tissue{cvTerm='BTO:0000491', cvName='excretion'}"),
    BTO_0002241_CVNAME_EYELID_("Tissue{cvTerm='BTO:0002241', cvName='eyelid'}"),
    BTO_0000469_CVNAME_FLOWER_("Tissue{cvTerm='BTO:0000469', cvName='flower'}"),
    BTO_0000470_CVNAME_FLOWER_BUD_("Tissue{cvTerm='BTO:0000470', cvName='flower bud'}"),
    BTO_0000506_CVNAME_GASTROCNEMIUS_("Tissue{cvTerm='BTO:0000506', cvName='gastrocnemius'}"),
    BTO_0000518_CVNAME_GILL_("Tissue{cvTerm='BTO:0000518', cvName='gill'}"),
    BTO_0001900_CVNAME_GROWTH_PHASE_CULTURE_("Tissue{cvTerm='BTO:0001900', cvName='growth phase culture'}"),
    BTO_0000515_CVNAME_HAUSTORIUM_("Tissue{cvTerm='BTO:0000515', cvName='haustorium'}"),
    BTO_0000562_CVNAME_HEART_("Tissue{cvTerm='BTO:0000562', cvName='heart'}"),
    BTO_0000862_CVNAME_HEART_VENTRICLE_("Tissue{cvTerm='BTO:0000862', cvName='heart ventricle'}"),
    BTO_0002181_CVNAME_HEK_293T_CELL_("Tissue{cvTerm='BTO:0002181', cvName='HEK-293T cell'}"),
    BTO_0000007_CVNAME_HEK_293_CELL_("Tissue{cvTerm='BTO:0000007', cvName='HEK-293 cell'}"),
    BTO_0000567_CVNAME_HELA_CELL_("Tissue{cvTerm='BTO:0000567', cvName='HeLa cell'}"),
    BTO_0000599_CVNAME_HEPG2_CELL_("Tissue{cvTerm='BTO:0000599', cvName='HepG2 cell'}"),
    BTO_0000972_CVNAME_HEP_3B_CELL_("Tissue{cvTerm='BTO:0000972', cvName='HEP-3B cell'}"),
    BTO_0000601_CVNAME_HIPPOCAMPUS_("Tissue{cvTerm='BTO:0000601', cvName='hippocampus'}"),
    BTO_0003264_CVNAME_HL_1_CELL_("Tissue{cvTerm='BTO:0003264', cvName='HL-1 cell'}"),
    BTO_0000738_CVNAME_HL_60_CELL_("Tissue{cvTerm='BTO:0000738', cvName='HL-60 cell'}"),
    BTO_0001949_CVNAME_HUVEC_CELL_("Tissue{cvTerm='BTO:0001949', cvName='HUVEC cell'}"),
    BTO_0000612_CVNAME_HYPHA_("Tissue{cvTerm='BTO:0000612', cvName='hypha'}"),
    BTO_0000613_CVNAME_HYPOCOTYL_("Tissue{cvTerm='BTO:0000613', cvName='hypocotyl'}"),
    BTO_0000661_CVNAME_JURKAT_CELL_("Tissue{cvTerm='BTO:0000661', cvName='JURKAT cell'}"),
    BTO_0001948_CVNAME_JURKAT_E_6_1_CELL_("Tissue{cvTerm='BTO:0001948', cvName='JURKAT E-6.1 cell'}"),
    BTO_0003147_CVNAME_JUVENILE_LEAF_("Tissue{cvTerm='BTO:0003147', cvName='juvenile leaf'}"),
    BTO_0000671_CVNAME_KIDNEY_("Tissue{cvTerm='BTO:0000671', cvName='kidney'}"),
    BTO_0000664_CVNAME_K_562_CELL_("Tissue{cvTerm='BTO:0000664', cvName='K-562 cell'}"),
    BTO_0000713_CVNAME_LEAF_("Tissue{cvTerm='BTO:0000713', cvName='leaf'}"),
    BTO_0000759_CVNAME_LIVER_("Tissue{cvTerm='BTO:0000759', cvName='liver'}"),
    BTO_0000488_CVNAME_LOWER_EPIDERMIS_("Tissue{cvTerm='BTO:0000488', cvName='lower epidermis'}"),
    BTO_0000763_CVNAME_LUNG_("Tissue{cvTerm='BTO:0000763', cvName='lung'}"),
    BTO_0000762_CVNAME_LUNG_CANCER_CELL_LINE_("Tissue{cvTerm='BTO:0000762', cvName='lung cancer cell line'}"),
    BTO_0000784_CVNAME_LYMPH_NODE_("Tissue{cvTerm='BTO:0000784', cvName='lymph node'}"),
    BTO_0002278_CVNAME_MACROPHAGE_CELL_LINE_("Tissue{cvTerm='BTO:0002278', cvName='macrophage cell line'}"),
    BTO_0005339_CVNAME_MA_MEL_11_CELL_("Tissue{cvTerm='BTO:0005339', cvName='Ma-Mel-11 cell'}"),
    BTO_0001939_CVNAME_MCF_10A_CELL_("Tissue{cvTerm='BTO:0001939', cvName='MCF-10A cell'}"),
    BTO_0000093_CVNAME_MCF_7_CELL_("Tissue{cvTerm='BTO:0000093', cvName='MCF-7 cell'}"),
    BTO_0000849_CVNAME_MELANOMA_CELL_LINE_("Tissue{cvTerm='BTO:0000849', cvName='melanoma cell line'}"),
    BTO_0000858_CVNAME_MESOPHYLL_("Tissue{cvTerm='BTO:0000858', cvName='mesophyll'}"),
    BTO_0000878_CVNAME_MONONUCLEAR_CELL_("Tissue{cvTerm='BTO:0000878', cvName='mononuclear cell'}"),
    BTO_0000740_CVNAME_MYELOCYTIC_LEUKEMIA_CELL_LINE_("Tissue{cvTerm='BTO:0000740', cvName='myelocytic leukemia cell line'}"),
    BTO_0001656_CVNAME_NERVE_CORD_("Tissue{cvTerm='BTO:0001656', cvName='nerve cord'}"),
    BTO_0000932_CVNAME_NEUROBLASTOMA_CELL_LINE_("Tissue{cvTerm='BTO:0000932', cvName='neuroblastoma cell line'}"),
    BTO_0002860_CVNAME_ORAL_MUCOSA_("Tissue{cvTerm='BTO:0002860', cvName='oral mucosa'}"),
    BTO_0004687_CVNAME_ORBIT_("Tissue{cvTerm='BTO:0004687', cvName='orbit'}"),
    BTO_0000407_CVNAME_OSTEOSARCOMA_CELL_LINE_("Tissue{cvTerm='BTO:0000407', cvName='osteosarcoma cell line'}"),
    BTO_0004129_CVNAME_OVARY_EPITHELIUM_CELL_LINE_("Tissue{cvTerm='BTO:0004129', cvName='ovary epithelium cell line'}"),
    BTO_0000553_CVNAME_PERIPHERAL_BLOOD_("Tissue{cvTerm='BTO:0000553', cvName='peripheral blood'}"),
    BTO_0001038_CVNAME_PERITROPHIC_MEMBRANE_("Tissue{cvTerm='BTO:0001038', cvName='peritrophic membrane'}"),
    BTO_0001784_CVNAME_PEYERS_GLAND_("Tissue{cvTerm='BTO:0001784', cvName='Peyers gland'}"),
    BTO_0001078_CVNAME_PLACENTA_("Tissue{cvTerm='BTO:0001078', cvName='placenta'}"),
    BTO_0001097_CVNAME_POLLEN_("Tissue{cvTerm='BTO:0001097', cvName='pollen'}"),
    BTO_0001413_CVNAME_PRIMARY_CELL_("Tissue{cvTerm='BTO:0001413', cvName='primary cell'}"),
    BTO_0001182_CVNAME_PRIMARY_ROOT_("Tissue{cvTerm='BTO:0001182', cvName='primary root'}"),
    BTO_0001130_CVNAME_PROSTATE_CANCER_CELL_("Tissue{cvTerm='BTO:0001130', cvName='prostate cancer cell'}"),
    BTO_0003076_CVNAME_RAMOS_CELL_("Tissue{cvTerm='BTO:0003076', cvName='RAMOS cell'}"),
    BTO_0000383_CVNAME_RENAL_CELL_CARCINOMA_CELL_LINE_("Tissue{cvTerm='BTO:0000383', cvName='renal cell carcinoma cell line'}"),
    BTO_0001188_CVNAME_ROOT_("Tissue{cvTerm='BTO:0001188', cvName='root'}"),
    BTO_0001191_CVNAME_ROOT_TIP_("Tissue{cvTerm='BTO:0001191', cvName='root tip'}"),
    BTO_0001201_CVNAME_ROSETTE_("Tissue{cvTerm='BTO:0001201', cvName='rosette'}"),
    BTO_0001202_CVNAME_SALIVA_("Tissue{cvTerm='BTO:0001202', cvName='saliva'}"),
    BTO_0001203_CVNAME_SALIVARY_GLAND_("Tissue{cvTerm='BTO:0001203', cvName='salivary gland'}"),
    BTO_0001002_CVNAME_SCHIZONT_("Tissue{cvTerm='BTO:0001002', cvName='schizont'}"),
    BTO_0002979_CVNAME_SECRETION_("Tissue{cvTerm='BTO:0002979', cvName='secretion'}"),
    BTO_0001226_CVNAME_SEED_("Tissue{cvTerm='BTO:0001226', cvName='seed'}"),
    BTO_0001228_CVNAME_SEEDLING_("Tissue{cvTerm='BTO:0001228', cvName='seedling'}"),
    BTO_0001227_CVNAME_SEED_COAT_("Tissue{cvTerm='BTO:0001227', cvName='seed coat'}"),
    BTO_0001230_CVNAME_SEMEN_("Tissue{cvTerm='BTO:0001230', cvName='semen'}"),
    BTO_0001232_CVNAME_SEMINAL_PLASMA_("Tissue{cvTerm='BTO:0001232', cvName='seminal plasma'}"),
    BTO_0001239_CVNAME_SERUM_("Tissue{cvTerm='BTO:0001239', cvName='serum'}"),
    BTO_0001243_CVNAME_SHOOT_("Tissue{cvTerm='BTO:0001243', cvName='shoot'}"),
    BTO_00005592_CVNAME_SILIQUE_("Tissue{cvTerm='BTO:00005592', cvName='silique'}"),
    BTO_0001250_CVNAME_SILK_GLAND_("Tissue{cvTerm='BTO:0001250', cvName='silk gland'}"),
    BTO_0001103_CVNAME_SKELETAL_MUSCLE_("Tissue{cvTerm='BTO:0001103', cvName='skeletal muscle'}"),
    BTO_0001253_CVNAME_SKIN_("Tissue{cvTerm='BTO:0001253', cvName='skin'}"),
    BTO_0001258_CVNAME_SMALL_INTESTINE_EPITHELIUM_("Tissue{cvTerm='BTO:0001258', cvName='small intestine epithelium'}"),
    BTO_0001277_CVNAME_SPERMATOZOON_("Tissue{cvTerm='BTO:0001277', cvName='spermatozoon'}"),
    BTO_0001281_CVNAME_SPLEEN_("Tissue{cvTerm='BTO:0001281', cvName='spleen'}"),
    BTO_0001899_CVNAME_STATIONARY_PHASE_CULTURE_("Tissue{cvTerm='BTO:0001899', cvName='stationary phase culture'}"),
    BTO_0001307_CVNAME_STOMACH_("Tissue{cvTerm='BTO:0001307', cvName='stomach'}"),
    BTO_0000038_CVNAME_SW_480_CELL_("Tissue{cvTerm='BTO:0000038', cvName='SW-480 cell'}"),
    BTO_0000675_CVNAME_SW_620_CELL_("Tissue{cvTerm='BTO:0000675', cvName='SW-620 cell'}"),
    BTO_0001363_CVNAME_TESTIS_("Tissue{cvTerm='BTO:0001363', cvName='testis'}"),
    BTO_0001679_CVNAME_TH2_CELL_("Tissue{cvTerm='BTO:0001679', cvName='Th2-cell'}"),
    BTO_0001368_CVNAME_THORAX_("Tissue{cvTerm='BTO:0001368', cvName='thorax'}"),
    BTO_0001370_CVNAME_THP_1_CELL_("Tissue{cvTerm='BTO:0001370', cvName='THP-1 cell'}"),
    BTO_0001384_CVNAME_TISSUE_CULTURE_("Tissue{cvTerm='BTO:0001384', cvName='tissue culture'}"),
    BTO_0000397_CVNAME_TOOTH_("Tissue{cvTerm='BTO:0000397', cvName='tooth'}"),
    BTO_0001419_CVNAME_URINE_("Tissue{cvTerm='BTO:0001419', cvName='urine'}"),
    BTO_0002036_CVNAME_U_87MG_CELL_("Tissue{cvTerm='BTO:0002036', cvName='U-87MG cell'}"),
    BTO_0004502_CVNAME_VASCULAR_CAMBIUM_("Tissue{cvTerm='BTO:0004502', cvName='vascular cambium'}"),
    BTO_0002488_CVNAME_VASCULAR_SMOOTH_MUSCLE_CELL_("Tissue{cvTerm='BTO:0002488', cvName='vascular smooth muscle cell'}"),
    BTO_0001439_CVNAME_VENOM_("Tissue{cvTerm='BTO:0001439', cvName='venom'}"),
    BTO_0001440_CVNAME_VENOM_GLAND_("Tissue{cvTerm='BTO:0001440', cvName='venom gland'}"),
    BTO_0001093_CVNAME_WEHI_231_CELL_("Tissue{cvTerm='BTO:0001093', cvName='WEHI-231 cell'}"),
    BTO_0001489_CVNAME_WHOLE_BODY_("Tissue{cvTerm='BTO:0001489', cvName='whole body'}"),
    BTO_0001468_CVNAME_XYLEM_("Tissue{cvTerm='BTO:0001468', cvName='xylem'}"),
    BTO_0002307_CVNAME_YEAST_("Tissue{cvTerm='BTO:0002307', cvName='yeast'}"),
    NONE_CVNAME_NONE_("Tissue{cvTerm='none', cvName='none'}"),
    UNKNOWN_CVNAME_UNKNOWN_("Tissue{cvTerm='unknown', cvName='unknown'}");

    private String value;

    TissueListEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private List<TissueListEnum> tissueList = new ArrayList<TissueListEnum>();

  
  /**
   **/
  public TissueList tissueList(List<TissueListEnum> tissueList) {
    this.tissueList = tissueList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tissueList")
  public List<TissueListEnum> getTissueList() {
    return tissueList;
  }
  public void setTissueList(List<TissueListEnum> tissueList) {
    this.tissueList = tissueList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TissueList tissueList = (TissueList) o;
    return Objects.equals(this.tissueList, tissueList.tissueList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tissueList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TissueList {\n");
    
    sb.append("    tissueList: ").append(toIndentedString(tissueList)).append("\n");
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

