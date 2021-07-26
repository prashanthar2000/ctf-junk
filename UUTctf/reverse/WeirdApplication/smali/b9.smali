.class public Lb9;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public D:I

.field public E:I

.field public F:I

.field public G:I

.field public H:I

.field public I:I

.field public J:I

.field public K:I

.field public L:I

.field public M:I

.field public N:I

.field public O:I

.field public P:I

.field public Q:F

.field public R:F

.field public S:I

.field public T:I

.field public U:F

.field public V:Z

.field public W:F

.field public X:F

.field public Y:F

.field public Z:F

.field public a:Z

.field public a0:F

.field public b:I

.field public b0:F

.field public c:I

.field public c0:F

.field public d:I

.field public d0:F

.field public e:I

.field public e0:F

.field public f:I

.field public f0:F

.field public g:F

.field public g0:F

.field public h:I

.field public h0:Z

.field public i:I

.field public i0:Z

.field public j:I

.field public j0:I

.field public k:I

.field public k0:I

.field public l:I

.field public l0:I

.field public m:I

.field public m0:I

.field public n:I

.field public n0:I

.field public o:I

.field public o0:I

.field public p:I

.field public p0:F

.field public q:I

.field public q0:F

.field public r:I

.field public r0:Z

.field public s:I

.field public s0:I

.field public t:I

.field public t0:I

.field public u:F

.field public u0:[I

.field public v:F

.field public v0:Ljava/lang/String;

.field public w:Ljava/lang/String;

.field public x:I

.field public y:I

.field public z:F


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lb9;->a:Z

    const/4 v1, -0x1

    iput v1, p0, Lb9;->e:I

    iput v1, p0, Lb9;->f:I

    const/high16 v2, -0x40800000    # -1.0f

    iput v2, p0, Lb9;->g:F

    iput v1, p0, Lb9;->h:I

    iput v1, p0, Lb9;->i:I

    iput v1, p0, Lb9;->j:I

    iput v1, p0, Lb9;->k:I

    iput v1, p0, Lb9;->l:I

    iput v1, p0, Lb9;->m:I

    iput v1, p0, Lb9;->n:I

    iput v1, p0, Lb9;->o:I

    iput v1, p0, Lb9;->p:I

    iput v1, p0, Lb9;->q:I

    iput v1, p0, Lb9;->r:I

    iput v1, p0, Lb9;->s:I

    iput v1, p0, Lb9;->t:I

    const/high16 v2, 0x3f000000    # 0.5f

    iput v2, p0, Lb9;->u:F

    iput v2, p0, Lb9;->v:F

    const/4 v2, 0x0

    iput-object v2, p0, Lb9;->w:Ljava/lang/String;

    iput v1, p0, Lb9;->x:I

    iput v0, p0, Lb9;->y:I

    const/4 v2, 0x0

    iput v2, p0, Lb9;->z:F

    iput v1, p0, Lb9;->A:I

    iput v1, p0, Lb9;->B:I

    iput v1, p0, Lb9;->C:I

    iput v1, p0, Lb9;->D:I

    iput v1, p0, Lb9;->E:I

    iput v1, p0, Lb9;->F:I

    iput v1, p0, Lb9;->G:I

    iput v1, p0, Lb9;->H:I

    iput v1, p0, Lb9;->I:I

    iput v0, p0, Lb9;->J:I

    iput v1, p0, Lb9;->K:I

    iput v1, p0, Lb9;->L:I

    iput v1, p0, Lb9;->M:I

    iput v1, p0, Lb9;->N:I

    iput v1, p0, Lb9;->O:I

    iput v1, p0, Lb9;->P:I

    iput v2, p0, Lb9;->Q:F

    iput v2, p0, Lb9;->R:F

    iput v0, p0, Lb9;->S:I

    iput v0, p0, Lb9;->T:I

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, p0, Lb9;->U:F

    iput-boolean v0, p0, Lb9;->V:Z

    iput v2, p0, Lb9;->W:F

    iput v2, p0, Lb9;->X:F

    iput v2, p0, Lb9;->Y:F

    iput v2, p0, Lb9;->Z:F

    iput v3, p0, Lb9;->a0:F

    iput v3, p0, Lb9;->b0:F

    const/high16 v4, 0x7fc00000    # Float.NaN

    iput v4, p0, Lb9;->c0:F

    iput v4, p0, Lb9;->d0:F

    iput v2, p0, Lb9;->e0:F

    iput v2, p0, Lb9;->f0:F

    iput v2, p0, Lb9;->g0:F

    iput-boolean v0, p0, Lb9;->h0:Z

    iput-boolean v0, p0, Lb9;->i0:Z

    iput v0, p0, Lb9;->j0:I

    iput v0, p0, Lb9;->k0:I

    iput v1, p0, Lb9;->l0:I

    iput v1, p0, Lb9;->m0:I

    iput v1, p0, Lb9;->n0:I

    iput v1, p0, Lb9;->o0:I

    iput v3, p0, Lb9;->p0:F

    iput v3, p0, Lb9;->q0:F

    iput-boolean v0, p0, Lb9;->r0:Z

    iput v1, p0, Lb9;->s0:I

    iput v1, p0, Lb9;->t0:I

    return-void
.end method


# virtual methods
.method public a(Landroidx/constraintlayout/widget/ConstraintLayout$a;)V
    .locals 2

    iget v0, p0, Lb9;->h:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->d:I

    iget v0, p0, Lb9;->i:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->e:I

    iget v0, p0, Lb9;->j:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->f:I

    iget v0, p0, Lb9;->k:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->g:I

    iget v0, p0, Lb9;->l:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->h:I

    iget v0, p0, Lb9;->m:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->i:I

    iget v0, p0, Lb9;->n:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->j:I

    iget v0, p0, Lb9;->o:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k:I

    iget v0, p0, Lb9;->p:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l:I

    iget v0, p0, Lb9;->q:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->p:I

    iget v0, p0, Lb9;->r:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->q:I

    iget v0, p0, Lb9;->s:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->r:I

    iget v0, p0, Lb9;->t:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->s:I

    iget v0, p0, Lb9;->D:I

    iput v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v0, p0, Lb9;->E:I

    iput v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v0, p0, Lb9;->F:I

    iput v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v0, p0, Lb9;->G:I

    iput v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v0, p0, Lb9;->P:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->x:I

    iget v0, p0, Lb9;->O:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->y:I

    iget v0, p0, Lb9;->u:F

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->z:F

    iget v0, p0, Lb9;->v:F

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->A:F

    iget v0, p0, Lb9;->x:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->m:I

    iget v0, p0, Lb9;->y:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->n:I

    iget v0, p0, Lb9;->z:F

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->o:F

    iget-object v0, p0, Lb9;->w:Ljava/lang/String;

    iput-object v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->B:Ljava/lang/String;

    iget v0, p0, Lb9;->A:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->P:I

    iget v0, p0, Lb9;->B:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Q:I

    iget v0, p0, Lb9;->Q:F

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->E:F

    iget v0, p0, Lb9;->R:F

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->D:F

    iget v0, p0, Lb9;->T:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->G:I

    iget v0, p0, Lb9;->S:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->F:I

    iget-boolean v0, p0, Lb9;->h0:Z

    iput-boolean v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->S:Z

    iget-boolean v0, p0, Lb9;->i0:Z

    iput-boolean v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->T:Z

    iget v0, p0, Lb9;->j0:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->H:I

    iget v0, p0, Lb9;->k0:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->I:I

    iget v0, p0, Lb9;->l0:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->L:I

    iget v0, p0, Lb9;->m0:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->M:I

    iget v0, p0, Lb9;->n0:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->J:I

    iget v0, p0, Lb9;->o0:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->K:I

    iget v0, p0, Lb9;->p0:F

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->N:F

    iget v0, p0, Lb9;->q0:F

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->O:F

    iget v0, p0, Lb9;->C:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->R:I

    iget v0, p0, Lb9;->g:F

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->c:F

    iget v0, p0, Lb9;->e:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a:I

    iget v0, p0, Lb9;->f:I

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->b:I

    iget v0, p0, Lb9;->b:I

    iput v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iget v0, p0, Lb9;->c:I

    iput v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    iget v0, p0, Lb9;->I:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    iget v0, p0, Lb9;->H:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    :cond_0
    invoke-virtual {p1}, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a()V

    return-void
.end method

.method public clone()Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lb9;

    invoke-direct {v0}, Lb9;-><init>()V

    iget-boolean v1, p0, Lb9;->a:Z

    iput-boolean v1, v0, Lb9;->a:Z

    iget v1, p0, Lb9;->b:I

    iput v1, v0, Lb9;->b:I

    iget v1, p0, Lb9;->c:I

    iput v1, v0, Lb9;->c:I

    iget v1, p0, Lb9;->e:I

    iput v1, v0, Lb9;->e:I

    iget v1, p0, Lb9;->f:I

    iput v1, v0, Lb9;->f:I

    iget v1, p0, Lb9;->g:F

    iput v1, v0, Lb9;->g:F

    iget v1, p0, Lb9;->h:I

    iput v1, v0, Lb9;->h:I

    iget v1, p0, Lb9;->i:I

    iput v1, v0, Lb9;->i:I

    iget v1, p0, Lb9;->j:I

    iput v1, v0, Lb9;->j:I

    iget v1, p0, Lb9;->k:I

    iput v1, v0, Lb9;->k:I

    iget v1, p0, Lb9;->l:I

    iput v1, v0, Lb9;->l:I

    iget v1, p0, Lb9;->m:I

    iput v1, v0, Lb9;->m:I

    iget v1, p0, Lb9;->n:I

    iput v1, v0, Lb9;->n:I

    iget v1, p0, Lb9;->o:I

    iput v1, v0, Lb9;->o:I

    iget v1, p0, Lb9;->p:I

    iput v1, v0, Lb9;->p:I

    iget v1, p0, Lb9;->q:I

    iput v1, v0, Lb9;->q:I

    iget v1, p0, Lb9;->r:I

    iput v1, v0, Lb9;->r:I

    iget v1, p0, Lb9;->s:I

    iput v1, v0, Lb9;->s:I

    iget v1, p0, Lb9;->t:I

    iput v1, v0, Lb9;->t:I

    iget v1, p0, Lb9;->u:F

    iput v1, v0, Lb9;->u:F

    iget v1, p0, Lb9;->v:F

    iput v1, v0, Lb9;->v:F

    iget-object v1, p0, Lb9;->w:Ljava/lang/String;

    iput-object v1, v0, Lb9;->w:Ljava/lang/String;

    iget v1, p0, Lb9;->A:I

    iput v1, v0, Lb9;->A:I

    iget v1, p0, Lb9;->B:I

    iput v1, v0, Lb9;->B:I

    iget v1, p0, Lb9;->u:F

    iput v1, v0, Lb9;->u:F

    iget v1, p0, Lb9;->u:F

    iput v1, v0, Lb9;->u:F

    iget v1, p0, Lb9;->u:F

    iput v1, v0, Lb9;->u:F

    iget v1, p0, Lb9;->u:F

    iput v1, v0, Lb9;->u:F

    iget v1, p0, Lb9;->u:F

    iput v1, v0, Lb9;->u:F

    iget v1, p0, Lb9;->C:I

    iput v1, v0, Lb9;->C:I

    iget v1, p0, Lb9;->D:I

    iput v1, v0, Lb9;->D:I

    iget v1, p0, Lb9;->E:I

    iput v1, v0, Lb9;->E:I

    iget v1, p0, Lb9;->F:I

    iput v1, v0, Lb9;->F:I

    iget v1, p0, Lb9;->G:I

    iput v1, v0, Lb9;->G:I

    iget v1, p0, Lb9;->H:I

    iput v1, v0, Lb9;->H:I

    iget v1, p0, Lb9;->I:I

    iput v1, v0, Lb9;->I:I

    iget v1, p0, Lb9;->J:I

    iput v1, v0, Lb9;->J:I

    iget v1, p0, Lb9;->K:I

    iput v1, v0, Lb9;->K:I

    iget v1, p0, Lb9;->L:I

    iput v1, v0, Lb9;->L:I

    iget v1, p0, Lb9;->M:I

    iput v1, v0, Lb9;->M:I

    iget v1, p0, Lb9;->N:I

    iput v1, v0, Lb9;->N:I

    iget v1, p0, Lb9;->O:I

    iput v1, v0, Lb9;->O:I

    iget v1, p0, Lb9;->P:I

    iput v1, v0, Lb9;->P:I

    iget v1, p0, Lb9;->Q:F

    iput v1, v0, Lb9;->Q:F

    iget v1, p0, Lb9;->R:F

    iput v1, v0, Lb9;->R:F

    iget v1, p0, Lb9;->S:I

    iput v1, v0, Lb9;->S:I

    iget v1, p0, Lb9;->T:I

    iput v1, v0, Lb9;->T:I

    iget v1, p0, Lb9;->U:F

    iput v1, v0, Lb9;->U:F

    iget-boolean v1, p0, Lb9;->V:Z

    iput-boolean v1, v0, Lb9;->V:Z

    iget v1, p0, Lb9;->W:F

    iput v1, v0, Lb9;->W:F

    iget v1, p0, Lb9;->X:F

    iput v1, v0, Lb9;->X:F

    iget v1, p0, Lb9;->Y:F

    iput v1, v0, Lb9;->Y:F

    iget v1, p0, Lb9;->Z:F

    iput v1, v0, Lb9;->Z:F

    iget v1, p0, Lb9;->a0:F

    iput v1, v0, Lb9;->a0:F

    iget v1, p0, Lb9;->b0:F

    iput v1, v0, Lb9;->b0:F

    iget v1, p0, Lb9;->c0:F

    iput v1, v0, Lb9;->c0:F

    iget v1, p0, Lb9;->d0:F

    iput v1, v0, Lb9;->d0:F

    iget v1, p0, Lb9;->e0:F

    iput v1, v0, Lb9;->e0:F

    iget v1, p0, Lb9;->f0:F

    iput v1, v0, Lb9;->f0:F

    iget v1, p0, Lb9;->g0:F

    iput v1, v0, Lb9;->g0:F

    iget-boolean v1, p0, Lb9;->h0:Z

    iput-boolean v1, v0, Lb9;->h0:Z

    iget-boolean v1, p0, Lb9;->i0:Z

    iput-boolean v1, v0, Lb9;->i0:Z

    iget v1, p0, Lb9;->j0:I

    iput v1, v0, Lb9;->j0:I

    iget v1, p0, Lb9;->k0:I

    iput v1, v0, Lb9;->k0:I

    iget v1, p0, Lb9;->l0:I

    iput v1, v0, Lb9;->l0:I

    iget v1, p0, Lb9;->m0:I

    iput v1, v0, Lb9;->m0:I

    iget v1, p0, Lb9;->n0:I

    iput v1, v0, Lb9;->n0:I

    iget v1, p0, Lb9;->o0:I

    iput v1, v0, Lb9;->o0:I

    iget v1, p0, Lb9;->p0:F

    iput v1, v0, Lb9;->p0:F

    iget v1, p0, Lb9;->q0:F

    iput v1, v0, Lb9;->q0:F

    iget v1, p0, Lb9;->s0:I

    iput v1, v0, Lb9;->s0:I

    iget v1, p0, Lb9;->t0:I

    iput v1, v0, Lb9;->t0:I

    iget-object v1, p0, Lb9;->u0:[I

    if-eqz v1, :cond_0

    array-length v2, v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, v0, Lb9;->u0:[I

    :cond_0
    iget v1, p0, Lb9;->x:I

    iput v1, v0, Lb9;->x:I

    iget v1, p0, Lb9;->y:I

    iput v1, v0, Lb9;->y:I

    iget v1, p0, Lb9;->z:F

    iput v1, v0, Lb9;->z:F

    iget-boolean v1, p0, Lb9;->r0:Z

    iput-boolean v1, v0, Lb9;->r0:Z

    return-object v0
.end method
